// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.DialogInterface;
import android.preference.Preference;
import android.util.Patterns;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.api.WLClient;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.worklight.common:
//            WLSettingActivity, WLConfig

class this._cls1
    implements android.content.kListener
{

    final ener this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/worklight/common/WLSettingActivity$2

/* anonymous class */
    class WLSettingActivity._cls2
        implements android.preference.Preference.OnPreferenceChangeListener
    {

        final WLSettingActivity this$0;

        public boolean onPreferenceChange(Preference preference, Object obj)
        {
            WLSettingActivity.access$102(WLSettingActivity.this, (String)obj);
            boolean flag;
            if (WLSettingActivity.access$100(WLSettingActivity.this).startsWith("http://["))
            {
                break MISSING_BLOCK_LABEL_44;
            }
            flag = WLSettingActivity.access$100(WLSettingActivity.this).startsWith("https://[");
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_240;
            }
            preference = WLSettingActivity.access$100(WLSettingActivity.this).substring(WLSettingActivity.access$100(WLSettingActivity.this).indexOf('[') + 1, WLSettingActivity.access$100(WLSettingActivity.this).indexOf(']'));
            obj = WLSettingActivity.access$100(WLSettingActivity.this).substring(WLSettingActivity.access$100(WLSettingActivity.this).indexOf(']') + 1);
            if (!preference.matches("(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]).){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))"))
            {
                throw new MalformedURLException();
            }
            try
            {
                if (!Patterns.WEB_URL.matcher((new StringBuilder()).append("http://9.8.7.6").append(((String) (obj))).toString()).matches())
                {
                    throw new MalformedURLException();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Preference preference)
            {
                try
                {
                    throw new MalformedURLException();
                }
                // Misplaced declaration of an exception variable
                catch (Preference preference)
                {
                    (new android.app.AlertDialog.Builder(WLSettingActivity.this)).setTitle(WLUtils.getResourceString("titleInvalidWLServerUrl", WLSettingActivity.this)).setMessage(WLUtils.getResourceString("errorInvalidWLServerUrl", WLSettingActivity.access$100(WLSettingActivity.this), WLSettingActivity.this)).setNeutralButton(WLUtils.getResourceString("OKTitleWLServerUrl", WLSettingActivity.this), new WLSettingActivity._cls2._cls1()).show();
                }
                return false;
            }
            break MISSING_BLOCK_LABEL_282;
            new URL(WLSettingActivity.access$100(WLSettingActivity.this));
            if (!Patterns.WEB_URL.matcher(WLSettingActivity.access$100(WLSettingActivity.this)).matches())
            {
                throw new MalformedURLException();
            }
            WLClient.getInstance().setServerUrl(new URL(WLSettingActivity.access$100(WLSettingActivity.this)));
            WLConfig.getInstance().writeWLPref("lastSettingsUrlStatePref", WLSettingActivity.access$100(WLSettingActivity.this));
            WLSettingActivity.access$200(WLSettingActivity.this);
            return true;
        }

            
            {
                this$0 = WLSettingActivity.this;
                super();
            }
    }

}
