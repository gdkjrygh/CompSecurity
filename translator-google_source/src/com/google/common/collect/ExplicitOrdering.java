// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Ordering, ImmutableMap, aw

final class ExplicitOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final ImmutableMap rankMap;

    ExplicitOrdering(ImmutableMap immutablemap)
    {
        rankMap = immutablemap;
    }

    ExplicitOrdering(List list)
    {
        this(a(list));
    }

    private int a(Object obj)
    {
        Integer integer = (Integer)rankMap.get(obj);
        if (integer == null)
        {
            throw new Ordering.IncomparableValueException(obj);
        } else
        {
            return integer.intValue();
        }
    }

    private static ImmutableMap a(List list)
    {
        aw aw1 = ImmutableMap.builder();
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            aw1.a(list.next(), Integer.valueOf(i));
            i++;
        }

        return aw1.a();
    }

    public final int compare(Object obj, Object obj1)
    {
        return a(obj) - a(obj1);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ExplicitOrdering)
        {
            obj = (ExplicitOrdering)obj;
            return rankMap.equals(((ExplicitOrdering) (obj)).rankMap);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return rankMap.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Ordering.explicit(")).append(rankMap.keySet()).append(")").toString();
    }
}
