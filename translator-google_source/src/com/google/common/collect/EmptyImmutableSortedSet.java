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
//            ImmutableSortedSet, ImmutableList, Ordering, bl, 
//            ej

class EmptyImmutableSortedSet extends ImmutableSortedSet
{

    EmptyImmutableSortedSet(Comparator comparator)
    {
        super(comparator);
    }

    public ImmutableList asList()
    {
        return ImmutableList.of();
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    int copyIntoArray(Object aobj[], int i)
    {
        return i;
    }

    ImmutableSortedSet createDescendingSet()
    {
        return new EmptyImmutableSortedSet(Ordering.from(comparator).reverse());
    }

    public ej descendingIterator()
    {
        return bl.a();
    }

    public volatile Iterator descendingIterator()
    {
        return descendingIterator();
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

    public int hashCode()
    {
        return 0;
    }

    ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return this;
    }

    int indexOf(Object obj)
    {
        return -1;
    }

    public boolean isEmpty()
    {
        return true;
    }

    boolean isPartialView()
    {
        return false;
    }

    public ej iterator()
    {
        return bl.a();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Object last()
    {
        throw new NoSuchElementException();
    }

    public int size()
    {
        return 0;
    }

    ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return this;
    }

    public String toString()
    {
        return "[]";
    }
}
