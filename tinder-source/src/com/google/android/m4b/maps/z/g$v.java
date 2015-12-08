// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import com.google.android.m4b.maps.y.e;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

final class  extends 
{

    private g b;

    public final boolean contains(Object obj)
    {
        if (obj instanceof java.util.Entry)
        {
            obj = (java.util.Entry)obj;
            Object obj1 = ((java.util.Entry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = b.get(obj1);
                if (obj1 != null && b.f.a(((java.util.Entry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator iterator()
    {
        return new <init>(b);
    }

    public final boolean remove(Object obj)
    {
        if (obj instanceof java.util.Entry)
        {
            obj = (java.util.Entry)obj;
            Object obj1 = ((java.util.Entry) (obj)).getKey();
            if (obj1 != null && b.remove(obj1, ((java.util.Entry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
    }

    (g g1, ConcurrentMap concurrentmap)
    {
        b = g1;
        super(g1, concurrentmap);
    }
}
