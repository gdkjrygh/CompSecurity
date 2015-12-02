// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.fbtrace.utils.FbTraceId;
import com.facebook.loom.logger.Logger;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.facebook.loom.core:
//            TraceController

public final class TraceControl
{

    private static final ThreadLocal a = new _cls1();
    private static volatile TraceControl b = null;
    private final SparseArray c;
    private final AtomicReference d = new AtomicReference(null);
    private final AtomicReference e;
    private final TraceControlListener f;

    private TraceControl(SparseArray sparsearray, TraceControlListener tracecontrollistener, com.facebook.loom.config.Config.RootControllerConfig rootcontrollerconfig)
    {
        c = sparsearray;
        f = tracecontrollistener;
        e = new AtomicReference(rootcontrollerconfig);
    }

    private int a(com.facebook.loom.config.Config.RootControllerConfig rootcontrollerconfig, int i, Object obj)
    {
        TraceController tracecontroller = (TraceController)c.get(i);
        if (tracecontroller == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Unregistered controller for id = ")).append(i).toString());
        } else
        {
            return tracecontroller.a(obj, rootcontrollerconfig.b(i));
        }
    }

    public static TraceControl a()
    {
        return b;
    }

    private void a(int i, Object obj, boolean flag)
    {
        TraceContext tracecontext;
        tracecontext = (TraceContext)d.get();
        break MISSING_BLOCK_LABEL_12;
        if (tracecontext != null && tracecontext.c == i)
        {
            TraceController tracecontroller = (TraceController)c.get(i);
            if (tracecontroller == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Unregistered traceController for id = ")).append(i).toString());
            }
            if (tracecontroller.a(tracecontext.d, obj))
            {
                if (d.compareAndSet(tracecontext, null))
                {
                    if (flag)
                    {
                        Logger.b();
                        if (f != null)
                        {
                            f.c(tracecontext);
                            return;
                        }
                    } else
                    {
                        Logger.a();
                        if (f != null)
                        {
                            f.b(tracecontext);
                            return;
                        }
                    }
                } else
                {
                    Log.w("LoomTraceControl", "Could not reset trace context to null");
                    return;
                }
            }
        }
        return;
    }

    static void a(SparseArray sparsearray, TraceControlListener tracecontrollistener, com.facebook.loom.config.Config.RootControllerConfig rootcontrollerconfig)
    {
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        com/facebook/loom/core/TraceControl;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        b = new TraceControl(sparsearray, tracecontrollistener, rootcontrollerconfig);
        com/facebook/loom/core/TraceControl;
        JVM INSTR monitorexit ;
        return;
        throw new IllegalStateException("TraceControl already initialized");
        sparsearray;
        com/facebook/loom/core/TraceControl;
        JVM INSTR monitorexit ;
        throw sparsearray;
        throw new IllegalStateException("TraceControl already initialized");
    }

    public final void a(int i, Object obj)
    {
        a(i, obj, false);
    }

    public final void a(com.facebook.loom.config.Config.RootControllerConfig rootcontrollerconfig)
    {
        Object obj = (TraceContext)d.get();
        if (obj != null && d.compareAndSet(obj, null))
        {
            Logger.b();
            if (f != null)
            {
                f.c(((TraceContext) (obj)));
            }
        }
        obj = (com.facebook.loom.config.Config.RootControllerConfig)e.get();
        e.compareAndSet(obj, rootcontrollerconfig);
    }

    public final boolean a(int i, int j, Object obj)
    {
        com.facebook.loom.config.Config.RootControllerConfig rootcontrollerconfig = (com.facebook.loom.config.Config.RootControllerConfig)e.get();
        if (!rootcontrollerconfig.a(i))
        {
            return false;
        }
        if ((TraceContext)d.get() != null)
        {
            return false;
        }
        int k = a(rootcontrollerconfig, i, obj);
        if (k == 0)
        {
            return false;
        }
        TraceContext tracecontext = new TraceContext();
        tracecontext.a = FbTraceId.b();
        tracecontext.b = FbTraceId.a(tracecontext.a);
        tracecontext.c = i;
        tracecontext.d = obj;
        tracecontext.e = k;
        if (d.compareAndSet(null, tracecontext))
        {
            int l = rootcontrollerconfig.b();
            i = l;
            if (l == -1)
            {
                i = 30000;
            }
            if ((j & 1) != 0)
            {
                i = 0x7fffffff;
            }
            if ((j & 4) != 0)
            {
                Logger.a(tracecontext.a, i);
            } else
            {
                Logger.a(tracecontext.a, j, i);
            }
            if (f != null)
            {
                f.a(tracecontext);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final String b()
    {
        TraceContext tracecontext = (TraceContext)d.get();
        if (tracecontext != null)
        {
            return tracecontext.b;
        } else
        {
            return "AAAAAAAAAAA";
        }
    }

    public final void b(int i, Object obj)
    {
        a(i, obj, true);
    }


    private class TraceContext
    {

        long a;
        String b;
        int c;
        Object d;
        int e;

        public TraceContext()
        {
        }
    }


    private class TraceControlListener
    {

        public abstract void a(TraceContext tracecontext);

        public abstract void b(TraceContext tracecontext);

        public abstract void c(TraceContext tracecontext);
    }


    private class _cls1 extends ThreadLocal
    {

        private static Random a()
        {
            return new Random();
        }

        protected final Object initialValue()
        {
            return a();
        }

        _cls1()
        {
        }
    }

}
