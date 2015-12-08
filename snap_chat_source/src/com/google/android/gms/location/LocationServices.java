// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzoz;
import com.google.android.gms.internal.zzpa;
import com.google.android.gms.internal.zzpf;
import com.google.android.gms.internal.zzpn;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{

    public static final Api API;
    public static FusedLocationProviderApi FusedLocationApi = new zzoz();
    public static GeofencingApi GeofencingApi = new zzpa();
    public static SettingsApi SettingsApi = new zzpn();
    private static final com.google.android.gms.common.api.Api.zzc zzGR;
    private static final com.google.android.gms.common.api.Api.zzb zzGS;

    public static zzpf zze(GoogleApiClient googleapiclient)
    {
        boolean flag1 = true;
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (zzpf)googleapiclient.zza(zzGR);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static 
    {
        zzGR = new com.google.android.gms.common.api.Api.zzc();
        zzGS = new com.google.android.gms.common.api.Api.zzb() {

            public final int getPriority()
            {
                return 0x7fffffff;
            }

            public final com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zzf zzf1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzk(context, looper, zzf1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final zzpf zzk(Context context, Looper looper, zzf zzf1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzpf(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, "locationServices", zzf1.getAccountName());
            }

        };
        API = new Api(zzGS, zzGR, new Scope[0]);
    }
}
