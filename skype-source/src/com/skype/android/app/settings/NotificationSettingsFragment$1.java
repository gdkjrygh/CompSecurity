// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.KpiAttributeName;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.OnPreferenceChangedEvent;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

// Referenced classes of package com.skype.android.app.settings:
//            NotificationSettingsFragment

final class this._cls0
    implements android.preference.stener
{

    final NotificationSettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        EventBusInstance.a().a(new OnPreferenceChangedEvent(preference, obj));
        if (preference.getKey().equals(getString(0x7f080556)) && ((Boolean)obj).booleanValue())
        {
            analytics.c(AnalyticsEvent.aZ);
        }
        if (preference.getKey().equals(getString(0x7f08053e)))
        {
            preference = (Boolean)obj;
            obj = new SkypeTelemetryEvent(KpiEvent.d);
            ((SkypeTelemetryEvent) (obj)).put(KpiAttributeName.m, preference);
            analytics.a(((SkypeTelemetryEvent) (obj)));
        }
        return true;
    }

    ()
    {
        this$0 = NotificationSettingsFragment.this;
        super();
    }
}
