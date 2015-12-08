// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.signin.internal.zzg;
import com.google.android.gms.signin.internal.zzh;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzpr, zzpt

public final class zzpq
{

    public static final com.google.android.gms.common.api.Api.ClientKey a;
    public static final com.google.android.gms.common.api.Api.ClientKey b;
    public static final com.google.android.gms.common.api.Api.zza c;
    static final com.google.android.gms.common.api.Api.zza d;
    public static final Api e;
    public static final Api f;
    public static final zzpr g = new zzg();

    static 
    {
        a = new com.google.android.gms.common.api.Api.ClientKey();
        b = new com.google.android.gms.common.api.Api.ClientKey();
        c = new com.google.android.gms.common.api.Api.zza() {

            public int a()
            {
                return 0x7fffffff;
            }

            public volatile com.google.android.gms.common.api.Api.Client a(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, zze, (zzpt)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzh a(Context context, Looper looper, zze zze, zzpt zzpt1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (zzpt1 == null)
                {
                    zzpt1 = zzpt.a;
                }
                return new zzh(context, looper, true, zze, zzpt1, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        d = new com.google.android.gms.common.api.Api.zza() {

            public int a()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.Client a(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzh a(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzh(context, looper, false, zze, zzpt.a, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
            }

        };
        e = new Api("SignIn.API", c, a, new Scope[0]);
        f = new Api("SignIn.INTERNAL_API", d, b, new Scope[0]);
    }
}
