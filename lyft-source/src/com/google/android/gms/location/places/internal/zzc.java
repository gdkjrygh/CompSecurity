// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzd

public class zzc
    implements GeoDataApi
{

    public zzc()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        return googleapiclient.a(new com.google.android.gms.location.places.zzm.zza(Places.a, googleapiclient, s, latlngbounds, autocompletefilter) {

            final String b;
            final LatLngBounds c;
            final AutocompleteFilter d;
            final zzc e;

            protected void a(zzd zzd1)
            {
                zzd1.a(new zzm(this), b, c, d);
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzd)client);
            }

            
            {
                e = zzc.this;
                b = s;
                c = latlngbounds;
                d = autocompletefilter;
                super(clientkey, googleapiclient);
            }
        });
    }

    public transient PendingResult a(GoogleApiClient googleapiclient, String as[])
    {
        boolean flag = true;
        if (as == null || as.length < 1)
        {
            flag = false;
        }
        zzu.b(flag);
        return googleapiclient.a(new com.google.android.gms.location.places.zzm.zzc(Places.a, googleapiclient, as) {

            final String b[];
            final zzc c;

            protected void a(zzd zzd1)
            {
                java.util.List list = Arrays.asList(b);
                zzd1.a(new zzm(this, zzd1.i()), list);
            }

            protected void b(com.google.android.gms.common.api.Api.Client client)
            {
                a((zzd)client);
            }

            
            {
                c = zzc.this;
                b = as;
                super(clientkey, googleapiclient);
            }
        });
    }
}
