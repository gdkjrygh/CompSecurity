// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class NullsFirstOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Ordering ordering;

    NullsFirstOrdering(Ordering ordering1)
    {
        ordering = ordering1;
    }

    public final int compare(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return ordering.compare(obj, obj1);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof NullsFirstOrdering)
        {
            obj = (NullsFirstOrdering)obj;
            return ordering.equals(((NullsFirstOrdering) (obj)).ordering);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return ordering.hashCode() ^ 0x39153a74;
    }

    public final Ordering nullsFirst()
    {
        return this;
    }

    public final Ordering nullsLast()
    {
        return ordering.nullsLast();
    }

    public final Ordering reverse()
    {
        return ordering.reverse().nullsLast();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(ordering).append(".nullsFirst()").toString();
    }
}
