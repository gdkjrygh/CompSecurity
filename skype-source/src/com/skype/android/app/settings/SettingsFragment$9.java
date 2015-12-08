// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        boolean flag = ((Boolean)obj).booleanValue();
        obj = analytics;
        AnalyticsEvent analyticsevent = AnalyticsEvent.bR;
        if (flag)
        {
            preference = "enable";
        } else
        {
            preference = "disable";
        }
        ((Analytics) (obj)).a(analyticsevent, preference);
        return true;
    }

    stener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
