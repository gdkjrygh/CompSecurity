// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.preference.Preference;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (obj instanceof String)
        {
            preference = (String)obj;
            if ("DEFAULT".equals(preference))
            {
                Log.d("SettingsFragment", "Sets ENHANCED XML subtitle configuration (default)");
                SubtitleConfiguration.clearQaLocalOverride(SettingsFragment.access$000(SettingsFragment.this));
                SettingsFragment.access$200(SettingsFragment.this, SubtitleConfiguration.DEFAULT);
            } else
            if ("ENHANCED_XML".equals(preference))
            {
                Log.d("SettingsFragment", "Sets ENHANCED XML subtitle configuration (default)");
                SubtitleConfiguration.updateQaLocalOverride(SettingsFragment.access$000(SettingsFragment.this), Integer.valueOf(SubtitleConfiguration.ENHANCED_XML.getLookupType()));
                SettingsFragment.access$200(SettingsFragment.this, SubtitleConfiguration.ENHANCED_XML);
            } else
            if ("SIMPLE_XML".equals(preference))
            {
                Log.d("SettingsFragment", "Sets SIMPLE XML subtitle configuration");
                SubtitleConfiguration.updateQaLocalOverride(SettingsFragment.access$000(SettingsFragment.this), Integer.valueOf(SubtitleConfiguration.SIMPLE_XML.getLookupType()));
                SettingsFragment.access$200(SettingsFragment.this, SubtitleConfiguration.SIMPLE_XML);
            } else
            if ("SIMPLE_EVENTS".equals(preference))
            {
                Log.d("SettingsFragment", "Sets SIMPLE EVENTS subtitle configuration (legacy)");
                SubtitleConfiguration.updateQaLocalOverride(SettingsFragment.access$000(SettingsFragment.this), Integer.valueOf(SubtitleConfiguration.SIMPLE_EVENTS.getLookupType()));
                SettingsFragment.access$200(SettingsFragment.this, SubtitleConfiguration.SIMPLE_EVENTS);
            } else
            {
                Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected value for player type ").append(preference).toString());
            }
        } else
        {
            Log.e("SettingsFragment", (new StringBuilder()).append("Received unexpected NON string value for player type ").append(obj).toString());
        }
        return true;
    }

    onfiguration()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
