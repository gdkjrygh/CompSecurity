// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.devtools;

import android.os.Debug;
import android.os.SystemClock;
import com.spotify.mobile.android.util.logging.Logger;
import gcy;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.devtools:
//            MethodTraceScope

public abstract class TraceStyle extends Enum
{

    public static final TraceStyle a;
    private static TraceStyle b;
    private static TraceStyle c;
    private static TraceStyle d;
    private static Thread e;
    private static final TraceStyle f[];

    private TraceStyle(String s, int i)
    {
        super(s, i);
    }

    TraceStyle(String s, int i, byte byte0)
    {
        this(s, i);
    }

    static void a()
    {
        if (e != null)
        {
            e.interrupt();
            try
            {
                e.join();
            }
            catch (InterruptedException interruptedexception) { }
            e = null;
        }
    }

    static Thread b()
    {
        e = null;
        return null;
    }

    static void c(MethodTraceScope methodtracescope)
    {
        methodtracescope = (new StringBuilder("/sdcard/")).append(methodtracescope.name().toLowerCase(Locale.US)).append(".").append(gcy.b()).append(".trace").toString();
        Logger.a("Starting method trace into %s", new Object[] {
            methodtracescope
        });
        Debug.startMethodTracing(methodtracescope, 0x1000000);
        methodtracescope = new Thread("TraceControl") {

            public final void run()
            {
                try
                {
                    Thread.sleep(3000L);
                }
                catch (InterruptedException interruptedexception) { }
                Debug.stopMethodTracing();
                TraceStyle.b();
            }

        };
        e = methodtracescope;
        methodtracescope.start();
    }

    public static TraceStyle valueOf(String s)
    {
        return (TraceStyle)Enum.valueOf(com/spotify/mobile/android/devtools/TraceStyle, s);
    }

    public static TraceStyle[] values()
    {
        return (TraceStyle[])f.clone();
    }

    public abstract void a(MethodTraceScope methodtracescope);

    public abstract void b(MethodTraceScope methodtracescope);

    static 
    {
        a = new TraceStyle("NONE") {

            public final void a(MethodTraceScope methodtracescope)
            {
            }

            public final void b(MethodTraceScope methodtracescope)
            {
            }

        };
        b = new TraceStyle("TIME_LOG") {

            public final void a(MethodTraceScope methodtracescope)
            {
                Logger.c("Trace start: %s", new Object[] {
                    methodtracescope.name()
                });
                methodtracescope.a("TIME_LOG_START", Long.valueOf(SystemClock.elapsedRealtime()));
            }

            public final void b(MethodTraceScope methodtracescope)
            {
                long l = SystemClock.elapsedRealtime();
                Long long1 = (Long)methodtracescope.mAuxData.get("TIME_LOG_START");
                if (long1 == null)
                {
                    return;
                } else
                {
                    methodtracescope.a("TIME_LOG_START", null);
                    Logger.c("Trace stop: %s, elapsed real time: %d", new Object[] {
                        methodtracescope, Long.valueOf(l - long1.longValue())
                    });
                    return;
                }
            }

        };
        c = new TraceStyle("METHOD_TRACING") {

            MethodTraceScope mActiveTraceScope;

            public final void a(MethodTraceScope methodtracescope)
            {
                TraceStyle.a();
                TraceStyle.c(methodtracescope);
                mActiveTraceScope = methodtracescope;
            }

            public final void b(MethodTraceScope methodtracescope)
            {
                if (mActiveTraceScope == methodtracescope)
                {
                    TraceStyle.a();
                    mActiveTraceScope = null;
                }
            }

        };
        d = new TraceStyle("METHOD_TRACING_TIME_LIMITED") {

            public final void a(MethodTraceScope methodtracescope)
            {
                TraceStyle.a();
                TraceStyle.c(methodtracescope);
            }

            public final void b(MethodTraceScope methodtracescope)
            {
            }

        };
        f = (new TraceStyle[] {
            a, b, c, d
        });
    }
}
