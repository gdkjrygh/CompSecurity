// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableSortedSet, RegularImmutableSortedSet, UnmodifiableIterator, 
//            UnmodifiableListIterator

final class ImmutableSortedAsList extends ImmutableList
{

    private final transient ImmutableList backingList;
    private final transient ImmutableSortedSet backingSet;

    ImmutableSortedAsList(ImmutableSortedSet immutablesortedset, ImmutableList immutablelist)
    {
        backingSet = immutablesortedset;
        backingList = immutablelist;
    }

    public boolean contains(Object obj)
    {
        return backingSet.indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        return backingList.equals(obj);
    }

    public Object get(int i)
    {
        return backingList.get(i);
    }

    public int hashCode()
    {
        return backingList.hashCode();
    }

    public int indexOf(Object obj)
    {
        return backingSet.indexOf(obj);
    }

    boolean isPartialView()
    {
        return backingList.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return backingList.iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return backingSet.indexOf(obj);
    }

    public UnmodifiableListIterator listIterator()
    {
        return backingList.listIterator();
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return backingList.listIterator(i);
    }

    public volatile ListIterator listIterator()
    {
        return listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public int size()
    {
        return backingList.size();
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        if (i == j)
        {
            return ImmutableList.of();
        } else
        {
            return (new RegularImmutableSortedSet(backingList.subList(i, j), backingSet.comparator())).asList();
        }
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    Object writeReplace()
    {
        return new ImmutableAsList.SerializedForm(backingSet);
    }
}
