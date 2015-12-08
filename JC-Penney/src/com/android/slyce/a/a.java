// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.android.slyce.a:
//            as, c

public class a extends AbstractCollection
    implements as, Serializable, Cloneable
{

    static final boolean a;
    private transient Object b[];
    private transient int c;
    private transient int d;

    public a()
    {
        b = new Object[16];
    }

    static int a(a a1)
    {
        return a1.c;
    }

    private boolean a(int k)
    {
        j();
        Object aobj[] = b;
        int l = aobj.length - 1;
        int i1 = c;
        int j1 = d;
        int k1 = k - i1 & l;
        int l1 = j1 - k & l;
        if (k1 >= (j1 - i1 & l))
        {
            throw new ConcurrentModificationException();
        }
        if (k1 < l1)
        {
            if (i1 <= k)
            {
                System.arraycopy(((Object) (aobj)), i1, ((Object) (aobj)), i1 + 1, k1);
            } else
            {
                System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj)), 1, k);
                aobj[0] = aobj[l];
                System.arraycopy(((Object) (aobj)), i1, ((Object) (aobj)), i1 + 1, l - i1);
            }
            aobj[i1] = null;
            c = i1 + 1 & l;
            return false;
        }
        if (k < j1)
        {
            System.arraycopy(((Object) (aobj)), k + 1, ((Object) (aobj)), k, l1);
            d = j1 - 1;
        } else
        {
            System.arraycopy(((Object) (aobj)), k + 1, ((Object) (aobj)), k, l - k);
            aobj[l] = aobj[0];
            System.arraycopy(((Object) (aobj)), 1, ((Object) (aobj)), 0, j1);
            d = j1 - 1 & l;
        }
        return true;
    }

    static boolean a(a a1, int k)
    {
        return a1.a(k);
    }

    private Object[] a(Object aobj[])
    {
        if (c < d)
        {
            System.arraycopy(((Object) (b)), c, ((Object) (aobj)), 0, size());
        } else
        if (c > d)
        {
            int k = b.length - c;
            System.arraycopy(((Object) (b)), c, ((Object) (aobj)), 0, k);
            System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), k, d);
            return aobj;
        }
        return aobj;
    }

    static int b(a a1)
    {
        return a1.d;
    }

    static Object[] c(a a1)
    {
        return a1.b;
    }

    private void i()
    {
        if (!a && c != d)
        {
            throw new AssertionError();
        }
        int k = c;
        int l = b.length;
        int i1 = l - k;
        int j1 = l << 1;
        if (j1 < 0)
        {
            throw new IllegalStateException("Sorry, deque too big");
        } else
        {
            Object aobj[] = new Object[j1];
            System.arraycopy(((Object) (b)), k, ((Object) (aobj)), 0, i1);
            System.arraycopy(((Object) (b)), 0, ((Object) (aobj)), i1, k);
            b = aobj;
            c = 0;
            d = l;
            return;
        }
    }

    private void j()
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

    public Object a()
    {
        Object obj = b();
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return obj;
        }
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("e == null");
        }
        Object aobj[] = b;
        int k = c - 1 & b.length - 1;
        c = k;
        aobj[k] = obj;
        if (c == d)
        {
            i();
        }
    }

    public boolean add(Object obj)
    {
        b(obj);
        return true;
    }

    public Object b()
    {
        int k = c;
        Object obj = b[k];
        if (obj == null)
        {
            return null;
        } else
        {
            b[k] = null;
            c = k + 1 & b.length - 1;
            return obj;
        }
    }

    public void b(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("e == null");
        }
        b[d] = obj;
        int k = d + 1 & b.length - 1;
        d = k;
        if (k == c)
        {
            i();
        }
    }

    public Object c()
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

    public boolean c(Object obj)
    {
        b(obj);
        return true;
    }

    public void clear()
    {
        int k = c;
        int i1 = d;
        if (k != i1)
        {
            d = 0;
            c = 0;
            int j1 = b.length;
            int l;
            do
            {
                b[k] = null;
                l = k + 1 & j1 - 1;
                k = l;
            } while (l != i1);
        }
    }

    public Object clone()
    {
        return h();
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int l = b.length;
        int k = c;
        do
        {
            Object obj1 = b[k];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    return true;
                }
                k = k + 1 & l - 1;
            } else
            {
                return false;
            }
        } while (true);
    }

    public Object d()
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

    public boolean d(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        int l = b.length;
        int k = c;
        do
        {
            Object obj1 = b[k];
            if (obj1 != null)
            {
                if (obj.equals(obj1))
                {
                    a(k);
                    return true;
                }
                k = k + 1 & l - 1;
            } else
            {
                return false;
            }
        } while (true);
    }

    public Object e()
    {
        return b[c];
    }

    public void e(Object obj)
    {
        a(obj);
    }

    public Object element()
    {
        return c();
    }

    public Object f()
    {
        return b[d - 1 & b.length - 1];
    }

    public Object g()
    {
        return a();
    }

    public a h()
    {
        a a1;
        try
        {
            a1 = (a)super.clone();
            System.arraycopy(((Object) (b)), 0, ((Object) (a1.b)), 0, b.length);
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return a1;
    }

    public boolean isEmpty()
    {
        return c == d;
    }

    public Iterator iterator()
    {
        return new c(this, null);
    }

    public boolean offer(Object obj)
    {
        return c(obj);
    }

    public Object peek()
    {
        return e();
    }

    public Object poll()
    {
        return b();
    }

    public Object remove()
    {
        return a();
    }

    public boolean remove(Object obj)
    {
        return d(obj);
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
        int k = size();
        if (aobj.length < k)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        a(aobj);
        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
