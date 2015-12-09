// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.setup;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.core.setup:
//            ConfigurationManager, ConfigurationAPI_

public final class ConfigurationManager_ extends ConfigurationManager
{

    private static ConfigurationManager_ instance_;
    private Context context_;

    private ConfigurationManager_(Context context)
    {
        context_ = context;
    }

    public static ConfigurationManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ConfigurationManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mApplicationService = ApplicationService_.getInstance_(context_);
        mConfigurationAPI = ConfigurationAPI_.getInstance_(context_);
        mConnectionUtil = ConnectionUtil_.getInstance_(context_);
    }
}
