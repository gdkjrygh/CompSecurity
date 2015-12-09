// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.preference.EditTextPreference;
import android.preference.Preference;
import android.widget.EditText;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.configuration.CastConfiguration;

// Referenced classes of package com.netflix.mediaclient.ui.settings:
//            SettingsFragment

class val.newAppId
    implements Runnable
{

    final val.newAppId this$1;
    final String val$newAppId;

    public void run()
    {
        CastConfiguration.setNewCastApplicationId(SettingsFragment.access$000(_fld0), val$newAppId);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$newAppId = String.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/ui/settings/SettingsFragment$7

/* anonymous class */
    class SettingsFragment._cls7
        implements android.preference.Preference.OnPreferenceChangeListener
    {

        final SettingsFragment this$0;

        public boolean onPreferenceChange(Preference preference, Object obj)
        {
            Log.d("SettingsFragment", (new StringBuilder()).append("onPreferenceChange ").append(obj).toString());
            if (preference instanceof EditTextPreference)
            {
                preference = ((EditTextPreference)preference).getEditText().getText().toString();
                Log.d("SettingsFragment", (new StringBuilder()).append("EditText.getText(): ").append(preference).toString());
                (new BackgroundTask()).execute(preference. new SettingsFragment._cls7._cls1());
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = SettingsFragment.this;
                super();
            }
    }

}
