// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Ordering, Lists

final class ComparatorOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;

    ComparatorOrdering(Comparator comparator1)
    {
        comparator = (Comparator)Preconditions.checkNotNull(comparator1);
    }

    public int binarySearch(List list, Object obj)
    {
        return Collections.binarySearch(list, obj, comparator);
    }

    public int compare(Object obj, Object obj1)
    {
        return comparator.compare(obj, obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof ComparatorOrdering)
        {
            obj = (ComparatorOrdering)obj;
            return comparator.equals(((ComparatorOrdering) (obj)).comparator);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return comparator.hashCode();
    }

    public List sortedCopy(Iterable iterable)
    {
        iterable = Lists.newArrayList(iterable);
        Collections.sort(iterable, comparator);
        return iterable;
    }

    public String toString()
    {
        return comparator.toString();
    }
}
