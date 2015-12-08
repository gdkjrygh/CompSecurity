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

    private static final long serialVersionUID = 0L;
    final Ordering forwardOrder;

    ReverseOrdering(Ordering ordering)
    {
        forwardOrder = (Ordering)Preconditions.checkNotNull(ordering);
    }

    public int compare(Object obj, Object obj1)
    {
        return forwardOrder.compare(obj1, obj);
    }

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return -forwardOrder.hashCode();
    }

    public Object max(Iterable iterable)
    {
        return forwardOrder.min(iterable);
    }

    public Object max(Object obj, Object obj1)
    {
        return forwardOrder.min(obj, obj1);
    }

    public transient Object max(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return forwardOrder.min(obj, obj1, obj2, aobj);
    }

    public Object min(Iterable iterable)
    {
        return forwardOrder.max(iterable);
    }

    public Object min(Object obj, Object obj1)
    {
        return forwardOrder.max(obj, obj1);
    }

    public transient Object min(Object obj, Object obj1, Object obj2, Object aobj[])
    {
        return forwardOrder.max(obj, obj1, obj2, aobj);
    }

    public Ordering reverse()
    {
        return forwardOrder;
    }

    public String toString()
    {
        return (new StringBuilder()).append(forwardOrder).append(".reverse()").toString();
    }
}
