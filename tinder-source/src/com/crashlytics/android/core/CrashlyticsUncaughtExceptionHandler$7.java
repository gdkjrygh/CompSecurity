// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class c
    implements Callable
{

    final Date a;
    final Thread b;
    final Throwable c;
    final CrashlyticsUncaughtExceptionHandler d;

    public Object call()
        throws Exception
    {
        CrashlyticsUncaughtExceptionHandler.a(d, a, b, c);
        return null;
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
