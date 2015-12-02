// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            es, kv, kh, fy, 
//            mi, mh

final class fo extends es
    implements kv
{

    private final transient fy a;
    private final transient es b;

    fo(fy fy1, es es1)
    {
        a = fy1;
        b = es1;
    }

    public es a(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        if (i == j)
        {
            return es.d();
        } else
        {
            return (new kh(b.a(i, j), a.comparator())).h();
        }
    }

    public mi a(int i)
    {
        return b.a(i);
    }

    boolean a()
    {
        return b.a();
    }

    public mi c()
    {
        return b.c();
    }

    public Comparator comparator()
    {
        return a.comparator();
    }

    public boolean contains(Object obj)
    {
        return a.a(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        return b.equals(obj);
    }

    public Object get(int i)
    {
        return b.get(i);
    }

    public mh h_()
    {
        return b.h_();
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public int indexOf(Object obj)
    {
        return a.a(obj);
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int lastIndexOf(Object obj)
    {
        return a.a(obj);
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
        return b.size();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }
}
