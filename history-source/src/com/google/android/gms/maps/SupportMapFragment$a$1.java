// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, GoogleMap, OnMapReadyCallback

class akU extends com.google.android.gms.maps.internal.A
{

    final OnMapReadyCallback akU;
    final gate alE;

    public void a(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException
    {
        akU.onMapReady(new GoogleMap(igooglemapdelegate));
    }

    gate(gate gate, OnMapReadyCallback onmapreadycallback)
    {
        alE = gate;
        akU = onmapreadycallback;
        super();
    }
}
