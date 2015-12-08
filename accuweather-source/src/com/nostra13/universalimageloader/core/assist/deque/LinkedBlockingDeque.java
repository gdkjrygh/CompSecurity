// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist.deque;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.nostra13.universalimageloader.core.assist.deque:
//            BlockingDeque

public class LinkedBlockingDeque extends AbstractQueue
    implements BlockingDeque, Serializable
{
    private abstract class AbstractItr
        implements Iterator
    {

        private Node lastRet;
        Node next;
        Object nextItem;
        final LinkedBlockingDeque this$0;

        private Node succ(Node node)
        {
_L6:
            Node node1 = nextNode(node);
            if (node1 != null) goto _L2; else goto _L1
_L1:
            Node node2 = null;
_L4:
            return node2;
_L2:
            node2 = node1;
            if (node1.item != null) goto _L4; else goto _L3
_L3:
            if (node1 == node)
            {
                return firstNode();
            }
            node = node1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        void advance()
        {
            ReentrantLock reentrantlock;
            reentrantlock = lock;
            reentrantlock.lock();
            next = succ(next);
            if (next != null)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            Object obj = null;
_L1:
            nextItem = obj;
            reentrantlock.unlock();
            return;
            obj = next.item;
              goto _L1
            Exception exception;
            exception;
            reentrantlock.unlock();
            throw exception;
        }

        abstract Node firstNode();

        public boolean hasNext()
        {
            return next != null;
        }

        public Object next()
        {
            if (next == null)
            {
                throw new NoSuchElementException();
            } else
            {
                lastRet = next;
                Object obj = nextItem;
                advance();
                return obj;
            }
        }

        abstract Node nextNode(Node node);

        public void remove()
        {
            ReentrantLock reentrantlock;
            Node node;
            node = lastRet;
            if (node == null)
            {
                throw new IllegalStateException();
            }
            lastRet = null;
            reentrantlock = lock;
            reentrantlock.lock();
            if (node.item != null)
            {
                unlink(node);
            }
            reentrantlock.unlock();
            return;
            Exception exception;
            exception;
            reentrantlock.unlock();
            throw exception;
        }

        AbstractItr()
        {
            ReentrantLock reentrantlock;
            this$0 = LinkedBlockingDeque.this;
            super();
            reentrantlock = lock;
            reentrantlock.lock();
            next = firstNode();
            if (next != null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            linkedblockingdeque = null;
_L1:
            nextItem = LinkedBlockingDeque.this;
            reentrantlock.unlock();
            return;
            linkedblockingdeque = ((LinkedBlockingDeque) (next.item));
              goto _L1
            linkedblockingdeque;
            reentrantlock.unlock();
            throw LinkedBlockingDeque.this;
        }
    }

    private class DescendingItr extends AbstractItr
    {

        final LinkedBlockingDeque this$0;

        Node firstNode()
        {
            return last;
        }

        Node nextNode(Node node)
        {
            return node.prev;
        }

        private DescendingItr()
        {
            this$0 = LinkedBlockingDeque.this;
            super();
        }

    }

    private class Itr extends AbstractItr
    {

        final LinkedBlockingDeque this$0;

        Node firstNode()
        {
            return first;
        }

        Node nextNode(Node node)
        {
            return node.next;
        }

        private Itr()
        {
            this$0 = LinkedBlockingDeque.this;
            super();
        }

    }

    static final class Node
    {

        Object item;
        Node next;
        Node prev;

        Node(Object obj)
        {
            item = obj;
        }
    }


    private static final long serialVersionUID = 0xfa9ddc6ce257fe26L;
    private final int capacity;
    private transient int count;
    transient Node first;
    transient Node last;
    final ReentrantLock lock;
    private final Condition notEmpty;
    private final Condition notFull;

    public LinkedBlockingDeque()
    {
        this(0x7fffffff);
    }

    public LinkedBlockingDeque(int i)
    {
        lock = new ReentrantLock();
        notEmpty = lock.newCondition();
        notFull = lock.newCondition();
        if (i <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            capacity = i;
            return;
        }
    }

    public LinkedBlockingDeque(Collection collection)
    {
        ReentrantLock reentrantlock;
        this(0x7fffffff);
        reentrantlock = lock;
        reentrantlock.lock();
        collection = collection.iterator();
_L2:
        Object obj;
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = collection.next();
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        throw new NullPointerException();
        collection;
        reentrantlock.unlock();
        throw collection;
        if (linkLast(new Node(obj))) goto _L2; else goto _L1
_L1:
        throw new IllegalStateException("Deque full");
        reentrantlock.unlock();
        return;
    }

    private boolean linkFirst(Node node)
    {
        if (count >= capacity)
        {
            return false;
        }
        Node node1 = first;
        node.next = node1;
        first = node;
        if (last == null)
        {
            last = node;
        } else
        {
            node1.prev = node;
        }
        count = count + 1;
        notEmpty.signal();
        return true;
    }

    private boolean linkLast(Node node)
    {
        if (count >= capacity)
        {
            return false;
        }
        Node node1 = last;
        node.prev = node1;
        last = node;
        if (first == null)
        {
            first = node;
        } else
        {
            node1.next = node;
        }
        count = count + 1;
        notEmpty.signal();
        return true;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        count = 0;
        first = null;
        last = null;
        do
        {
            Object obj = objectinputstream.readObject();
            if (obj == null)
            {
                return;
            }
            add(obj);
        } while (true);
    }

    private Object unlinkFirst()
    {
        Node node = first;
        if (node == null)
        {
            return null;
        }
        Node node1 = node.next;
        Object obj = node.item;
        node.item = null;
        node.next = node;
        first = node1;
        if (node1 == null)
        {
            last = null;
        } else
        {
            node1.prev = null;
        }
        count = count - 1;
        notFull.signal();
        return obj;
    }

    private Object unlinkLast()
    {
        Node node = last;
        if (node == null)
        {
            return null;
        }
        Node node1 = node.prev;
        Object obj = node.item;
        node.item = null;
        node.prev = node;
        last = node1;
        if (node1 == null)
        {
            first = null;
        } else
        {
            node1.next = null;
        }
        count = count - 1;
        notFull.signal();
        return obj;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Node node;
        objectoutputstream.defaultWriteObject();
        node = first;
_L1:
        if (node == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        objectoutputstream.writeObject(node.item);
        node = node.next;
          goto _L1
        objectoutputstream.writeObject(null);
        reentrantlock.unlock();
        return;
        objectoutputstream;
        reentrantlock.unlock();
        throw objectoutputstream;
    }

    public boolean add(Object obj)
    {
        addLast(obj);
        return true;
    }

    public void addFirst(Object obj)
    {
        if (!offerFirst(obj))
        {
            throw new IllegalStateException("Deque full");
        } else
        {
            return;
        }
    }

    public void addLast(Object obj)
    {
        if (!offerLast(obj))
        {
            throw new IllegalStateException("Deque full");
        } else
        {
            return;
        }
    }

    public void clear()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Node node = first;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Node node1;
        node.item = null;
        node1 = node.next;
        node.prev = null;
        node.next = null;
        node = node1;
        if (true) goto _L2; else goto _L1
_L1:
        last = null;
        first = null;
        count = 0;
        notFull.signalAll();
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public boolean contains(Object obj)
    {
        ReentrantLock reentrantlock;
        if (obj == null)
        {
            return false;
        }
        reentrantlock = lock;
        reentrantlock.lock();
        Node node = first;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag = obj.equals(node.item);
        if (flag)
        {
            reentrantlock.unlock();
            return true;
        }
        node = node.next;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    public Iterator descendingIterator()
    {
        return new DescendingItr();
    }

    public int drainTo(Collection collection)
    {
        return drainTo(collection, 0x7fffffff);
    }

    public int drainTo(Collection collection, int i)
    {
        ReentrantLock reentrantlock;
        if (collection == null)
        {
            throw new NullPointerException();
        }
        if (collection == this)
        {
            throw new IllegalArgumentException();
        }
        reentrantlock = lock;
        reentrantlock.lock();
        int j = Math.min(i, count);
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        collection.add(first.item);
        unlinkFirst();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return j;
        collection;
        reentrantlock.unlock();
        throw collection;
    }

    public Object element()
    {
        return getFirst();
    }

    public Object getFirst()
    {
        Object obj = peekFirst();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public Object getLast()
    {
        Object obj = peekLast();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public Iterator iterator()
    {
        return new Itr();
    }

    public boolean offer(Object obj)
    {
        return offerLast(obj);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return offerLast(obj, l, timeunit);
    }

    public boolean offerFirst(Object obj)
    {
        Node node;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        node = new Node(obj);
        obj = lock;
        ((ReentrantLock) (obj)).lock();
        boolean flag = linkFirst(node);
        ((ReentrantLock) (obj)).unlock();
        return flag;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
    }

    public boolean offerFirst(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        obj = new Node(obj);
        l = timeunit.toNanos(l);
        timeunit = lock;
        timeunit.lockInterruptibly();
_L2:
        boolean flag = linkFirst(((Node) (obj)));
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return false;
        }
        l = notFull.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return true;
        obj;
        timeunit.unlock();
        throw obj;
    }

    public boolean offerLast(Object obj)
    {
        Node node;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        node = new Node(obj);
        obj = lock;
        ((ReentrantLock) (obj)).lock();
        boolean flag = linkLast(node);
        ((ReentrantLock) (obj)).unlock();
        return flag;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
    }

    public boolean offerLast(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        obj = new Node(obj);
        l = timeunit.toNanos(l);
        timeunit = lock;
        timeunit.lockInterruptibly();
_L2:
        boolean flag = linkLast(((Node) (obj)));
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return false;
        }
        l = notFull.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return true;
        obj;
        timeunit.unlock();
        throw obj;
    }

    public Object peek()
    {
        return peekFirst();
    }

    public Object peekFirst()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Object obj = first;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        reentrantlock.unlock();
        return obj;
_L2:
        obj = first.item;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object peekLast()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Object obj = last;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        reentrantlock.unlock();
        return obj;
_L2:
        obj = last.item;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object poll()
    {
        return pollFirst();
    }

    public Object poll(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return pollFirst(l, timeunit);
    }

    public Object pollFirst()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Object obj = unlinkFirst();
        reentrantlock.unlock();
        return obj;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object pollFirst(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        timeunit = lock;
        timeunit.lockInterruptibly();
_L2:
        Object obj = unlinkFirst();
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return null;
        }
        l = notEmpty.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return obj;
        Exception exception;
        exception;
        timeunit.unlock();
        throw exception;
    }

    public Object pollLast()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Object obj = unlinkLast();
        reentrantlock.unlock();
        return obj;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object pollLast(long l, TimeUnit timeunit)
        throws InterruptedException
    {
        l = timeunit.toNanos(l);
        timeunit = lock;
        timeunit.lockInterruptibly();
_L2:
        Object obj = unlinkLast();
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l <= 0L)
        {
            timeunit.unlock();
            return null;
        }
        l = notEmpty.awaitNanos(l);
        if (true) goto _L2; else goto _L1
_L1:
        timeunit.unlock();
        return obj;
        Exception exception;
        exception;
        timeunit.unlock();
        throw exception;
    }

    public Object pop()
    {
        return removeFirst();
    }

    public void push(Object obj)
    {
        addFirst(obj);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        putLast(obj);
    }

    public void putFirst(Object obj)
        throws InterruptedException
    {
        Node node;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        node = new Node(obj);
        obj = lock;
        ((ReentrantLock) (obj)).lock();
        for (; !linkFirst(node); notFull.await()) { }
        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
        ((ReentrantLock) (obj)).unlock();
        return;
    }

    public void putLast(Object obj)
        throws InterruptedException
    {
        Node node;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        node = new Node(obj);
        obj = lock;
        ((ReentrantLock) (obj)).lock();
        for (; !linkLast(node); notFull.await()) { }
        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        ((ReentrantLock) (obj)).unlock();
        throw exception;
        ((ReentrantLock) (obj)).unlock();
        return;
    }

    public int remainingCapacity()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        int i;
        int j;
        i = capacity;
        j = count;
        reentrantlock.unlock();
        return i - j;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object remove()
    {
        return removeFirst();
    }

    public boolean remove(Object obj)
    {
        return removeFirstOccurrence(obj);
    }

    public Object removeFirst()
    {
        Object obj = pollFirst();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean removeFirstOccurrence(Object obj)
    {
        ReentrantLock reentrantlock;
        if (obj == null)
        {
            return false;
        }
        reentrantlock = lock;
        reentrantlock.lock();
        Node node = first;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(node.item))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        unlink(node);
        reentrantlock.unlock();
        return true;
        node = node.next;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    public Object removeLast()
    {
        Object obj = pollLast();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean removeLastOccurrence(Object obj)
    {
        ReentrantLock reentrantlock;
        if (obj == null)
        {
            return false;
        }
        reentrantlock = lock;
        reentrantlock.lock();
        Node node = last;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj.equals(node.item))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        unlink(node);
        reentrantlock.unlock();
        return true;
        node = node.prev;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return false;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

    public int size()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        int i = count;
        reentrantlock.unlock();
        return i;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object take()
        throws InterruptedException
    {
        return takeFirst();
    }

    public Object takeFirst()
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
_L1:
        Object obj = unlinkFirst();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        notEmpty.await();
          goto _L1
        obj;
        reentrantlock.unlock();
        throw obj;
        reentrantlock.unlock();
        return obj;
    }

    public Object takeLast()
        throws InterruptedException
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
_L1:
        Object obj = unlinkLast();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        notEmpty.await();
          goto _L1
        obj;
        reentrantlock.unlock();
        throw obj;
        reentrantlock.unlock();
        return obj;
    }

    public Object[] toArray()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Node node;
        Object aobj[];
        aobj = new Object[count];
        node = first;
        int i = 0;
_L2:
        if (node == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[i] = node.item;
        node = node.next;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        reentrantlock.unlock();
        return aobj;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    public Object[] toArray(Object aobj[])
    {
        Object aobj1[];
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        aobj1 = aobj;
        if (aobj.length < count)
        {
            aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), count);
        }
        aobj = first;
        int i = 0;
_L2:
        if (aobj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1[i] = ((Node) (aobj)).item;
        aobj = ((Node) (aobj)).next;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        reentrantlock.unlock();
        return aobj1;
        aobj;
        reentrantlock.unlock();
        throw aobj;
    }

    public String toString()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        Object obj = first;
        if (obj == null)
        {
            reentrantlock.unlock();
            return "[]";
        }
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append('[');
_L1:
        Object obj2 = ((Node) (obj)).item;
        Object obj1;
        obj1 = obj2;
        if (obj2 == this)
        {
            obj1 = "(this Collection)";
        }
        stringbuilder.append(obj1);
        obj = ((Node) (obj)).next;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        obj = stringbuilder.append(']').toString();
        reentrantlock.unlock();
        return ((String) (obj));
        stringbuilder.append(',').append(' ');
          goto _L1
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    void unlink(Node node)
    {
        Node node1 = node.prev;
        Node node2 = node.next;
        if (node1 == null)
        {
            unlinkFirst();
            return;
        }
        if (node2 == null)
        {
            unlinkLast();
            return;
        } else
        {
            node1.next = node2;
            node2.prev = node1;
            node.item = null;
            count = count - 1;
            notFull.signal();
            return;
        }
    }
}
