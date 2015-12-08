// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.os.Handler;
import com.cmcm.adsdk.b.c.b;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            f, g

public final class e
{

    public Handler a;
    public volatile boolean b;
    public g c;
    private long d;
    private Runnable e;

    public e(g g1)
    {
        e = new f(this);
        b = true;
        d = 1000L;
        c = g1;
        a = new Handler();
    }

    static long a(e e1)
    {
        return e1.d;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "CMNativeAdHandler scheduleImpressionRetry");
        flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c.a();
        if (a == null)
        {
            a = new Handler();
        }
        a.postDelayed(e, d);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "CMNativeAdHandler cancelImpressionRetry");
        if (b)
        {
            a.removeCallbacks(e);
            a = null;
            b = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
