// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.facebook.acra.ACRA;
import com.facebook.acra.ErrorReporter;
import com.facebook.analytics.appstatelogger.AppStateLogger;
import com.facebook.base.app.ApplicationLike;
import com.facebook.base.app.DelegatingApplication;
import com.facebook.base.app.LightweightPerfEvents;
import com.facebook.base.lwperf.LightWeightPerfState;
import com.facebook.base.lwperf.perfstats.BackgroundChecker;
import com.facebook.base.lwperf.perfstats.PerfStats;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.DexDiagnostics;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.dextricks.MemoryEnlargementHack;
import com.facebook.common.dextricks.MemoryReductionHack;
import com.facebook.common.errorreporting.AcraDexLibLoaderBridge;
import com.facebook.common.errorreporting.FbCrashReporter;
import com.facebook.common.errorreporting.crashcounter.CrashCounter;
import com.facebook.common.errorreporting.persisteduid.PersistedUid;
import com.facebook.common.gcinitopt.GcOptimizer;
import com.facebook.common.manifest.ManifestReader;
import com.facebook.common.process.ProcessName;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.FbAppTypeSelector;
import com.facebook.dalvik.DalvikInternals;
import com.facebook.dalvik.DalvikLinearAllocType;
import com.facebook.dalvik.DalvikReplaceBuffer;
import com.facebook.dalviktelemetry.DalvikTelemetry;
import com.facebook.inject.FbInjector;
import com.facebook.inject.FbInjectorProvider;
import com.facebook.nobreak.CatchMeIfYouCan;
import com.facebook.nobreak.CatchMeIfYouCanHolder;
import com.facebook.nobreak.DefaultCatchMeIfYouCan;
import com.facebook.nobreak.ExceptionHandlerToDispatchKnownExceptionRemedies;
import com.facebook.nobreak.RecoveryModeHelper;
import com.facebook.resources.HasBaseResourcesAccess;
import com.facebook.systrace.MemoryTracer;
import com.facebook.systrace.Systrace;

// Referenced classes of package com.facebook.katana.app:
//            WorkAppTypes, FacebookAppTypes, FacebookApplicationImpl, NodexFacebookApplicationImpl, 
//            RecoveryModeFacebookApplicationImpl, FbnsApplicationImpl, BrowserApplicationImpl

public class FacebookApplication extends DelegatingApplication
    implements FbInjectorProvider, HasBaseResourcesAccess
{

    private static final com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile g[] = {
        new com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile("dash", 6, 60000L, true, true, true)
    };
    private static final com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile h[] = {
        new com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile("", 3, 0x1d4c0L, false, false, false), new com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile("dash_service", 3, 0x1d4c0L, false, false, false), new com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile("providers", 3, 0x1d4c0L, false, false, false), new com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile("dash", 6, 60000L, false, false, false)
    };
    private FbAppType a;
    private CatchMeIfYouCan b;
    private long c;
    private PerfStats d;
    private LightweightPerfEvents e;
    private RecoveryModeHelper f;

    public FacebookApplication()
    {
        e = new LightweightPerfEvents();
        d = new PerfStats();
    }

    private DexErrorRecoveryInfo a(LightweightPerfEvents lightweightperfevents)
    {
        try
        {
            lightweightperfevents = DexLibLoader.a(this, BuildConstants.c(), lightweightperfevents);
            AcraDexLibLoaderBridge.a();
            MemoryReductionHack.a(this);
        }
        // Misplaced declaration of an exception variable
        catch (LightweightPerfEvents lightweightperfevents)
        {
            a(ErrorReporter.getInstance());
            com.facebook.acra.ErrorReporter.ReportsSenderWorker reportssenderworker = ErrorReporter.getInstance().handleException(lightweightperfevents);
            if (reportssenderworker != null)
            {
                try
                {
                    reportssenderworker.join();
                }
                catch (InterruptedException interruptedexception) { }
            }
            b.uncaughtException(Thread.currentThread(), lightweightperfevents);
            Process.killProcess(Process.myPid());
            throw new RuntimeException("unreachable");
        }
        return lightweightperfevents;
    }

    private void a(ErrorReporter errorreporter)
    {
        DexDiagnostics dexdiagnostics = new DexDiagnostics(this);
        try
        {
            int k = dexdiagnostics.a();
            errorreporter.putCustomData("application_uid", String.valueOf(Process.myUid()));
            errorreporter.putCustomData("directory_owner_uid", String.valueOf(k));
            errorreporter.putCustomData("mounts_file", DexDiagnostics.a("/proc/mounts", " /data "));
            errorreporter.putCustomData("uptime_file", DexDiagnostics.a("/proc/uptime", null));
            errorreporter.putCustomData("loadavg_file", DexDiagnostics.a("/proc/loadavg", null));
            errorreporter.putCustomData("dex_directories", dexdiagnostics.c());
            errorreporter.putCustomData("logcat_dump", DexDiagnostics.d());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ErrorReporter errorreporter)
        {
            Log.e("FacebookApplication", "Unable to read directory owner uid for ACRA report", errorreporter);
        }
    }

    private void a(boolean flag, int k)
    {
        if (!BreakpadManager.b())
        {
            BreakpadManager.a(this, flag, k);
        }
        if (BreakpadManager.b())
        {
            long l;
            try
            {
                DalvikInternals.a(System.mapLibraryName(BreakpadManager.a()));
            }
            catch (Exception exception)
            {
                Log.w("FacebookApplication", "registerDalvikStreamWithBreakpad failed", exception);
            }
            BreakpadManager.getMinidumpFlags();
            l = 0L;
            if (f())
            {
                l = 40L;
            }
            BreakpadManager.setMinidumpFlags(l);
        }
    }

    private boolean f()
    {
        String s = j().c();
        return "videoplayer".equalsIgnoreCase(s) || "browser".equalsIgnoreCase(s);
    }

    private void g()
    {
        e.a("ACRA_Setup");
        a = i();
        Object obj;
        if (BuildConstants.c())
        {
            obj = "https://b-www.facebook.com/mobile/android_beta_crash_logs/";
        } else
        {
            obj = "https://b-www.facebook.com/mobile/android_crash_logs/";
        }
        if (BuildConstants.e())
        {
            obj = FbCrashReporter.a(a.c()).toString();
        }
        obj = ACRA.init(new FbCrashReporter(this), ((String) (obj)), BuildConstants.c());
        ((ErrorReporter) (obj)).putCustomData("app", a.b());
        ((ErrorReporter) (obj)).putCustomData("fb_app_id", a.c());
        ((ErrorReporter) (obj)).putLazyCustomData("app_backgrounded", new _cls1());
        PersistedUid.a(this, ((ErrorReporter) (obj)));
        CrashCounter.a(this, ((ErrorReporter) (obj)));
        if (BuildConstants.c())
        {
            ((ErrorReporter) (obj)).setMaxReportSize(0x100000L);
        }
        e.b("ACRA_Setup");
        return;
        Exception exception;
        exception;
        e.b("ACRA_Setup");
        throw exception;
    }

    private void h()
    {
        AppStateLogger.a(this, j());
    }

    private FbAppType i()
    {
        e.a("FacebookApplication#getAppType");
        FbAppType fbapptype;
        if (BuildConstants.e())
        {
            if (BuildConstants.c())
            {
                fbapptype = WorkAppTypes.a;
            } else
            {
                fbapptype = WorkAppTypes.b;
            }
        } else
        {
            fbapptype = FbAppTypeSelector.a(FacebookAppTypes.a, FacebookAppTypes.b, FacebookAppTypes.c);
        }
        e.b("FacebookApplication#getAppType");
        return fbapptype;
    }

    private ProcessName j()
    {
        return DefaultCatchMeIfYouCan.a(this);
    }

    public final FbInjector a()
    {
        ApplicationLike applicationlike = e();
        if (applicationlike instanceof FacebookApplicationImpl)
        {
            return ((FacebookApplicationImpl)applicationlike).a();
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder("Injector is not supported in process ")).append(j().b()).toString());
        }
    }

    protected final ApplicationLike c()
    {
        Object obj;
        if (BuildConstants.c())
        {
            Systrace.a();
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            try
            {
                MemoryEnlargementHack.a(this);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FacebookApplication", "Unable to set large heap mode", ((Throwable) (obj)));
            }
        }
        e.a("ColdStart/FBApp.createDelegate");
        obj = j().c();
        if (!"recovery".equalsIgnoreCase(((String) (obj)))) goto _L2; else goto _L1
_L1:
        if (f.a(this)) goto _L4; else goto _L3
_L3:
        RecoveryModeHelper.b();
_L6:
        if (!"nodex".equalsIgnoreCase(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj = new NodexFacebookApplicationImpl();
        e.b("ColdStart/FBApp.createDelegate");
        return ((ApplicationLike) (obj));
_L4:
        obj = new RecoveryModeFacebookApplicationImpl(this, f);
        e.b("ColdStart/FBApp.createDelegate");
        return ((ApplicationLike) (obj));
_L2:
        if (!f.a(this)) goto _L6; else goto _L5
_L5:
        RecoveryModeHelper.b();
          goto _L6
        obj;
        e.b("ColdStart/FBApp.createDelegate");
        throw obj;
        if (!"videoplayer".equalsIgnoreCase(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_191;
        }
        obj = new NodexFacebookApplicationImpl();
        e.b("ColdStart/FBApp.createDelegate");
        return ((ApplicationLike) (obj));
        e.a("ColdStart/EnsureDexsLoaded");
        DexErrorRecoveryInfo dexerrorrecoveryinfo = a(e);
        e.b("ColdStart/EnsureDexsLoaded");
        if (android.os.Build.VERSION.SDK_INT <= 19 && j().e())
        {
            GcOptimizer.a(this);
        }
        if (!BuildConstants.c())
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj = DalvikLinearAllocType.FBANDROID_DEBUG;
_L7:
        e.a("ColdStart/ReplaceLinearAllocBuffer");
        boolean flag = DalvikReplaceBuffer.a(((DalvikLinearAllocType) (obj)));
        e.b("ColdStart/ReplaceLinearAllocBuffer");
        if (flag)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        e.a("ColdStart/FallbackReplaceLinearAllocBuffer");
        DalvikTelemetry.a(this, j().b());
        e.b("ColdStart/FallbackReplaceLinearAllocBuffer");
        e.b("ColdStart/FBApp.createDelegate");
        if ("fbns".equals(j().c()))
        {
            return new FbnsApplicationImpl();
        }
        break MISSING_BLOCK_LABEL_392;
        obj;
        e.b("ColdStart/EnsureDexsLoaded");
        throw obj;
        obj = DalvikLinearAllocType.FBANDROID_RELEASE;
          goto _L7
        Exception exception;
        exception;
        e.b("ColdStart/ReplaceLinearAllocBuffer");
        throw exception;
        exception;
        e.b("ColdStart/FallbackReplaceLinearAllocBuffer");
        throw exception;
        if ("browser".equalsIgnoreCase(j().c()))
        {
            return new BrowserApplicationImpl();
        } else
        {
            FacebookApplicationImpl facebookapplicationimpl = new FacebookApplicationImpl(this, a, dexerrorrecoveryinfo, c, d, e);
            e = null;
            d = null;
            return facebookapplicationimpl;
        }
    }

    protected final void d()
    {
        LightWeightPerfState.a();
        c = LightWeightPerfState.d();
        d.l();
        e.d("ColdStart/FBAppImpl.onCreate");
        e.a("ColdStart/FBApp.onBaseContextAttached");
        BackgroundChecker.a().b();
        boolean flag;
        flag = "true".equals((new ManifestReader(this)).a("com.facebook.ndash"));
        e.a("CatchMeIfYouCan_Setup");
        if (!flag) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L3; else goto _L2
_L2:
        b = CatchMeIfYouCanHolder.a();
_L4:
        e.b("CatchMeIfYouCan_Setup");
        f = RecoveryModeHelper.a();
        ExceptionHandlerToDispatchKnownExceptionRemedies.a(this);
        g();
        h();
        e.a("BreakpadManager_Setup");
        a(BuildConstants.c(), 0);
        e.b("BreakpadManager_Setup");
        MemoryTracer.a();
        e.b("ColdStart/FBApp.onBaseContextAttached");
        return;
_L3:
        Object obj;
        if (!BuildConstants.c())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = h;
_L5:
        b = CatchMeIfYouCanHolder.a(this, ((com.facebook.nobreak.DefaultCatchMeIfYouCan.ProcessProfile []) (obj)));
          goto _L4
        obj;
        e.b("CatchMeIfYouCan_Setup");
        throw obj;
        obj;
        e.b("ColdStart/FBApp.onBaseContextAttached");
        throw obj;
        obj = g;
          goto _L5
        Exception exception;
        exception;
        e.b("BreakpadManager_Setup");
        throw exception;
    }


    private class _cls1
        implements CustomReportDataSupplier
    {

        final FacebookApplication a;

        public String getCustomData(Throwable throwable)
        {
            return String.valueOf(BackgroundChecker.a().e());
        }

        _cls1()
        {
            a = FacebookApplication.this;
            super();
        }
    }

}
