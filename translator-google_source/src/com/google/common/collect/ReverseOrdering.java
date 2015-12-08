// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class ReverseOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Ordering forwardOrder;

    ReverseOrdering(Ordering ordering)
    {
        forwardOrder = (Ordering)p.a(ordering);
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

    public final Object max(Iterable iterable)
    {
        return forwardOrder.min(iterable);
    }

    public final Object max(Object obj, Object obj1)
    {
        return forwardOrder.min(obj, obj1);
    }

    public final transient Object max(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return forwardOrder.min(obj, obj1, obj2, aobj);
    }

    public final Object max(Iterator iterator)
    {
        return forwardOrder.min(iterator);
    }

    public final Object min(Iterable iterable)
    {
        return forwardOrder.max(iterable);
    }

    public final Object min(Object obj, Object obj1)
    {
        return forwardOrder.max(obj, obj1);
    }

    public final transient Object min(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return forwardOrder.max(obj, obj1, obj2, aobj);
    }

    public final Object min(Iterator iterator)
    {
        return forwardOrder.max(iterator);
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
