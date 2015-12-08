// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler

class c
    implements Runnable
{

    final Date a;
    final Thread b;
    final Throwable c;
    final CrashlyticsUncaughtExceptionHandler d;

    public void run()
    {
        if (!CrashlyticsUncaughtExceptionHandler.a(d).get())
        {
            CrashlyticsUncaughtExceptionHandler.b(d, a, b, c);
        }
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
    {
        d = crashlyticsuncaughtexceptionhandler;
        a = date;
        b = thread;
        c = throwable;
        super();
    }
}
