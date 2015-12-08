// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.events.DisabledEventsStrategy;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy

class DisabledSessionAnalyticsManagerStrategy extends DisabledEventsStrategy
    implements SessionAnalyticsManagerStrategy
{

    DisabledSessionAnalyticsManagerStrategy()
    {
    }

    public void setAnalyticsSettingsData(AnalyticsSettingsData analyticssettingsdata, String s)
    {
    }
}
