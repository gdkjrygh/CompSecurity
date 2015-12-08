// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.c.b:
//            bq

private final class <init> extends AbstractSet
{

    final bq a;

    public final boolean add(Object obj)
    {
        obj = (java.util.ntry)obj;
        if (!contains(obj))
        {
            a.a((Comparable)((java.util.ntry) (obj)).getKey(), ((java.util.ntry) (obj)).getValue());
            return true;
        } else
        {
            return false;
        }
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        Object obj1 = (java.util.ntry)obj;
        obj = a.get(((java.util.ntry) (obj1)).getKey());
        obj1 = ((java.util.ntry) (obj1)).getValue();
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public final Iterator iterator()
    {
        return new <init>(a, (byte)0);
    }

    public final boolean remove(Object obj)
    {
        obj = (java.util.ntry)obj;
        if (contains(obj))
        {
            a.remove(((java.util.ntry) (obj)).getKey());
            return true;
        } else
        {
            return false;
        }
    }

    public final int size()
    {
        return a.size();
    }

    private ect(bq bq1)
    {
        a = bq1;
        super();
    }

    tractSet(bq bq1, byte byte0)
    {
        this(bq1);
    }
}
