// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils
{

    static final boolean $assertionsDisabled;
    private static final Object sLock = new Object();
    private static Handler sUiThreadHandler = null;
    private static boolean sWillOverride = false;

    public ThreadUtils()
    {
    }

    public static void assertOnUiThread()
    {
        if (!$assertionsDisabled && !runningOnUiThread())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    private static Handler getUiThreadHandler()
    {
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        if (sUiThreadHandler != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (sWillOverride)
        {
            throw new RuntimeException("Did not yet override the UI thread");
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        sUiThreadHandler = new Handler(Looper.getMainLooper());
        Handler handler = sUiThreadHandler;
        obj;
        JVM INSTR monitorexit ;
        return handler;
    }

    public static Looper getUiThreadLooper()
    {
        return getUiThreadHandler().getLooper();
    }

    public static FutureTask postOnUiThread(FutureTask futuretask)
    {
        getUiThreadHandler().post(futuretask);
        return futuretask;
    }

    public static void postOnUiThread(Runnable runnable)
    {
        getUiThreadHandler().post(runnable);
    }

    public static void postOnUiThreadDelayed(Runnable runnable, long l)
    {
        getUiThreadHandler().postDelayed(runnable, l);
    }

    public static FutureTask runOnUiThread(Callable callable)
    {
        return runOnUiThread(new FutureTask(callable));
    }

    public static FutureTask runOnUiThread(FutureTask futuretask)
    {
        if (runningOnUiThread())
        {
            futuretask.run();
            return futuretask;
        } else
        {
            postOnUiThread(futuretask);
            return futuretask;
        }
    }

    public static void runOnUiThread(Runnable runnable)
    {
        if (runningOnUiThread())
        {
            runnable.run();
            return;
        } else
        {
            getUiThreadHandler().post(runnable);
            return;
        }
    }

    public static Object runOnUiThreadBlocking(Callable callable)
        throws ExecutionException
    {
        callable = new FutureTask(callable);
        runOnUiThread(callable);
        try
        {
            callable = ((Callable) (callable.get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            throw new RuntimeException("Interrupted waiting for callable", callable);
        }
        return callable;
    }

    public static void runOnUiThreadBlocking(Runnable runnable)
    {
        if (runningOnUiThread())
        {
            runnable.run();
            return;
        }
        runnable = new FutureTask(runnable, null);
        postOnUiThread(runnable);
        try
        {
            runnable.get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            throw new RuntimeException("Exception occured while waiting for runnable", runnable);
        }
    }

    public static Object runOnUiThreadBlockingNoException(Callable callable)
    {
        try
        {
            callable = ((Callable) (runOnUiThreadBlocking(callable)));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            throw new RuntimeException("Error occured waiting for callable", callable);
        }
        return callable;
    }

    public static boolean runningOnUiThread()
    {
        return getUiThreadHandler().getLooper() == Looper.myLooper();
    }

    public static void setThreadPriorityAudio(int i)
    {
        Process.setThreadPriority(i, -16);
    }

    public static void setUiThread(Looper looper)
    {
        Object obj = sLock;
        obj;
        JVM INSTR monitorenter ;
        if (sUiThreadHandler != null && sUiThreadHandler.getLooper() != looper)
        {
            throw new RuntimeException((new StringBuilder()).append("UI thread looper is already set to ").append(sUiThreadHandler.getLooper()).append(" (Main thread looper is ").append(Looper.getMainLooper()).append("), cannot set to new looper ").append(looper).toString());
        }
        break MISSING_BLOCK_LABEL_79;
        looper;
        obj;
        JVM INSTR monitorexit ;
        throw looper;
        sUiThreadHandler = new Handler(looper);
        obj;
        JVM INSTR monitorexit ;
    }

    public static void setWillOverrideUiThread()
    {
        synchronized (sLock)
        {
            sWillOverride = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/ThreadUtils.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
