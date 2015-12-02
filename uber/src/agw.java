// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public final class agw
    implements Runnable
{

    protected final akk a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private akm g;
    private final int h;
    private final int i;

    private agw(akm akm1, akk akk1, int j, int k)
    {
        e = 200L;
        f = 50L;
        d = new Handler(Looper.getMainLooper());
        a = akk1;
        g = akm1;
        b = false;
        c = false;
        h = k;
        i = j;
    }

    public agw(akm akm1, akk akk1, int j, int k, byte byte0)
    {
        this(akm1, akk1, j, k);
    }

    static int a(agw agw1)
    {
        return agw1.i;
    }

    private void a(AdResponseParcel adresponseparcel, akw akw1)
    {
        a.setWebViewClient(akw1);
        akk akk1 = a;
        if (TextUtils.isEmpty(adresponseparcel.b))
        {
            akw1 = null;
        } else
        {
            ot.e();
            akw1 = ajc.a(adresponseparcel.b);
        }
        akk1.loadDataWithBaseURL(akw1, adresponseparcel.c, "text/html", "UTF-8", null);
    }

    static int b(agw agw1)
    {
        return agw1.h;
    }

    static long c(agw agw1)
    {
        long l = agw1.f - 1L;
        agw1.f = l;
        return l;
    }

    static long d(agw agw1)
    {
        return agw1.f;
    }

    static akm e(agw agw1)
    {
        return agw1.g;
    }

    static long f(agw agw1)
    {
        return agw1.e;
    }

    static Handler g(agw agw1)
    {
        return agw1.d;
    }

    public final void a()
    {
        d.postDelayed(this, e);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        a(adresponseparcel, new akw(this, a, adresponseparcel.q));
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        return c;
    }

    public final void run()
    {
        if (a == null || c())
        {
            g.a(a, true);
            return;
        } else
        {
            (new agx(this, a.a())).execute(new Void[0]);
            return;
        }
    }
}
