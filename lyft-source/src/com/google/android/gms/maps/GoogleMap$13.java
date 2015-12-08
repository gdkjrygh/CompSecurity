// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class zza extends com.google.android.gms.maps.internal.>
{

    final oWindowAdapter a;
    final GoogleMap b;

    public zzd a(zzi zzi)
    {
        return zze.a(a.getInfoWindow(new Marker(zzi)));
    }

    public zzd b(zzi zzi)
    {
        return zze.a(a.getInfoContents(new Marker(zzi)));
    }

    oWindowAdapter(GoogleMap googlemap, oWindowAdapter owindowadapter)
    {
        b = googlemap;
        a = owindowadapter;
        super();
    }
}
