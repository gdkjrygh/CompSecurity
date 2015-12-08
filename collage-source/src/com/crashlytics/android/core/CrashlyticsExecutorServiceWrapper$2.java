// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsExecutorServiceWrapper

class val.callable
    implements Callable
{

    final CrashlyticsExecutorServiceWrapper this$0;
    final Callable val$callable;

    public Object call()
        throws Exception
    {
        Object obj;
        try
        {
            obj = val$callable.call();
        }
        catch (Exception exception)
        {
            c.h().e("Fabric", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }

    ()
    {
        this$0 = final_crashlyticsexecutorservicewrapper;
        val$callable = Callable.this;
        super();
    }
}
