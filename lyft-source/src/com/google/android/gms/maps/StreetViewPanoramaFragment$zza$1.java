// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class a extends com.google.android.gms.maps.internal.
{

    final OnStreetViewPanoramaReadyCallback a;
    final  b;

    public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        a.a(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    ( , OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        b = ;
        a = onstreetviewpanoramareadycallback;
        super();
    }
}
