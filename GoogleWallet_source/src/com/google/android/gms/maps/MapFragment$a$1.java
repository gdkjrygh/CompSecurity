// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            MapFragment, GoogleMap, OnMapReadyCallback

final class it> extends com.google.android.gms.maps.internal.te
{

    final OnMapReadyCallback aza;
    final ck azb;

    public final void a(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException
    {
        OnMapReadyCallback onmapreadycallback = aza;
        new GoogleMap(igooglemapdelegate);
    }

    ck(ck ck, OnMapReadyCallback onmapreadycallback)
    {
        azb = ck;
        aza = onmapreadycallback;
        super();
    }
}
