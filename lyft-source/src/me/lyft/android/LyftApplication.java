// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android;

import android.content.Context;
import android.support.multidex.MultiDexApplication;
import com.crashlytics.android.Crashlytics;
import dagger.ObjectGraph;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.analytics.studies.AppLaunchAnalytics;
import me.lyft.android.analytics.trackers.AnalyticsService;
import me.lyft.android.application.ILogoutService;
import me.lyft.android.common.AndroidClock;
import me.lyft.android.common.DeviceClock;
import me.lyft.android.development.DeveloperTools;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.jobs.CheckDriverDocumentsJob;
import me.lyft.android.jobs.InitFacebookSdkJob;
import me.lyft.android.jobs.JobManager;
import me.lyft.android.jobs.UpdateFacebookTokenJob;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android:
//            IUserSession, ILyftPreferences, AppModule

public class LyftApplication extends MultiDexApplication
{

    AnalyticsService analyticsService;
    private ObjectGraph applicationGraph;
    DeveloperTools developerTools;
    IDevice device;
    JobManager jobManager;
    ILogoutService logoutService;
    ILyftPreferences preferences;
    IUserSession userSession;

    public LyftApplication()
    {
    }

    private void checkDriverDocuments()
    {
        if (!userSession.getUser().isNull())
        {
            jobManager.queueBackgroundJob(new CheckDriverDocumentsJob());
        }
    }

    public static LyftApplication from(Context context)
    {
        return (LyftApplication)context.getApplicationContext();
    }

    public static LyftApplication getInstance(Context context)
    {
        return (LyftApplication)context.getApplicationContext();
    }

    private void initUncaughtExceptionHandler()
    {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            final LyftApplication this$0;
            final Thread.UncaughtExceptionHandler val$crashlyticsErrorHandler;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                AppAnalytics.trackAppCrash(throwable);
                L.w(throwable, "Uncaught exception on thread %s, crashing.", new Object[] {
                    thread
                });
                crashlyticsErrorHandler.uncaughtException(thread, throwable);
                logoutService.resetCachedState();
            }

            
            {
                this$0 = LyftApplication.this;
                crashlyticsErrorHandler = uncaughtexceptionhandler;
                super();
            }
        });
    }

    private void updateInstallStatus()
    {
        if (preferences.getAppVersionCode() == null)
        {
            preferences.setInstallStatus(1);
            preferences.setAppVersionCode(Integer.valueOf(device.getApplicationVersionCode()));
            return;
        }
        if (device.getApplicationVersionCode() > preferences.getAppVersionCode().intValue())
        {
            preferences.setAppVersionCode(Integer.valueOf(device.getApplicationVersionCode()));
            preferences.setInstallStatus(2);
            logoutService.resetCachedState();
            AppAnalytics.trackAppVersionUpdateEvent();
            return;
        } else
        {
            preferences.setInstallStatus(0);
            return;
        }
    }

    public ObjectGraph getApplicationGraph()
    {
        return applicationGraph;
    }

    protected Object[] getModules()
    {
        return (new Object[] {
            new AppModule(this)
        });
    }

    public void inject(Object obj)
    {
        applicationGraph.inject(obj);
    }

    public void onCreate()
    {
        super.onCreate();
        Fabric.a(this, new Kit[] {
            new Crashlytics()
        });
        initUncaughtExceptionHandler();
        AppLaunchAnalytics.onCreateApplication();
        ScreenAnalytics.cleanScreenTracking();
        applicationGraph = ObjectGraph.create(getModules());
        applicationGraph.inject(this);
        applicationGraph.injectStatics();
        developerTools.initDeveloperTools(this);
        analyticsService.onApplicationCreate();
        jobManager.queueBackgroundJob(new InitFacebookSdkJob());
        jobManager.queueBackgroundJob(new UpdateFacebookTokenJob());
        updateInstallStatus();
        checkDriverDocuments();
        L.d("Application created", new Object[0]);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        L.d("onLowMemory", new Object[0]);
    }

    public void onTerminate()
    {
        super.onTerminate();
        L.d("onTerminate", new Object[0]);
    }

    public void onTrimMemory(int i)
    {
        super.onTrimMemory(i);
        L.d((new StringBuilder()).append("onTrimMemory:").append(i).toString(), new Object[0]);
    }

    static 
    {
        System.setProperty("rx.ring-buffer.size", "128");
        System.setProperty("rx.indexed-ring-buffer.size", "256");
        DeviceClock.setDeviceClock(new AndroidClock());
    }
}
