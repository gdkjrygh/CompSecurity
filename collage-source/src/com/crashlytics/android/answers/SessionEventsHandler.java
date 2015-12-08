// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.d.b;
import io.fabric.sdk.android.services.events.e;
import io.fabric.sdk.android.services.events.i;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            DisabledSessionAnalyticsManagerStrategy, SessionAnalyticsFilesManager, SessionAnalyticsManagerStrategy, Answers

class SessionEventsHandler extends e
{

    SessionEventsHandler(Context context, i i, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, ScheduledExecutorService scheduledexecutorservice)
    {
        super(context, i, sessionanalyticsfilesmanager, scheduledexecutorservice);
    }

    protected i getDisabledEventsStrategy()
    {
        return new DisabledSessionAnalyticsManagerStrategy();
    }

    protected void setAnalyticsSettingsData(final b analyticsSettingsData, final String protocolAndHostOverride)
    {
        super.executeAsync(new Runnable() {

            final SessionEventsHandler this$0;
            final b val$analyticsSettingsData;
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
                    h.a(Answers.getInstance().getContext(), "Crashlytics failed to set analytics settings data.", exception);
                }
            }

            
            {
                this$0 = SessionEventsHandler.this;
                analyticsSettingsData = b;
                protocolAndHostOverride = s;
                super();
            }
        });
    }

}
