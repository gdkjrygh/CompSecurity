// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.z;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, n, a

private static class c
    implements c
{

    private final WeakReference a;
    private final a b;
    private final int c;

    public void a(ConnectionResult connectionresult)
    {
        zzg zzg1;
        boolean flag = false;
        zzg1 = (zzg)a.get();
        if (zzg1 == null)
        {
            return;
        }
        if (Looper.myLooper() == zzg.d(zzg1).a())
        {
            flag = true;
        }
        z.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zzg.c(zzg1).lock();
        boolean flag1 = zzg.a(zzg1, 0);
        if (!flag1)
        {
            zzg.c(zzg1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            zzg.a(zzg1, connectionresult, b, c);
        }
        if (zzg.k(zzg1))
        {
            zzg.l(zzg1);
        }
        zzg.c(zzg1).unlock();
        return;
        connectionresult;
        zzg.c(zzg1).unlock();
        throw connectionresult;
    }

    public void b(ConnectionResult connectionresult)
    {
        zzg zzg1;
        boolean flag = true;
        zzg1 = (zzg)a.get();
        if (zzg1 == null)
        {
            return;
        }
        if (Looper.myLooper() != zzg.d(zzg1).a())
        {
            flag = false;
        }
        z.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        zzg.c(zzg1).lock();
        flag = zzg.a(zzg1, 1);
        if (!flag)
        {
            zzg.c(zzg1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            zzg.a(zzg1, connectionresult, b, c);
        }
        if (zzg.k(zzg1))
        {
            zzg.m(zzg1);
        }
        zzg.c(zzg1).unlock();
        return;
        connectionresult;
        zzg.c(zzg1).unlock();
        throw connectionresult;
    }

    public Result(zzg zzg1, a a1, int i)
    {
        a = new WeakReference(zzg1);
        b = a1;
        c = i;
    }
}
