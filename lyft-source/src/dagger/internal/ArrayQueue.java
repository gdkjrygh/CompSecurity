// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue extends AbstractCollection
    implements Serializable, Cloneable, Queue
{

    private static final int MIN_INITIAL_CAPACITY = 8;
    private static final long serialVersionUID = 0x207cda2e240da08bL;
    private transient Object elements[];
    private transient int head;
    private transient int tail;

    public ArrayQueue()
    {
        elements = new Object[16];
    }

    public ArrayQueue(int i)
    {
        allocateElements(i);
    }

    public ArrayQueue(Collection collection)
    {
        allocateElements(collection.size());
        addAll(collection);
    }

    private void allocateElements(int i)
    {
        int j = 8;
        if (i >= 8)
        {
            i = i >>> 1 | i;
            i |= i >>> 2;
            i |= i >>> 4;
            i |= i >>> 8;
            i = (i | i >>> 16) + 1;
            j = i;
            if (i < 0)
            {
                j = i >>> 1;
            }
        }
        elements = new Object[j];
    }

    private boolean delete(int i)
    {
        Object aobj[] = elements;
        int j = aobj.length - 1;
        int k = head;
        int l = tail;
        int i1 = i - k & j;
        int j1 = l - i & j;
        if (i1 >= (l - k & j))
        {
            throw new ConcurrentModificationException();
        }
        if (i1 < j1)
        {
            if (k <= i)
            {
                System.arraycopy(((Object) (aobj)), k, ((Object) (aobj)), k + 1, i1);
            } else
            {
                System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj)), 1, i);
                aobj[0] = aobj[j];
                System.arraycopy(((Object) (aobj)), k, ((Object) (aobj)), k + 1, j - k);
            }
            aobj[k] = null;
            head = k + 1 & j;
            return false;
        }
        if (i < l)
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j1);
            tail = l - 1;
        } else
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j - i);
            aobj[j] = aobj[0];
            System.arraycopy(((Object) (aobj)), 1, ((Object) (aobj)), 0, l);
            tail = l - 1 & j;
        }
        return true;
    }

    private void doubleCapacity()
    {
        int i = head;
        int j = elements.length;
        int k = j - i;
        int l = j << 1;
        if (l < 0)
        {
            throw new IllegalStateException("Sorry, queue too big");
        } else
        {
            Object aobj[] = new Object[l];
            System.arraycopy(((Object) (elements)), i, ((Object) (aobj)), 0, k);
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), k, i);
            elements = aobj;
            head = 0;
            tail = j;
            return;
        }
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        int i = 0;
        objectinputstream.defaultReadObject();
        int j = objectinputstream.readInt();
        allocateElements(j);
        head = 0;
        tail = j;
        for (; i < j; i++)
        {
            elements[i] = objectinputstream.readObject();
        }

    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(size());
        int j = elements.length;
        for (int i = head; i != tail; i = i + 1 & j - 1)
        {
            objectoutputstream.writeObject(elements[i]);
        }

    }

    public boolean add(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("e == null");
        }
        elements[tail] = obj;
        int i = tail + 1 & elements.length - 1;
        tail = i;
        if (i == head)
        {
            doubleCapacity();
        }
        return true;
    }

    public void clear()
    {
        int i = head;
        int k = tail;
        if (i != k)
        {
            tail = 0;
            head = 0;
            int l = elements.length;
            int j;
            do
            {
                elements[i] = null;
                j = i + 1 & l - 1;
                i = j;
            } while (j != k);
        }
    }

    public ArrayQueue clone()
    {
        ArrayQueue arrayqueue;
        try
        {
            arrayqueue = (ArrayQueue)super.clone();
            Object aobj[] = (Object[])(Object[])Array.newInstance(((Object) (elements)).getClass().getComponentType(), elements.length);
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), 0, elements.length);
            arrayqueue.elements = aobj;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return arrayqueue;
    }

    public volatile Object clone()
    {
        return clone();
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int j = elements.length;
        int i = head;
        do
        {
            Object obj1 = elements[i];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    return true;
                }
                i = i + 1 & j - 1;
            } else
            {
                return false;
            }
        } while (true);
    }

    public Object element()
    {
        Object obj = elements[head];
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean isEmpty()
    {
        return head == tail;
    }

    public Iterator iterator()
    {
        return new QueueIterator();
    }

    public boolean offer(Object obj)
    {
        return add(obj);
    }

    public Object peek()
    {
        return elements[head];
    }

    public Object poll()
    {
        int i = head;
        Object obj = elements[i];
        if (obj == null)
        {
            return null;
        } else
        {
            elements[i] = null;
            head = i + 1 & elements.length - 1;
            return obj;
        }
    }

    public Object remove()
    {
        Object obj = poll();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public boolean remove(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int j = elements.length;
        int i = head;
        do
        {
            Object obj1 = elements[i];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    delete(i);
                    return true;
                }
                i = i + 1 & j - 1;
            } else
            {
                return false;
            }
        } while (true);
    }

    public int size()
    {
        return tail - head & elements.length - 1;
    }

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i;
        i = size();
        if (aobj.length < i)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
        }
        if (head >= tail) goto _L2; else goto _L1
_L1:
        System.arraycopy(((Object) (elements)), head, ((Object) (aobj)), 0, size());
_L4:
        if (aobj.length > i)
        {
            aobj[i] = null;
        }
        return aobj;
_L2:
        if (head > tail)
        {
            int j = elements.length - head;
            System.arraycopy(((Object) (elements)), head, ((Object) (aobj)), 0, j);
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), j, tail);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }





    private class QueueIterator
        implements Iterator
    {

        private int cursor;
        private int fence;
        private int lastRet;
        final ArrayQueue this$0;

        public boolean hasNext()
        {
            return cursor != fence;
        }

        public Object next()
        {
            if (cursor == fence)
            {
                throw new NoSuchElementException();
            }
            Object obj = elements[cursor];
            if (tail != fence || obj == null)
            {
                throw new ConcurrentModificationException();
            } else
            {
                lastRet = cursor;
                cursor = cursor + 1 & elements.length - 1;
                return obj;
            }
        }

        public void remove()
        {
            if (lastRet < 0)
            {
                throw new IllegalStateException();
            }
            if (delete(lastRet))
            {
                cursor = cursor - 1 & elements.length - 1;
                fence = tail;
            }
            lastRet = -1;
        }

        private QueueIterator()
        {
            this$0 = ArrayQueue.this;
            super();
            cursor = head;
            fence = tail;
            lastRet = -1;
        }

    }

}
