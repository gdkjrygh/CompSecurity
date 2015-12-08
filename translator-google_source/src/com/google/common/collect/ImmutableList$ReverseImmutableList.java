// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

class a extends ImmutableList
{

    private final transient ImmutableList a;

    private int a(int i)
    {
        return size() - 1 - i;
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public Object get(int i)
    {
        p.a(i, size());
        return a.get(a(i));
    }

    public int indexOf(Object obj)
    {
        int i = a.lastIndexOf(obj);
        if (i >= 0)
        {
            return a(i);
        } else
        {
            return -1;
        }
    }

    boolean isPartialView()
    {
        return a.isPartialView();
    }

    public volatile Iterator iterator()
    {
        return super.iterator();
    }

    public int lastIndexOf(Object obj)
    {
        int i = a.indexOf(obj);
        if (i >= 0)
        {
            return a(i);
        } else
        {
            return -1;
        }
    }

    public volatile ListIterator listIterator()
    {
        return super.listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return super.listIterator(i);
    }

    public ImmutableList reverse()
    {
        return a;
    }

    public int size()
    {
        return a.size();
    }

    public ImmutableList subList(int i, int j)
    {
        p.a(i, j, size());
        return a.subList(size() - j, size() - i).reverse();
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    (ImmutableList immutablelist)
    {
        a = immutablelist;
    }
}
