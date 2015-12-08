// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, Iterators, Ordering, ImmutableMultiset, 
//            CollectPreconditions, UnmodifiableSortedMultiset, SortedMultiset

public final class Multisets
{

    private static final Ordering DECREASING_COUNT_ORDERING = new _cls5();

    private Multisets()
    {
    }

    static boolean addAllImpl(Multiset multiset, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof Multiset)
        {
            Multiset.Entry entry;
            for (collection = cast(collection).entrySet().iterator(); collection.hasNext(); multiset.add(entry.getElement(), entry.getCount()))
            {
                entry = (Multiset.Entry)collection.next();
            }

        } else
        {
            Iterators.addAll(multiset, collection.iterator());
        }
        return true;
    }

    static Multiset cast(Iterable iterable)
    {
        return (Multiset)iterable;
    }

    public static boolean containsOccurrences(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        for (multiset1 = multiset1.entrySet().iterator(); multiset1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)multiset1.next();
            if (multiset.count(entry.getElement()) < entry.getCount())
            {
                return false;
            }
        }

        return true;
    }

    public static ImmutableMultiset copyHighestCountFirst(Multiset multiset)
    {
        return ImmutableMultiset.copyFromEntries(DECREASING_COUNT_ORDERING.immutableSortedCopy(multiset.entrySet()));
    }

    public static Multiset difference(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new _cls4(multiset, multiset1);
    }

    static boolean equalsImpl(Multiset multiset, Object obj)
    {
        if (obj == multiset)
        {
            return true;
        }
        if (obj instanceof Multiset)
        {
            obj = (Multiset)obj;
            if (multiset.size() != ((Multiset) (obj)).size() || multiset.entrySet().size() != ((Multiset) (obj)).entrySet().size())
            {
                return false;
            }
            for (obj = ((Multiset) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                Multiset.Entry entry = (Multiset.Entry)((Iterator) (obj)).next();
                if (multiset.count(entry.getElement()) != entry.getCount())
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    public static Multiset filter(Multiset multiset, Predicate predicate)
    {
        if (multiset instanceof FilteredMultiset)
        {
            multiset = (FilteredMultiset)multiset;
            predicate = Predicates.and(((FilteredMultiset) (multiset)).predicate, predicate);
            return new FilteredMultiset(((FilteredMultiset) (multiset)).unfiltered, predicate);
        } else
        {
            return new FilteredMultiset(multiset, predicate);
        }
    }

    public static Multiset.Entry immutableEntry(Object obj, int i)
    {
        return new ImmutableEntry(obj, i);
    }

    static int inferDistinctElements(Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            return ((Multiset)iterable).elementSet().size();
        } else
        {
            return 11;
        }
    }

    public static Multiset intersection(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new _cls2(multiset, multiset1);
    }

    static Iterator iteratorImpl(Multiset multiset)
    {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static boolean removeAllImpl(Multiset multiset, Collection collection)
    {
        Object obj = collection;
        if (collection instanceof Multiset)
        {
            obj = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().removeAll(((Collection) (obj)));
    }

    public static boolean removeOccurrences(Multiset multiset, Iterable iterable)
    {
        if (iterable instanceof Multiset)
        {
            return removeOccurrencesImpl(multiset, (Multiset)iterable);
        } else
        {
            return removeOccurrencesImpl(multiset, iterable);
        }
    }

    private static boolean removeOccurrencesImpl(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        Iterator iterator = multiset.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            int i = multiset1.count(entry.getElement());
            if (i >= entry.getCount())
            {
                iterator.remove();
                flag = true;
            } else
            if (i > 0)
            {
                multiset.remove(entry.getElement(), i);
                flag = true;
            }
        } while (true);
        return flag;
    }

    private static boolean removeOccurrencesImpl(Multiset multiset, Iterable iterable)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(iterable);
        boolean flag = false;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            flag |= multiset.remove(iterable.next());
        }

        return flag;
    }

    static boolean retainAllImpl(Multiset multiset, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        Object obj = collection;
        if (collection instanceof Multiset)
        {
            obj = ((Multiset)collection).elementSet();
        }
        return multiset.elementSet().retainAll(((Collection) (obj)));
    }

    public static boolean retainOccurrences(Multiset multiset, Multiset multiset1)
    {
        return retainOccurrencesImpl(multiset, multiset1);
    }

    private static boolean retainOccurrencesImpl(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        Iterator iterator = multiset.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)iterator.next();
            int i = multiset1.count(entry.getElement());
            if (i == 0)
            {
                iterator.remove();
                flag = true;
            } else
            if (i < entry.getCount())
            {
                multiset.setCount(entry.getElement(), i);
                flag = true;
            }
        } while (true);
        return flag;
    }

    static int setCountImpl(Multiset multiset, Object obj, int i)
    {
        CollectPreconditions.checkNonnegative(i, "count");
        int j = multiset.count(obj);
        i -= j;
        if (i > 0)
        {
            multiset.add(obj, i);
        } else
        if (i < 0)
        {
            multiset.remove(obj, -i);
            return j;
        }
        return j;
    }

    static boolean setCountImpl(Multiset multiset, Object obj, int i, int j)
    {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(j, "newCount");
        if (multiset.count(obj) == i)
        {
            multiset.setCount(obj, j);
            return true;
        } else
        {
            return false;
        }
    }

    static int sizeImpl(Multiset multiset)
    {
        multiset = multiset.entrySet().iterator();
        long l;
        for (l = 0L; multiset.hasNext(); l = (long)((Multiset.Entry)multiset.next()).getCount() + l) { }
        return Ints.saturatedCast(l);
    }

    public static Multiset sum(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new _cls3(multiset, multiset1);
    }

    public static Multiset union(Multiset multiset, Multiset multiset1)
    {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset1);
        return new _cls1(multiset, multiset1);
    }

    public static Multiset unmodifiableMultiset(ImmutableMultiset immutablemultiset)
    {
        return (Multiset)Preconditions.checkNotNull(immutablemultiset);
    }

    public static Multiset unmodifiableMultiset(Multiset multiset)
    {
        if ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset))
        {
            return multiset;
        } else
        {
            return new UnmodifiableMultiset((Multiset)Preconditions.checkNotNull(multiset));
        }
    }

    public static SortedMultiset unmodifiableSortedMultiset(SortedMultiset sortedmultiset)
    {
        return new UnmodifiableSortedMultiset((SortedMultiset)Preconditions.checkNotNull(sortedmultiset));
    }


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class FilteredMultiset {}


    /* member class not found */
    class ImmutableEntry {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class MultisetIteratorImpl {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class UnmodifiableMultiset {}


    /* member class not found */
    class _cls5 {}

}
