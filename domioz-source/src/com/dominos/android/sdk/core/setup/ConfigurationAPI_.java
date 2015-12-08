// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.setup;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.data.http.cdn.ContentRestClient_;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;

// Referenced classes of package com.dominos.android.sdk.core.setup:
//            ConfigurationAPI

public final class ConfigurationAPI_ extends ConfigurationAPI
{

    private Context context_;

    private ConfigurationAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static ConfigurationAPI_ getInstance_(Context context)
    {
        return new ConfigurationAPI_(context);
    }

    private void init_()
    {
        mConfigurationPreferences = new ApplicationConfigurationPreferences_(context_);
        mApplicationService = ApplicationService_.getInstance_(context_);
        mContentService = ContentRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
