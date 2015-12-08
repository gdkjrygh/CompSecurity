// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsExecutorServiceWrapper

class val.runnable
    implements Runnable
{

    final CrashlyticsExecutorServiceWrapper this$0;
    final Runnable val$runnable;

    public void run()
    {
        try
        {
            val$runnable.run();
            return;
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Fabric", "Failed to execute task.", exception);
        }
    }

    A()
    {
        this$0 = final_crashlyticsexecutorservicewrapper;
        val$runnable = Runnable.this;
        super();
    }
}
