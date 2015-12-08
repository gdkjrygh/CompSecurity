// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

public class ThreadUtils
{

    private static final Object a = new Object();
    private static Handler b = null;
    private static boolean c;

    public ThreadUtils()
    {
    }

    public static void a()
    {
        if (!c && !d())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public static void a(Runnable runnable)
    {
        if (d())
        {
            runnable.run();
            return;
        } else
        {
            c().post(runnable);
            return;
        }
    }

    public static Looper b()
    {
        return c().getLooper();
    }

    public static void b(Runnable runnable)
    {
        c().post(runnable);
    }

    private static Handler c()
    {
        Handler handler;
        synchronized (a)
        {
            if (b == null)
            {
                b = new Handler(Looper.getMainLooper());
            }
            handler = b;
        }
        return handler;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static boolean d()
    {
        return c().getLooper() == Looper.myLooper();
    }

    private static boolean isThreadPriorityAudio(int i)
    {
        return Process.getThreadPriority(i) == -16;
    }

    public static void setThreadPriorityAudio(int i)
    {
        Process.setThreadPriority(i, -16);
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
        c = flag;
    }
}
