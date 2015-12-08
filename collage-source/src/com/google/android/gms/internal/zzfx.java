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
//            hz, hs, gw

public class zzfx
    implements Runnable
{

    protected final hs a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private ht.a g;
    private final int h;
    private final int i;

    public zzfx(ht.a a1, hs hs1, int j, int k)
    {
        this(a1, hs1, j, k, 200L, 50L);
    }

    public zzfx(ht.a a1, hs hs1, int j, int k, long l, long l1)
    {
        e = l;
        f = l1;
        d = new Handler(Looper.getMainLooper());
        a = hs1;
        g = a1;
        b = false;
        c = false;
        h = k;
        i = j;
    }

    static int a(zzfx zzfx1)
    {
        return zzfx1.i;
    }

    static int b(zzfx zzfx1)
    {
        return zzfx1.h;
    }

    static long c(zzfx zzfx1)
    {
        long l = zzfx1.f - 1L;
        zzfx1.f = l;
        return l;
    }

    static long d(zzfx zzfx1)
    {
        return zzfx1.f;
    }

    static ht.a e(zzfx zzfx1)
    {
        return zzfx1.g;
    }

    static long f(zzfx zzfx1)
    {
        return zzfx1.e;
    }

    static Handler g(zzfx zzfx1)
    {
        return zzfx1.d;
    }

    public void a()
    {
        d.postDelayed(this, e);
    }

    public void a(AdResponseParcel adresponseparcel)
    {
        a(adresponseparcel, new hz(this, a, adresponseparcel.zzEe));
    }

    public void a(AdResponseParcel adresponseparcel, hz hz1)
    {
        a.setWebViewClient(hz1);
        hs hs1 = a;
        if (TextUtils.isEmpty(adresponseparcel.zzAT))
        {
            hz1 = null;
        } else
        {
            hz1 = zzp.zzbx().a(adresponseparcel.zzAT);
        }
        hs1.loadDataWithBaseURL(hz1, adresponseparcel.body, "text/html", "UTF-8", null);
    }

    public void b()
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

    public boolean c()
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

    public boolean d()
    {
        return c;
    }

    public void run()
    {
        if (a == null || c())
        {
            g.zza(a, true);
            return;
        } else
        {
    /* block-local class not found */
    class a {}

            (new a(a.getWebView())).execute(new Void[0]);
            return;
        }
    }
}
