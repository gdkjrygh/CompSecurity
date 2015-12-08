// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.wearable.internal.zzav;
import com.google.android.gms.wearable.internal.zzax;
import com.google.android.gms.wearable.internal.zzbi;
import com.google.android.gms.wearable.internal.zzbk;
import com.google.android.gms.wearable.internal.zzbm;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzg;
import com.google.android.gms.wearable.internal.zzi;
import com.google.android.gms.wearable.internal.zzt;
import com.google.android.gms.wearable.internal.zzu;

// Referenced classes of package com.google.android.gms.wearable:
//            DataApi, CapabilityApi, MessageApi, NodeApi, 
//            ChannelApi, zza, zzd, zzg, 
//            zzi

public class Wearable
{

    public static final DataApi a = new zzu();
    public static final CapabilityApi b = new zzg();
    public static final MessageApi c = new zzav();
    public static final NodeApi d = new zzax();
    public static final ChannelApi e = new zzi();
    public static final zza f = new zzd();
    public static final com.google.android.gms.wearable.zzd g = new zzt();
    public static final com.google.android.gms.wearable.zzg h = new zzbi();
    public static final com.google.android.gms.wearable.zzi i = new zzbm();
    public static final com.google.android.gms.common.api.Api.ClientKey j;
    public static final Api k;
    private static final com.google.android.gms.common.api.Api.zza l;

    static 
    {
        j = new com.google.android.gms.common.api.Api.ClientKey();
        l = new com.google.android.gms.common.api.Api.zza() {

            public int a()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client a(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, zze, (WearableOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzbk a(Context context, Looper looper, zze zze, WearableOptions wearableoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                class WearableOptions.Builder
                {

                        public WearableOptions.Builder()
                        {
                        }
                }

                if (wearableoptions == null)
                {
                    new WearableOptions(new WearableOptions.Builder());
                }
                return new zzbk(context, looper, connectioncallbacks, onconnectionfailedlistener, zze);
            }


            private class WearableOptions
                implements com.google.android.gms.common.api.Api.ApiOptions.Optional
            {

                private WearableOptions(Builder builder)
                {
                }

            }

        };
        k = new Api("Wearable.API", l, j, new Scope[0]);
    }
}
