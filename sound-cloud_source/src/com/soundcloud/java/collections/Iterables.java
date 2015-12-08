// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.optional.Optional;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

// Referenced classes of package com.soundcloud.java.collections:
//            MoreCollections, Iterators, CollectPreconditions, Lists, 
//            MoreArrays

public final class Iterables
{

    private Iterables()
    {
    }

    public static boolean addAll(Collection collection, Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return collection.addAll(MoreCollections.cast(iterable));
        } else
        {
            return Iterators.addAll(collection, ((Iterable)Preconditions.checkNotNull(iterable)).iterator());
        }
    }

    public static boolean all(Iterable iterable, Predicate predicate)
    {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static boolean any(Iterable iterable, Predicate predicate)
    {
        return Iterators.any(iterable.iterator(), predicate);
    }

    public static Iterable concat(final Iterable inputs)
    {
        Preconditions.checkNotNull(inputs);
        return new _cls1();
    }

    public static transient Iterable concat(Iterable aiterable[])
    {
        Preconditions.checkNotNull(aiterable);
        return concat(((Iterable) (Arrays.asList(aiterable))));
    }

    public static boolean contains(Iterable iterable, Object obj)
    {
        if (iterable instanceof Collection)
        {
            return MoreCollections.safeContains((Collection)iterable, obj);
        } else
        {
            return Iterators.contains(iterable.iterator(), obj);
        }
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

    public static Iterable filter(final Iterable unfiltered, final Predicate predicate)
    {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(predicate);
        return new _cls6();
    }

    public static Iterable filter(final Iterable unfiltered, final Class type)
    {
        Preconditions.checkNotNull(unfiltered);
        Preconditions.checkNotNull(type);
        return new _cls7();
    }

    public static Object find(Iterable iterable, Predicate predicate)
    {
        return Iterators.find(iterable.iterator(), predicate);
    }

    public static Object find(Iterable iterable, Predicate predicate, Object obj)
    {
        return Iterators.find(iterable.iterator(), predicate, obj);
    }

    public static Object get(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List)
        {
            return ((List)iterable).get(i);
        } else
        {
            return Iterators.get(iterable.iterator(), i);
        }
    }

    public static Object get(Iterable iterable, int i, Object obj)
    {
        Preconditions.checkNotNull(iterable);
        CollectPreconditions.checkIndexNonnegative(i);
        if (iterable instanceof List)
        {
            iterable = Lists.cast(iterable);
            if (i < iterable.size())
            {
                obj = iterable.get(i);
            }
            return obj;
        } else
        {
            iterable = iterable.iterator();
            Iterators.advance(iterable, i);
            return Iterators.getNext(iterable, obj);
        }
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

    public static Object getLast(Iterable iterable, Object obj)
    {
        if (iterable instanceof Collection)
        {
            if (MoreCollections.cast(iterable).isEmpty())
            {
                return obj;
            }
            if (iterable instanceof List)
            {
                return getLastInNonemptyList(Lists.cast(iterable));
            }
        }
        return Iterators.getLast(iterable.iterator(), obj);
    }

    private static Object getLastInNonemptyList(List list)
    {
        return list.get(list.size() - 1);
    }

    public static Object getOnlyElement(Iterable iterable)
    {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static Object getOnlyElement(Iterable iterable, Object obj)
    {
        return Iterators.getOnlyElement(iterable.iterator(), obj);
    }

    public static int indexOf(Iterable iterable, Predicate predicate)
    {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static boolean isEmpty(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    private static Iterator iterators(Iterable iterable)
    {
        return new _cls2(iterable.iterator());
    }

    public static Iterable paddedPartition(final Iterable iterable, final int size)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (size > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new _cls4();
    }

    public static Iterable partition(final Iterable iterable, final int size)
    {
        Preconditions.checkNotNull(iterable);
        boolean flag;
        if (size > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new _cls3();
    }

    public static boolean removeAll(Iterable iterable, Collection collection)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).removeAll((Collection)Preconditions.checkNotNull(collection));
        } else
        {
            return Iterators.removeAll(iterable.iterator(), collection);
        }
    }

    static Object removeFirstMatching(Iterable iterable, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            Object obj = iterable.next();
            if (predicate.apply(obj))
            {
                iterable.remove();
                return obj;
            }
        }

        return null;
    }

    public static boolean removeIf(Iterable iterable, Predicate predicate)
    {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List))
        {
            return removeIfFromRandomAccessList((List)iterable, (Predicate)Preconditions.checkNotNull(predicate));
        } else
        {
            return Iterators.removeIf(iterable.iterator(), predicate);
        }
    }

    private static boolean removeIfFromRandomAccessList(List list, Predicate predicate)
    {
        int i;
        int j;
        boolean flag;
        flag = false;
        j = 0;
        i = 0;
_L2:
        Object obj;
        int k;
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = list.get(i);
        k = j;
        if (predicate.apply(obj))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (i <= j)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        list.set(j, obj);
        k = j + 1;
        i++;
        j = k;
        if (true) goto _L2; else goto _L1
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        slowRemoveIfForRemainingElements(list, predicate, j, i);
        flag = true;
_L4:
        return flag;
_L1:
        list.subList(j, list.size()).clear();
        if (i != j)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean retainAll(Iterable iterable, Collection collection)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).retainAll((Collection)Preconditions.checkNotNull(collection));
        } else
        {
            return Iterators.retainAll(iterable.iterator(), collection);
        }
    }

    public static int size(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).size();
        } else
        {
            return Iterators.size(iterable.iterator());
        }
    }

    private static void slowRemoveIfForRemainingElements(List list, Predicate predicate, int i, int j)
    {
        for (int k = list.size() - 1; k > j; k--)
        {
            if (predicate.apply(list.get(k)))
            {
                list.remove(k);
            }
        }

        for (j--; j >= i; j--)
        {
            list.remove(j);
        }

    }

    public static Object[] toArray(Iterable iterable, Class class1)
    {
        iterable = toCollection(iterable);
        return iterable.toArray(MoreArrays.newArray(class1, iterable.size()));
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

    public static Iterable transform(final Iterable fromIterable, final Function function)
    {
        Preconditions.checkNotNull(fromIterable);
        Preconditions.checkNotNull(function);
        return new _cls5();
    }

    public static Optional tryFind(Iterable iterable, Predicate predicate)
    {
        return Iterators.tryFind(iterable.iterator(), predicate);
    }


    private class _cls1
        implements Iterable
    {

        final Iterable val$inputs;

        public final Iterator iterator()
        {
            return Iterators.concat(Iterables.iterators(inputs));
        }

        _cls1()
        {
            inputs = iterable;
            super();
        }
    }


    private class _cls6
        implements Iterable
    {

        final Predicate val$predicate;
        final Iterable val$unfiltered;

        public final Iterator iterator()
        {
            return Iterators.filter(unfiltered.iterator(), predicate);
        }

        _cls6()
        {
            unfiltered = iterable;
            predicate = predicate1;
            super();
        }
    }


    private class _cls7
        implements Iterable
    {

        final Class val$type;
        final Iterable val$unfiltered;

        public final Iterator iterator()
        {
            return Iterators.filter(unfiltered.iterator(), type);
        }

        _cls7()
        {
            unfiltered = iterable;
            type = class1;
            super();
        }
    }


    private class _cls2 extends TransformedIterator
    {

        final volatile Object transform(Object obj)
        {
            return transform((Iterable)obj);
        }

        final Iterator transform(Iterable iterable)
        {
            return iterable.iterator();
        }

        _cls2(Iterator iterator)
        {
            super(iterator);
        }
    }


    private class _cls4
        implements Iterable
    {

        final Iterable val$iterable;
        final int val$size;

        public final Iterator iterator()
        {
            return Iterators.paddedPartition(iterable.iterator(), size);
        }

        _cls4()
        {
            iterable = iterable1;
            size = i;
            super();
        }
    }


    private class _cls3
        implements Iterable
    {

        final Iterable val$iterable;
        final int val$size;

        public final Iterator iterator()
        {
            return Iterators.partition(iterable.iterator(), size);
        }

        _cls3()
        {
            iterable = iterable1;
            size = i;
            super();
        }
    }


    private class _cls5
        implements Iterable
    {

        final Iterable val$fromIterable;
        final Function val$function;

        public final Iterator iterator()
        {
            return Iterators.transform(fromIterable.iterator(), function);
        }

        _cls5()
        {
            fromIterable = iterable;
            function = function1;
            super();
        }
    }

}
