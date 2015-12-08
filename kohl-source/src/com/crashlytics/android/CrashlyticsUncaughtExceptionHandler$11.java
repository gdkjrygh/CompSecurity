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

class this._cls0
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;

    public Boolean call()
        throws Exception
    {
        if (!CrashlyticsUncaughtExceptionHandler.access$300(CrashlyticsUncaughtExceptionHandler.this).get())
        {
            com.crashlytics.android.internal.models.SessionEventData sessioneventdata = CrashlyticsUncaughtExceptionHandler.access$700(CrashlyticsUncaughtExceptionHandler.this).getExternalCrashEventData();
            if (sessioneventdata != null)
            {
                CrashlyticsUncaughtExceptionHandler.access$800(CrashlyticsUncaughtExceptionHandler.this, sessioneventdata);
            }
            CrashlyticsUncaughtExceptionHandler.access$900(CrashlyticsUncaughtExceptionHandler.this);
            CrashlyticsUncaughtExceptionHandler.access$600(CrashlyticsUncaughtExceptionHandler.this);
            Fabric.getLogger().d("Fabric", "Open sessions were closed and a new session was opened.");
            return Boolean.valueOf(true);
        } else
        {
            Fabric.getLogger().d("Fabric", "Skipping session finalization because a crash has already occurred.");
            return Boolean.valueOf(false);
        }
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = CrashlyticsUncaughtExceptionHandler.this;
        super();
    }
}
