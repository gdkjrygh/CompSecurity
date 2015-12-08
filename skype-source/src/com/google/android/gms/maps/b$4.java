// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.maps:
//            b

final class nit> extends com.google.android.gms.maps.a.t>
{

    final l.LatLng a;
    final b b;

    public final void a(LatLng latlng)
    {
        a.onMapClick(latlng);
    }

    l.LatLng(b b1, l.LatLng latlng)
    {
        b = b1;
        a = latlng;
        super();
    }
}
