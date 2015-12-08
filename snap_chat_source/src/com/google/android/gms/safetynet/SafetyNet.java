// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.safetynet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.internal.zzum;
import com.google.android.gms.internal.zzun;
import com.google.android.gms.internal.zzuo;

// Referenced classes of package com.google.android.gms.safetynet:
//            SafetyNetApi, zzc

public final class SafetyNet
{

    public static final Api API;
    public static final SafetyNetApi SafetyNetApi = new zzum();
    public static final com.google.android.gms.common.api.Api.zzc zzGR;
    public static final com.google.android.gms.common.api.Api.zzb zzGS;
    public static final zzc zzawG = new zzuo();

    static 
    {
        zzGR = new com.google.android.gms.common.api.Api.zzc();
        zzGS = new com.google.android.gms.common.api.Api.zzb() {

            public final int getPriority()
            {
                return 0x7fffffff;
            }

            public final com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzp(context, looper, zzf, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public final zzun zzp(Context context, Looper looper, zzf zzf, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzun(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        API = new Api(zzGS, zzGR, new Scope[0]);
    }
}
