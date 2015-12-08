// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.events.EnabledEventsStrategy;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy, SessionAnalyticsFilesSender, Answers, AnswersRetryFilesSender, 
//            SessionAnalyticsFilesManager

class EnabledSessionAnalyticsManagerStrategy extends EnabledEventsStrategy
    implements SessionAnalyticsManagerStrategy
{

    FilesSender a;
    private final HttpRequestFactory g;

    public EnabledSessionAnalyticsManagerStrategy(Context context, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        super(context, scheduledexecutorservice, sessionanalyticsfilesmanager);
        g = httprequestfactory;
    }

    public FilesSender a()
    {
        return a;
    }

    public void a(AnalyticsSettingsData analyticssettingsdata, String s)
    {
        a = AnswersRetryFilesSender.a(new SessionAnalyticsFilesSender(Answers.b(), s, analyticssettingsdata.a, g, (new ApiKey()).a(b)));
        ((SessionAnalyticsFilesManager)d).a(analyticssettingsdata);
        a(analyticssettingsdata.b);
    }
}
