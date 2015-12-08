// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.SkyLib;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        int i = Integer.parseInt((String)obj);
        preference.setSummary(SettingsFragment.access$400(SettingsFragment.this)[i]);
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = 51200;
        }
        lib.setOperatingMedia(com.skype.DIA.OM_UNKNOWN, i, i);
        return true;
    }

    stener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
