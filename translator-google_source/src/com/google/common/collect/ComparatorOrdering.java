// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class ComparatorOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;

    ComparatorOrdering(Comparator comparator1)
    {
        comparator = (Comparator)p.a(comparator1);
    }

    public final int compare(Object obj, Object obj1)
    {
        return comparator.compare(obj, obj1);
    }

    public final boolean equals(Object obj)
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

    public final int hashCode()
    {
        return comparator.hashCode();
    }

    public final String toString()
    {
        return comparator.toString();
    }
}
