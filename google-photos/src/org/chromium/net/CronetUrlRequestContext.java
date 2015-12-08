// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import qwn;
import qxm;
import qxn;
import qxo;

// Referenced classes of package org.chromium.net:
//            UrlRequestContext, CronetLibraryLoader, UrlRequestContextConfig, CronetUrlRequest, 
//            Version, UrlRequestListener, UrlRequest

public class CronetUrlRequestContext extends UrlRequestContext
{

    final AtomicInteger a;
    private final Object b;
    private final ConditionVariable c;
    private long d;
    private final Object e;
    private final qwn f;
    private final qwn g;

    public CronetUrlRequestContext(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        byte byte0;
        byte0 = 3;
        super();
        b = new Object();
        c = new ConditionVariable(false);
        a = new AtomicInteger(0);
        d = 0L;
        e = new Object();
        f = new qwn();
        g = new qwn();
        CronetLibraryLoader.a(context, urlrequestcontextconfig);
        if (!Log.isLoggable("ChromiumNetwork", 2)) goto _L2; else goto _L1
_L1:
        byte0 = -2;
_L4:
        nativeSetMinLogLevel(byte0);
        d = nativeCreateRequestContextAdapter(urlrequestcontextconfig.toString());
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
        context = new qxm(this);
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            context.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(context);
            return;
        }
    }

    public static Object a(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.b;
    }

    private void a(Runnable runnable)
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            Log.e("ChromiumNetwork", "Exception posting task to executor", runnable);
        }
    }

    public static void a(CronetUrlRequestContext croneturlrequestcontext, long l)
    {
        croneturlrequestcontext.nativeInitRequestContextOnMainThread(l);
    }

    public static long b(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.d;
    }

    public static Object c(CronetUrlRequestContext croneturlrequestcontext)
    {
        return croneturlrequestcontext.e;
    }

    public static qwn d(CronetUrlRequestContext croneturlrequestcontext)
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
            throw new IllegalStateException("Context is shut down.");
        } else
        {
            return;
        }
    }

    public static qwn e(CronetUrlRequestContext croneturlrequestcontext)
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
        a(new qxn(this, i, l, j));
    }

    private void onThroughputObservation(int i, long l, int j)
    {
        a(new qxo(this, i, l, j));
    }

    public final UrlRequest a(String s, UrlRequestListener urlrequestlistener, Executor executor)
    {
        synchronized (b)
        {
            d();
            s = new CronetUrlRequest(this, s, 3, urlrequestlistener, executor);
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
