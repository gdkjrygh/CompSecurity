// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class alo extends com.google.android.gms.maps.internal.
{

    final reetViewPanoramaReady alG;
    final OnStreetViewPanoramaReadyCallback alo;

    public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException
    {
        alo.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    ( , OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        alG = ;
        alo = onstreetviewpanoramareadycallback;
        super();
    }
}
