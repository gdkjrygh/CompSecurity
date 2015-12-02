// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.loom.config.Config;
import com.facebook.loom.config.ConfigProvider;
import com.facebook.loom.config.DevConfigProvider;
import com.facebook.loom.logger.FileManager;
import com.facebook.loom.logger.Logger;
import com.facebook.loom.logger.Trace;
import com.facebook.tools.dextr.bridge.upload.BackgroundUploadService;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.facebook.loom.core:
//            TraceEvents, TraceControl, ManualTraceController, HttpTraceController, 
//            QPLTraceController

public final class TraceOrchestrator
    implements com.facebook.loom.config.ConfigProvider.ConfigUpdateListener, TraceControl.TraceControlListener, com.facebook.loom.logger.Trace.ClosedListener, com.facebook.tools.dextr.bridge.upload.BackgroundUploadService.BackgroundUploadListener
{

    private static final AtomicReference a = new AtomicReference(null);
    private ConfigProvider b;
    private Config c;
    private FileManager d;
    private LoomListener e;
    private BackgroundUploadService f;

    private TraceOrchestrator(Context context, ConfigProvider configprovider)
    {
        b = configprovider;
        c = null;
        d = new FileManager(context);
        e = null;
        f = null;
    }

    public static TraceOrchestrator a()
    {
        TraceOrchestrator traceorchestrator = (TraceOrchestrator)a.get();
        if (traceorchestrator == null)
        {
            throw new IllegalStateException("TraceOrchestrator has not been initialized");
        } else
        {
            return traceorchestrator;
        }
    }

    public static void a(Context context, ConfigProvider configprovider)
    {
        Object obj = configprovider;
        if (configprovider == null)
        {
            obj = new DevConfigProvider();
        }
        context = new TraceOrchestrator(context, ((ConfigProvider) (obj)));
        if (a.compareAndSet(null, context))
        {
            context.d();
            return;
        } else
        {
            throw new IllegalStateException("Orchestrator already initialized");
        }
    }

    private void b(Config config)
    {
        if (config.equals(c))
        {
            return;
        }
        TraceEvents.c(-1);
        c = config;
        TraceControl tracecontrol = TraceControl.a();
        if (tracecontrol == null)
        {
            throw new IllegalStateException("Performing config change before TraceControl has been initialized");
        } else
        {
            tracecontrol.a(config.a());
            TraceEvents.b(config.b());
            return;
        }
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        b.a(this);
        obj = b.c();
        this;
        JVM INSTR monitorexit ;
        SparseArray sparsearray = new SparseArray(1);
        sparsearray.put(4, new ManualTraceController());
        sparsearray.put(2, new HttpTraceController());
        sparsearray.put(1, new QPLTraceController());
        TraceControl.a(sparsearray, this, ((Config) (obj)).a());
        this;
        JVM INSTR monitorenter ;
        b(((Config) (obj)));
        obj = d.e();
        d.a(TimeUnit.DAYS.toSeconds(1L));
        d.a(10);
        this;
        JVM INSTR monitorexit ;
        Logger.a(((File) (obj)), this);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        Config config = c;
        this;
        JVM INSTR monitorexit ;
        if (config != null)
        {
            TraceEvents.c(-1);
            TraceEvents.b(config.b());
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void f()
    {
        BackgroundUploadService backgrounduploadservice = f;
        if (backgrounduploadservice == null)
        {
            return;
        } else
        {
            backgrounduploadservice.a(d.a(), this);
            backgrounduploadservice.b(d.b(), this);
            return;
        }
    }

    public final void a(Config config)
    {
        this;
        JVM INSTR monitorenter ;
        b(config);
        this;
        JVM INSTR monitorexit ;
        return;
        config;
        throw config;
    }

    public final void a(ConfigProvider configprovider)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = configprovider.equals(b);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b.a(null);
        configprovider.a(this);
        b = configprovider;
        b(configprovider.c());
        if (true) goto _L1; else goto _L3
_L3:
        configprovider;
        throw configprovider;
    }

    public final void a(TraceControl.TraceContext tracecontext)
    {
        this;
        JVM INSTR monitorenter ;
        Config config;
        LoomListener loomlistener;
        config = c;
        loomlistener = e;
        this;
        JVM INSTR monitorexit ;
        if (config != null)
        {
            TraceEvents.c(-1);
            TraceEvents.b(tracecontext.e);
        }
        if (loomlistener != null)
        {
            loomlistener.a(tracecontext);
        }
        return;
        tracecontext;
        this;
        JVM INSTR monitorexit ;
        throw tracecontext;
    }

    public final void a(LoomListener loomlistener)
    {
        this;
        JVM INSTR monitorenter ;
        e = loomlistener;
        this;
        JVM INSTR monitorexit ;
        return;
        loomlistener;
        throw loomlistener;
    }

    public final void a(Trace trace)
    {
        File file = trace.b();
        if (file.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!trace.d())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!file.delete())
        {
            Log.e("TraceOrchestrator", "Could not delete aborted trace");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if ((trace.c() & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d.a(file, flag);
        f();
        trace = e;
        this;
        JVM INSTR monitorexit ;
        if (trace == null) goto _L1; else goto _L4
_L4:
        trace.a();
        return;
        trace;
        this;
        JVM INSTR monitorexit ;
        throw trace;
    }

    public final void a(BackgroundUploadService backgrounduploadservice)
    {
        this;
        JVM INSTR monitorenter ;
        BackgroundUploadService backgrounduploadservice1 = f;
        if (backgrounduploadservice1 != backgrounduploadservice) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = backgrounduploadservice;
        f();
        if (true) goto _L1; else goto _L3
_L3:
        backgrounduploadservice;
        throw backgrounduploadservice;
    }

    public final void a(File file)
    {
        this;
        JVM INSTR monitorenter ;
        LoomListener loomlistener;
        d.a(file);
        loomlistener = e;
        this;
        JVM INSTR monitorexit ;
        if (loomlistener != null)
        {
            loomlistener.a(file);
        }
        return;
        file;
        this;
        JVM INSTR monitorexit ;
        throw file;
    }

    public final void b(TraceControl.TraceContext tracecontext)
    {
        e();
        this;
        JVM INSTR monitorenter ;
        LoomListener loomlistener = e;
        this;
        JVM INSTR monitorexit ;
        if (loomlistener != null)
        {
            loomlistener.b(tracecontext);
        }
        return;
        tracecontext;
        this;
        JVM INSTR monitorexit ;
        throw tracecontext;
    }

    public final void b(File file)
    {
        this;
        JVM INSTR monitorenter ;
        LoomListener loomlistener = e;
        this;
        JVM INSTR monitorexit ;
        if (loomlistener != null)
        {
            loomlistener.b(file);
        }
        return;
        file;
        this;
        JVM INSTR monitorexit ;
        throw file;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        a(new DevConfigProvider());
        flag = d.c();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final Iterable c()
    {
        this;
        JVM INSTR monitorenter ;
        Iterable iterable = d.d();
        this;
        JVM INSTR monitorexit ;
        return iterable;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c(TraceControl.TraceContext tracecontext)
    {
        e();
        this;
        JVM INSTR monitorenter ;
        LoomListener loomlistener = e;
        this;
        JVM INSTR monitorexit ;
        if (loomlistener != null)
        {
            loomlistener.c(tracecontext);
        }
        return;
        tracecontext;
        this;
        JVM INSTR monitorexit ;
        throw tracecontext;
    }


    private class LoomListener
        implements TraceControl.TraceControlListener, com.facebook.tools.dextr.bridge.upload.BackgroundUploadService.BackgroundUploadListener
    {

        public abstract void a();
    }

}
