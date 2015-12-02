// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            es, kr, gg, jp, 
//            mi, mh

final class kq extends es
{

    final transient Object a;

    kq(Object obj)
    {
        a = Preconditions.checkNotNull(obj);
    }

    public es a(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = es.d();
        }
        return ((es) (obj));
    }

    public mi a(int i)
    {
        Preconditions.checkPositionIndex(i, 1);
        return new kr(this, i);
    }

    boolean a()
    {
        return false;
    }

    public boolean contains(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !a.equals(((List) (obj)).get(0)))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, 1);
        return a;
    }

    public mh h_()
    {
        return gg.a(a);
    }

    public int hashCode()
    {
        return a.hashCode() + 31;
    }

    public int indexOf(Object obj)
    {
        return !a.equals(obj) ? -1 : 0;
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
        return !a.equals(obj) ? -1 : 0;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return 1;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public Object[] toArray()
    {
        return (new Object[] {
            a
        });
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length != 0) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, 1);
_L4:
        aobj1[0] = a;
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > 1)
        {
            aobj[1] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        String s = a.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
