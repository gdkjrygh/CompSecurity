// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.functions.Predicate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.soundcloud.java.collections:
//            FilteredSet

class FilteredSortedSet extends FilteredSet
    implements SortedSet
{

    private final SortedSet sortedUnfiltered;

    FilteredSortedSet(SortedSet sortedset, Predicate predicate)
    {
        super(sortedset, predicate);
        sortedUnfiltered = sortedset;
    }

    public Comparator comparator()
    {
        return sortedUnfiltered.comparator();
    }

    public Object first()
    {
        return iterator().next();
    }

    public SortedSet headSet(Object obj)
    {
        return new FilteredSortedSet(sortedUnfiltered.headSet(obj), predicate);
    }

    public Object last()
    {
        SortedSet sortedset = sortedUnfiltered;
        do
        {
            Object obj = sortedset.last();
            if (predicate.apply(obj))
            {
                return obj;
            }
            sortedset = sortedset.headSet(obj);
        } while (true);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new FilteredSortedSet(sortedUnfiltered.subSet(obj, obj1), predicate);
    }

    public SortedSet tailSet(Object obj)
    {
        return new FilteredSortedSet(sortedUnfiltered.tailSet(obj), predicate);
    }
}
