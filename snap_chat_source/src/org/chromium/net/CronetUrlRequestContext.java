// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import akV;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package org.chromium.net:
//            CronetEngine, CronetLibraryLoader, CronetUrlRequest, Version, 
//            UrlRequestListener, UrlRequest

class CronetUrlRequestContext extends CronetEngine
{

    final AtomicInteger a;
    private final Object b;
    private final ConditionVariable c;
    private long d;
    private final Object e;
    private final akV f;
    private final akV g;

    public CronetUrlRequestContext(CronetEngine.Builder builder)
    {
        byte byte0;
        byte0 = 3;
        super();
        b = new Object();
        c = new ConditionVariable(false);
        a = new AtomicInteger(0);
        d = 0L;
        e = new Object();
        f = new akV();
        g = new akV();
        CronetLibraryLoader.a(builder.b, builder);
        if (!Log.isLoggable("ChromiumNetwork", 2)) goto _L2; else goto _L1
_L1:
        byte0 = -2;
_L4:
        nativeSetMinLogLevel(byte0);
        d = nativeCreateRequestContextAdapter(builder.toString());
        if (d == 0L)
        {
            throw new NullPointerException("Context Adapter creation failed.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (Log.isLoggable("ChromiumNetwork", 3))
        {
            byte0 = -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        builder = new Runnable() {

            private CronetUrlRequestContext a;

            public final void run()
            {
                synchronized (CronetUrlRequestContext.a(a))
                {
                    CronetUrlRequestContext.a(a, CronetUrlRequestContext.b(a));
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = CronetUrlRequestContext.this;
                super();
            }
        };
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            builder.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(builder);
            return;
        }
    }

    static Object a(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.b;
    }

    private static void a(Runnable runnable)
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            return;
        }
    }

    static void a(CronetUrlRequestContext croneturlrequestcontext, long l)
    {
        croneturlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    static long b(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.d;
    }

    static Object c(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.e;
    }

    static akV d(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.f;
    }

    private void d()
    {
        boolean flag;
        if (d != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalStateException("Engine is shut down.");
        } else
        {
            return;
        }
    }

    static akV e(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.g;
    }

    private void initNetworkThread()
    {
        synchronized (b)
        {
            Thread.currentThread();
            c.open();
        }
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(10);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static native long nativeCreateRequestContextAdapter(String s);

    private native void nativeDestroy(long l);

    private native void nativeEnableNetworkQualityEstimator(long l, boolean flag, boolean flag1);

    private native void nativeInitRequestContextOnMainThread(long l);

    private native void nativeProvideRTTObservations(long l, boolean flag);

    private native void nativeProvideThroughputObservations(long l, boolean flag);

    private static native int nativeSetMinLogLevel(int i);

    private native void nativeStartNetLogToFile(long l, String s, boolean flag);

    private native void nativeStopNetLog(long l);

    private void onRttObservation(int i, long l, int j)
    {
        a(new Runnable() {

            private CronetUrlRequestContext a;

            public final void run()
            {
                Object obj = CronetUrlRequestContext.c(a);
                obj;
                JVM INSTR monitorenter ;
                for (Iterator iterator = CronetUrlRequestContext.d(a).iterator(); iterator.hasNext(); iterator.next()) { }
                break MISSING_BLOCK_LABEL_45;
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                obj;
                JVM INSTR monitorexit ;
            }

            
            {
                a = CronetUrlRequestContext.this;
                super();
            }
        });
    }

    private void onThroughputObservation(int i, long l, int j)
    {
        a(new Runnable() {

            private CronetUrlRequestContext a;

            public final void run()
            {
                Object obj = CronetUrlRequestContext.c(a);
                obj;
                JVM INSTR monitorenter ;
                for (Iterator iterator = CronetUrlRequestContext.e(a).iterator(); iterator.hasNext(); iterator.next()) { }
                break MISSING_BLOCK_LABEL_45;
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                obj;
                JVM INSTR monitorexit ;
            }

            
            {
                a = CronetUrlRequestContext.this;
                super();
            }
        });
    }

    public final UrlRequest a(String s, UrlRequestListener urlrequestlistener, Executor executor, int i)
    {
        synchronized (b)
        {
            d();
            s = new CronetUrlRequest(this, s, i, urlrequestlistener, executor);
        }
        return s;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public final String b()
    {
        return (new StringBuilder("Cronet/")).append(Version.a()).toString();
    }

    final long c()
    {
        long l;
        synchronized (b)
        {
            d();
            l = d;
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
