// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.manager;

import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;

public class PushAPI
{

    ConfigurationManager mConfigurationManager;

    public PushAPI()
    {
    }

    public boolean isPushEnabled()
    {
        return mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isPushNotificationsEnabled();
    }
}
