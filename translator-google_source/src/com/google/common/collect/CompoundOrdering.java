// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            Ordering, ImmutableList

final class CompoundOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final ImmutableList comparators;

    CompoundOrdering(Iterable iterable)
    {
        comparators = ImmutableList.copyOf(iterable);
    }

    CompoundOrdering(Comparator comparator, Comparator comparator1)
    {
        comparators = ImmutableList.of(comparator, comparator1);
    }

    public final int compare(Object obj, Object obj1)
    {
        int j = comparators.size();
        for (int i = 0; i < j; i++)
        {
            int k = ((Comparator)comparators.get(i)).compare(obj, obj1);
            if (k != 0)
            {
                return k;
            }
        }

        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof CompoundOrdering)
        {
            obj = (CompoundOrdering)obj;
            return comparators.equals(((CompoundOrdering) (obj)).comparators);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return comparators.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Ordering.compound(")).append(comparators).append(")").toString();
    }
}
