// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;


// Referenced classes of package com.google.android.apps.wallet.config.cloudconfig:
//            CloudServiceSpec, WalletCloudConfigurationManager, CloudConfigurationManager

public class CloudConfigModule
{

    public CloudConfigModule()
    {
    }

    static CloudConfigurationManager getCloudConfigurationManager(WalletCloudConfigurationManager walletcloudconfigurationmanager)
    {
        return walletcloudconfigurationmanager;
    }

    static CloudServiceSpec getCrossbarServiceSpec(WalletCloudConfigurationManager walletcloudconfigurationmanager)
    {
        return new CloudServiceSpec(walletcloudconfigurationmanager.getCloudConfig().getOauthScope(), walletcloudconfigurationmanager.getServerUrlPrefix());
    }
}
