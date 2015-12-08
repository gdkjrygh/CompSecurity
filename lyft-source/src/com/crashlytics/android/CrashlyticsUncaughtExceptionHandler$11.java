// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler, Crashlytics

class a
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler a;

    public Boolean a()
    {
        if (!CrashlyticsUncaughtExceptionHandler.a(a).get())
        {
            com.crashlytics.android.internal.models.SessionEventData sessioneventdata = CrashlyticsUncaughtExceptionHandler.d(a).t();
            if (sessioneventdata != null)
            {
                CrashlyticsUncaughtExceptionHandler.a(a, sessioneventdata);
            }
            CrashlyticsUncaughtExceptionHandler.e(a);
            CrashlyticsUncaughtExceptionHandler.c(a);
            Fabric.g().a("Fabric", "Open sessions were closed and a new session was opened.");
            return Boolean.valueOf(true);
        } else
        {
            Fabric.g().a("Fabric", "Skipping session finalization because a crash has already occurred.");
            return Boolean.valueOf(false);
        }
    }

    public Object call()
    {
        return a();
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        a = crashlyticsuncaughtexceptionhandler;
        super();
    }
}
