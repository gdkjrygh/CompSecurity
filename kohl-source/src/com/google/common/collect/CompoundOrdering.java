// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

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

    CompoundOrdering(List list, Comparator comparator)
    {
        comparators = (new ImmutableList.Builder()).addAll(list).add(comparator).build();
    }

    public int compare(Object obj, Object obj1)
    {
        for (Iterator iterator = comparators.iterator(); iterator.hasNext();)
        {
            int i = ((Comparator)iterator.next()).compare(obj, obj1);
            if (i != 0)
            {
                return i;
            }
        }

        return 0;
    }

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return comparators.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Ordering.compound(").append(comparators).append(")").toString();
    }
}
