// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.core.setup.ConfigurationManager_;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.common:
//            ConfigProvider

public final class ConfigProvider_ extends ConfigProvider
{

    private static ConfigProvider_ instance_;
    private Context context_;

    private ConfigProvider_(Context context)
    {
        context_ = context;
    }

    public static ConfigProvider_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ConfigProvider_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mConfigPrefs = new ApplicationConfigurationPreferences_(context_);
        mApplicationService = ApplicationService_.getInstance_(context_);
        mConfigurationManager = ConfigurationManager_.getInstance_(context_);
    }
}
