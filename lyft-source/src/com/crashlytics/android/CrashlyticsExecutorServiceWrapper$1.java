// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android:
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
            Fabric.g().d("Fabric", "Failed to execute task.", exception);
        }
    }

    A(CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, Runnable runnable)
    {
        b = crashlyticsexecutorservicewrapper;
        a = runnable;
        super();
    }
}
