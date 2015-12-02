// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            es, dm, gg, mi, 
//            mh

final class dl extends es
{

    static final dl a = new dl();
    static final mi b = new dm();
    private static final Object d[] = new Object[0];

    private dl()
    {
    }

    public es a(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, 0);
        return this;
    }

    public mi a(int i)
    {
        Preconditions.checkPositionIndex(i, 0);
        return b;
    }

    boolean a()
    {
        return false;
    }

    public mi c()
    {
        return b;
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
        if (obj instanceof List)
        {
            return ((List)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, 0);
        throw new AssertionError("unreachable");
    }

    public mh h_()
    {
        return gg.a();
    }

    public int hashCode()
    {
        return 1;
    }

    public int indexOf(Object obj)
    {
        return -1;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int lastIndexOf(Object obj)
    {
        return -1;
    }

    public ListIterator listIterator()
    {
        return c();
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return 0;
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    public Object[] toArray()
    {
        return d;
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
