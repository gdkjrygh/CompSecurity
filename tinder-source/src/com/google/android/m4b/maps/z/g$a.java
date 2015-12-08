// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.util.AbstractSet;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.m4b.maps.z:
//            g

abstract class a extends AbstractSet
{

    final ConcurrentMap a;
    private g b;

    public void clear()
    {
        a.clear();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public int size()
    {
        return a.size();
    }

    (g g1, ConcurrentMap concurrentmap)
    {
        b = g1;
        super();
        a = concurrentmap;
    }
}
