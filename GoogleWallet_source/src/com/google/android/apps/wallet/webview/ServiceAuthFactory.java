// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthInfo

public class ServiceAuthFactory
{

    CloudConfigurationManager cloudConfigurationManager;

    ServiceAuthFactory(CloudConfigurationManager cloudconfigurationmanager)
    {
        cloudConfigurationManager = cloudconfigurationmanager;
    }

    public final ServiceAuthInfo getGmailServiceAuthInfo()
    {
        cloudConfigurationManager.getCloudConfig();
        String s = com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig.getGmailServiceName();
        cloudConfigurationManager.getCloudConfig();
        return new ServiceAuthInfo(s, com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig.getGmailUrlPrefix(), true, true, ServiceAuthInfo.PreloadAuthPolicy.Always, null);
    }

    public final ServiceAuthInfo getWhiskyServiceAuthInfo(String s)
    {
        return new ServiceAuthInfo(cloudConfigurationManager.getCloudConfig().getWhiskyServiceName(), cloudConfigurationManager.getCloudConfig().getWhiskyUrlPrefix(), true, true, ServiceAuthInfo.PreloadAuthPolicy.Check, ImmutableList.of(new ServiceAuthInfo.CookieInfo(cloudConfigurationManager.getCloudConfig().getWhiskyUrlPrefix(), s, 1200)));
    }
}
