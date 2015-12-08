// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public final class chm
    implements Runnable
{

    final Handler a;
    protected final ckw b;
    protected boolean c;
    private long d;
    private cky e;
    private boolean f;
    private final int g;
    private final int h;

    private chm(cky cky1, ckw ckw1, int i, int j)
    {
        d = 50L;
        a = new Handler(Looper.getMainLooper());
        b = ckw1;
        e = cky1;
        f = false;
        c = false;
        g = j;
        h = i;
    }

    public chm(cky cky1, ckw ckw1, int i, int j, byte byte0)
    {
        this(cky1, ckw1, i, j);
    }

    static int a(chm chm1)
    {
        return chm1.h;
    }

    static int b(chm chm1)
    {
        return chm1.g;
    }

    static long c(chm chm1)
    {
        long l = chm1.d - 1L;
        chm1.d = l;
        return l;
    }

    static long d(chm chm1)
    {
        return chm1.d;
    }

    static cky e(chm chm1)
    {
        return chm1.e;
    }

    static Handler f(chm chm1)
    {
        return chm1.a;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        f = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        Object obj = new clk(this, b, adresponseparcel.q);
        b.setWebViewClient(((android.webkit.WebViewClient) (obj)));
        ckw ckw1 = b;
        if (TextUtils.isEmpty(adresponseparcel.b))
        {
            obj = null;
        } else
        {
            bkv.e();
            obj = cjj.a(adresponseparcel.b);
        }
        ckw1.loadDataWithBaseURL(((String) (obj)), adresponseparcel.c, "text/html", "UTF-8", null);
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        return c;
    }

    public final void run()
    {
        if (b == null || b())
        {
            e.a(b, true);
            return;
        } else
        {
            (new chn(this, b.a())).execute(new Void[0]);
            return;
        }
    }
}
