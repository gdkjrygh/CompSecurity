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
//            SessionAnalyticsManagerStrategy, DefaultSessionAnalyticsFilesSender, Answers, SessionAnalyticsFilesManager

class EnabledSessionAnalyticsManagerStrategy extends EnabledEventsStrategy
    implements SessionAnalyticsManagerStrategy
{

    FilesSender filesSender;
    private final HttpRequestFactory httpRequestFactory;

    public EnabledSessionAnalyticsManagerStrategy(Context context, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        super(context, scheduledexecutorservice, sessionanalyticsfilesmanager);
        httpRequestFactory = httprequestfactory;
    }

    public FilesSender getFilesSender()
    {
        return filesSender;
    }

    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
    {
        filesSender = new DefaultSessionAnalyticsFilesSender(Answers.getInstance(), s, analyticssettingsdata.analyticsURL, httpRequestFactory, ApiKey.getApiKey(context));
        ((SessionAnalyticsFilesManager)filesManager).setAnalyticsSettingsData(analyticssettingsdata);
        configureRollover(analyticssettingsdata.flushIntervalSeconds);
    }
}
