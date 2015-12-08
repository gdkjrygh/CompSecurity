// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zze, zzg, Api

class c
    implements iClient.ConnectionProgressReportCallbacks
{

    private final WeakReference a;
    private final Api b;
    private final int c;

    public void a(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = false;
        zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() == zze.b(zze1).a())
        {
            flag = true;
        }
        zzu.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zze.a(zze1).lock();
        boolean flag1 = zze.a(zze1, 0);
        if (!flag1)
        {
            zze.a(zze1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            zze.a(zze1, connectionresult, b, c);
        }
        if (zze.f(zze1))
        {
            zze.g(zze1);
        }
        zze.a(zze1).unlock();
        return;
        connectionresult;
        zze.a(zze1).unlock();
        throw connectionresult;
    }

    public void b(ConnectionResult connectionresult)
    {
        zze zze1;
        boolean flag = true;
        zze1 = (zze)a.get();
        if (zze1 == null)
        {
            return;
        }
        if (Looper.myLooper() != zze.b(zze1).a())
        {
            flag = false;
        }
        zzu.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        zze.a(zze1).lock();
        flag = zze.a(zze1, 1);
        if (!flag)
        {
            zze.a(zze1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            zze.a(zze1, connectionresult, b, c);
        }
        if (zze.f(zze1))
        {
            zze.h(zze1);
        }
        zze.a(zze1).unlock();
        return;
        connectionresult;
        zze.a(zze1).unlock();
        throw connectionresult;
    }

    public sult(zze zze1, Api api, int i)
    {
        a = new WeakReference(zze1);
        b = api;
        c = i;
    }
}
