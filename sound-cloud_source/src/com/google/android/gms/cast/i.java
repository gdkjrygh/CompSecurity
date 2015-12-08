// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.b.n;
import com.google.android.gms.common.internal.zzf;

final class i extends com.google.android.gms.common.api.Api.zza
{

    i()
    {
    }

    public final com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        obj = (h.a)obj;
        return new n(context, looper, zzf, ((h.a) (obj)).a, ((h.a) (obj)).b, connectioncallbacks, onconnectionfailedlistener);
    }
}
