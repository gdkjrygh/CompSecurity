// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class zza extends com.google.android.gms.maps.internal.>
{

    final arkerClickListener a;
    final GoogleMap b;

    public boolean a(zzi zzi)
    {
        return a.onMarkerClick(new Marker(zzi));
    }

    arkerClickListener(GoogleMap googlemap, arkerClickListener arkerclicklistener)
    {
        b = googlemap;
        a = arkerclicklistener;
        super();
    }
}
