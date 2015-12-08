// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cva;
import java.io.Serializable;

public final class ReverseOrdering extends cva
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final cva forwardOrder;

    public ReverseOrdering(cva cva1)
    {
        forwardOrder = (cva)ctz.a(cva1);
    }

    public final cva a()
    {
        return forwardOrder;
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

    public final String toString()
    {
        String s = String.valueOf(String.valueOf(forwardOrder));
        return (new StringBuilder(s.length() + 10)).append(s).append(".reverse()").toString();
    }
}
