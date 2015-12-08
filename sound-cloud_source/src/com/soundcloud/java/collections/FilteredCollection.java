// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.functions.Predicates;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterables, MoreCollections, Iterators, Lists

class FilteredCollection extends AbstractCollection
{

    final Predicate predicate;
    final Collection unfiltered;

    FilteredCollection(Collection collection, Predicate predicate1)
    {
        unfiltered = collection;
        predicate = predicate1;
    }

    public boolean add(Object obj)
    {
        Preconditions.checkArgument(predicate.apply(obj));
        return unfiltered.add(obj);
    }

    public boolean addAll(Collection collection)
    {
        Object obj;
        for (Iterator iterator1 = collection.iterator(); iterator1.hasNext(); Preconditions.checkArgument(predicate.apply(obj)))
        {
            obj = iterator1.next();
        }

        return unfiltered.addAll(collection);
    }

    public void clear()
    {
        Iterables.removeIf(unfiltered, predicate);
    }

    public boolean contains(Object obj)
    {
        if (MoreCollections.safeContains(unfiltered, obj))
        {
            return predicate.apply(obj);
        } else
        {
            return false;
        }
    }

    public boolean containsAll(Collection collection)
    {
        return MoreCollections.containsAllImpl(this, collection);
    }

    FilteredCollection createCombined(Predicate predicate1)
    {
        return new FilteredCollection(unfiltered, Predicates.and(predicate, predicate1));
    }

    public boolean isEmpty()
    {
        return !Iterables.any(unfiltered, predicate);
    }

    public Iterator iterator()
    {
        return Iterators.filter(unfiltered.iterator(), predicate);
    }

    public boolean remove(Object obj)
    {
        return contains(obj) && unfiltered.remove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.in(collection)));
    }

    public boolean retainAll(Collection collection)
    {
        return Iterables.removeIf(unfiltered, Predicates.and(predicate, Predicates.not(Predicates.in(collection))));
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    public Object[] toArray()
    {
        return Lists.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return Lists.newArrayList(iterator()).toArray(aobj);
    }
}
