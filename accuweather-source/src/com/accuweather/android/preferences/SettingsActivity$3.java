// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.preferences;

import android.preference.Preference;

// Referenced classes of package com.accuweather.android.preferences:
//            SettingsActivity

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsActivity this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        if (SettingsActivity.access$000(SettingsActivity.this))
        {
            SettingsActivity.access$100(SettingsActivity.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
