// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, ImmutableSortedSet, ImmutableSetMultimap, Ordering, 
//            ImmutableSet, ImmutableList, ImmutableCollection

final class EmptyImmutableSortedMap extends ImmutableSortedMap
{

    private final transient ImmutableSortedSet a;

    EmptyImmutableSortedMap(Comparator comparator)
    {
        a = ImmutableSortedSet.emptySet(comparator);
    }

    EmptyImmutableSortedMap(Comparator comparator, ImmutableSortedMap immutablesortedmap)
    {
        super(immutablesortedmap);
        a = ImmutableSortedSet.emptySet(comparator);
    }

    public final ImmutableSetMultimap asMultimap()
    {
        return ImmutableSetMultimap.of();
    }

    final ImmutableSortedMap createDescendingMap()
    {
        return new EmptyImmutableSortedMap(Ordering.from(comparator()).reverse(), this);
    }

    final ImmutableSet createEntrySet()
    {
        throw new AssertionError("should never be called");
    }

    public final ImmutableSet entrySet()
    {
        return ImmutableSet.of();
    }

    public final volatile Set entrySet()
    {
        return entrySet();
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final ImmutableSortedMap headMap(Object obj, boolean flag)
    {
        p.a(obj);
        return this;
    }

    public final volatile NavigableMap headMap(Object obj, boolean flag)
    {
        return headMap(obj, flag);
    }

    public final boolean isEmpty()
    {
        return true;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final volatile ImmutableSet keySet()
    {
        return keySet();
    }

    public final ImmutableSortedSet keySet()
    {
        return a;
    }

    public final volatile Set keySet()
    {
        return keySet();
    }

    public final int size()
    {
        return 0;
    }

    public final ImmutableSortedMap tailMap(Object obj, boolean flag)
    {
        p.a(obj);
        return this;
    }

    public final volatile NavigableMap tailMap(Object obj, boolean flag)
    {
        return tailMap(obj, flag);
    }

    public final String toString()
    {
        return "{}";
    }

    public final ImmutableCollection values()
    {
        return ImmutableList.of();
    }

    public final volatile Collection values()
    {
        return values();
    }
}
