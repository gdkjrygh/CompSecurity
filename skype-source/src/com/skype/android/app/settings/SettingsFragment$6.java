// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.preference.Preference;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AttributeContainer;
import com.skype.android.analytics.StatsType;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class val.store
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;
    final Intent val$store;

    public final boolean onPreferenceClick(Preference preference)
    {
        boolean flag = false;
        preference = getActivity();
        if (preference != null)
        {
            try
            {
                preference.startActivity(val$store);
                preference = new AttributeContainer();
                preference.put(AnalyticsParameter.a.b(), Integer.valueOf(1));
                preference.put(AnalyticsParameter.b.b(), Integer.valueOf(1022));
                lib.reportStatsEvent(StatsType.a.a(), preference.serialize());
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                return false;
            }
            flag = true;
        }
        return flag;
    }

    tener()
    {
        this$0 = final_settingsfragment;
        val$store = Intent.this;
        super();
    }
}
