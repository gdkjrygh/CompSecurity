// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.signin.internal.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.signin:
//            b

final class c extends com.google.android.gms.common.api.Api.zza
{

    c()
    {
    }

    public final com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return new i(context, looper, true, zzf, connectioncallbacks, onconnectionfailedlistener, Executors.newSingleThreadExecutor());
    }

    public final List zzl(Object obj)
    {
        return Arrays.asList(new Scope[] {
            b.e, b.f
        });
    }
}
