// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsUncaughtExceptionHandler, LogFileManager

class b
    implements Callable
{

    final long a;
    final String b;
    final CrashlyticsUncaughtExceptionHandler c;

    public Void a()
    {
        if (!CrashlyticsUncaughtExceptionHandler.a(c).get())
        {
            CrashlyticsUncaughtExceptionHandler.b(c).a(a, b);
        }
        return null;
    }

    public Object call()
    {
        return a();
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, long l, String s)
    {
        c = crashlyticsuncaughtexceptionhandler;
        a = l;
        b = s;
        super();
    }
}
