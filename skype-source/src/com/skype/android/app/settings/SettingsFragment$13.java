// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.Setup;
import com.skype.SkyLib;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0
    implements android.preference.nceChangeListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        int i;
        if (!((Boolean)obj).booleanValue())
        {
            i = 0;
        } else
        {
            i = 1;
        }
        lib.getSetup().setInt("Lib/Account/PrivateSkypeMode", i);
        return true;
    }

    tener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
