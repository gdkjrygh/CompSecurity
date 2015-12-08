// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.preference.EditTextPreference;
import android.preference.Preference;
import com.worklight.wlclient.api.WLClient;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.worklight.common:
//            WLSettingActivity, WLConfig

class this._cls0
    implements android.preference.nceChangeListener
{

    final WLSettingActivity this$0;

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            WLConfig.getInstance().useCustomServerUrl(true);
            WLSettingActivity.access$000(WLSettingActivity.this).setEnabled(true);
            WLSettingActivity.access$102(WLSettingActivity.this, WLSettingActivity.access$000(WLSettingActivity.this).getText());
            try
            {
                WLClient.getInstance().setServerUrl(new URL(WLSettingActivity.access$100(WLSettingActivity.this)));
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                return false;
            }
        } else
        {
            WLConfig.getInstance().useCustomServerUrl(false);
            WLSettingActivity.access$102(WLSettingActivity.this, WLClient.getInstance().getServerUrl().toString());
            WLSettingActivity.access$000(WLSettingActivity.this).setEnabled(false);
        }
        return true;
    }

    eChangeListener()
    {
        this$0 = WLSettingActivity.this;
        super();
    }
}
