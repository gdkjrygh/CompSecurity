// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            CompoundOrdering, Lists, ExplicitOrdering, ComparatorOrdering, 
//            NaturalOrdering, ObjectArrays, UsingToStringOrdering, ImmutableList, 
//            Iterables, LexicographicalOrdering, NullsFirstOrdering, NullsLastOrdering, 
//            ByFunctionOrdering, ReverseOrdering, MapMaker, Platform

public abstract class Ordering
    implements Comparator
{
    static class ArbitraryOrdering extends Ordering
    {

        private Map uids;

        public int compare(Object obj, Object obj1)
        {
            if (obj == obj1)
            {
                return 0;
            }
            int i = identityHashCode(obj);
            int j = identityHashCode(obj1);
            if (i != j)
            {
                return i >= j ? 1 : -1;
            }
            i = ((Integer)uids.get(obj)).compareTo((Integer)uids.get(obj1));
            if (i == 0)
            {
                throw new AssertionError();
            } else
            {
                return i;
            }
        }

        int identityHashCode(Object obj)
        {
            return System.identityHashCode(obj);
        }

        public String toString()
        {
            return "Ordering.arbitrary()";
        }

        ArbitraryOrdering()
        {
            uids = Platform.tryWeakKeys(new MapMaker()).makeComputingMap(new _cls1());
        }
    }

    private static class ArbitraryOrderingHolder
    {

        static final Ordering ARBITRARY_ORDERING = new ArbitraryOrdering();


        private ArbitraryOrderingHolder()
        {
        }
    }

    static class IncomparableValueException extends ClassCastException
    {

        private static final long serialVersionUID = 0L;
        final Object value;

        IncomparableValueException(Object obj)
        {
            super((new StringBuilder()).append("Cannot compare value: ").append(obj).toString());
            value = obj;
        }
    }


    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    protected Ordering()
    {
    }

    public static Ordering arbitrary()
    {
        return ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    public static Ordering compound(Iterable iterable)
    {
        return new CompoundOrdering(iterable);
    }

    public static transient Ordering explicit(Object obj, Object aobj[])
    {
        return explicit(Lists.asList(obj, aobj));
    }

    public static Ordering explicit(List list)
    {
        return new ExplicitOrdering(list);
    }

    public static Ordering from(Ordering ordering)
    {
        return (Ordering)Preconditions.checkNotNull(ordering);
    }

    public static Ordering from(Comparator comparator)
    {
        if (comparator instanceof Ordering)
        {
            return (Ordering)comparator;
        } else
        {
            return new ComparatorOrdering(comparator);
        }
    }

    public static Ordering natural()
    {
        return NaturalOrdering.INSTANCE;
    }

    private int partition(Object aobj[], int i, int j, int k)
    {
        Object obj = aobj[k];
        aobj[k] = aobj[j];
        aobj[j] = obj;
        int l;
        for (k = i; i < j; k = l)
        {
            l = k;
            if (compare(aobj[i], obj) < 0)
            {
                ObjectArrays.swap(aobj, k, i);
                l = k + 1;
            }
            i++;
        }

        ObjectArrays.swap(aobj, j, k);
        return k;
    }

    private void quicksortLeastK(Object aobj[], int i, int j, int k)
    {
        if (j > i)
        {
            int l = partition(aobj, i, j, i + j >>> 1);
            quicksortLeastK(aobj, i, l - 1, k);
            if (l < k)
            {
                quicksortLeastK(aobj, l + 1, j, k);
            }
        }
    }

    public static Ordering usingToString()
    {
        return UsingToStringOrdering.INSTANCE;
    }

    public int binarySearch(List list, Object obj)
    {
        return Collections.binarySearch(list, obj, this);
    }

    public abstract int compare(Object obj, Object obj1);

    public Ordering compound(Comparator comparator)
    {
        return new CompoundOrdering(this, (Comparator)Preconditions.checkNotNull(comparator));
    }

    public List greatestOf(Iterable iterable, int i)
    {
        return reverse().leastOf(iterable, i);
    }

    public ImmutableList immutableSortedCopy(Iterable iterable)
    {
        return ImmutableList.copyOf(sortedCopy(iterable));
    }

    public boolean isOrdered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            Object obj;
            for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (obj)))
            {
                obj = iterator.next();
                if (compare(iterable, obj) > 0)
                {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        if (iterator.hasNext())
        {
            Object obj;
            for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (obj)))
            {
                obj = iterator.next();
                if (compare(iterable, obj) >= 0)
                {
                    return false;
                }
            }

        }
        return true;
    }

    public List leastOf(Iterable iterable, int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%d is negative", new Object[] {
            Integer.valueOf(i)
        });
        iterable = ((Iterable) ((Object[])Iterables.toArray(iterable)));
        if (iterable.length <= i)
        {
            Arrays.sort(iterable, this);
        } else
        {
            quicksortLeastK(iterable, 0, iterable.length - 1, i);
            Object aobj[] = (Object[])new Object[i];
            System.arraycopy(iterable, 0, ((Object) (aobj)), 0, i);
            iterable = ((Iterable) (aobj));
        }
        return Collections.unmodifiableList(Arrays.asList(iterable));
    }

    public Ordering lexicographical()
    {
        return new LexicographicalOrdering(this);
    }

    public Object max(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (max(iterable, iterator.next())))) { }
        return iterable;
    }

    public Object max(Object obj, Object obj1)
    {
        if (compare(obj, obj1) >= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public transient Object max(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        obj = max(max(obj, obj1), obj2);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            obj = max(obj, aobj[i]);
        }

        return obj;
    }

    public Object min(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        for (iterable = ((Iterable) (iterator.next())); iterator.hasNext(); iterable = ((Iterable) (min(iterable, iterator.next())))) { }
        return iterable;
    }

    public Object min(Object obj, Object obj1)
    {
        if (compare(obj, obj1) <= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public transient Object min(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        obj = min(min(obj, obj1), obj2);
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            obj = min(obj, aobj[i]);
        }

        return obj;
    }

    public Ordering nullsFirst()
    {
        return new NullsFirstOrdering(this);
    }

    public Ordering nullsLast()
    {
        return new NullsLastOrdering(this);
    }

    public Ordering onResultOf(Function function)
    {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering reverse()
    {
        return new ReverseOrdering(this);
    }

    public List sortedCopy(Iterable iterable)
    {
        iterable = Lists.newArrayList(iterable);
        Collections.sort(iterable, this);
        return iterable;
    }

    // Unreferenced inner class com/google/common/collect/Ordering$ArbitraryOrdering$1

/* anonymous class */
    class ArbitraryOrdering._cls1
        implements Function
    {

        final AtomicInteger counter = new AtomicInteger(0);
        final ArbitraryOrdering this$0;

        public Integer apply(Object obj)
        {
            return Integer.valueOf(counter.getAndIncrement());
        }

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

            
            {
                this$0 = ArbitraryOrdering.this;
                super();
            }
    }

}
