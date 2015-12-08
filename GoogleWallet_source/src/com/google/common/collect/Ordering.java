// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            NaturalOrdering, Iterables, ImmutableList, NullsFirstOrdering, 
//            NullsLastOrdering, ByFunctionOrdering, ReverseOrdering, Lists

public abstract class Ordering
    implements Comparator
{

    protected Ordering()
    {
    }

    public static Ordering natural()
    {
        return NaturalOrdering.INSTANCE;
    }

    public final int binarySearch(List list, Object obj)
    {
        return Collections.binarySearch(list, obj, this);
    }

    public abstract int compare(Object obj, Object obj1);

    public final ImmutableList immutableSortedCopy(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])Iterables.toArray(iterable)));
        int j = iterable.length;
        for (int i = 0; i < j; i++)
        {
            Preconditions.checkNotNull(iterable[i]);
        }

        Arrays.sort(iterable, this);
        return ImmutableList.asImmutableList(iterable);
    }

    public Ordering nullsFirst()
    {
        return new NullsFirstOrdering(this);
    }

    public Ordering nullsLast()
    {
        return new NullsLastOrdering(this);
    }

    public final Ordering onResultOf(Function function)
    {
        return new ByFunctionOrdering(function, this);
    }

    public Ordering reverse()
    {
        return new ReverseOrdering(this);
    }

    public final List sortedCopy(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])Iterables.toArray(iterable)));
        Arrays.sort(iterable, this);
        return Lists.newArrayList(Arrays.asList(iterable));
    }
}
