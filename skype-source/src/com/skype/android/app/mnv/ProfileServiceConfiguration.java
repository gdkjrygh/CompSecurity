// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.net.Uri;
import android.text.TextUtils;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.HttpServicesConfiguration;

public class ProfileServiceConfiguration
{

    private static final String DEFAULT_TEST = "https://directory.services.live-int.com/profile/mine/System.ShortCircuitProfile.json";
    EcsConfiguration configuration;

    ProfileServiceConfiguration(EcsConfiguration ecsconfiguration)
    {
        configuration = ecsconfiguration;
    }

    private String getUrlFromFile()
    {
        return null;
    }

    HttpServicesConfiguration getProfileServiceUrl()
    {
        String s = getUrlFromFile();
        if (!TextUtils.isEmpty(s))
        {
            s = Uri.parse(s).buildUpon().path("/profile/mine/System.ShortCircuitProfile.json").toString();
        } else
        {
            s = (new StringBuilder()).append(configuration.getProfileServiceUrl()).append("/profile/mine/System.ShortCircuitProfile.json").toString();
        }
        return new HttpServicesConfiguration(s, com.skype.android.util.HttpUtil.Encoding.c);
    }
}
