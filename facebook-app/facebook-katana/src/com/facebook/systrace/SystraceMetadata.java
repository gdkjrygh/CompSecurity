// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import android.os.Build;
import android.os.Process;
import com.facebook.androidinternals.android.os.SystemPropertiesInternal;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

// Referenced classes of package com.facebook.systrace:
//            TraceConfig, Systrace, TraceDirect

public final class SystraceMetadata
{

    private static volatile WeakHashMap a;

    private SystraceMetadata()
    {
    }

    public static void a()
    {
        a = new WeakHashMap();
    }

    public static void b()
    {
    }

    public static void c()
    {
        if (TraceConfig.a(64L))
        {
            int i1 = Process.myTid();
            Thread thread = Thread.currentThread();
            Systrace.a(64L, "thread_name", thread.getName(), i1);
            if (a != null)
            {
                a.put(thread, Integer.valueOf(i1));
                return;
            }
        }
    }

    static void d()
    {
        j();
    }

    static void e()
    {
    }

    static void f()
    {
        l();
    }

    static void g()
    {
        m();
    }

    static boolean h()
    {
        return k();
    }

    static void i()
    {
        o();
    }

    private static void j()
    {
        (new Thread(new _cls1(), "fbsystrace-thread-name-tracer")).start();
    }

    private static boolean k()
    {
        return a != null;
    }

    private static void l()
    {
        if (!TraceConfig.a(1L))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(127);
            stringbuilder.append("Android trace tags: ");
            stringbuilder.append(TraceConfig.a());
            stringbuilder.append(", Facebook trace tags: ");
            stringbuilder.append(TraceConfig.b());
            Systrace.a(64L, "process_labels", stringbuilder.toString(), 0);
            return;
        }
    }

    private static void m()
    {
        if (!TraceConfig.a(64L))
        {
            return;
        } else
        {
            Systrace.a(64L, "process_name", TraceDirect.b(), 0);
            Systrace.a(64L, "process_labels", n(), 0);
            return;
        }
    }

    private static String n()
    {
        String s = SystemPropertiesInternal.a("dalvik.vm.heapgrowthlimit");
        String s1 = SystemPropertiesInternal.a("dalvik.vm.heapmaxfree");
        String s2 = SystemPropertiesInternal.a("dalvik.vm.heapminfree");
        String s3 = SystemPropertiesInternal.a("dalvik.vm.heapstartsize");
        String s4 = SystemPropertiesInternal.a("dalvik.vm.heaptargetutilization");
        return String.format("device=%s,heapgrowthlimit=%s,heapstartsize=%s,heapminfree=%s,heapmaxfree=%s,heaptargetutilization=%s", new Object[] {
            Build.MODEL, s, s3, s1, s2, s4
        });
    }

    private static void o()
    {
        if (!TraceConfig.a(64L))
        {
            return;
        }
        Systrace.a(64L, "TraceExistingThreadsMetadata");
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); Systrace.a(64L, "thread_name", ((Thread)entry.getKey()).getName(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_93;
        Exception exception;
        exception;
        Systrace.a(64L);
        throw exception;
        Systrace.a(64L);
        return;
    }

    static 
    {
        TraceConfig.a(new JustInTimeTracer((byte)0));
    }

    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            SystraceMetadata.c();
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception) { }
            SystraceMetadata.f();
            SystraceMetadata.g();
            if (!SystraceMetadata.h())
            {
                return;
            } else
            {
                SystraceMetadata.i();
                return;
            }
        }

        _cls1()
        {
        }
    }


    private class JustInTimeTracer
        implements TraceListener
    {

        public final void a()
        {
            SystraceMetadata.d();
        }

        public final void b()
        {
            SystraceMetadata.e();
        }

        private JustInTimeTracer()
        {
        }

        JustInTimeTracer(byte byte0)
        {
            this();
        }
    }

}
