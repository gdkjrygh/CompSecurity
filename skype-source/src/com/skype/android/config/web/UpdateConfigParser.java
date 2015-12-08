// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import android.content.Context;
import android.text.TextUtils;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.UpdateConfig;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.config.web:
//            ConfigParser

public class UpdateConfigParser
    implements ConfigParser
{

    public UpdateConfigParser()
    {
    }

    public String getKey()
    {
        return "version";
    }

    public boolean isArray()
    {
        return false;
    }

    public void parse(Context context, ApplicationConfig applicationconfig, Object obj)
        throws JSONException
    {
        context = applicationconfig.getUpdateConfig();
        applicationconfig = (JSONObject)obj;
        obj = applicationconfig.optString("minimumVersion");
        String s = applicationconfig.optString("recommendedVersion");
        String s1 = applicationconfig.optString("url");
        boolean flag = applicationconfig.optBoolean("alwaysShow");
        context.setMinimumRequiredVersion(((String) (obj)));
        context.setSuggestedUpgradeVersion(s);
        context.setAlwaysShow(flag);
        context.setLastUpdateTimestamp(System.currentTimeMillis());
        if (!TextUtils.isEmpty(s1))
        {
            context.setUpdateUrl(s1);
        }
        context.setUpdateConfigurationRefreshed(true);
    }
}
