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

    static EventsStrategy a(SessionEventsHandler sessioneventshandler)
    {
        return sessioneventshandler.c;
    }

    protected EventsStrategy a()
    {
        return new DisabledSessionAnalyticsManagerStrategy();
    }

    protected void a(AnalyticsSettingsData analyticssettingsdata, String s)
    {
        super.b(new Runnable(analyticssettingsdata, s) {

            final AnalyticsSettingsData a;
            final String b;
            final SessionEventsHandler c;

            public void run()
            {
                try
                {
                    ((SessionAnalyticsManagerStrategy)SessionEventsHandler.a(c)).a(a, b);
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.a(Answers.b().C(), "Crashlytics failed to set analytics settings data.", exception);
                }
            }

            
            {
                c = SessionEventsHandler.this;
                a = analyticssettingsdata;
                b = s;
                super();
            }
        });
    }
}
