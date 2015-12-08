// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

final class  extends 
{

    private g b;

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public final Iterator iterator()
    {
        return new <init>(b);
    }

    public final boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    (g g1, ConcurrentMap concurrentmap)
    {
        b = g1;
        super(g1, concurrentmap);
    }
}
