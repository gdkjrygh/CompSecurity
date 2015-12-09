// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class cmd
    implements bqz
{

    private final WeakReference a;
    private final bql b;
    private final int c;

    public cmd(clz clz1, bql bql, int i)
    {
        a = new WeakReference(clz1);
        b = bql;
        c = i;
    }

    public final void a(ConnectionResult connectionresult)
    {
        clz clz1;
        boolean flag = false;
        clz1 = (clz)a.get();
        if (clz1 == null)
        {
            return;
        }
        if (Looper.myLooper() == clz1.a.e)
        {
            flag = true;
        }
        btl.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        clz1.b.lock();
        boolean flag1 = clz1.b(0);
        if (!flag1)
        {
            clz1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            clz1.b(connectionresult, b, c);
        }
        if (clz1.e())
        {
            clz1.f();
        }
        clz1.b.unlock();
        return;
        connectionresult;
        clz1.b.unlock();
        throw connectionresult;
    }

    public final void b(ConnectionResult connectionresult)
    {
        clz clz1;
        boolean flag = true;
        clz1 = (clz)a.get();
        if (clz1 == null)
        {
            return;
        }
        if (Looper.myLooper() != clz1.a.e)
        {
            flag = false;
        }
        btl.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        clz1.b.lock();
        flag = clz1.b(1);
        if (!flag)
        {
            clz1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            clz1.b(connectionresult, b, c);
        }
        if (clz1.e())
        {
            clz1.g();
        }
        clz1.b.unlock();
        return;
        connectionresult;
        clz1.b.unlock();
        throw connectionresult;
    }
}
