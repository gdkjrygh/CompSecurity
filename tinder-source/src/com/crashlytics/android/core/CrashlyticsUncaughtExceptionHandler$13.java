// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.CrashEventDataProvider;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, CrashlyticsCore

class a
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler a;

    public Object call()
        throws Exception
    {
        if (!CrashlyticsUncaughtExceptionHandler.a(a).get())
        {
            c.a().a("CrashlyticsCore", "Finalizing previously open sessions.");
            CrashlyticsCore crashlyticscore = CrashlyticsUncaughtExceptionHandler.f(a);
            com.crashlytics.android.core.internal.models.SessionEventData sessioneventdata = null;
            if (crashlyticscore.k != null)
            {
                sessioneventdata = crashlyticscore.k.a();
            }
            if (sessioneventdata != null)
            {
                CrashlyticsUncaughtExceptionHandler.a(a, sessioneventdata);
            }
            CrashlyticsUncaughtExceptionHandler.g(a);
            c.a().a("CrashlyticsCore", "Closed all previously open sessions");
            return Boolean.valueOf(true);
        } else
        {
            c.a().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
            return Boolean.valueOf(false);
        }
    }

    I(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        a = crashlyticsuncaughtexceptionhandler;
        super();
    }
}
