// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zzd
    implements FusedLocationProviderApi
{

    public zzd()
    {
    }

    public Location a(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.a(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.p();
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public PendingResult a(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.b(new zza(googleapiclient, locationlistener) {

            final LocationListener b;
            final zzd c;

            protected void a(zzj zzj1)
            {
                zzj1.a(b);
                a(((Result) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzj)client);
            }

            
            {
                c = zzd.this;
                b = locationlistener;
                super(googleapiclient);
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.b(new zza(googleapiclient, locationrequest, locationlistener) {
            private class zza extends com.google.android.gms.location.LocationServices.zza
            {

                public Result b(Status status)
                {
                    return d(status);
                }

                public Status d(Status status)
                {
                    return status;
                }

                public zza(GoogleApiClient googleapiclient)
                {
                    super(googleapiclient);
                }
            }


            final LocationRequest b;
            final LocationListener c;
            final zzd d;

            protected void a(zzj zzj1)
            {
                zzj1.a(b, c, null);
                a(((Result) (Status.a)));
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzj)client);
            }

            
            {
                d = zzd.this;
                b = locationrequest;
                c = locationlistener;
                super(googleapiclient);
            }
        });
    }
}
