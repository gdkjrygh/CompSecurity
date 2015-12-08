// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core;

import android.os.Handler;
import android.os.Looper;
import com.connectsdk.service.capability.listeners.ErrorListener;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class Util
{

    private static final int NUM_OF_THREADS = 20;
    public static String T = "Connect SDK";
    private static Executor executor = Executors.newFixedThreadPool(20, new ThreadFactory() {

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setName("2nd Screen BG");
            return runnable;
        }

    });
    private static Handler handler;

    public Util()
    {
    }

    public static byte[] convertIpAddress(int i)
    {
        return (new byte[] {
            (byte)(i & 0xff), (byte)(i >> 8 & 0xff), (byte)(i >> 16 & 0xff), (byte)(i >> 24 & 0xff)
        });
    }

    public static Executor getExecutor()
    {
        return executor;
    }

    public static long getTime()
    {
        return TimeUnit.MILLISECONDS.toSeconds((new Date()).getTime());
    }

    public static boolean isMain()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void postError(ErrorListener errorlistener, ServiceCommandError servicecommanderror)
    {
        if (errorlistener == null)
        {
            return;
        } else
        {
            runOnUI(new Runnable(errorlistener, servicecommanderror) {

                final ServiceCommandError val$error;
                final ErrorListener val$listener;

                public void run()
                {
                    listener.onError(error);
                }

            
            {
                listener = errorlistener;
                error = servicecommanderror;
                super();
            }
            });
            return;
        }
    }

    public static void postSuccess(ResponseListener responselistener, Object obj)
    {
        if (responselistener == null)
        {
            return;
        } else
        {
            runOnUI(new Runnable(responselistener, obj) {

                final ResponseListener val$listener;
                final Object val$object;

                public void run()
                {
                    listener.onSuccess(object);
                }

            
            {
                listener = responselistener;
                object = obj;
                super();
            }
            });
            return;
        }
    }

    public static void runInBackground(Runnable runnable)
    {
        runInBackground(runnable, false);
    }

    public static void runInBackground(Runnable runnable, boolean flag)
    {
        if (flag || isMain())
        {
            executor.execute(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public static void runOnUI(Runnable runnable)
    {
        if (handler == null)
        {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(runnable);
    }

}
