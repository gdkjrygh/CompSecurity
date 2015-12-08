// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            v, x

final class w extends AbstractSet
{

    final v a;

    private w(v v1)
    {
        a = v1;
        super();
    }

    w(v v1, byte byte0)
    {
        this(v1);
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = a.get(((java.util.Map.Entry) (obj)).getKey());
            if (obj1 != null && obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator()
    {
        return new x(this);
    }

    public final boolean remove(Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            return v.a(a, ((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
        }
    }

    public final int size()
    {
        return v.b(a);
    }
}
