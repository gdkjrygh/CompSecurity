// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.preference.EditTextPreference;
import android.preference.Preference;

// Referenced classes of package com.worklight.common:
//            WLPreferences, WLUtils, WLConfig

class this._cls0
    implements android.preference.ferenceChangeListener
{

    final WLPreferences this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            WLUtils.writeWLPref(getApplicationContext(), "shouldModifyUrlPref", "true");
            WLPreferences.access$0(WLPreferences.this).setEnabled(true);
            WLPreferences.access$1(WLPreferences.this, WLPreferences.access$0(WLPreferences.this).getText());
            WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", WLPreferences.access$2(WLPreferences.this));
            return true;
        } else
        {
            WLUtils.writeWLPref(getApplicationContext(), "shouldModifyUrlPref", "false");
            WLPreferences.access$1(WLPreferences.this, WLPreferences.access$3(WLPreferences.this).getRootURL());
            WLUtils.writeWLPref(getApplicationContext(), "WLServerURL", WLPreferences.access$2(WLPreferences.this));
            WLPreferences.access$0(WLPreferences.this).setEnabled(false);
            return true;
        }
    }

    ()
    {
        this$0 = WLPreferences.this;
        super();
    }
}
