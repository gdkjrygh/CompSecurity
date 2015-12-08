// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cva;
import cvh;
import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet

class DescendingImmutableSortedSet extends ImmutableSortedSet
{

    private final ImmutableSortedSet forward;

    DescendingImmutableSortedSet(ImmutableSortedSet immutablesortedset)
    {
        super(cva.a(immutablesortedset.comparator()).a());
        forward = immutablesortedset;
    }

    final int a(Object obj)
    {
        int i = forward.a(obj);
        if (i == -1)
        {
            return i;
        } else
        {
            return size() - 1 - i;
        }
    }

    final ImmutableSortedSet a(Object obj, boolean flag)
    {
        return forward.d(obj, flag).m_();
    }

    final ImmutableSortedSet a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return forward.b(obj1, flag1, obj, flag).m_();
    }

    public final cvh a()
    {
        return forward.c();
    }

    final ImmutableSortedSet b(Object obj, boolean flag)
    {
        return forward.c(obj, flag).m_();
    }

    public final cvh c()
    {
        return forward.a();
    }

    public Object ceiling(Object obj)
    {
        return forward.floor(obj);
    }

    final ImmutableSortedSet d()
    {
        throw new AssertionError("should never be called");
    }

    public Iterator descendingIterator()
    {
        return forward.a();
    }

    public volatile NavigableSet descendingSet()
    {
        return forward;
    }

    final boolean e()
    {
        return forward.e();
    }

    public Object floor(Object obj)
    {
        return forward.ceiling(obj);
    }

    public Object higher(Object obj)
    {
        return forward.lower(obj);
    }

    public Iterator iterator()
    {
        return forward.c();
    }

    public Object lower(Object obj)
    {
        return forward.higher(obj);
    }

    public final ImmutableSortedSet m_()
    {
        return forward;
    }

    public int size()
    {
        return forward.size();
    }
}
