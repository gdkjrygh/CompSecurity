// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            fy, gg, mh

class dr extends fy
{

    private static final Object b[] = new Object[0];

    dr(Comparator comparator)
    {
        super(comparator);
    }

    int a(Object obj)
    {
        return -1;
    }

    fy a(Object obj, boolean flag)
    {
        return this;
    }

    fy a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    boolean a()
    {
        return false;
    }

    fy b(Object obj, boolean flag)
    {
        return this;
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object first()
    {
        throw new NoSuchElementException();
    }

    public mh h_()
    {
        return gg.a();
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public Object last()
    {
        throw new NoSuchElementException();
    }

    public int size()
    {
        return 0;
    }

    public Object[] toArray()
    {
        return b;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    public String toString()
    {
        return "[]";
    }

}
