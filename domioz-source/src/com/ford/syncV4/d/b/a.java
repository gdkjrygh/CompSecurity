// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d.b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package com.ford.syncV4.d.b:
//            d, b, c, e

public class a
    implements d
{

    private static final String a = com/ford/syncV4/d/b/a.getSimpleName();
    private final Object b = new Object();
    private final Object c = new Object();
    private int d;
    private e e;
    private boolean f;
    private Thread g;
    private Looper h;
    private Handler i;
    private Runnable j;

    public a()
    {
        j = new b(this);
    }

    static Handler a(a a1, Handler handler)
    {
        a1.i = handler;
        return handler;
    }

    static Looper a(a a1, Looper looper)
    {
        a1.h = looper;
        return looper;
    }

    static Object a(a a1)
    {
        return a1.c;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.f = flag;
        return flag;
    }

    static boolean b(a a1)
    {
        return a1.f;
    }

    static e c(a a1)
    {
        return a1.e;
    }

    static Object d(a a1)
    {
        return a1.b;
    }

    static Handler e(a a1)
    {
        return a1.i;
    }

    static String e()
    {
        return a;
    }

    static int f(a a1)
    {
        return a1.d;
    }

    static Runnable g(a a1)
    {
        return a1.j;
    }

    public final void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = new Thread(new c(this), "HeartbeatThread");
        g.start();
_L2:
        return;
        Log.d(a, "HeartbeatThread is already started; doing nothing");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int k)
    {
        d = k;
    }

    public final void a(e e1)
    {
        e = e1;
    }

    public final void b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        g.interrupt();
        g = null;
        if (i == null) goto _L2; else goto _L1
_L1:
        i.removeCallbacks(j);
        i = null;
_L5:
        if (h == null) goto _L4; else goto _L3
_L3:
        h.quit();
        h = null;
_L6:
        return;
_L2:
        Log.e(a, "HeartbeatThread's handler is null");
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        Log.e(a, "HeartbeatThread's looper is null");
          goto _L6
        Log.d(a, "HeartbeatThread is not started");
        i = null;
        h = null;
          goto _L6
    }

    public final void c()
    {
        synchronized (b)
        {
            if (i != null)
            {
                i.removeCallbacks(j);
                if (!i.postDelayed(j, d))
                {
                    Log.e(a, "Couldn't reschedule run()");
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void d()
    {
        synchronized (c)
        {
            Log.d(a, "ACK received");
            f = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
