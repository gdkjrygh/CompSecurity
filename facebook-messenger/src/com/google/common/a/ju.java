// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            es, jv, gg, jp, 
//            ax, mi, mh

class ju extends es
{

    private final transient int a;
    private final transient int b;
    private final transient Object d[];

    ju(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    ju(Object aobj[], int i, int j)
    {
        a = i;
        b = j;
        d = aobj;
    }

    static Object[] a(ju ju1)
    {
        return ju1.d;
    }

    static int b(ju ju1)
    {
        return ju1.a;
    }

    public es a(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, b);
        if (i == j)
        {
            return es.d();
        } else
        {
            return new ju(d, a + i, j - i);
        }
    }

    public mi a(int i)
    {
        return new jv(this, b, i);
    }

    boolean a()
    {
        return a != 0 || b != d.length;
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof List))
        {
            return false;
        }
        List list = (List)obj;
        if (size() != list.size())
        {
            return false;
        }
        int i = a;
        if (obj instanceof ju)
        {
            obj = (ju)obj;
            for (int j = ((ju) (obj)).a; j < ((ju) (obj)).a + ((ju) (obj)).b;)
            {
                if (!d[i].equals(((ju) (obj)).d[j]))
                {
                    return false;
                }
                j++;
                i++;
            }

        } else
        {
            for (obj = list.iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj1 = ((Iterator) (obj)).next();
                if (!d[i].equals(obj1))
                {
                    return false;
                }
                i++;
            }

        }
        return true;
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, b);
        return d[a + i];
    }

    public mh h_()
    {
        return gg.a(d, a, b);
    }

    public int hashCode()
    {
        int j = 1;
        for (int i = a; i < a + b; i++)
        {
            j = j * 31 + d[i].hashCode();
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj != null)
        {
            for (int i = a; i < a + b; i++)
            {
                if (d[i].equals(obj))
                {
                    return i - a;
                }
            }

        }
        return -1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            for (int i = (a + b) - 1; i >= a; i--)
            {
                if (d[i].equals(obj))
                {
                    return i - a;
                }
            }

        }
        return -1;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return b;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[size()];
        System.arraycopy(((Object) (d)), a, ((Object) (aobj)), 0, b);
        return aobj;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length >= b) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, b);
_L4:
        System.arraycopy(((Object) (d)), a, ((Object) (aobj1)), 0, b);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > b)
        {
            aobj[b] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        StringBuilder stringbuilder = ax.a(size()).append('[').append(d[a]);
        for (int i = a + 1; i < a + b; i++)
        {
            stringbuilder.append(", ").append(d[i]);
        }

        return stringbuilder.append(']').toString();
    }
}
