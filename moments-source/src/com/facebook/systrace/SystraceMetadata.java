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
    }

    public static void b()
    {
        if (TraceConfig.a(64L))
        {
            int i1 = Process.myTid();
            Thread thread = Thread.currentThread();
            Systrace.a("thread_name", thread.getName(), i1);
            if (a != null)
            {
                a.put(thread, Integer.valueOf(i1));
                return;
            }
        }
    }

    static void c()
    {
        i();
    }

    static void d()
    {
    }

    static void e()
    {
        k();
    }

    static void f()
    {
        l();
    }

    static boolean g()
    {
        return j();
    }

    static void h()
    {
        n();
    }

    private static void i()
    {
        (new Thread(new _cls1(), "fbsystrace-thread-name-tracer")).start();
    }

    private static boolean j()
    {
        return a != null;
    }

    private static void k()
    {
        if (!TraceConfig.a(1L))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(127);
            stringbuilder.append("Android trace tags: ");
            stringbuilder.append(TraceConfig.b());
            stringbuilder.append(", Facebook trace tags: ");
            stringbuilder.append(TraceConfig.c());
            Systrace.a("process_labels", stringbuilder.toString(), 0);
            return;
        }
    }

    private static void l()
    {
        if (!TraceConfig.a(64L))
        {
            return;
        } else
        {
            Systrace.a("process_name", TraceDirect.b(), 0);
            Systrace.a("process_labels", m(), 0);
            return;
        }
    }

    private static String m()
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

    private static void n()
    {
        if (!TraceConfig.a(64L))
        {
            return;
        }
        Systrace.a(64L, "TraceExistingThreadsMetadata");
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); Systrace.a("thread_name", ((Thread)entry.getKey()).getName(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_90;
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
            SystraceMetadata.b();
            try
            {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedexception) { }
            SystraceMetadata.e();
            SystraceMetadata.f();
            if (!SystraceMetadata.g())
            {
                return;
            } else
            {
                SystraceMetadata.h();
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
            SystraceMetadata.c();
        }

        public final void b()
        {
            SystraceMetadata.d();
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
