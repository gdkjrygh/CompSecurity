// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzvb, zzuq, zzus, zzvc

public final class zzup
{

    public static final Api API;
    public static final com.google.android.gms.common.api.Api.zzc zzGR;
    public static final com.google.android.gms.common.api.Api.zzb zzGS;
    public static final zzuq zzawO = new zzvb();

    static 
    {
        zzGR = new com.google.android.gms.common.api.Api.zzc();
        zzGS = new com.google.android.gms.common.api.Api.zzb() {

            public final int getPriority()
            {
                return 0x7fffffff;
            }

            public final volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zzf, (zzus)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final zzvc zza(Context context, Looper looper, zzf zzf, zzus zzus1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (zzus1 == null)
                {
                    zzus1 = zzus.zzawP;
                }
                return new zzvc(context, looper, zzf, zzus1, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        API = new Api(zzGS, zzGR, new Scope[0]);
    }
}
