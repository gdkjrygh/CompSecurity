// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            SortedSetMultimap, MapConstraints, MapConstraint

private static class  extends 
    implements SortedSetMultimap
{

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile Set get(Object obj)
    {
        return get(obj);
    }

    public SortedSet get(Object obj)
    {
        return (SortedSet)super.get(obj);
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public volatile Set removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public SortedSet removeAll(Object obj)
    {
        return (SortedSet)super.All(obj);
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public volatile Set replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public SortedSet replaceValues(Object obj, Iterable iterable)
    {
        return (SortedSet)super.eValues(obj, iterable);
    }

    public Comparator valueComparator()
    {
        return ((SortedSetMultimap)_mthdelegate()).valueComparator();
    }

    (SortedSetMultimap sortedsetmultimap, MapConstraint mapconstraint)
    {
        super(sortedsetmultimap, mapconstraint);
    }
}
