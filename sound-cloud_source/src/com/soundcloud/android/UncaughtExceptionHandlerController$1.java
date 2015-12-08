// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.MemoryReporter;
import rx.exceptions.OnErrorFailedException;

// Referenced classes of package com.soundcloud.android:
//            UncaughtExceptionHandlerController

class val.crashlyticsHandler
    implements Controller._cls1
{

    final UncaughtExceptionHandlerController this$0;
    final Controller val$crashlyticsHandler;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (ErrorUtils.isCausedByOutOfMemory(throwable))
        {
            UncaughtExceptionHandlerController.access$000(UncaughtExceptionHandlerController.this).reportOomStats();
            val$crashlyticsHandler.uncaughtException(thread, new OutOfMemoryError("OOM Trend"));
            return;
        }
        if (throwable.getCause() instanceof OnErrorFailedException)
        {
            val$crashlyticsHandler.uncaughtException(thread, ErrorUtils.findRootCause(throwable));
            return;
        } else
        {
            val$crashlyticsHandler.uncaughtException(thread, throwable);
            return;
        }
    }

    A()
    {
        this$0 = final_uncaughtexceptionhandlercontroller;
        val$crashlyticsHandler = Controller._cls1.val.crashlyticsHandler.this;
        super();
    }
}
