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
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager, Answers, SessionEventMetadata, SessionAnalyticsFilesManager

class AutoSessionAnalyticsManager extends SessionAnalyticsManager
{

    private final android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private final Application application;

    public AutoSessionAnalyticsManager(Application application1, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        this(application1, sessioneventmetadata, sessionanalyticsfilesmanager, ExecutorUtils.buildSingleThreadScheduledExecutorService("Crashlytics Trace Manager"), httprequestfactory);
    }

    AutoSessionAnalyticsManager(Application application1, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, ScheduledExecutorService scheduledexecutorservice, HttpRequestFactory httprequestfactory)
    {
        super(application1, sessioneventmetadata, sessionanalyticsfilesmanager, scheduledexecutorservice, httprequestfactory);
        activityLifecycleCallbacks = new android.app.Application.ActivityLifecycleCallbacks() {

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
        application = application1;
        CommonUtils.logControlled(Answers.getInstance().getContext(), "Registering activity lifecycle callbacks for session analytics.");
        application1.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public void disable()
    {
        CommonUtils.logControlled(Answers.getInstance().getContext(), "Unregistering activity lifecycle callbacks for session analytics");
        application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        super.disable();
    }
}
