// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.app.Application;
import com.skype.Account;
import com.skype.android.app.OnForegroundChanged;
import com.skype.android.app.signin.tasks.AccountTask;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.config.ecs.EcsKeys;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.inject.LifecycleAdapter;
import com.skype.android.telemetry.LifecycleTelemetryHelper;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.NetworkUtil;
import com.skype.android.wakeup.ForegroundState;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsPersistentStorage, ExperimentTag, ExperimentTelemetryEvent, ExperimentEvent, 
//            Analytics, KpiInAppActivityEndedTelemetryEvent, LogEvent

public class AnalyticsInAppObserver extends LifecycleAdapter
    implements AccountTask
{
    public static final class AppLifecycleTrigger extends Enum
    {

        public static final AppLifecycleTrigger a;
        public static final AppLifecycleTrigger b;
        public static final AppLifecycleTrigger c;
        public static final AppLifecycleTrigger d;
        public static final AppLifecycleTrigger e;
        public static final AppLifecycleTrigger f;
        public static final AppLifecycleTrigger g;
        private static final AppLifecycleTrigger h[];

        public static AppLifecycleTrigger valueOf(String s)
        {
            return (AppLifecycleTrigger)Enum.valueOf(com/skype/android/analytics/AnalyticsInAppObserver$AppLifecycleTrigger, s);
        }

        public static AppLifecycleTrigger[] values()
        {
            return (AppLifecycleTrigger[])h.clone();
        }

        static 
        {
            a = new AppLifecycleTrigger("AppLaunched", 0);
            b = new AppLifecycleTrigger("Login", 1);
            c = new AppLifecycleTrigger("Foregrounded", 2);
            d = new AppLifecycleTrigger("Resumed", 3);
            e = new AppLifecycleTrigger("Killed", 4);
            f = new AppLifecycleTrigger("Logout", 5);
            g = new AppLifecycleTrigger("Backgrounded", 6);
            h = (new AppLifecycleTrigger[] {
                a, b, c, d, e, f, g
            });
        }

        private AppLifecycleTrigger(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Object a = new Object();
    private LifecycleTelemetryHelper b;
    private Provider c;
    private final AnalyticsPersistentStorage d;
    private final Analytics e;
    private final EcsConfiguration f;
    private AppLifecycleTrigger g;
    private boolean h;

    public AnalyticsInAppObserver(Application application, Analytics analytics, SCTManager sctmanager, NetworkUtil networkutil, EcsClient ecsclient, EcsConfiguration ecsconfiguration, Provider provider, 
            ForegroundState foregroundstate, EventBus eventbus, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        h = false;
        (new EventSubscriberBinder(eventbus, this)).bind();
        b = new LifecycleTelemetryHelper(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage);
        c = provider;
        d = analyticspersistentstorage;
        e = analytics;
        f = ecsconfiguration;
        if (foregroundstate.c())
        {
            application = AppLifecycleTrigger.d;
        } else
        {
            application = AppLifecycleTrigger.a;
        }
        g = application;
    }

    private void a(Account account)
    {
        synchronized (a)
        {
            if (!h && d.b("unknown").equals("false"))
            {
                long l = d.a();
                a(b("unknown"), AppLifecycleTrigger.e, account, l, -1L, -1L);
            }
        }
        if (a())
        {
            synchronized (a)
            {
                if (!h)
                {
                    h = true;
                    a("false");
                    long l1 = System.currentTimeMillis();
                    d.a(l1);
                    obj = g.name();
                    d.c(((String) (obj)));
                    if (f.getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN) != ExperimentTag.a)
                    {
                        obj = new ExperimentTelemetryEvent(ExperimentEvent.e, f.getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN));
                        e.a(((ExperimentTelemetryEvent) (obj)));
                    }
                }
            }
        }
        return;
        account;
        obj;
        JVM INSTR monitorexit ;
        throw account;
        exception;
        account;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(String s)
    {
        d.a(s);
    }

    private void a(String s, AppLifecycleTrigger applifecycletrigger, Account account, long l, long l1, 
            long l2)
    {
        b.a(s, applifecycletrigger.name(), account, l, l1, l2);
        s = new KpiInAppActivityEndedTelemetryEvent(applifecycletrigger, l, l2);
        e.a(s);
        if (f.getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN) != ExperimentTag.a)
        {
            s = new ExperimentTelemetryEvent(ExperimentEvent.f, f.getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN));
            e.a(s);
            if (applifecycletrigger == AppLifecycleTrigger.f)
            {
                s = new ExperimentTelemetryEvent(ExperimentEvent.g, f.getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN));
                e.a(s);
            }
        }
        a("true");
    }

    private boolean a()
    {
        for (Account account = (Account)c.get(); account == null || account.getStatusProp() != com.skype.Account.STATUS.LOGGED_IN;)
        {
            return false;
        }

        return true;
    }

    private String b(String s)
    {
        return d.d(s);
    }

    private void b(Account account)
    {
        if (g == AppLifecycleTrigger.f || g == AppLifecycleTrigger.g && a())
        {
            synchronized (a)
            {
                if (h)
                {
                    h = false;
                    long l = d.a();
                    long l1 = System.currentTimeMillis();
                    long l2 = (l1 - l) / 1000L;
                    a(b("unknown"), g, account, l, l1, l2);
                }
            }
            return;
        } else
        {
            return;
        }
        account;
        obj;
        JVM INSTR monitorexit ;
        throw account;
    }

    public final void a(OnForegroundChanged onforegroundchanged)
    {
        if (onforegroundchanged.isForegrounded())
        {
            g = AppLifecycleTrigger.c;
            a((Account)c.get());
        }
    }

    public final void a(com.skype.android.gen.SkyLibListener.OnOperationModeChanged onoperationmodechanged)
    {
        if (onoperationmodechanged.getLevel() >= com.skype.GI.NETWORKACTIVITYLEVEL.NAL_QUIET_SUSPENDED_LEVEL.toInt())
        {
            g = AppLifecycleTrigger.g;
            b((Account)c.get());
        }
    }

    public void onLogin(Account account)
    {
        g = AppLifecycleTrigger.b;
        a(account);
    }

    public void onLogout(Account account)
    {
        g = AppLifecycleTrigger.f;
        b(account);
    }

    public void onResume()
    {
        if (g != AppLifecycleTrigger.d)
        {
            e.a(LogEvent.a);
            a((Account)c.get());
        }
        g = AppLifecycleTrigger.d;
    }

}
