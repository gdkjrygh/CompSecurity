// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            v

final class <init> extends AbstractSet
{

    private v a;

    public final boolean add(Object obj)
    {
        obj = (java.util.Entry)obj;
        if (!contains(obj))
        {
            a.a((Comparable)((java.util.Entry) (obj)).getKey(), ((java.util.Entry) (obj)).getValue());
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
        Object obj1 = (java.util.Entry)obj;
        obj = a.get(((java.util.Entry) (obj1)).getKey());
        obj1 = ((java.util.Entry) (obj1)).getValue();
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public final Iterator iterator()
    {
        return new <init>(a, (byte)0);
    }

    public final boolean remove(Object obj)
    {
        obj = (java.util.Entry)obj;
        if (contains(obj))
        {
            a.remove(((java.util.Entry) (obj)).getKey());
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

    private (v v1)
    {
        a = v1;
        super();
    }

    a(v v1, byte byte0)
    {
        this(v1);
    }
}
