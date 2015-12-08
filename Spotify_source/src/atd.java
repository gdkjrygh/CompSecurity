// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class atd
    implements ate
{

    private static final String b = atd.getSimpleName();
    public int a;
    private final Object c = new Object();
    private final Object d = new Object();
    private atf e;
    private boolean f;
    private Thread g;
    private Looper h;
    private Handler i;
    private Runnable j;

    public atd()
    {
        j = new Runnable() {

            private atd a;

            public final void run()
            {
                Object obj = atd.a(a);
                obj;
                JVM INSTR monitorenter ;
                Log.d(atd.e(), "run()");
                if (!atd.b(a)) goto _L2; else goto _L1
_L1:
                Log.d(atd.e(), "ACK has been received, sending and scheduling heartbeat");
                if (atd.c(a) == null) goto _L4; else goto _L3
_L3:
                atd.c(a).a();
_L7:
                atd.a(a, false);
_L8:
                obj = atd.d(a);
                obj;
                JVM INSTR monitorenter ;
                if (atd.e(a) == null)
                {
                    break MISSING_BLOCK_LABEL_215;
                }
                if (Thread.interrupted()) goto _L6; else goto _L5
_L5:
                Log.d(atd.e(), "Rescheduling run()");
                if (!atd.e(a).postDelayed(this, atd.f(a)))
                {
                    Log.e(atd.e(), "Couldn't reschedule run()");
                }
_L9:
                return;
_L4:
                Log.w(atd.e(), "Delegate is not set, scheduling heartbeat anyway");
                  goto _L7
                Exception exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
_L2:
                Log.d(atd.e(), "ACK has not been received");
                if (atd.c(a) != null)
                {
                    a.b();
                    atd.c(a).b();
                }
                  goto _L8
_L6:
                Log.i(atd.e(), "The thread is interrupted; not scheduling heartbeat");
                  goto _L9
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
                Log.e(atd.e(), "HeartbeatThread handler is not set; not scheduling heartbeat");
                a.b();
                  goto _L9
            }

            
            {
                a = atd.this;
                super();
            }
        };
    }

    static Handler a(atd atd1, Handler handler)
    {
        atd1.i = handler;
        return handler;
    }

    static Looper a(atd atd1, Looper looper)
    {
        atd1.h = looper;
        return looper;
    }

    static Object a(atd atd1)
    {
        return atd1.d;
    }

    static boolean a(atd atd1, boolean flag)
    {
        atd1.f = flag;
        return flag;
    }

    static boolean b(atd atd1)
    {
        return atd1.f;
    }

    static atf c(atd atd1)
    {
        return atd1.e;
    }

    static Object d(atd atd1)
    {
        return atd1.c;
    }

    static Handler e(atd atd1)
    {
        return atd1.i;
    }

    static String e()
    {
        return b;
    }

    static int f(atd atd1)
    {
        return atd1.a;
    }

    static Runnable g(atd atd1)
    {
        return atd1.j;
    }

    public final void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = new Thread(new Runnable() {

            private atd a;

            public final void run()
            {
                if (!Thread.interrupted())
                {
                    Looper.prepare();
                    atd.a(a, Looper.myLooper());
                    atd.a(a, new Handler());
                    Log.d(atd.e(), "scheduling run()");
                    atd.a(a, true);
                    if (!atd.e(a).postDelayed(atd.g(a), atd.f(a)))
                    {
                        Log.e(atd.e(), "Couldn't schedule run()");
                    }
                    Log.d(atd.e(), "Starting looper");
                    Looper.loop();
                    Log.d(atd.e(), "Looper stopped, exiting thread");
                    return;
                } else
                {
                    Log.i(atd.e(), "HeartbeatThread is run, but already interrupted");
                    return;
                }
            }

            
            {
                a = atd.this;
                super();
            }
        }, "HeartbeatThread");
        g.start();
_L2:
        return;
        Log.d(b, "HeartbeatThread is already started; doing nothing");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(atf atf)
    {
        e = atf;
    }

    public final void b()
    {
        Object obj = c;
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
        Log.e(b, "HeartbeatThread's handler is null");
          goto _L5
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        Log.e(b, "HeartbeatThread's looper is null");
          goto _L6
        Log.d(b, "HeartbeatThread is not started");
        i = null;
        h = null;
          goto _L6
    }

    public final void c()
    {
        synchronized (c)
        {
            if (i != null)
            {
                i.removeCallbacks(j);
                if (!i.postDelayed(j, a))
                {
                    Log.e(b, "Couldn't reschedule run()");
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
        synchronized (d)
        {
            Log.d(b, "ACK received");
            f = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
