// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class d extends com.google.android.gms.location.places.a
{

    final String b;
    final LatLngBounds c;
    final AutocompleteFilter d;
    final zzc e;

    protected void a(zzd zzd1)
    {
        zzd1.a(new zzm(this), b, c, d);
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzd)ient);
    }

    ter(zzc zzc1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        e = zzc1;
        b = s;
        c = latlngbounds;
        d = autocompletefilter;
        super(ientkey, googleapiclient);
    }
}
