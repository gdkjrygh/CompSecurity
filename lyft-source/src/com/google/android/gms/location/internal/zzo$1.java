// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzo, zzj

class nt extends com.google.android.gms.location.onServices.zza
{

    final LocationSettingsRequest b;
    final String c;
    final zzo d;

    protected void a(zzj zzj1)
    {
        zzj1.a(b, this, c);
    }

    public Result b(Status status)
    {
        return d(status);
    }

    protected void b(com.google.android.gms.common.api.ient ient)
    {
        a((zzj)ient);
    }

    public LocationSettingsResult d(Status status)
    {
        return new LocationSettingsResult(status);
    }

    nt(zzo zzo1, GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        d = zzo1;
        b = locationsettingsrequest;
        c = s;
        super(googleapiclient);
    }
}
