// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class r extends com.google.android.gms.maps.internal.apter
{

    final GoogleMap YZ;
    final oWindowAdapter Zn;

    public d f(f f1)
    {
        return e.h(Zn.getInfoWindow(new Marker(f1)));
    }

    public d g(f f1)
    {
        return e.h(Zn.getInfoContents(new Marker(f1)));
    }

    oWindowAdapter(GoogleMap googlemap, oWindowAdapter owindowadapter)
    {
        YZ = googlemap;
        Zn = owindowadapter;
        super();
    }
}
