// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, SortedMultiset, Ordering, Multisets, 
//            BoundType

abstract class AbstractSortedMultiset extends AbstractMultiset
    implements SortedMultiset
{

    final Comparator comparator;
    private transient SortedMultiset descendingMultiset;

    AbstractSortedMultiset()
    {
        this(((Comparator) (Ordering.natural())));
    }

    AbstractSortedMultiset(Comparator comparator1)
    {
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
    }

    public Comparator comparator()
    {
        return comparator;
    }

    SortedMultiset createDescendingMultiset()
    {
        return new _cls1();
    }

    NavigableSet createElementSet()
    {
        return new SortedMultisets.NavigableElementSet(this);
    }

    volatile Set createElementSet()
    {
        return createElementSet();
    }

    abstract Iterator descendingEntryIterator();

    Iterator descendingIterator()
    {
        return Multisets.iteratorImpl(descendingMultiset());
    }

    public SortedMultiset descendingMultiset()
    {
        SortedMultiset sortedmultiset1 = descendingMultiset;
        SortedMultiset sortedmultiset = sortedmultiset1;
        if (sortedmultiset1 == null)
        {
            sortedmultiset = createDescendingMultiset();
            descendingMultiset = sortedmultiset;
        }
        return sortedmultiset;
    }

    public NavigableSet elementSet()
    {
        return (NavigableSet)super.elementSet();
    }

    public volatile Set elementSet()
    {
        return elementSet();
    }

    public volatile SortedSet elementSet()
    {
        return elementSet();
    }

    public Multiset.Entry firstEntry()
    {
        Iterator iterator = entryIterator();
        if (iterator.hasNext())
        {
            return (Multiset.Entry)iterator.next();
        } else
        {
            return null;
        }
    }

    public Multiset.Entry lastEntry()
    {
        Iterator iterator = descendingEntryIterator();
        if (iterator.hasNext())
        {
            return (Multiset.Entry)iterator.next();
        } else
        {
            return null;
        }
    }

    public Multiset.Entry pollFirstEntry()
    {
        Iterator iterator = entryIterator();
        if (iterator.hasNext())
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            entry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            iterator.remove();
            return entry;
        } else
        {
            return null;
        }
    }

    public Multiset.Entry pollLastEntry()
    {
        Iterator iterator = descendingEntryIterator();
        if (iterator.hasNext())
        {
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            entry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
            iterator.remove();
            return entry;
        } else
        {
            return null;
        }
    }

    public SortedMultiset subMultiset(Object obj, BoundType boundtype, Object obj1, BoundType boundtype1)
    {
        Preconditions.checkNotNull(boundtype);
        Preconditions.checkNotNull(boundtype1);
        return tailMultiset(obj, boundtype).headMultiset(obj1, boundtype1);
    }

    /* member class not found */
    class _cls1 {}

}
