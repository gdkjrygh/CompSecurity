// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.katana.app;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.analytics.tagging.AnalyticsTag;
import com.facebook.apptab.state.TabTag;
import com.facebook.backgroundtasks.BackgroundTaskController;
import com.facebook.base.app.AbstractApplicationLike;
import com.facebook.base.app.LightweightPerfEvents;
import com.facebook.base.lwperf.LightWeightPerfState;
import com.facebook.base.lwperf.perfstats.BackgroundChecker;
import com.facebook.base.lwperf.perfstats.PerfStats;
import com.facebook.classpreloader.ClassPreloaderController;
import com.facebook.common.appstate.AppStateManager;
import com.facebook.common.build.SignatureType;
import com.facebook.common.dextricks.DexErrorRecoveryInfo;
import com.facebook.common.errorreporting.AcraBLogBridge;
import com.facebook.common.errorreporting.FbErrorReporter;
import com.facebook.common.errorreporting.FbErrorReporterImpl;
import com.facebook.common.executors.gk.ThreadPriorityGatekeeperHandler;
import com.facebook.common.init.AppInitLock;
import com.facebook.common.process.ProcessName;
import com.facebook.common.random.Random_InsecureRandomMethodAutoProvider;
import com.facebook.common.udppriming.client.ColdStartPrimingInformation;
import com.facebook.common.udppriming.client.EncryptChannelInformation;
import com.facebook.common.udppriming.client.UDPPrimingDNSInfo;
import com.facebook.config.application.FbAppType;
import com.facebook.config.application.SignatureTypeMethodAutoProvider;
import com.facebook.contacts.background.ContactsTaskTag;
import com.facebook.feed.perf.FeedPerfLogger;
import com.facebook.inject.FbInjector;
import com.facebook.inject.FbInjectorProvider;
import com.facebook.katana.app.module.common.FbandroidProcessName;
import com.facebook.loom.core.TraceOrchestrator;
import com.facebook.messaging.background.MessagesDataTaskTag;
import com.facebook.messaging.background.MessagesLocalTaskTag;
import com.facebook.perf.StartupPerfLogger;
import com.facebook.performancelogger.DelegatingPerformanceLogger;
import com.facebook.performancelogger.MarkerConfig;
import com.facebook.performancelogger.PerformanceLogger;
import com.facebook.reportaproblem.base.ReportAProblem;
import com.facebook.reportaproblem.fb.FbReportAProblemConfigProvider;
import com.facebook.resources.HasOverridingResources;
import com.facebook.strictmode.StrictModeAggregator;
import com.facebook.tools.dextr.runtime.detour.TracerDetour;
import com.google.common.base.FinalizableReferenceQueue;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.facebook.katana.app:
//            FacebookApplication

public class FacebookApplicationImpl extends AbstractApplicationLike
    implements FbInjectorProvider, HasOverridingResources
{

    public static final String l = com/facebook/katana/app/FacebookApplication.getSimpleName();
    private final Context m;
    private final DexErrorRecoveryInfo n;
    private FbandroidProcessName o;
    private final long p;
    private final PerfStats q;
    private LightweightPerfEvents r;
    private boolean s;
    private boolean t;

    public FacebookApplicationImpl(Application application, FbAppType fbapptype, DexErrorRecoveryInfo dexerrorrecoveryinfo, long l1, PerfStats perfstats, LightweightPerfEvents lightweightperfevents)
    {
        super(application, fbapptype, lightweightperfevents);
        s = false;
        t = false;
        n = dexerrorrecoveryinfo;
        p = l1;
        q = perfstats;
        m = application;
        r = lightweightperfevents;
    }

    static FbandroidProcessName a(FacebookApplicationImpl facebookapplicationimpl)
    {
        return facebookapplicationimpl.o;
    }

    private void a(FbInjector fbinjector)
    {
        if (n != null && !n.a.isEmpty())
        {
            fbinjector = (FbErrorReporter)FbErrorReporterImpl.a(fbinjector);
            int i = n.a.size();
            if (n.b.size() < i)
            {
                i = n.b.size();
            }
            for (int j = 0; j < i; j++)
            {
                fbinjector.a("DexLibLoader_ERROR_RECOVERY", (String)n.a.get(j), (Throwable)n.b.get(j));
            }

        }
    }

    static void a(FacebookApplicationImpl facebookapplicationimpl, FbInjector fbinjector)
    {
        facebookapplicationimpl.a(fbinjector);
    }

    static void a(FacebookApplicationImpl facebookapplicationimpl, StartupPerfLogger startupperflogger)
    {
        facebookapplicationimpl.a(startupperflogger);
    }

    private void a(StartupPerfLogger startupperflogger)
    {
        r.e("ColdStart/AppInitialization");
        r.a(new _cls2(startupperflogger));
        t = true;
        g();
    }

    static void a(StartupPerfLogger startupperflogger, int i, String s1, long l1, long l2, Boolean boolean1, 
            PerfStats perfstats)
    {
        b(startupperflogger, i, s1, l1, l2, boolean1, perfstats);
    }

    private void a(PerformanceLogger performancelogger, FeedPerfLogger feedperflogger, long l1)
    {
        TracerDetour.a("FacebookApplicationImpl.runPerfMarkers", 0x55a866a);
        if (!FbandroidProcessName.DASH.equals(o)) goto _L2; else goto _L1
_L1:
        performancelogger.b((new MarkerConfig(0xa0033, "DashColdStart")).a(l1).a(new AnalyticsTag[] {
            AnalyticsTag.DASH_ACTIVITY_NAME, AnalyticsTag.DASH_SPLASH_ANALYTICS_NAME, AnalyticsTag.MODULE_DASH, AnalyticsTag.MODULE_DASH_LAUNCHABLES
        }).b().c(BackgroundChecker.a().d()));
_L4:
        TracerDetour.a(0x5559291e);
        return;
_L2:
        if (!o.getProcessName().e()) goto _L4; else goto _L3
_L3:
        l1 = p;
        PerfStats perfstats = q;
        boolean flag = f();
        LightWeightPerfState.a();
        feedperflogger.a(l1, perfstats, flag, LightWeightPerfState.e());
        performancelogger.b((new MarkerConfig(0xa0034, "NNF_PermalinkFromAndroidNotificationColdLoad")).a(p).a(new AnalyticsTag[] {
            AnalyticsTag.STORY_VIEW, TabTag.Notifications.analyticsTag
        }).b().c(BackgroundChecker.a().d()));
          goto _L4
        performancelogger;
        TracerDetour.a(0x1cc2f495);
        throw performancelogger;
    }

    private static void b(StartupPerfLogger startupperflogger, int i, String s1, long l1, long l2, Boolean boolean1, 
            PerfStats perfstats)
    {
        if (startupperflogger == null)
        {
            return;
        } else
        {
            startupperflogger.a(i, s1, null, null, l1, perfstats, boolean1).a(i, s1, null, null, l2, boolean1);
            return;
        }
    }

    private boolean f()
    {
        o.getProcessName().b();
        boolean flag = n.c;
        LightWeightPerfState.a().b();
        return n.c || LightWeightPerfState.a().b();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (s && t)
        {
            r = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        TracerDetour.a("FacebookApplicationImpl.startStrictMode", 0x4bcd61af);
        FbInjector fbinjector;
        SignatureType signaturetype;
        fbinjector = a();
        signaturetype = (SignatureType)SignatureTypeMethodAutoProvider.a(fbinjector);
        if (signaturetype == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        if (signaturetype == SignatureType.DEBUG)
        {
            (new StrictModeAggregator((FbErrorReporter)FbErrorReporterImpl.a(fbinjector), (Random)Random_InsecureRandomMethodAutoProvider.a(fbinjector))).a();
        }
        TracerDetour.a(0xc955c9a6);
        return;
        Exception exception;
        exception;
        TracerDetour.a(0x5069fd38);
        throw exception;
    }

    protected final void a(ProcessName processname)
    {
        o = FbandroidProcessName.convertProcessNameToProcessEnum(processname);
    }

    protected final void b(ProcessName processname)
    {
        FbInjector fbinjector = a();
        BackgroundTaskController backgroundtaskcontroller = (BackgroundTaskController)BackgroundTaskController.a(fbinjector);
        if (!processname.e())
        {
            backgroundtaskcontroller.a(com/facebook/contacts/background/ContactsTaskTag, true);
            backgroundtaskcontroller.a(com/facebook/messaging/background/MessagesDataTaskTag, true);
            backgroundtaskcontroller.a(com/facebook/messaging/background/MessagesLocalTaskTag, true);
        } else
        {
            ((AppStateManager)AppStateManager.a(fbinjector)).a(p);
        }
        r.d("ColdStart/AppInitialization");
    }

    public final void c()
    {
        long l1;
        r.e("ColdStart/FBAppImpl.onCreate");
        l1 = SystemClock.elapsedRealtime();
        TracerDetour.a("FacebookApplicationImpl.onCreate", 0xe6c390f6);
        TraceOrchestrator.a(m, null);
        ClassPreloaderController.a(b());
        EncryptChannelInformation.a().a(m);
        ColdStartPrimingInformation.a().a(m);
        UDPPrimingDNSInfo.a().a(m);
        ReportAProblem.a(new FbReportAProblemConfigProvider(m));
        ThreadPriorityGatekeeperHandler.a(m);
        TracerDetour.a("FacebookApplicationImpl.super.onCreate", 0x9fa6ac79);
        super.c();
        FbInjector fbinjector;
        TracerDetour.a(0xd8332b66);
        AcraBLogBridge.a();
        Logger.getLogger(com/google/common/base/FinalizableReferenceQueue.getName()).setLevel(Level.SEVERE);
        fbinjector = a();
        h();
        a((PerformanceLogger)DelegatingPerformanceLogger.a(fbinjector), (FeedPerfLogger)FeedPerfLogger.a(fbinjector), l1);
        AppInitLock appinitlock = (AppInitLock)AppInitLock.a(fbinjector);
        appinitlock.a(new _cls1(fbinjector));
        r.a("ColdStart/UIThreadBlockedOnAppInit", 0x700002);
        appinitlock.b();
        r.e("ColdStart/UIThreadBlockedOnAppInit");
        TracerDetour.a(0xcac2bb10);
        if (fbinjector != null)
        {
            b((StartupPerfLogger)StartupPerfLogger.a(fbinjector), 0x4e0004, "ApplicationOnCreate", l1, SystemClock.elapsedRealtime(), Boolean.valueOf(BackgroundChecker.a().d()), null);
        }
        s = true;
        g();
        return;
        Exception exception;
        exception;
        TracerDetour.a(0x9cb5ea09);
        throw exception;
        exception;
        fbinjector = null;
_L2:
        TracerDetour.a(0xb592c6fc);
        if (fbinjector != null)
        {
            b((StartupPerfLogger)StartupPerfLogger.a(fbinjector), 0x4e0004, "ApplicationOnCreate", l1, SystemClock.elapsedRealtime(), Boolean.valueOf(BackgroundChecker.a().d()), null);
        }
        s = true;
        g();
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }


    private class _cls2
        implements com.facebook.base.app.LightweightPerfEvents.Marker
    {

        final StartupPerfLogger a;
        final FacebookApplicationImpl b;

        public final void a(int i, String s1, long l1, long l2, boolean flag, 
                PerfStats perfstats)
        {
            FacebookApplicationImpl.a(a, i, s1, l1, l2, Boolean.valueOf(flag), perfstats);
        }

        _cls2(StartupPerfLogger startupperflogger)
        {
            b = FacebookApplicationImpl.this;
            a = startupperflogger;
            super();
        }
    }


    private class _cls1 extends com.facebook.common.init.AppInitLock.Listener
    {

        final FbInjector a;
        final FacebookApplicationImpl b;

        public final void a()
        {
            TracerDetour.a("FacebookApplicationImpl.AppInitLock.onInitialized", 0xff60a0cf);
            if (FacebookApplicationImpl.a(b).getProcessName().e())
            {
                ((FeedPerfLogger)FeedPerfLogger.a(b.a())).l();
                FacebookApplicationImpl.a(b, (StartupPerfLogger)StartupPerfLogger.a(a));
            }
            DalvikTelemetry.a(a);
            FacebookApplicationImpl.a(b, a);
            ClassPreloaderController.a(com.facebook.classpreloader.ClassPreloaderConfig.PreloadStopTriggers.APP_INIT_DONE);
            TracerDetour.a(0xaf0b68d1);
            return;
            Exception exception;
            exception;
            TracerDetour.a(0x8f49e606);
            throw exception;
        }

        _cls1(FbInjector fbinjector)
        {
            b = FacebookApplicationImpl.this;
            a = fbinjector;
            super();
        }
    }

}
