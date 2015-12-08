// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.network.HttpRequestFactory;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager, Answers, SessionEventsHandler, EnabledSessionAnalyticsManagerStrategy, 
//            SessionEventMetadata, SessionAnalyticsFilesManager

class AutoSessionAnalyticsManager extends SessionAnalyticsManager
{

    private final Application d;
    private final android.app.Application.ActivityLifecycleCallbacks e = new android.app.Application.ActivityLifecycleCallbacks() {

        final AutoSessionAnalyticsManager a;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            a.a(activity);
        }

        public void onActivityDestroyed(Activity activity)
        {
            a.b(activity);
        }

        public void onActivityPaused(Activity activity)
        {
            a.c(activity);
        }

        public void onActivityResumed(Activity activity)
        {
            a.d(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
            a.e(activity);
        }

        public void onActivityStarted(Activity activity)
        {
            a.f(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            a.g(activity);
        }

            
            {
                a = AutoSessionAnalyticsManager.this;
                super();
            }
    };

    AutoSessionAnalyticsManager(SessionEventMetadata sessioneventmetadata, SessionEventsHandler sessioneventshandler, Application application)
    {
        super(sessioneventmetadata, sessioneventshandler);
        d = application;
        CommonUtils.a(Answers.b().C(), "Registering activity lifecycle callbacks for session analytics.");
        application.registerActivityLifecycleCallbacks(e);
    }

    public static AutoSessionAnalyticsManager a(Application application, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = ExecutorUtils.b("Crashlytics Trace Manager");
        return new AutoSessionAnalyticsManager(sessioneventmetadata, new SessionEventsHandler(application, new EnabledSessionAnalyticsManagerStrategy(application, scheduledexecutorservice, sessionanalyticsfilesmanager, httprequestfactory), sessionanalyticsfilesmanager, scheduledexecutorservice), application);
    }

    public void a()
    {
        CommonUtils.a(Answers.b().C(), "Unregistering activity lifecycle callbacks for session analytics");
        d.unregisterActivityLifecycleCallbacks(e);
        super.a();
    }
}
