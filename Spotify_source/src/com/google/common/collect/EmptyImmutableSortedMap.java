// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cva;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, ImmutableSortedSet, ImmutableSet, ImmutableList, 
//            ImmutableCollection

final class EmptyImmutableSortedMap extends ImmutableSortedMap
{

    private final transient ImmutableSortedSet a;

    EmptyImmutableSortedMap(Comparator comparator)
    {
        a = ImmutableSortedSet.a(comparator);
    }

    private EmptyImmutableSortedMap(Comparator comparator, ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        a = ImmutableSortedSet.a(comparator);
    }

    public final ImmutableSortedMap a(Object obj, boolean flag)
    {
        ctz.a(obj);
        return this;
    }

    public final ImmutableSet b()
    {
        return ImmutableSet.g();
    }

    public final ImmutableSortedMap b(Object obj, boolean flag)
    {
        ctz.a(obj);
        return this;
    }

    final ImmutableSet c()
    {
        throw new AssertionError("should never be called");
    }

    public final volatile ImmutableSet d()
    {
        return a;
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return ImmutableSet.g();
    }

    public final ImmutableCollection f()
    {
        return ImmutableList.d();
    }

    final ImmutableSortedMap g()
    {
        return new EmptyImmutableSortedMap(cva.a(comparator()).a(), this);
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        ctz.a(obj);
        return this;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final volatile Set keySet()
    {
        return a;
    }

    public final ImmutableSortedSet p_()
    {
        return a;
    }

    public final int size()
    {
        return 0;
    }

    public final NavigableMap tailMap(Object obj, boolean flag)
    {
        ctz.a(obj);
        return this;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return ImmutableList.d();
    }
}
