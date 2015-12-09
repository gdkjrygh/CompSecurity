// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.cloudconfig;

import com.google.android.apps.wallet.config.gservices.GservicesWrapper;

// Referenced classes of package com.google.android.apps.wallet.config.cloudconfig:
//            CloudConfigurationManager

public class WalletCloudConfigurationManager extends CloudConfigurationManager
{

    public WalletCloudConfigurationManager(GservicesWrapper gserviceswrapper)
    {
        super(gserviceswrapper);
    }

    public final String getServerUrlPrefix()
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$config$cloudconfig$CloudConfigurationManager$CloudConfig[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$config$cloudconfig$CloudConfigurationManager$CloudConfig = new int[CloudConfigurationManager.CloudConfig.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$config$cloudconfig$CloudConfigurationManager$CloudConfig[CloudConfigurationManager.CloudConfig.DEVELOPMENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$config$cloudconfig$CloudConfigurationManager$CloudConfig[CloudConfigurationManager.CloudConfig.SANDBOX.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager.CloudConfig[getCloudConfig().ordinal()])
        {
        default:
            return "https://clients5.google.com/cm";

        case 1: // '\001'
            return "https://cream-dev.sandbox.google.com/cm";

        case 2: // '\002'
            return "https://cream.sandbox.google.com/cm";
        }
    }
}
