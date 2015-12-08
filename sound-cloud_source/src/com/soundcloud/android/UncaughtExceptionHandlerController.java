// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android;

import android.app.ActivityManager;
import android.content.Context;
import com.soundcloud.android.utils.CrashlyticsMemoryReporter;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.MemoryReporter;

class UncaughtExceptionHandlerController
{
    class IllegalUncaughtExceptionHandlerException extends RuntimeException
    {

        final UncaughtExceptionHandlerController this$0;

        public IllegalUncaughtExceptionHandlerException(String s)
        {
            this$0 = UncaughtExceptionHandlerController.this;
            super(s);
        }
    }


    private static final String OOM_TREND_LABEL = "OOM Trend";
    private Thread.UncaughtExceptionHandler handler;
    private final MemoryReporter memoryReporter;

    public UncaughtExceptionHandlerController(Context context, boolean flag)
    {
        context = (ActivityManager)context.getSystemService("activity");
        if (flag)
        {
            memoryReporter = new CrashlyticsMemoryReporter(context);
            return;
        } else
        {
            memoryReporter = new MemoryReporter(context);
            return;
        }
    }

    UncaughtExceptionHandlerController(MemoryReporter memoryreporter)
    {
        memoryReporter = memoryreporter;
    }

    void assertHandlerIsSet()
    {
        if (handler != Thread.getDefaultUncaughtExceptionHandler())
        {
            String s = (new StringBuilder("Illegal handler: ")).append(Thread.getDefaultUncaughtExceptionHandler()).toString();
            setHandler();
            ErrorUtils.handleSilentException(s, new IllegalUncaughtExceptionHandlerException(s));
        }
    }

    void reportMemoryTrim(int i)
    {
        memoryReporter.reportMemoryTrim(i);
    }

    void reportSystemMemoryStats()
    {
        memoryReporter.reportSystemMemoryStats();
    }

    void setHandler()
    {
        handler = new _cls1();
        Thread.setDefaultUncaughtExceptionHandler(handler);
    }


    private class _cls1
        implements Thread.UncaughtExceptionHandler
    {

        final UncaughtExceptionHandlerController this$0;
        final Thread.UncaughtExceptionHandler val$crashlyticsHandler;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            if (ErrorUtils.isCausedByOutOfMemory(throwable))
            {
                memoryReporter.reportOomStats();
                crashlyticsHandler.uncaughtException(thread, new OutOfMemoryError("OOM Trend"));
                return;
            }
            if (throwable.getCause() instanceof OnErrorFailedException)
            {
                crashlyticsHandler.uncaughtException(thread, ErrorUtils.findRootCause(throwable));
                return;
            } else
            {
                crashlyticsHandler.uncaughtException(thread, throwable);
                return;
            }
        }

        _cls1()
        {
            this$0 = UncaughtExceptionHandlerController.this;
            crashlyticsHandler = uncaughtexceptionhandler;
            super();
        }
    }

}
