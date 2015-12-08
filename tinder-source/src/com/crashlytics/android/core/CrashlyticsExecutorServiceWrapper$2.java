// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsExecutorServiceWrapper

class a
    implements Callable
{

    final Callable a;
    final CrashlyticsExecutorServiceWrapper b;

    public Object call()
        throws Exception
    {
        Object obj;
        try
        {
            obj = a.call();
        }
        catch (Exception exception)
        {
            c.a().c("CrashlyticsCore", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }

    (CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, Callable callable)
    {
        b = crashlyticsexecutorservicewrapper;
        a = callable;
        super();
    }
}
