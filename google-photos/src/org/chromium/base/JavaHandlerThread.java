// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import qwk;
import qwl;

public class JavaHandlerThread
{

    public final HandlerThread a;

    private JavaHandlerThread(String s)
    {
        a = new HandlerThread(s);
    }

    public static void a(JavaHandlerThread javahandlerthread, long l, long l1)
    {
        javahandlerthread.nativeInitializeThread(l, l1);
    }

    public static void b(JavaHandlerThread javahandlerthread, long l, long l1)
    {
        javahandlerthread.nativeStopThread(l, l1);
    }

    private static JavaHandlerThread create(String s)
    {
        return new JavaHandlerThread(s);
    }

    private native void nativeInitializeThread(long l, long l1);

    private native void nativeStopThread(long l, long l1);

    private void start(long l, long l1)
    {
        a.start();
        (new Handler(a.getLooper())).post(new qwk(this, l, l1));
    }

    private void stop(long l, long l1)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new Handler(a.getLooper())).post(new qwl(this, l, l1, flag));
        if (flag)
        {
            a.quitSafely();
        }
    }
}
