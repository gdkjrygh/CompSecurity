// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.preference.EditTextPreference;
import android.preference.Preference;

// Referenced classes of package com.worklight.common:
//            WLSettingActivity, WLConfig

class this._cls0
    implements android.preference.nceChangeListener
{

    final WLSettingActivity this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference = (String)obj;
        WLConfig.getInstance().writeWLPref("newAppVersionPref", preference);
        WLSettingActivity.access$400(WLSettingActivity.this).setSummary(preference);
        return true;
    }

    eChangeListener()
    {
        this$0 = WLSettingActivity.this;
        super();
    }
}
