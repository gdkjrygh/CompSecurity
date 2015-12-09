// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList, Iterators, UnmodifiableIterator

final class EmptyImmutableSortedSet extends ImmutableSortedSet
{

    EmptyImmutableSortedSet(Comparator comparator)
    {
        super(comparator);
    }

    public final ImmutableList asList()
    {
        return ImmutableList.of();
    }

    public final boolean contains(Object obj)
    {
        return false;
    }

    public final boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final int copyIntoArray(Object aobj[], int i)
    {
        return i;
    }

    public final UnmodifiableIterator descendingIterator()
    {
        return Iterators.emptyIterator();
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final Object first()
    {
        throw new NoSuchElementException();
    }

    public final int hashCode()
    {
        return 0;
    }

    final ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return this;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final UnmodifiableIterator iterator()
    {
        return Iterators.emptyIterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final Object last()
    {
        throw new NoSuchElementException();
    }

    public final int size()
    {
        return 0;
    }

    final ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    final ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return this;
    }

    public final String toString()
    {
        return "[]";
    }
}
