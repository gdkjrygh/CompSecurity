// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventsHandler, SessionAnalyticsManagerStrategy, Answers

class val.protocolAndHostOverride
    implements Runnable
{

    final SessionEventsHandler this$0;
    final AnalyticsSettingsData val$analyticsSettingsData;
    final String val$protocolAndHostOverride;

    public void run()
    {
        try
        {
            ((SessionAnalyticsManagerStrategy)SessionEventsHandler.access$000(SessionEventsHandler.this)).setAnalyticsSettingsData(val$analyticsSettingsData, val$protocolAndHostOverride);
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.logControlledError(Answers.getInstance().getContext(), "Crashlytics failed to set analytics settings data.", exception);
        }
    }

    gsData()
    {
        this$0 = final_sessioneventshandler;
        val$analyticsSettingsData = analyticssettingsdata;
        val$protocolAndHostOverride = String.this;
        super();
    }
}
