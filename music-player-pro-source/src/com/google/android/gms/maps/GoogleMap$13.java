// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class r extends com.google.android.gms.maps.internal.apter
{

    final oWindowAdapter akD;
    final GoogleMap akp;

    public d f(l l)
    {
        return e.k(akD.getInfoWindow(new Marker(l)));
    }

    public d g(l l)
    {
        return e.k(akD.getInfoContents(new Marker(l)));
    }

    oWindowAdapter(GoogleMap googlemap, oWindowAdapter owindowadapter)
    {
        akp = googlemap;
        akD = owindowadapter;
        super();
    }
}
