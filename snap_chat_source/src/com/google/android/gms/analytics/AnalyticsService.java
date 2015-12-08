// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.IntentService;
import android.content.Intent;
import android.util.Pair;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsReceiver, GoogleAnalytics, zzae, zzd

public final class AnalyticsService extends IntentService
{

    static int zzAZ = 1800;

    public AnalyticsService()
    {
        super("AnalyticsService");
    }

    static void zzC(int i)
    {
        zzAZ = i;
    }

    protected final void onHandleIntent(Intent intent)
    {
        synchronized (AnalyticsReceiver.zzmz)
        {
            if (AnalyticsReceiver.zzAY != null && AnalyticsReceiver.zzAY.isHeld())
            {
                AnalyticsReceiver.zzAY.release();
            }
        }
_L2:
        intent = GoogleAnalytics.getInstance(this);
        zzae.zzab("Analytics Service called.");
        Pair pair = intent.zzgl().zzfg();
        if (pair != null && pair.first != null && pair.second != null && Math.abs(System.currentTimeMillis() - ((Long)pair.first).longValue()) >= (long)(zzAZ * 1000))
        {
            intent.dispatchLocalHits();
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
