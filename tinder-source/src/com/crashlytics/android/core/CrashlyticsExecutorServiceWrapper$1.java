// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsExecutorServiceWrapper

class a
    implements Runnable
{

    final Runnable a;
    final CrashlyticsExecutorServiceWrapper b;

    public void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            c.a().c("CrashlyticsCore", "Failed to execute task.", exception);
        }
    }

    (CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, Runnable runnable)
    {
        b = crashlyticsexecutorservicewrapper;
        a = runnable;
        super();
    }
}
