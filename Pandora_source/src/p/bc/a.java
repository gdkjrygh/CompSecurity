// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bc;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// Referenced classes of package p.bc:
//            b, c

public class a
    implements b
{

    private static final String a = p/bc/a.getSimpleName();
    private final Object b = new Object();
    private final Object c = new Object();
    private int d;
    private c e;
    private boolean f;
    private Thread g;
    private Looper h;
    private Handler i;
    private Runnable j;

    public a()
    {
        j = new Runnable() {

            final a a;

            private void a()
            {
                Object obj = a.d(a);
                obj;
                JVM INSTR monitorenter ;
                if (a.e(a) == null)
                {
                    break MISSING_BLOCK_LABEL_86;
                }
                if (Thread.interrupted()) goto _L2; else goto _L1
_L1:
                Log.d(a.e(), "Rescheduling run()");
                if (!a.e(a).postDelayed(this, a.f(a)))
                {
                    Log.e(a.e(), "Couldn't reschedule run()");
                }
_L3:
                return;
_L2:
                Log.i(a.e(), "The thread is interrupted; not scheduling heartbeat");
                  goto _L3
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                Log.e(a.e(), "HeartbeatThread handler is not set; not scheduling heartbeat");
                a.b();
                  goto _L3
            }

            public void run()
            {
                Object obj = a.a(a);
                obj;
                JVM INSTR monitorenter ;
                Log.d(a.e(), "run()");
                if (!a.b(a))
                {
                    break MISSING_BLOCK_LABEL_97;
                }
                Log.d(a.e(), "ACK has been received, sending and scheduling heartbeat");
                if (a.c(a) == null) goto _L2; else goto _L1
_L1:
                a.c(a).a(a);
_L3:
                a.a(a, false);
_L4:
                a();
                return;
_L2:
                Log.w(a.e(), "Delegate is not set, scheduling heartbeat anyway");
                  goto _L3
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                Log.d(a.e(), "ACK has not been received");
                if (a.c(a) != null)
                {
                    a.b();
                    a.c(a).b(a);
                }
                  goto _L4
            }

            
            {
                a = a.this;
                super();
            }
        };
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

    static c c(a a1)
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

    public void a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = new Thread(new Runnable() {

            final a a;

            public void run()
            {
                if (!Thread.interrupted())
                {
                    Looper.prepare();
                    a.a(a, Looper.myLooper());
                    a.a(a, new Handler());
                    Log.d(a.e(), "scheduling run()");
                    a.a(a, true);
                    if (!a.e(a).postDelayed(a.g(a), a.f(a)))
                    {
                        Log.e(a.e(), "Couldn't schedule run()");
                    }
                    Log.d(a.e(), "Starting looper");
                    Looper.loop();
                    Log.d(a.e(), "Looper stopped, exiting thread");
                    return;
                } else
                {
                    Log.i(a.e(), "HeartbeatThread is run, but already interrupted");
                    return;
                }
            }

            
            {
                a = a.this;
                super();
            }
        }, "HeartbeatThread");
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

    public void a(int k)
    {
        d = k;
    }

    public void a(c c1)
    {
        e = c1;
    }

    public void b()
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

    public void c()
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

    public void d()
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
