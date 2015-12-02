// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.acra.ErrorReporter;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.errorreporting.FbCustomReportDataSupplier;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.errorreporting.FbErrorReporterImpl;
import com.facebook.common.executors.ListeningScheduledExecutorService_ForUiThreadMethodAutoProvider;
import com.facebook.common.init.impl.FbAppInitializer;
import com.facebook.common.memory.MemoryManager;
import com.facebook.common.memory.Provider_MemoryManager__com_facebook_common_memory_MemoryManager__INJECTED_BY_TemplateInjector;
import com.facebook.common.process.DefaultProcessUtil;
import com.facebook.common.process.ProcessName;
import com.facebook.common.process.ProcessUtil;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.IntendedAudience;
import com.facebook.debug.activitytracer.ActivityTrace;
import com.facebook.debug.activitytracer.ActivityTracer;
import com.facebook.debug.activitytracer.AppStartupType;
import com.facebook.debug.coldstart.ColdStartTimer;
import com.facebook.debug.log.BLog;
import com.facebook.debug.tracer.AsyncTracer;
import com.facebook.inject.FbInjector;
import com.facebook.inject.InjectableComponentWithContext;
import com.facebook.inject.Lazy;
import com.facebook.inject.autorequire.AutoRequireLoaderModule;
import com.facebook.inject.rootmodule.RootModuleProvider;
import com.facebook.perftestutils.FrameRateEventsTraceListener;
import com.facebook.resources.FbResources;
import com.facebook.systrace.SystraceMetadata;
import com.facebook.systrace.mainlooper.FbMainLooperTracerFactory;
import com.facebook.systrace.mainlooper.MainLooperTracer;
import com.facebook.systrace.mainlooper.MainLooperTracerFactory;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.Futures;
import com.google.inject.util.Providers;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.facebook.base.app:
//            ApplicationLike, LightweightPerfEvents

public abstract class AbstractApplicationLike
    implements ApplicationLike, InjectableComponentWithContext
{

    private static final String l = com/facebook/base/app/AbstractApplicationLike.getName();
    protected final Application a;
    FbAppInitializer b;
    ActivityTracer c;
    Executor d;
    volatile FbResources e;
    Lazy f;
    FbErrorReporter g;
    Set h;
    MainLooperTracerFactory i;
    FbAppType j;
    ColdStartTimer k;
    private final AtomicInteger m = new AtomicInteger();
    private LightweightPerfEvents n;
    private FbInjector o;

    public AbstractApplicationLike(Application application, FbAppType fbapptype, LightweightPerfEvents lightweightperfevents)
    {
        a = application;
        FbAppType.a(fbapptype);
        n = lightweightperfevents;
    }

    private static void a(Class class1, InjectableComponentWithContext injectablecomponentwithcontext)
    {
        a(injectablecomponentwithcontext, injectablecomponentwithcontext.getContext());
    }

    private static void a(Object obj, Context context)
    {
        context = FbInjector.a(context);
        obj = (AbstractApplicationLike)obj;
        obj.b = (FbAppInitializer)FbAppInitializer.a(context);
        obj.c = (ActivityTracer)ActivityTracer.a(context);
        obj.d = (Executor)ListeningScheduledExecutorService_ForUiThreadMethodAutoProvider.a(context);
        obj.e = (FbResources)com.facebook.resources.STATICDI_PROCESS_DEPENDENT_PROVIDER.FbResources.b(context);
        obj.f = Provider_MemoryManager__com_facebook_common_memory_MemoryManager__INJECTED_BY_TemplateInjector.a(context);
        obj.g = (FbErrorReporter)FbErrorReporterImpl.a(context);
        obj.h = com.facebook.common.errorreporting.STATICDI_MULTIBIND_PROVIDER.FbCustomReportDataSupplier.a(context);
        obj.i = (MainLooperTracerFactory)FbMainLooperTracerFactory.a(context);
        obj.j = (FbAppType)context.getInstance(com/facebook/config/application/FbAppType);
        obj.k = (ColdStartTimer)ColdStartTimer.a(context);
    }

    private static List c(ProcessName processname)
    {
        com.facebook.common.process.PrivateProcessName privateprocessname = processname.d();
        return ImmutableList.builder().c(new AutoRequireLoaderModule(privateprocessname)).c(RootModuleProvider.a(processname)).b();
    }

    protected static void d()
    {
    }

    private static void d(ProcessName processname)
    {
        if (TextUtils.isEmpty(processname.b()))
        {
            processname = "empty";
        } else
        {
            processname = processname.b();
        }
        ErrorReporter.getInstance().putCustomData("process_name_on_start", processname);
    }

    private static void f()
    {
        if (BuildConstants.c())
        {
            BLog.a(3);
        }
    }

    private void g()
    {
        _cls2.a[j.g().ordinal()];
        JVM INSTR tableswitch 1 1: default 32
    //                   1 39;
           goto _L1 _L2
_L1:
        byte byte0 = 5;
_L4:
        BLog.a(byte0);
        return;
_L2:
        byte0 = 3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ProcessName h()
    {
        ActivityManager activitymanager = (ActivityManager)a.getSystemService("activity");
        javax.inject.Provider provider = Providers.a(Integer.valueOf(Process.myPid()));
        return (new DefaultProcessUtil(a, activitymanager, provider)).a();
    }

    private void i()
    {
        ErrorReporter.getInstance().putCustomData("app_on_create_count", Integer.toString(m.incrementAndGet()));
    }

    private void j()
    {
        k();
        l();
    }

    private static void k()
    {
        try
        {
            Class.forName("android.os.AsyncTask");
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            BLog.a(l, "Exception trying to initialize AsyncTask", classnotfoundexception);
        }
    }

    private void l()
    {
        try
        {
            a.getSystemService("audio");
            return;
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }

    public final Resources A_()
    {
        return e;
    }

    public final FbInjector a()
    {
        this;
        JVM INSTR monitorenter ;
        while (o == null) 
        {
            wait();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        FbInjector fbinjector = o;
        this;
        JVM INSTR monitorexit ;
        return fbinjector;
    }

    public final void a(int i1)
    {
        ((MemoryManager)f.get()).a(i1);
    }

    protected void a(ProcessName processname)
    {
    }

    public final Application b()
    {
        return a;
    }

    protected void b(ProcessName processname)
    {
    }

    public void c()
    {
        Object obj;
        Object obj1;
        long l1;
        Logger.getLogger(com/google/common/base/FinalizableReferenceQueue.getName()).setLevel(Level.SEVERE);
        f();
        obj = AsyncTracer.a("Application startup");
        l1 = System.nanoTime();
        SystraceMetadata.c();
        j();
        i();
        obj1 = h();
        a(((ProcessName) (obj1)));
        d(((ProcessName) (obj1)));
        this;
        JVM INSTR monitorenter ;
        List list;
        com.facebook.common.process.PrivateProcessName privateprocessname;
        list = c(((ProcessName) (obj1)));
        privateprocessname = ((ProcessName) (obj1)).d();
        n.c("ColdStart/FBInjector.create");
        o = FbInjector.a(b(), list, privateprocessname, BuildConstants.c());
        n.b("ColdStart/FBInjector.create");
        TracerDetour.a("ApplicationLike.onCreate#notifyAll", 0xebeb8f8f);
        notifyAll();
        TracerDetour.a(0x4586f79f);
        this;
        JVM INSTR monitorexit ;
        n.c("ColdStart/FBInjector.inject");
        a(com/facebook/base/app/AbstractApplicationLike, this);
        n.b("ColdStart/FBInjector.inject");
        n = null;
        g();
        FbCustomReportDataSupplier fbcustomreportdatasupplier;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); g.a(fbcustomreportdatasupplier.a(), fbcustomreportdatasupplier))
        {
            fbcustomreportdatasupplier = (FbCustomReportDataSupplier)iterator.next();
        }

        break MISSING_BLOCK_LABEL_257;
        obj;
        n.b("ColdStart/FBInjector.create");
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        TracerDetour.a(0xc3ef0e59);
        throw obj;
        obj;
        n.b("ColdStart/FBInjector.inject");
        n = null;
        throw obj;
        h = null;
        b(((ProcessName) (obj1)));
        TracerDetour.a("FbAppInitializer.run", 0x78f53b04);
        obj1 = b.a();
        TracerDetour.a(0xdaaed7f5);
        l1 = (System.nanoTime() - l1) / 0xf4240L;
        k.a(l1);
        c.a(((AsyncTracer) (obj)), "cold_start");
        obj = c.a();
        if (obj != null)
        {
            ((ActivityTrace) (obj)).a(AppStartupType.COLD_START);
        }
        Futures.a(((com.google.common.util.concurrent.ListenableFuture) (obj1)), new _cls1(), d);
        MainLooperTracer.a(i);
        FrameRateEventsTraceListener.c();
        return;
        Exception exception;
        exception;
        TracerDetour.a(0x6698d2a1);
        throw exception;
    }

    public final void e()
    {
        ((MemoryManager)f.get()).a();
    }

    public Context getContext()
    {
        return b();
    }


    private class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[IntendedAudience.values().length];
            try
            {
                a[IntendedAudience.DEVELOPMENT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[IntendedAudience.PUBLIC.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[IntendedAudience.FACEBOOK.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements FutureCallback
    {

        final AbstractApplicationLike a;

        public void onFailure(Throwable throwable)
        {
            throw Throwables.propagate(throwable);
        }

        public void onSuccess(Object obj)
        {
            AbstractApplicationLike.d();
        }

        _cls1()
        {
            a = AbstractApplicationLike.this;
            super();
        }
    }

}
