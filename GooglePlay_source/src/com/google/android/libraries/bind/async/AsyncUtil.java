// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.bind.util.Util;
import java.util.concurrent.Executor;

public final class AsyncUtil
{

    private static Executor immediateExecutor = new Executor() {

        public final void execute(Runnable runnable)
        {
            runnable.run();
        }

    };
    private static Executor mainThreadExecutor = new Executor() {

        public final void execute(Runnable runnable)
        {
            AsyncUtil.mainThreadHandler.post(runnable);
        }

    };
    private static final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    public static void checkMainThread()
    {
        Util.checkPrecondition(isMainThread(), "Not on the main thread");
    }

    public static Executor immediateExecutor()
    {
        return immediateExecutor;
    }

    public static boolean isMainThread()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static Executor mainThreadExecutor()
    {
        return mainThreadExecutor;
    }

    public static Handler mainThreadHandler()
    {
        return mainThreadHandler;
    }


}
