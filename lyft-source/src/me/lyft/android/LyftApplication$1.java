// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android:
//            LyftApplication

class Handler
    implements eptionHandler
{

    final LyftApplication this$0;
    final eptionHandler val$crashlyticsErrorHandler;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        AppAnalytics.trackAppCrash(throwable);
        L.w(throwable, "Uncaught exception on thread %s, crashing.", new Object[] {
            thread
        });
        val$crashlyticsErrorHandler.uncaughtException(thread, throwable);
        logoutService.resetCachedState();
    }

    Handler()
    {
        this$0 = final_lyftapplication;
        val$crashlyticsErrorHandler = eptionHandler.this;
        super();
    }
}
