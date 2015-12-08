// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class jzm
    implements jyr
{

    private final WeakReference a;
    private final jyh b;
    private final int c;

    public jzm(jzf jzf1, jyh jyh, int i)
    {
        a = new WeakReference(jzf1);
        b = jyh;
        c = i;
    }

    public final void a(ConnectionResult connectionresult)
    {
        jzf jzf1;
        boolean flag = false;
        jzf1 = (jzf)a.get();
        if (jzf1 == null)
        {
            return;
        }
        if (Looper.myLooper() == jzf1.a.e)
        {
            flag = true;
        }
        b.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        jzf1.b.lock();
        boolean flag1 = jzf1.b(0);
        if (!flag1)
        {
            jzf1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            jzf1.b(connectionresult, b, c);
        }
        if (jzf1.e())
        {
            jzf1.f();
        }
        jzf1.b.unlock();
        return;
        connectionresult;
        jzf1.b.unlock();
        throw connectionresult;
    }

    public final void b(ConnectionResult connectionresult)
    {
        jzf jzf1;
        boolean flag = true;
        jzf1 = (jzf)a.get();
        if (jzf1 == null)
        {
            return;
        }
        if (Looper.myLooper() != jzf1.a.e)
        {
            flag = false;
        }
        b.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        jzf1.b.lock();
        flag = jzf1.b(1);
        if (!flag)
        {
            jzf1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            jzf1.b(connectionresult, b, c);
        }
        if (jzf1.e())
        {
            jzf1.g();
        }
        jzf1.b.unlock();
        return;
        connectionresult;
        jzf1.b.unlock();
        throw connectionresult;
    }
}
