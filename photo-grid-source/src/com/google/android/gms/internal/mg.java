// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzji, ry, qa, sb, 
//            mh

public final class mg
    implements Runnable
{

    protected final ry a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private sb g;
    private final int h;
    private final int i;

    private mg(sb sb1, ry ry1, int j, int k)
    {
        e = 200L;
        f = 50L;
        d = new Handler(Looper.getMainLooper());
        a = ry1;
        g = sb1;
        b = false;
        c = false;
        h = k;
        i = j;
    }

    public mg(sb sb1, ry ry1, int j, int k, byte byte0)
    {
        this(sb1, ry1, j, k);
    }

    static int a(mg mg1)
    {
        return mg1.i;
    }

    static int b(mg mg1)
    {
        return mg1.h;
    }

    static long c(mg mg1)
    {
        long l = mg1.f - 1L;
        mg1.f = l;
        return l;
    }

    static long d(mg mg1)
    {
        return mg1.f;
    }

    static sb e(mg mg1)
    {
        return mg1.g;
    }

    static long f(mg mg1)
    {
        return mg1.e;
    }

    static Handler g(mg mg1)
    {
        return mg1.d;
    }

    public final void a()
    {
        d.postDelayed(this, e);
    }

    public final void a(AdResponseParcel adresponseparcel)
    {
        Object obj = new zzji(this, a, adresponseparcel.zzER);
        a.setWebViewClient(((android.webkit.WebViewClient) (obj)));
        ry ry1 = a;
        if (TextUtils.isEmpty(adresponseparcel.zzBF))
        {
            obj = null;
        } else
        {
            zzp.zzbv();
            obj = qa.a(adresponseparcel.zzBF);
        }
        ry1.loadDataWithBaseURL(((String) (obj)), adresponseparcel.body, "text/html", "UTF-8", null);
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
            (new mh(this, a.a())).execute(new Void[0]);
            return;
        }
    }
}
