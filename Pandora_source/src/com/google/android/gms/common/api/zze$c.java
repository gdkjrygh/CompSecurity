// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zze, zzg, Api

private static class c
    implements ApiClient.zza
{

    private final WeakReference a;
    private final Api b;
    private final int c;

    public void zza(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = false;
        zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() == zze.zza(zze1).getLooper())
        {
            flag = true;
        }
        zzv.zza(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zze.zzc(zze1).lock();
        boolean flag1 = zze.zza(zze1, 0);
        if (!flag1)
        {
            zze.zzc(zze1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zze.zza(zze1, connectionresult, b, c);
        }
        if (zze.zzf(zze1))
        {
            zze.zzg(zze1);
        }
        zze.zzc(zze1).unlock();
        return;
        connectionresult;
        zze.zzc(zze1).unlock();
        throw connectionresult;
    }

    public void zzb(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = true;
        zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() != zze.zza(zze1).getLooper())
        {
            flag = false;
        }
        zzv.zza(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        zze.zzc(zze1).lock();
        flag = zze.zza(zze1, 1);
        if (!flag)
        {
            zze.zzc(zze1).unlock();
            return;
        }
        if (!connectionresult.isSuccess())
        {
            zze.zza(zze1, connectionresult, b, c);
        }
        if (zze.zzf(zze1))
        {
            zze.zzh(zze1);
        }
        zze.zzc(zze1).unlock();
        return;
        connectionresult;
        zze.zzc(zze1).unlock();
        throw connectionresult;
    }

    public Result(zze zze1, Api api, int i)
    {
        a = new WeakReference(zze1);
        b = api;
        c = i;
    }
}
