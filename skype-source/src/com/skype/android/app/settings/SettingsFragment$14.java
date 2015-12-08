// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import android.text.TextUtils;
import com.skype.android.app.shortcircuit.AutoBuddyManager;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment, UserPreferences

final class this._cls0
    implements android.preference.nceChangeListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        boolean flag = ((Boolean)obj).booleanValue();
        boolean flag1 = userPrefs.isAutoBuddyEnabledInLocalCache();
        if (TextUtils.isEmpty(userPrefs.getLocallyCachedAutoBuddy()) || flag != flag1)
        {
            userPrefs.setLocallyCachedAutoBuddy(flag);
            SettingsFragment.access$200(SettingsFragment.this, flag);
            autoBuddyManager.updateAutoBuddy(flag);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
