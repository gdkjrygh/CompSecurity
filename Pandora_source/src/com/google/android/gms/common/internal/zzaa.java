// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zze

public class zzaa extends zzi
{

    private final com.google.android.gms.common.api.Api.zzd zzUd;

    public zzaa(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze, com.google.android.gms.common.api.Api.zzd zzd)
    {
        super(context, looper, i, connectioncallbacks, onconnectionfailedlistener, zze);
        zzUd = zzd;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzUd.zzD(ibinder);
    }

    protected String zzeq()
    {
        return zzUd.zzeq();
    }

    protected String zzer()
    {
        return zzUd.zzer();
    }
}
