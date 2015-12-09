// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.IntentService;
import android.content.Intent;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver, a, h, u

public final class AnalyticsService extends IntentService
{

    static int a = 1800;

    public AnalyticsService()
    {
        super("AnalyticsService");
    }

    static void a(int i)
    {
        a = i;
    }

    protected final void onHandleIntent(Intent intent)
    {
        synchronized (AnalyticsReceiver.a)
        {
            if (AnalyticsReceiver.b != null && AnalyticsReceiver.b.isHeld())
            {
                AnalyticsReceiver.b.release();
            }
        }
_L2:
        intent = com.google.android.gms.analytics.a.a(this);
        h.c("Analytics Service called.");
        Pair pair = intent.c().b();
        if (pair != null && pair.first != null && pair.second != null && Math.abs(System.currentTimeMillis() - ((Long)pair.first).longValue()) >= (long)(a * 1000))
        {
            intent.f();
        }
        stopSelf();
        return;
        exception;
        intent;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        if (true) goto _L2; else goto _L1
_L1:
    }

}
