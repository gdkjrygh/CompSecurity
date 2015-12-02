// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.android.core:
//            b, a

public class ArrayDeque extends AbstractCollection
    implements com.android.core.b, Serializable, Cloneable
{
    private class a
        implements Iterator
    {

        final ArrayDeque a;
        private int b;
        private int c;
        private int d;

        public boolean hasNext()
        {
            return b != c;
        }

        public Object next()
        {
            if (b == c)
            {
                throw new NoSuchElementException();
            }
            Object obj = ArrayDeque.c(a)[b];
            if (ArrayDeque.b(a) != c || obj == null)
            {
                throw new ConcurrentModificationException();
            } else
            {
                d = b;
                b = b + 1 & ArrayDeque.c(a).length - 1;
                return obj;
            }
        }

        public void remove()
        {
            if (d < 0)
            {
                throw new IllegalStateException();
            }
            if (ArrayDeque.a(a, d))
            {
                b = b - 1 & ArrayDeque.c(a).length - 1;
                c = ArrayDeque.b(a);
            }
            d = -1;
        }

        private a()
        {
            a = ArrayDeque.this;
            super();
            b = ArrayDeque.a(a);
            c = ArrayDeque.b(a);
            d = -1;
        }

    }

    private class b
        implements Iterator
    {

        final ArrayDeque a;
        private int b;
        private int c;
        private int d;

        public boolean hasNext()
        {
            return b != c;
        }

        public Object next()
        {
            if (b == c)
            {
                throw new NoSuchElementException();
            }
            b = b - 1 & ArrayDeque.c(a).length - 1;
            Object obj = ArrayDeque.c(a)[b];
            if (ArrayDeque.a(a) != c || obj == null)
            {
                throw new ConcurrentModificationException();
            } else
            {
                d = b;
                return obj;
            }
        }

        public void remove()
        {
            if (d < 0)
            {
                throw new IllegalStateException();
            }
            if (!ArrayDeque.a(a, d))
            {
                b = b + 1 & ArrayDeque.c(a).length - 1;
                c = ArrayDeque.a(a);
            }
            d = -1;
        }

        private b()
        {
            a = ArrayDeque.this;
            super();
            b = ArrayDeque.b(a);
            c = ArrayDeque.a(a);
            d = -1;
        }

    }


    static final boolean a;
    private transient Object b[];
    private transient int c;
    private transient int d;

    public ArrayDeque()
    {
        b = (Object[])new Object[16];
    }

    public ArrayDeque(int i)
    {
        a(i);
    }

    public ArrayDeque(Collection collection)
    {
        a(collection.size());
        addAll(collection);
    }

    static int a(ArrayDeque arraydeque)
    {
        return arraydeque.c;
    }

    private void a()
    {
        if (!a && c != d)
        {
            throw new AssertionError();
        }
        int i = c;
        int j = b.length;
        int k = j - i;
        int l = j << 1;
        if (l < 0)
        {
            throw new IllegalStateException("Sorry, deque too big");
        } else
        {
            Object aobj[] = new Object[l];
            System.arraycopy(((Object) (b)), i, ((Object) (aobj)), 0, k);
            System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), k, i);
            b = (Object[])aobj;
            c = 0;
            d = j;
            return;
        }
    }

    private void a(int i)
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
        b = (Object[])new Object[j];
    }

    static boolean a(ArrayDeque arraydeque, int i)
    {
        return arraydeque.b(i);
    }

    private Object[] a(Object aobj[])
    {
        if (c < d)
        {
            System.arraycopy(((Object) (b)), c, ((Object) (aobj)), 0, size());
        } else
        if (c > d)
        {
            int i = b.length - c;
            System.arraycopy(((Object) (b)), c, ((Object) (aobj)), 0, i);
            System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), i, d);
            return aobj;
        }
        return aobj;
    }

    static int b(ArrayDeque arraydeque)
    {
        return arraydeque.d;
    }

    private void b()
    {
        if (!a && b[d] != null)
        {
            throw new AssertionError();
        }
        if (a || (c != d ? b[c] != null && b[d - 1 & b.length - 1] != null : b[c] == null))
        {
            if (!a && b[c - 1 & b.length - 1] != null)
            {
                throw new AssertionError();
            } else
            {
                return;
            }
        } else
        {
            throw new AssertionError();
        }
    }

    private boolean b(int i)
    {
        b();
        Object aobj[] = b;
        int j = aobj.length - 1;
        int k = c;
        int l = d;
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
            c = k + 1 & j;
            return false;
        }
        if (i < l)
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j1);
            d = l - 1;
        } else
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j - i);
            aobj[j] = aobj[0];
            System.arraycopy(((Object) (aobj)), 1, ((Object) (aobj)), 0, l);
            d = l - 1 & j;
        }
        return true;
    }

    static Object[] c(ArrayDeque arraydeque)
    {
        return arraydeque.b;
    }

    public boolean add(Object obj)
    {
        addLast(obj);
        return true;
    }

    public void addFirst(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        Object aobj[] = b;
        int i = c - 1 & b.length - 1;
        c = i;
        aobj[i] = obj;
        if (c == d)
        {
            a();
        }
    }

    public void addLast(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        b[d] = obj;
        int i = d + 1 & b.length - 1;
        d = i;
        if (i == c)
        {
            a();
        }
    }

    public void clear()
    {
        int i = c;
        int k = d;
        if (i != k)
        {
            d = 0;
            c = 0;
            int l = b.length;
            int j;
            do
            {
                b[i] = null;
                j = i + 1 & l - 1;
                i = j;
            } while (j != k);
        }
    }

    public ArrayDeque clone()
    {
        ArrayDeque arraydeque;
        try
        {
            arraydeque = (ArrayDeque)super.clone();
            arraydeque.b = com.android.core.a.a(b, b.length);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return arraydeque;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int j = b.length;
        int i = c;
        do
        {
            Object obj1 = b[i];
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

    public Iterator descendingIterator()
    {
        return new b();
    }

    public Object element()
    {
        return getFirst();
    }

    public Object getFirst()
    {
        Object obj = b[c];
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
        Object obj = b[d - 1 & b.length - 1];
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
        return c == d;
    }

    public Iterator iterator()
    {
        return new a();
    }

    public boolean offer(Object obj)
    {
        return offerLast(obj);
    }

    public boolean offerFirst(Object obj)
    {
        addFirst(obj);
        return true;
    }

    public boolean offerLast(Object obj)
    {
        addLast(obj);
        return true;
    }

    public Object peek()
    {
        return peekFirst();
    }

    public Object peekFirst()
    {
        return b[c];
    }

    public Object peekLast()
    {
        return b[d - 1 & b.length - 1];
    }

    public Object poll()
    {
        return pollFirst();
    }

    public Object pollFirst()
    {
        int i = c;
        Object obj = b[i];
        if (obj == null)
        {
            return null;
        } else
        {
            b[i] = null;
            c = i + 1 & b.length - 1;
            return obj;
        }
    }

    public Object pollLast()
    {
        int i = d;
        i = b.length - 1 & i - 1;
        Object obj = b[i];
        if (obj == null)
        {
            return null;
        } else
        {
            b[i] = null;
            d = i;
            return obj;
        }
    }

    public Object pop()
    {
        return removeFirst();
    }

    public void push(Object obj)
    {
        addFirst(obj);
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
        if (obj == null)
        {
            return false;
        }
        int j = b.length;
        int i = c;
        do
        {
            Object obj1 = b[i];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    b(i);
                    return true;
                }
                i = i + 1 & j - 1;
            } else
            {
                return false;
            }
        } while (true);
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
        if (obj == null)
        {
            return false;
        }
        int j = b.length - 1;
        int i = d - 1 & j;
        do
        {
            Object obj1 = b[i];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    b(i);
                    return true;
                }
                i = i - 1 & j;
            } else
            {
                return false;
            }
        } while (true);
    }

    public int size()
    {
        return d - c & b.length - 1;
    }

    public Object[] toArray()
    {
        return a(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length < i)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
        }
        a(aobj);
        if (aobj.length > i)
        {
            aobj[i] = null;
        }
        return aobj;
    }

    static 
    {
        boolean flag;
        if (!com/android/core/ArrayDeque.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
