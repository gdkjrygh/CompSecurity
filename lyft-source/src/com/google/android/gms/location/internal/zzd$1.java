// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzd, zzj

class nt extends a
{

    final LocationRequest b;
    final LocationListener c;
    final zzd d;

    protected void a(zzj zzj1)
    {
        zzj1.a(b, c, null);
        a(((com.google.android.gms.common.api.Result) (Status.a)));
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzj)ient);
    }

    nt(zzd zzd1, GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        d = zzd1;
        b = locationrequest;
        c = locationlistener;
        super(googleapiclient);
    }
}
