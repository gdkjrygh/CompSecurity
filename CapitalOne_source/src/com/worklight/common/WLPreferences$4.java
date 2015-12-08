// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.preference.EditTextPreference;
import android.preference.Preference;

// Referenced classes of package com.worklight.common:
//            WLPreferences, WLUtils

class this._cls0
    implements android.preference.ferenceChangeListener
{

    final WLPreferences this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        preference = (String)obj;
        WLUtils.writeWLPref(getApplicationContext(), "newAppVersionPref", preference);
        WLPreferences.access$6(WLPreferences.this).setSummary(preference);
        return true;
    }

    ()
    {
        this$0 = WLPreferences.this;
        super();
    }
}
