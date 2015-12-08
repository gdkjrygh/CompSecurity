// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Lists, Iterables, Collections2, Multimaps, 
//            ImmutableList, Maps, ImmutableSet, Ordering, 
//            ImmutableSortedSet, ImmutableListMultimap, ImmutableMap

public abstract class FluentIterable
    implements Iterable
{

    private final Iterable iterable;

    protected FluentIterable()
    {
        iterable = this;
    }

    FluentIterable(Iterable iterable1)
    {
        iterable = (Iterable)Preconditions.checkNotNull(iterable1);
    }

    public static FluentIterable from(FluentIterable fluentiterable)
    {
        return (FluentIterable)Preconditions.checkNotNull(fluentiterable);
    }

    public static FluentIterable from(Iterable iterable1)
    {
        if (iterable1 instanceof FluentIterable)
        {
            return (FluentIterable)iterable1;
        } else
        {
            return new _cls1(iterable1, iterable1);
        }
    }

    public static FluentIterable of(Object aobj[])
    {
        return from(Lists.newArrayList(aobj));
    }

    public final boolean allMatch(Predicate predicate)
    {
        return Iterables.all(iterable, predicate);
    }

    public final boolean anyMatch(Predicate predicate)
    {
        return Iterables.any(iterable, predicate);
    }

    public final FluentIterable append(Iterable iterable1)
    {
        return from(Iterables.concat(iterable, iterable1));
    }

    public final transient FluentIterable append(Object aobj[])
    {
        return from(Iterables.concat(iterable, Arrays.asList(aobj)));
    }

    public final boolean contains(Object obj)
    {
        return Iterables.contains(iterable, obj);
    }

    public final Collection copyInto(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        if (iterable instanceof Collection)
        {
            collection.addAll(Collections2.cast(iterable));
        } else
        {
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) 
            {
                collection.add(iterator.next());
            }
        }
        return collection;
    }

    public final FluentIterable cycle()
    {
        return from(Iterables.cycle(iterable));
    }

    public final FluentIterable filter(Predicate predicate)
    {
        return from(Iterables.filter(iterable, predicate));
    }

    public final FluentIterable filter(Class class1)
    {
        return from(Iterables.filter(iterable, class1));
    }

    public final Optional first()
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            return Optional.of(iterator.next());
        } else
        {
            return Optional.absent();
        }
    }

    public final Optional firstMatch(Predicate predicate)
    {
        return Iterables.tryFind(iterable, predicate);
    }

    public final Object get(int i)
    {
        return Iterables.get(iterable, i);
    }

    public final ImmutableListMultimap index(Function function)
    {
        return Multimaps.index(iterable, function);
    }

    public final boolean isEmpty()
    {
        return !iterable.iterator().hasNext();
    }

    public final String join(Joiner joiner)
    {
        return joiner.join(this);
    }

    public final Optional last()
    {
        if (iterable instanceof List)
        {
            List list = (List)iterable;
            if (list.isEmpty())
            {
                return Optional.absent();
            } else
            {
                return Optional.of(list.get(list.size() - 1));
            }
        }
        Iterator iterator = iterable.iterator();
        if (!iterator.hasNext())
        {
            return Optional.absent();
        }
        if (iterable instanceof SortedSet)
        {
            return Optional.of(((SortedSet)iterable).last());
        }
        Object obj;
        do
        {
            obj = iterator.next();
        } while (iterator.hasNext());
        return Optional.of(obj);
    }

    public final FluentIterable limit(int i)
    {
        return from(Iterables.limit(iterable, i));
    }

    public final int size()
    {
        return Iterables.size(iterable);
    }

    public final FluentIterable skip(int i)
    {
        return from(Iterables.skip(iterable, i));
    }

    public final Object[] toArray(Class class1)
    {
        return Iterables.toArray(iterable, class1);
    }

    public final ImmutableList toList()
    {
        return ImmutableList.copyOf(iterable);
    }

    public final ImmutableMap toMap(Function function)
    {
        return Maps.toMap(iterable, function);
    }

    public final ImmutableSet toSet()
    {
        return ImmutableSet.copyOf(iterable);
    }

    public final ImmutableList toSortedList(Comparator comparator)
    {
        return Ordering.from(comparator).immutableSortedCopy(iterable);
    }

    public final ImmutableSortedSet toSortedSet(Comparator comparator)
    {
        return ImmutableSortedSet.copyOf(comparator, iterable);
    }

    public String toString()
    {
        return Iterables.toString(iterable);
    }

    public final FluentIterable transform(Function function)
    {
        return from(Iterables.transform(iterable, function));
    }

    public FluentIterable transformAndConcat(Function function)
    {
        return from(Iterables.concat(transform(function)));
    }

    public final ImmutableMap uniqueIndex(Function function)
    {
        return Maps.uniqueIndex(iterable, function);
    }

    /* member class not found */
    class _cls1 {}

}
