// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler, LogFileManager, FileLogStore

class b
    implements Callable
{

    final long a;
    final String b;
    final CrashlyticsUncaughtExceptionHandler c;

    public Object call()
        throws Exception
    {
        if (!CrashlyticsUncaughtExceptionHandler.a(c).get())
        {
            LogFileManager logfilemanager = CrashlyticsUncaughtExceptionHandler.b(c);
            long l = a;
            String s = b;
            logfilemanager.a.a(l, s);
        }
        return null;
    }

    (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, long l, String s)
    {
        c = crashlyticsuncaughtexceptionhandler;
        a = l;
        b = s;
        super();
    }
}
