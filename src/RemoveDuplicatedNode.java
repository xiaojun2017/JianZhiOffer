/**
 * Date: 2019/1/21
 * Created by Liuian
 */

/**
 * 去除重复的Node
 */
class RemoveDuplicatedNode {

    class Node {
        Node next;
        int val;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }


    /**
     * 遍历重复的，然后删去
     *
     * @param head
     * @return
     */
    public Node removeDuplicatedNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node pHead = new Node(null, Integer.MIN_VALUE);
        pHead.next = head;
        Node curr = pHead;

        while (curr != null) {
            Node temp = curr;
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            temp.next = curr;

            curr = curr.next;
        }

        return head;

    }
}
