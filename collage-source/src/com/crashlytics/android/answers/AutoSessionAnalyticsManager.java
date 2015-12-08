// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.common.m;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager, Answers, SessionEventsHandler, EnabledSessionAnalyticsManagerStrategy, 
//            SessionEventMetadata, SessionAnalyticsFilesManager

class AutoSessionAnalyticsManager extends SessionAnalyticsManager
{

    private static final String EXECUTOR_SERVICE = "Crashlytics Trace Manager";
    private final android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new android.app.Application.ActivityLifecycleCallbacks() {

        final AutoSessionAnalyticsManager this$0;

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
            onCreate(activity);
        }

        public void onActivityDestroyed(Activity activity)
        {
            onDestroy(activity);
        }

        public void onActivityPaused(Activity activity)
        {
            onPause(activity);
        }

        public void onActivityResumed(Activity activity)
        {
            onResume(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
            onSaveInstanceState(activity);
        }

        public void onActivityStarted(Activity activity)
        {
            onStart(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            onStop(activity);
        }

            
            {
                this$0 = AutoSessionAnalyticsManager.this;
                super();
            }
    };
    private final Application application;

    AutoSessionAnalyticsManager(SessionEventMetadata sessioneventmetadata, SessionEventsHandler sessioneventshandler, Application application1)
    {
        super(sessioneventmetadata, sessioneventshandler);
        application = application1;
        h.a(Answers.getInstance().getContext(), "Registering activity lifecycle callbacks for session analytics.");
        application1.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static AutoSessionAnalyticsManager build(Application application1, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, e e)
    {
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = m.b("Crashlytics Trace Manager");
        return new AutoSessionAnalyticsManager(sessioneventmetadata, new SessionEventsHandler(application1, new EnabledSessionAnalyticsManagerStrategy(application1, scheduledexecutorservice, sessionanalyticsfilesmanager, e), sessionanalyticsfilesmanager, scheduledexecutorservice), application1);
    }

    public void disable()
    {
        h.a(Answers.getInstance().getContext(), "Unregistering activity lifecycle callbacks for session analytics");
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        super.disable();
    }
}
