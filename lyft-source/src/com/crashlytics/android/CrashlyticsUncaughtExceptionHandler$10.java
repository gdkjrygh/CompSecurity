// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler

class a
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler a;

    public Void a()
    {
        if (!a.c())
        {
            CrashlyticsUncaughtExceptionHandler.c(a);
        }
        return null;
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
