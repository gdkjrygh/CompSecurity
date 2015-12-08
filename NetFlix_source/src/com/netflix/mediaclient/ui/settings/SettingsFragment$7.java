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

class this._cls0
    implements android.preference.enceChangeListener
{

    final SettingsFragment this$0;

    public boolean onPreferenceChange(final Preference newAppId, Object obj)
    {
        Log.d("SettingsFragment", (new StringBuilder()).append("onPreferenceChange ").append(obj).toString());
        if (newAppId instanceof EditTextPreference)
        {
            newAppId = ((EditTextPreference)newAppId).getEditText().getText().toString();
            Log.d("SettingsFragment", (new StringBuilder()).append("EditText.getText(): ").append(newAppId).toString());
            (new BackgroundTask()).execute(new Runnable() {

                final SettingsFragment._cls7 this$1;
                final String val$newAppId;

                public void run()
                {
                    CastConfiguration.setNewCastApplicationId(SettingsFragment.access$000(this$0), newAppId);
                }

            
            {
                this$1 = SettingsFragment._cls7.this;
                newAppId = s;
                super();
            }
            });
            return true;
        } else
        {
            return false;
        }
    }

    _cls1.val.newAppId()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
