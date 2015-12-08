// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{

    public static final Api a;
    public static final FusedLocationProviderApi b = new zzd();
    public static final GeofencingApi c = new zze();
    public static final SettingsApi d = new zzo();
    private static final com.google.android.gms.common.api.Api.ClientKey e;
    private static final com.google.android.gms.common.api.Api.zza f;

    static com.google.android.gms.common.api.Api.ClientKey a()
    {
        return e;
    }

    public static zzj a(GoogleApiClient googleapiclient)
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
        zzu.b(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (zzj)googleapiclient.a(e);
        if (googleapiclient != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static 
    {
        e = new com.google.android.gms.common.api.Api.ClientKey();
        f = new com.google.android.gms.common.api.Api.zza() {

            public int a()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.Client a(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzj a(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzj(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices", zze1);
            }

        };
        a = new Api("LocationServices.API", f, e, new Scope[0]);
    }
}
