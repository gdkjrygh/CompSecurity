// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.subjects;


// Referenced classes of package rx.subjects:
//            ReplaySubject

static final class head
{
    static final class Node
    {

        volatile Node next;
        final Object value;

        Node(Object obj)
        {
            value = obj;
        }
    }


    final Node head = new Node(null);
    int size;
    Node tail;

    public void addLast(Object obj)
    {
        Node node = tail;
        obj = new Node(obj);
        node.next = ((Node) (obj));
        tail = ((Node) (obj));
        size = size + 1;
    }

    public void clear()
    {
        tail = head;
        size = 0;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public Object removeFirst()
    {
        if (head.next == null)
        {
            throw new IllegalStateException("Empty!");
        }
        Node node = head.next;
        head.next = node.next;
        if (head.next == null)
        {
            tail = head;
        }
        size = size - 1;
        return node.value;
    }

    public int size()
    {
        return size;
    }

    Node.value()
    {
        tail = head;
    }
}
