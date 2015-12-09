// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cva;
import java.io.Serializable;
import java.util.Comparator;

public final class ComparatorOrdering extends cva
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator comparator;

    public ComparatorOrdering(Comparator comparator1)
    {
        comparator = (Comparator)ctz.a(comparator1);
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
