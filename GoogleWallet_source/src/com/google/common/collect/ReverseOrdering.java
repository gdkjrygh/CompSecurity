// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class ReverseOrdering extends Ordering
    implements Serializable
{

    final Ordering forwardOrder;

    ReverseOrdering(Ordering ordering)
    {
        forwardOrder = (Ordering)Preconditions.checkNotNull(ordering);
    }

    public final int compare(Object obj, Object obj1)
    {
        return forwardOrder.compare(obj1, obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof ReverseOrdering)
        {
            obj = (ReverseOrdering)obj;
            return forwardOrder.equals(((ReverseOrdering) (obj)).forwardOrder);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return -forwardOrder.hashCode();
    }

    public final Ordering reverse()
    {
        return forwardOrder;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(forwardOrder).append(".reverse()").toString();
    }
}
