// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

class b extends ImmutableList
{

    private final transient ImmutableList b;

    private int b(int i)
    {
        return size() - 1 - i;
    }

    public final ImmutableList a(int i, int j)
    {
        ctz.a(i, j, size());
        return b.a(size() - j, size() - i).g();
    }

    public boolean contains(Object obj)
    {
        return b.contains(obj);
    }

    final boolean e()
    {
        return b.e();
    }

    public final ImmutableList g()
    {
        return b;
    }

    public Object get(int i)
    {
        ctz.a(i, size());
        return b.get(b(i));
    }

    public int indexOf(Object obj)
    {
        int i = b.lastIndexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public Iterator iterator()
    {
        return super.a();
    }

    public int lastIndexOf(Object obj)
    {
        int i = b.indexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public ListIterator listIterator()
    {
        return a(0);
    }

    public ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public int size()
    {
        return b.size();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    (ImmutableList immutablelist)
    {
        b = immutablelist;
    }
}
