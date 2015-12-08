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
//            ImmutableSortedSet, Iterators, UnmodifiableIterator

class EmptyImmutableSortedSet extends ImmutableSortedSet
{

    private static final Object EMPTY_ARRAY[] = new Object[0];

    EmptyImmutableSortedSet(Comparator comparator)
    {
        super(comparator);
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

    public int hashCode()
    {
        return 0;
    }

    ImmutableSortedSet headSetImpl(Object obj)
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

    public UnmodifiableIterator iterator()
    {
        return Iterators.emptyIterator();
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

    ImmutableSortedSet subSetImpl(Object obj, Object obj1)
    {
        return this;
    }

    ImmutableSortedSet tailSetImpl(Object obj)
    {
        return this;
    }

    public Object[] toArray()
    {
        return EMPTY_ARRAY;
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
