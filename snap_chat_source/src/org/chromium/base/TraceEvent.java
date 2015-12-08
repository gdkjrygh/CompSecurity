// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;

// Referenced classes of package org.chromium.base:
//            ThreadUtils, CommandLine

public class TraceEvent
{
    static class a
        implements Printer
    {

        private static boolean a;

        void a(String s)
        {
            if (TraceEvent.a())
            {
                TraceEvent.b();
            }
        }

        void b(String s)
        {
            if (TraceEvent.a())
            {
                TraceEvent.c();
            }
        }

        public void println(String s)
        {
            if (s.startsWith(">"))
            {
                a(s);
                return;
            }
            if (!a && !s.startsWith("<"))
            {
                throw new AssertionError();
            } else
            {
                b(s);
                return;
            }
        }

        static 
        {
            boolean flag;
            if (!org/chromium/base/TraceEvent.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b extends a
        implements android.os.MessageQueue.IdleHandler
    {

        private long a;
        private long b;
        private int c;
        private int d;
        private int e;
        private boolean f;

        private final void a()
        {
            if (TraceEvent.a() && !f)
            {
                a = SystemClock.elapsedRealtime();
                Looper.myQueue().addIdleHandler(this);
                f = true;
            } else
            if (f && !TraceEvent.a())
            {
                Looper.myQueue().removeIdleHandler(this);
                f = false;
                return;
            }
        }

        private static void a(int i, String s)
        {
            TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", s);
            Log.println(i, "TraceEvent.LooperMonitor", s);
        }

        final void a(String s)
        {
            if (e == 0)
            {
                TraceEvent.a("Looper.queueIdle");
            }
            b = SystemClock.elapsedRealtime();
            a();
            super.a(s);
        }

        final void b(String s)
        {
            long l = SystemClock.elapsedRealtime() - b;
            if (l > 16L)
            {
                a(5, (new StringBuilder("observed a task that took ")).append(l).append("ms: ").append(s).toString());
            }
            super.b(s);
            a();
            c = c + 1;
            e = e + 1;
        }

        public final boolean queueIdle()
        {
            long l = SystemClock.elapsedRealtime();
            if (a == 0L)
            {
                a = l;
            }
            long l1 = l - a;
            d = d + 1;
            TraceEvent.b("Looper.queueIdle", (new StringBuilder()).append(e).append(" tasks since last idle.").toString());
            if (l1 > 48L)
            {
                a(3, (new StringBuilder()).append(c).append(" tasks and ").append(d).append(" idles processed so far, ").append(e).append(" tasks bursted and ").append(l1).append("ms elapsed since last idle").toString());
            }
            a = l;
            e = 0;
            return true;
        }

        private b()
        {
            super((byte)0);
            a = 0L;
            b = 0L;
            c = 0;
            d = 0;
            e = 0;
            f = false;
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c
    {

        private static final a a;

        static a a()
        {
            return a;
        }

        static 
        {
            Object obj;
            if (CommandLine.d().a())
            {
                obj = new b((byte)0);
            } else
            {
                obj = new a((byte)0);
            }
            a = ((a) (obj));
        }
    }


    private static volatile boolean a = false;
    private static volatile boolean b = false;

    public TraceEvent()
    {
    }

    public static void a(String s)
    {
        if (a)
        {
            nativeEnd(s, null);
        }
    }

    public static void a(String s, String s1)
    {
        if (a)
        {
            nativeInstant(s, s1);
        }
    }

    static boolean a()
    {
        return a;
    }

    static void b()
    {
        nativeBeginToplevel();
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            nativeBegin(s, s1);
        }
    }

    static void c()
    {
        nativeEndToplevel();
    }

    private static native void nativeBegin(String s, String s1);

    private static native void nativeBeginToplevel();

    private static native void nativeEnd(String s, String s1);

    private static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String s, long l);

    private static native void nativeInstant(String s, String s1);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String s, long l);

    private static native void nativeStopATrace();

    public static void setEnabled(boolean flag)
    {
        a = flag;
        Looper looper = ThreadUtils.b();
        a a1;
        if (flag)
        {
            a1 = c.a();
        } else
        {
            a1 = null;
        }
        looper.setMessageLogging(a1);
    }

}
