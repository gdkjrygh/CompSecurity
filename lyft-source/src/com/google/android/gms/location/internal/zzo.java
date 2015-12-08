// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zzo
    implements SettingsApi
{

    public zzo()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest)
    {
        return a(googleapiclient, locationsettingsrequest, null);
    }

    public PendingResult a(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        return googleapiclient.a(new com.google.android.gms.location.LocationServices.zza(googleapiclient, locationsettingsrequest, s) {

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

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzj)client);
            }

            public LocationSettingsResult d(Status status)
            {
                return new LocationSettingsResult(status);
            }

            
            {
                d = zzo.this;
                b = locationsettingsrequest;
                c = s;
                super(googleapiclient);
            }
        });
    }
}
