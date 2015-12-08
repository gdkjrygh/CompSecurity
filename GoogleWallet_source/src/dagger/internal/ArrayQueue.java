// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ArrayQueue extends AbstractCollection
    implements Serializable, Cloneable, Queue
{
    class QueueIterator
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


    private transient Object elements[];
    private transient int head;
    private transient int tail;

    public ArrayQueue()
    {
        elements = new Object[16];
    }

    private ArrayQueue clone()
    {
        ArrayQueue arrayqueue;
        try
        {
            arrayqueue = (ArrayQueue)super.clone();
            Object aobj[] = (Object[])Array.newInstance(((Object) (elements)).getClass().getComponentType(), elements.length);
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), 0, elements.length);
            arrayqueue.elements = aobj;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return arrayqueue;
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

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean contains(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = elements.length;
        int i = head;
        do
        {
            Object obj1 = elements[i];
            if (obj1 == null)
            {
                continue;
            }
            if (obj.equals(obj1))
            {
                return true;
            }
            i = i + 1 & j - 1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
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
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = elements.length;
        int i = head;
        do
        {
            Object obj1 = elements[i];
            if (obj1 == null)
            {
                continue;
            }
            if (obj.equals(obj1))
            {
                delete(i);
                return true;
            }
            i = i + 1 & j - 1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
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
        Object aobj1[];
        int i;
        i = size();
        aobj1 = aobj;
        if (aobj.length < i)
        {
            aobj1 = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
        }
        if (head >= tail) goto _L2; else goto _L1
_L1:
        System.arraycopy(((Object) (elements)), head, ((Object) (aobj1)), 0, size());
_L4:
        if (aobj1.length > i)
        {
            aobj1[i] = null;
        }
        return aobj1;
_L2:
        if (head > tail)
        {
            int j = elements.length - head;
            System.arraycopy(((Object) (elements)), head, ((Object) (aobj1)), 0, j);
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj1)), j, tail);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }




}
