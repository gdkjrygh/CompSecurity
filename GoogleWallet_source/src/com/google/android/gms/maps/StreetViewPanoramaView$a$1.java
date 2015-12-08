// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaView, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

final class azu extends com.google.android.gms.maps.internal.
{

    final aDelegate azH;
    final OnStreetViewPanoramaReadyCallback azu;

    public final void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException
    {
        OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback = azu;
        new StreetViewPanorama(istreetviewpanoramadelegate);
    }

    llback(llback llback, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        azH = llback;
        azu = onstreetviewpanoramareadycallback;
        super();
    }
}
