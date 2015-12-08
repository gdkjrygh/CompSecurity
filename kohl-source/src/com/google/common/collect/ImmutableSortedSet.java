// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSetFauxverideShim, Ordering, EmptyImmutableSortedSet, ImmutableList, 
//            RegularImmutableSortedSet, Lists, ExplicitOrderedImmutableSortedSet, ImmutableCollection, 
//            ImmutableSet

public abstract class ImmutableSortedSet extends ImmutableSortedSetFauxverideShim
    implements SortedSet
{
    public static final class Builder extends ImmutableSet.Builder
    {

        private final Comparator comparator;

        public volatile ImmutableCollection.Builder add(Object obj)
        {
            return add(obj);
        }

        public volatile ImmutableCollection.Builder add(Object aobj[])
        {
            return add(aobj);
        }

        public volatile ImmutableSet.Builder add(Object obj)
        {
            return add(obj);
        }

        public volatile ImmutableSet.Builder add(Object aobj[])
        {
            return add(aobj);
        }

        public Builder add(Object obj)
        {
            super.add(obj);
            return this;
        }

        public transient Builder add(Object aobj[])
        {
            super.add(aobj);
            return this;
        }

        public volatile ImmutableCollection.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public volatile ImmutableCollection.Builder addAll(Iterator iterator)
        {
            return addAll(iterator);
        }

        public volatile ImmutableSet.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public volatile ImmutableSet.Builder addAll(Iterator iterator)
        {
            return addAll(iterator);
        }

        public Builder addAll(Iterable iterable)
        {
            super.addAll(iterable);
            return this;
        }

        public Builder addAll(Iterator iterator)
        {
            super.addAll(iterator);
            return this;
        }

        public volatile ImmutableCollection build()
        {
            return build();
        }

        public volatile ImmutableSet build()
        {
            return build();
        }

        public ImmutableSortedSet build()
        {
            return ImmutableSortedSet.copyOfInternal(comparator, contents.iterator());
        }

        public Builder(Comparator comparator1)
        {
            comparator = (Comparator)Preconditions.checkNotNull(comparator1);
        }
    }

    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Comparator comparator;
        final Object elements[];

        Object readResolve()
        {
            return (new Builder(comparator)).add((Object[])elements).build();
        }

        public SerializedForm(Comparator comparator1, Object aobj[])
        {
            comparator = comparator1;
            elements = aobj;
        }
    }


    private static final ImmutableSortedSet NATURAL_EMPTY_SET;
    private static final Comparator NATURAL_ORDER;
    final transient Comparator comparator;

    ImmutableSortedSet(Comparator comparator1)
    {
        comparator = comparator1;
    }

    public static ImmutableSortedSet copyOf(Iterable iterable)
    {
        return copyOf(((Comparator) (Ordering.natural())), iterable);
    }

    public static ImmutableSortedSet copyOf(Collection collection)
    {
        return copyOf(((Comparator) (Ordering.natural())), collection);
    }

    public static ImmutableSortedSet copyOf(Comparator comparator1, Iterable iterable)
    {
        Preconditions.checkNotNull(comparator1);
        return copyOfInternal(comparator1, iterable, false);
    }

    public static ImmutableSortedSet copyOf(Comparator comparator1, Collection collection)
    {
        Preconditions.checkNotNull(comparator1);
        return copyOfInternal(comparator1, collection, false);
    }

    public static ImmutableSortedSet copyOf(Comparator comparator1, Iterator iterator)
    {
        Preconditions.checkNotNull(comparator1);
        return copyOfInternal(comparator1, iterator);
    }

    public static ImmutableSortedSet copyOf(Iterator iterator)
    {
        return copyOfInternal(Ordering.natural(), iterator);
    }

    public static ImmutableSortedSet copyOf(Comparable acomparable[])
    {
        return copyOf(((Comparator) (Ordering.natural())), ((Collection) (Arrays.asList(acomparable))));
    }

    private static ImmutableSortedSet copyOfInternal(Comparator comparator1, Iterable iterable, boolean flag)
    {
        ImmutableSortedSet immutablesortedset;
        boolean flag1;
        if (flag || hasSameComparator(iterable, comparator1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1 || !(iterable instanceof ImmutableSortedSet))
        {
            break MISSING_BLOCK_LABEL_74;
        }
        immutablesortedset = (ImmutableSortedSet)iterable;
        if (!immutablesortedset.isEmpty()) goto _L2; else goto _L1
_L1:
        return immutablesortedset;
_L2:
        ImmutableList immutablelist;
        immutablelist = immutablesortedset.asList();
        iterable = ImmutableList.copyOf(iterable);
        if (immutablelist == iterable) goto _L1; else goto _L3
_L3:
        return new RegularImmutableSortedSet(iterable, comparator1);
        iterable = immutableSortedUniqueCopy(comparator1, Lists.newArrayList(iterable));
        if (iterable.isEmpty())
        {
            return emptySet(comparator1);
        } else
        {
            return new RegularImmutableSortedSet(iterable, comparator1);
        }
    }

    private static ImmutableSortedSet copyOfInternal(Comparator comparator1, Iterator iterator)
    {
        if (!iterator.hasNext())
        {
            return emptySet(comparator1);
        } else
        {
            return new RegularImmutableSortedSet(immutableSortedUniqueCopy(comparator1, Lists.newArrayList(iterator)), comparator1);
        }
    }

    public static ImmutableSortedSet copyOfSorted(SortedSet sortedset)
    {
        Comparator comparator2 = sortedset.comparator();
        Comparator comparator1 = comparator2;
        if (comparator2 == null)
        {
            comparator1 = NATURAL_ORDER;
        }
        return copyOfInternal(comparator1, sortedset, true);
    }

    private static ImmutableSortedSet emptySet()
    {
        return NATURAL_EMPTY_SET;
    }

    static ImmutableSortedSet emptySet(Comparator comparator1)
    {
        if (NATURAL_ORDER.equals(comparator1))
        {
            return emptySet();
        } else
        {
            return new EmptyImmutableSortedSet(comparator1);
        }
    }

    static boolean hasSameComparator(Iterable iterable, Comparator comparator1)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (iterable instanceof SortedSet)
            {
                iterable = ((SortedSet)iterable).comparator();
                if (iterable != null)
                {
                    break label0;
                }
                flag = flag1;
                if (comparator1 == Ordering.natural())
                {
                    flag = true;
                }
            }
            return flag;
        }
        return comparator1.equals(iterable);
    }

    private static ImmutableList immutableSortedUniqueCopy(Comparator comparator1, List list)
    {
        if (list.isEmpty())
        {
            return ImmutableList.of();
        }
        Collections.sort(list, comparator1);
        int j = 1;
        for (int i = 1; i < list.size();)
        {
            Object obj = list.get(i);
            int k = j;
            if (comparator1.compare(obj, list.get(j - 1)) != 0)
            {
                list.set(j, obj);
                k = j + 1;
            }
            i++;
            j = k;
        }

        return ImmutableList.copyOf(list.subList(0, j));
    }

    public static Builder naturalOrder()
    {
        return new Builder(Ordering.natural());
    }

    public static ImmutableSortedSet of()
    {
        return emptySet();
    }

    public static ImmutableSortedSet of(Comparable comparable)
    {
        return new RegularImmutableSortedSet(ImmutableList.of(comparable), Ordering.natural());
    }

    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable1)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1
        }));
    }

    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable1, Comparable comparable2)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2
        }));
    }

    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2, comparable3
        }));
    }

    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4)
    {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[] {
            comparable, comparable1, comparable2, comparable3, comparable4
        }));
    }

    public static transient ImmutableSortedSet of(Comparable comparable, Comparable comparable1, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable acomparable[])
    {
        ArrayList arraylist = new ArrayList(acomparable.length + 6);
        Collections.addAll(arraylist, new Comparable[] {
            comparable, comparable1, comparable2, comparable3, comparable4, comparable5
        });
        Collections.addAll(arraylist, acomparable);
        return copyOf(Ordering.natural(), arraylist);
    }

    public static ImmutableSortedSet of(Comparable acomparable[])
    {
        return copyOf(acomparable);
    }

    public static Builder orderedBy(Comparator comparator1)
    {
        return new Builder(comparator1);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static Builder reverseOrder()
    {
        return new Builder(Ordering.natural().reverse());
    }

    static int unsafeCompare(Comparator comparator1, Object obj, Object obj1)
    {
        return comparator1.compare(obj, obj1);
    }

    public static transient ImmutableSortedSet withExplicitOrder(Object obj, Object aobj[])
    {
        return withExplicitOrder(Lists.asList(obj, aobj));
    }

    public static ImmutableSortedSet withExplicitOrder(List list)
    {
        return ExplicitOrderedImmutableSortedSet.create(list);
    }

    public Comparator comparator()
    {
        return comparator;
    }

    public ImmutableSortedSet headSet(Object obj)
    {
        return headSetImpl(Preconditions.checkNotNull(obj));
    }

    public volatile SortedSet headSet(Object obj)
    {
        return headSet(obj);
    }

    abstract ImmutableSortedSet headSetImpl(Object obj);

    abstract int indexOf(Object obj);

    public ImmutableSortedSet subSet(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        boolean flag;
        if (comparator.compare(obj, obj1) <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return subSetImpl(obj, obj1);
    }

    public volatile SortedSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, obj1);
    }

    abstract ImmutableSortedSet subSetImpl(Object obj, Object obj1);

    public ImmutableSortedSet tailSet(Object obj)
    {
        return tailSetImpl(Preconditions.checkNotNull(obj));
    }

    public volatile SortedSet tailSet(Object obj)
    {
        return tailSet(obj);
    }

    abstract ImmutableSortedSet tailSetImpl(Object obj);

    int unsafeCompare(Object obj, Object obj1)
    {
        return unsafeCompare(comparator, obj, obj1);
    }

    Object writeReplace()
    {
        return new SerializedForm(comparator, toArray());
    }

    static 
    {
        NATURAL_ORDER = Ordering.natural();
        NATURAL_EMPTY_SET = new EmptyImmutableSortedSet(NATURAL_ORDER);
    }

}
