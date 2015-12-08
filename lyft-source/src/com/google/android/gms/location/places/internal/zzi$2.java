// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi, zzj

class b extends com.google.android.gms.location.places.f
{

    final PlaceReport b;
    final zzi c;

    protected void a(zzj zzj1)
    {
        zzj1.a(new zzm(this), b);
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzj)ient);
    }

    (zzi zzi1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        c = zzi1;
        b = placereport;
        super(ientkey, googleapiclient);
    }
}
