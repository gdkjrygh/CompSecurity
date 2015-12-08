// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzj

public class zzi
    implements PlaceDetectionApi
{

    public zzi()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, PlaceFilter placefilter)
    {
        return googleapiclient.a(new com.google.android.gms.location.places.zzm.zzd(Places.b, googleapiclient, placefilter) {

            final PlaceFilter b;
            final zzi c;

            protected void a(zzj zzj1)
            {
                zzj1.a(new zzm(this, zzj1.i()), b);
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzj)client);
            }

            
            {
                c = zzi.this;
                b = placefilter;
                super(clientkey, googleapiclient);
            }
        });
    }

    public PendingResult a(GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        return googleapiclient.b(new com.google.android.gms.location.places.zzm.zzf(Places.b, googleapiclient, placereport) {

            final PlaceReport b;
            final zzi c;

            protected void a(zzj zzj1)
            {
                zzj1.a(new zzm(this), b);
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzj)client);
            }

            
            {
                c = zzi.this;
                b = placereport;
                super(clientkey, googleapiclient);
            }
        });
    }
}
