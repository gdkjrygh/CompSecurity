// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventsHandler, SessionAnalyticsManagerStrategy, Answers

class b
    implements Runnable
{

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

    gsData(SessionEventsHandler sessioneventshandler, AnalyticsSettingsData analyticssettingsdata, String s)
    {
        c = sessioneventshandler;
        a = analyticssettingsdata;
        b = s;
        super();
    }
}
