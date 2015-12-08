// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.preference.Preference;
import com.skype.Account;
import com.skype.PROPKEY;

// Referenced classes of package com.skype.android.app.settings:
//            SettingsFragment

final class this._cls0
    implements android.preference.nceChangeListener
{

    final SettingsFragment this$0;

    public final boolean onPreferenceChange(Preference preference, Object obj)
    {
        int j = Integer.parseInt((String)obj);
        obj = account;
        PROPKEY propkey = PROPKEY.ACCOUNT_CHAT_POLICY;
        int i;
        if (j == 0)
        {
            i = com.skype.UDDIES_OR_AUTHORIZED_CAN_ADD.oInt();
        } else
        {
            i = com.skype.VERYONE_CAN_ADD.oInt();
        }
        ((Account) (obj)).setServersideIntProperty(propkey, i);
        preference.setSummary(SettingsFragment.access$300(SettingsFragment.this)[j]);
        return true;
    }

    tener()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
