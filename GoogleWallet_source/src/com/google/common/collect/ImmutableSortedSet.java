// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSetFauxverideShim, SortedIterable, Ordering, EmptyImmutableSortedSet, 
//            UnmodifiableIterator

public abstract class ImmutableSortedSet extends ImmutableSortedSetFauxverideShim
    implements SortedIterable, SortedSet
{
    static final class SerializedForm
        implements Serializable
    {

        final Comparator comparator;
        final Object elements[];

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

    private ImmutableSortedSet headSet(Object obj)
    {
        return headSet(obj, false);
    }

    private ImmutableSortedSet headSet(Object obj, boolean flag)
    {
        return headSetImpl(Preconditions.checkNotNull(obj), flag);
    }

    private ImmutableSortedSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, true, obj1, false);
    }

    private ImmutableSortedSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        boolean flag2;
        if (comparator.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        return subSetImpl(obj, flag, obj1, flag1);
    }

    private ImmutableSortedSet tailSet(Object obj)
    {
        return tailSet(obj, true);
    }

    private ImmutableSortedSet tailSet(Object obj, boolean flag)
    {
        return tailSetImpl(Preconditions.checkNotNull(obj), flag);
    }

    public Comparator comparator()
    {
        return comparator;
    }

    public abstract UnmodifiableIterator descendingIterator();

    public Object first()
    {
        return iterator().next();
    }

    public volatile SortedSet headSet(Object obj)
    {
        return headSet(obj);
    }

    abstract ImmutableSortedSet headSetImpl(Object obj, boolean flag);

    public abstract UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Object last()
    {
        return descendingIterator().next();
    }

    public volatile SortedSet subSet(Object obj, Object obj1)
    {
        return subSet(obj, obj1);
    }

    abstract ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1);

    public volatile SortedSet tailSet(Object obj)
    {
        return tailSet(obj);
    }

    abstract ImmutableSortedSet tailSetImpl(Object obj, boolean flag);

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
