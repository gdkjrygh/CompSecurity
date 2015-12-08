// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap, OnMapReadyCallback

class a extends com.google.android.gms.maps.internal.
{

    final OnMapReadyCallback a;
    final te b;

    public void a(IGoogleMapDelegate igooglemapdelegate)
    {
        a.onMapReady(new GoogleMap(igooglemapdelegate));
    }

    te(te te, OnMapReadyCallback onmapreadycallback)
    {
        b = te;
        a = onmapreadycallback;
        super();
    }
}
