// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.EventsHandler;
import io.fabric.sdk.android.services.events.EventsStrategy;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            DisabledSessionAnalyticsManagerStrategy, SessionAnalyticsFilesManager, SessionAnalyticsManagerStrategy, Answers

class SessionEventsHandler extends EventsHandler
{

    SessionEventsHandler(Context context, EventsStrategy eventsstrategy, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, ScheduledExecutorService scheduledexecutorservice)
    {
        super(context, eventsstrategy, sessionanalyticsfilesmanager, scheduledexecutorservice);
    }

    protected EventsStrategy getDisabledEventsStrategy()
    {
        return new DisabledSessionAnalyticsManagerStrategy();
    }

    protected void setAnalyticsSettingsData(final AnalyticsSettingsData analyticsSettingsData, final String protocolAndHostOverride)
    {
        super.executeAsync(new Runnable() {

            final SessionEventsHandler this$0;
            final AnalyticsSettingsData val$analyticsSettingsData;
            final String val$protocolAndHostOverride;

            public void run()
            {
                try
                {
                    ((SessionAnalyticsManagerStrategy)SessionEventsHandler.this.this$0).setAnalyticsSettingsData(analyticsSettingsData, protocolAndHostOverride);
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.logControlledError(Answers.getInstance().getContext(), "Crashlytics failed to set analytics settings data.", exception);
                }
            }

            
            {
                this$0 = SessionEventsHandler.this;
                analyticsSettingsData = analyticssettingsdata;
                protocolAndHostOverride = s;
                super();
            }
        });
    }

}
