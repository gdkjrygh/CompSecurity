// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Ordering, ef

final class eg
{

    public static Comparator a(SortedSet sortedset)
    {
        Comparator comparator = sortedset.comparator();
        sortedset = comparator;
        if (comparator == null)
        {
            sortedset = Ordering.natural();
        }
        return sortedset;
    }

    public static boolean a(Comparator comparator, Iterable iterable)
    {
        p.a(comparator);
        p.a(iterable);
        if (iterable instanceof SortedSet)
        {
            iterable = a((SortedSet)iterable);
        } else
        if (iterable instanceof ef)
        {
            iterable = ((ef)iterable).comparator();
        } else
        {
            return false;
        }
        return comparator.equals(iterable);
    }
}
