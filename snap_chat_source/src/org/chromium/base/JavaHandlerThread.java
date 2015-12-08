// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;

class JavaHandlerThread
{

    final HandlerThread a;

    private JavaHandlerThread(String s)
    {
        a = new HandlerThread(s);
    }

    static void a(JavaHandlerThread javahandlerthread, long l, long l1)
    {
        javahandlerthread.nativeInitializeThread(l, l1);
    }

    static void b(JavaHandlerThread javahandlerthread, long l, long l1)
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
        (new Handler(a.getLooper())).post(new Runnable(l, l1) {

            private long a;
            private long b;
            private JavaHandlerThread c;

            public final void run()
            {
                JavaHandlerThread.a(c, a, b);
            }

            
            {
                c = JavaHandlerThread.this;
                a = l;
                b = l1;
                super();
            }
        });
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
        (new Handler(a.getLooper())).post(new Runnable(l, l1, flag) {

            private long a;
            private long b;
            private boolean c;
            private JavaHandlerThread d;

            public final void run()
            {
                JavaHandlerThread.b(d, a, b);
                if (!c)
                {
                    d.a.quit();
                }
            }

            
            {
                d = JavaHandlerThread.this;
                a = l;
                b = l1;
                c = flag;
                super();
            }
        });
        if (flag)
        {
            a.quitSafely();
        }
    }
}
