// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class dagger.a.a extends AbstractCollection
    implements Serializable, Cloneable, Queue
{
    private final class a
        implements Iterator
    {

        final dagger.a.a a;
        private int b;
        private int c;
        private int d;

        public final boolean hasNext()
        {
            return b != c;
        }

        public final Object next()
        {
            if (b == c)
            {
                throw new NoSuchElementException();
            }
            Object obj = dagger.a.a.c(a)[b];
            if (dagger.a.a.b(a) != c || obj == null)
            {
                throw new ConcurrentModificationException();
            } else
            {
                d = b;
                b = b + 1 & dagger.a.a.c(a).length - 1;
                return obj;
            }
        }

        public final void remove()
        {
            if (d < 0)
            {
                throw new IllegalStateException();
            }
            if (dagger.a.a.a(a, d))
            {
                b = b - 1 & dagger.a.a.c(a).length - 1;
                c = dagger.a.a.b(a);
            }
            d = -1;
        }

        private a()
        {
            a = dagger.a.a.this;
            super();
            b = dagger.a.a.a(a);
            c = dagger.a.a.b(a);
            d = -1;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private transient Object a[];
    private transient int b;
    private transient int c;

    public dagger.a.a()
    {
        a = new Object[16];
    }

    static int a(dagger.a.a a1)
    {
        return a1.b;
    }

    private dagger.a.a a()
    {
        dagger.a.a a1;
        try
        {
            a1 = (dagger.a.a)super.clone();
            Object aobj[] = (Object[])(Object[])Array.newInstance(((Object) (a)).getClass().getComponentType(), a.length);
            System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, a.length);
            a1.a = aobj;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return a1;
    }

    private boolean a(int i)
    {
        Object aobj[] = a;
        int j = aobj.length - 1;
        int k = b;
        int l = c;
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
            b = k + 1 & j;
            return false;
        }
        if (i < l)
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j1);
            c = l - 1;
        } else
        {
            System.arraycopy(((Object) (aobj)), i + 1, ((Object) (aobj)), i, j - i);
            aobj[j] = aobj[0];
            System.arraycopy(((Object) (aobj)), 1, ((Object) (aobj)), 0, l);
            c = l - 1 & j;
        }
        return true;
    }

    static boolean a(dagger.a.a a1, int i)
    {
        return a1.a(i);
    }

    static int b(dagger.a.a a1)
    {
        return a1.c;
    }

    static Object[] c(dagger.a.a a1)
    {
        return a1.a;
    }

    public final boolean add(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("e == null");
        }
        a[c] = obj;
        int i = c + 1 & a.length - 1;
        c = i;
        if (i == b)
        {
            int j = b;
            int k = a.length;
            int l = k - j;
            int i1 = k << 1;
            if (i1 < 0)
            {
                throw new IllegalStateException("Sorry, queue too big");
            }
            obj = ((Object) (new Object[i1]));
            System.arraycopy(((Object) (a)), j, obj, 0, l);
            System.arraycopy(((Object) (a)), 0, obj, l, j);
            a = ((Object []) (obj));
            b = 0;
            c = k;
        }
        return true;
    }

    public final void clear()
    {
        int i = b;
        int k = c;
        if (i != k)
        {
            c = 0;
            b = 0;
            int l = a.length;
            int j;
            do
            {
                a[i] = null;
                j = i + 1 & l - 1;
                i = j;
            } while (j != k);
        }
    }

    public final Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public final boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int j = a.length;
        int i = b;
        do
        {
            Object obj1 = a[i];
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

    public final Object element()
    {
        Object obj = a[b];
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public final boolean isEmpty()
    {
        return b == c;
    }

    public final Iterator iterator()
    {
        return new a((byte)0);
    }

    public final boolean offer(Object obj)
    {
        return add(obj);
    }

    public final Object peek()
    {
        return a[b];
    }

    public final Object poll()
    {
        int i = b;
        Object obj = a[i];
        if (obj == null)
        {
            return null;
        } else
        {
            a[i] = null;
            b = i + 1 & a.length - 1;
            return obj;
        }
    }

    public final Object remove()
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

    public final boolean remove(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int j = a.length;
        int i = b;
        do
        {
            Object obj1 = a[i];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    a(i);
                    return true;
                }
                i = i + 1 & j - 1;
            } else
            {
                return false;
            }
        } while (true);
    }

    public final int size()
    {
        return c - b & a.length - 1;
    }

    public final Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        i = size();
        if (aobj.length < i)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), i);
        }
        if (b >= c) goto _L2; else goto _L1
_L1:
        System.arraycopy(((Object) (a)), b, ((Object) (aobj)), 0, size());
_L4:
        if (aobj.length > i)
        {
            aobj[i] = null;
        }
        return aobj;
_L2:
        if (b > c)
        {
            int j = a.length - b;
            System.arraycopy(((Object) (a)), b, ((Object) (aobj)), 0, j);
            System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), j, c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
