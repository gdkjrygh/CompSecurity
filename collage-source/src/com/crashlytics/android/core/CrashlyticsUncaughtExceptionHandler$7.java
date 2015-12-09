// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.Date;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsUncaughtExceptionHandler

class val.ex
    implements Callable
{

    final CrashlyticsUncaughtExceptionHandler this$0;
    final Throwable val$ex;
    final Date val$now;
    final Thread val$thread;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        CrashlyticsUncaughtExceptionHandler.access$200(CrashlyticsUncaughtExceptionHandler.this, val$now, val$thread, val$ex);
        return null;
    }

    ()
    {
        this$0 = final_crashlyticsuncaughtexceptionhandler;
        val$now = date;
        val$thread = thread1;
        val$ex = Throwable.this;
        super();
    }
}
