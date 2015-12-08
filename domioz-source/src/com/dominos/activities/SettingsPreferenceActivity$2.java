// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.DialogInterface;
import android.widget.Toast;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import com.dominos.beacon.util.BeaconConfigurationPreferences_;

// Referenced classes of package com.dominos.activities:
//            SettingsPreferenceActivity

class this._cls0
    implements android.content.er
{

    final SettingsPreferenceActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SettingsPreferenceActivity.access$000(SettingsPreferenceActivity.this).clearCurrentUser();
        SettingsPreferenceActivity.access$100(SettingsPreferenceActivity.this).clear();
        SettingsPreferenceActivity.access$200(SettingsPreferenceActivity.this).clear();
        Toast.makeText(SettingsPreferenceActivity.this, getString(0x7f08042b), 0).show();
    }

    es_()
    {
        this$0 = SettingsPreferenceActivity.this;
        super();
    }
}
