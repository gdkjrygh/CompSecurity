// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.device.data;

import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.cu;
import com.vungle.publisher.env.SdkConfig;

public class AppFingerprintManager
{

    SdkConfig a;
    AppFingerprint.Factory b;
    cu c;
    ScheduledPriorityExecutor d;
    com.vungle.publisher.db.model.LoggedException.Factory e;

    public AppFingerprintManager()
    {
    }

    public final void a()
    {
        long l = a.g;
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Logger.v("VungleData", "app fingerprinting allowed by server");
        long l1 = System.currentTimeMillis();
        if (l + a.f < l1)
        {
            d.a(new _cls1(), com.vungle.publisher.async.ScheduledPriorityExecutor.b.s);
            return;
        }
        try
        {
            Logger.d("VungleData", "throttled fingerprint request");
            return;
        }
        catch (Exception exception)
        {
            e.a("VungleData", "exception while throttling app fingerprint", exception);
        }
        return;
        Logger.v("VungleData", "app fingerprinting not allowed by server");
        return;
    }

    /* member class not found */
    class _cls1 {}

}
