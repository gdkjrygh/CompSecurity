// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.content.Intent;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class this._cls0
    implements android.preference.enceClickListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceClick(Preference preference)
    {
        Log.d("SettingsFragment", "Notification enabled clicked");
        if (preference instanceof CheckBoxPreference)
        {
            if (((CheckBoxPreference)preference).isChecked())
            {
                Log.d("SettingsFragment", "Register for notifications");
                preference = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN");
                preference.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                LocalBroadcastManager.getInstance(SettingsFragment.access$000(SettingsFragment.this)).sendBroadcast(preference);
            } else
            {
                Log.d("SettingsFragment", "Unregister from notifications");
                preference = new Intent("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT");
                preference.addCategory("com.netflix.mediaclient.intent.category.PUSH");
                LocalBroadcastManager.getInstance(SettingsFragment.access$000(SettingsFragment.this)).sendBroadcast(preference);
            }
        } else
        {
            Log.e("SettingsFragment", "We did not received notification checkbox preference!");
        }
        return true;
    }

    ()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
