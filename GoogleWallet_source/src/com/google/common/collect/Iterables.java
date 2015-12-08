// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterators, ImmutableList, ObjectArrays, 
//            Lists, FluentIterable, TransformedIterator

public final class Iterables
{

    public static boolean addAll(Collection collection, Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return collection.addAll(Collections2.cast(iterable));
        } else
        {
            return Iterators.addAll(collection, ((Iterable)Preconditions.checkNotNull(iterable)).iterator());
        }
    }

    private static Iterable concat(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        return new FluentIterable(iterable) {

            final Iterable val$inputs;

            public final Iterator iterator()
            {
                return Iterators.concat(Iterables.iterators(inputs));
            }

            
            {
                inputs = iterable;
                super();
            }
        };
    }

    public static Iterable concat(Iterable iterable, Iterable iterable1)
    {
        return concat(((Iterable) (ImmutableList.of(iterable, iterable1))));
    }

    public static boolean elementsEqual(Iterable iterable, Iterable iterable1)
    {
        if ((iterable instanceof Collection) && (iterable1 instanceof Collection))
        {
            Collection collection = (Collection)iterable;
            Collection collection1 = (Collection)iterable1;
            if (collection.size() != collection1.size())
            {
                return false;
            }
        }
        return Iterators.elementsEqual(iterable.iterator(), iterable1.iterator());
    }

    public static Iterable filter(Iterable iterable, Predicate predicate)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new FluentIterable(iterable, predicate) {

            final Predicate val$predicate;
            final Iterable val$unfiltered;

            public final Iterator iterator()
            {
                return Iterators.filter(unfiltered.iterator(), predicate);
            }

            
            {
                unfiltered = iterable;
                predicate = predicate1;
                super();
            }
        };
    }

    public static Object find(Iterable iterable, Predicate predicate)
    {
        return Iterators.find(iterable.iterator(), predicate);
    }

    public static Object find(Iterable iterable, Predicate predicate, Object obj)
    {
        return Iterators.find(iterable.iterator(), predicate, obj);
    }

    public static Object getFirst(Iterable iterable, Object obj)
    {
        return Iterators.getNext(iterable.iterator(), obj);
    }

    public static Object getLast(Iterable iterable)
    {
        if (iterable instanceof List)
        {
            iterable = (List)iterable;
            if (iterable.isEmpty())
            {
                throw new NoSuchElementException();
            } else
            {
                return getLastInNonemptyList(iterable);
            }
        } else
        {
            return Iterators.getLast(iterable.iterator());
        }
    }

    private static Object getLastInNonemptyList(List list)
    {
        return list.get(list.size() - 1);
    }

    public static Object getOnlyElement(Iterable iterable)
    {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static int indexOf(Iterable iterable, Predicate predicate)
    {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    private static Iterator iterators(Iterable iterable)
    {
        return new TransformedIterator(iterable.iterator()) {

            private static Iterator transform(Iterable iterable1)
            {
                return iterable1.iterator();
            }

            final volatile Object transform(Object obj)
            {
                return transform((Iterable)obj);
            }

        };
    }

    static Object[] toArray(Iterable iterable)
    {
        return toCollection(iterable).toArray();
    }

    public static Object[] toArray(Iterable iterable, Class class1)
    {
        iterable = toCollection(iterable);
        return iterable.toArray(ObjectArrays.newArray(class1, iterable.size()));
    }

    private static Collection toCollection(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return (Collection)iterable;
        } else
        {
            return Lists.newArrayList(iterable.iterator());
        }
    }

    public static String toString(Iterable iterable)
    {
        return Iterators.toString(iterable.iterator());
    }

    public static Iterable transform(Iterable iterable, Function function)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new FluentIterable(iterable, function) {

            final Iterable val$fromIterable;
            final Function val$function;

            public final Iterator iterator()
            {
                return Iterators.transform(fromIterable.iterator(), function);
            }

            
            {
                fromIterable = iterable;
                function = function1;
                super();
            }
        };
    }

}
