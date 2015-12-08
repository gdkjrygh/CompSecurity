// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dl

private static final class c
    implements com.google.android.gms.common.api.nResult
{

    private final WeakReference a;
    private final a b;
    private final int c;

    public final void a(ConnectionResult connectionresult)
    {
        dj dj1;
        boolean flag = false;
        dj1 = (dj)a.get();
        if (dj1 == null)
        {
            return;
        }
        if (Looper.myLooper() == dj1.a.e)
        {
            flag = true;
        }
        u.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        dj1.b.lock();
        boolean flag1 = dj1.b(0);
        if (!flag1)
        {
            dj1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            dj1.b(connectionresult, b, c);
        }
        if (dj1.e())
        {
            dj1.f();
        }
        dj1.b.unlock();
        return;
        connectionresult;
        dj1.b.unlock();
        throw connectionresult;
    }

    public final void b(ConnectionResult connectionresult)
    {
        dj dj1;
        boolean flag = true;
        dj1 = (dj)a.get();
        if (dj1 == null)
        {
            return;
        }
        if (Looper.myLooper() != dj1.a.e)
        {
            flag = false;
        }
        u.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        dj1.b.lock();
        flag = dj1.b(1);
        if (!flag)
        {
            dj1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            dj1.b(connectionresult, b, c);
        }
        if (dj1.e())
        {
            dj1.g();
        }
        dj1.b.unlock();
        return;
        connectionresult;
        dj1.b.unlock();
        throw connectionresult;
    }

    public ionResult(dj dj1, a a1, int i)
    {
        a = new WeakReference(dj1);
        b = a1;
        c = i;
    }
}
