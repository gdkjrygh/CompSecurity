// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsExecutorServiceWrapper

class a
    implements Callable
{

    final Callable a;
    final CrashlyticsExecutorServiceWrapper b;

    public Object call()
    {
        Object obj;
        try
        {
            obj = a.call();
        }
        catch (Exception exception)
        {
            Fabric.g().d("Fabric", "Failed to execute task.", exception);
            return null;
        }
        return obj;
    }

    A(CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, Callable callable)
    {
        b = crashlyticsexecutorservicewrapper;
        a = callable;
        super();
    }
}
