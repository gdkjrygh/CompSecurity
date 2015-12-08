// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.events.EventsHandler;
import io.fabric.sdk.android.services.events.EventsStrategy;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            EnabledSessionAnalyticsManagerStrategy, SessionEvent, DisabledSessionAnalyticsManagerStrategy, SessionEventMetadata, 
//            SessionAnalyticsFilesManager, Answers, SessionAnalyticsManagerStrategy

class SessionAnalyticsManager extends EventsHandler
{

    private final SessionEventMetadata metadata;

    public SessionAnalyticsManager(Context context, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        this(context, sessioneventmetadata, sessionanalyticsfilesmanager, ExecutorUtils.buildSingleThreadScheduledExecutorService("Crashlytics SAM"), httprequestfactory);
    }

    SessionAnalyticsManager(Context context, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, ScheduledExecutorService scheduledexecutorservice, HttpRequestFactory httprequestfactory)
    {
        super(context, new EnabledSessionAnalyticsManagerStrategy(context, scheduledexecutorservice, sessionanalyticsfilesmanager, httprequestfactory), sessionanalyticsfilesmanager, scheduledexecutorservice);
        metadata = sessioneventmetadata;
    }

    private void recordEventAsync(SessionEvent.Type type, Activity activity, boolean flag)
    {
        recordEventAsync(SessionEvent.buildActivityLifecycleEvent(metadata, type, activity), flag);
    }

    protected EventsStrategy getDisabledEventsStrategy()
    {
        return new DisabledSessionAnalyticsManagerStrategy();
    }

    public void onCrash(final String sessionId)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("onCrash called from main thread!!!");
        } else
        {
            executeSync(new Runnable() {

                final SessionAnalyticsManager this$0;
                final String val$sessionId;

                public void run()
                {
                    try
                    {
                        
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SessionAnalyticsManager.this;
                sessionId = s;
                super();
            }
            });
            return;
        }
    }

    public void onCreate(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.CREATE, activity, false);
    }

    public void onDestroy(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.DESTROY, activity, false);
    }

    public void onError(String s)
    {
        recordEventAsync(SessionEvent.buildErrorEvent(metadata, s), false);
    }

    public void onInstall()
    {
        recordEventAsync(SessionEvent.buildEvent(metadata, SessionEvent.Type.INSTALL, new HashMap()), true);
    }

    public void onPause(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.PAUSE, activity, false);
    }

    public void onResume(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.RESUME, activity, false);
    }

    public void onSaveInstanceState(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.SAVE_INSTANCE_STATE, activity, false);
    }

    public void onStart(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.START, activity, false);
    }

    public void onStop(Activity activity)
    {
        recordEventAsync(SessionEvent.Type.STOP, activity, false);
    }

    void setAnalyticsSettingsData(final AnalyticsSettingsData analyticsSettingsData, final String protocolAndHostOverride)
    {
        executeAsync(new Runnable() {

            final SessionAnalyticsManager this$0;
            final AnalyticsSettingsData val$analyticsSettingsData;
            final String val$protocolAndHostOverride;

            public void run()
            {
                try
                {
                    ((SessionAnalyticsManagerStrategy)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SessionAnalyticsManager.this;
                analyticsSettingsData = analyticssettingsdata;
                protocolAndHostOverride = s;
                super();
            }
        });
    }



}
