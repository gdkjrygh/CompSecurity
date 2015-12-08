// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;

public class LoyaltyAPI
{

    ConfigurationManager mConfigurationManager;
    PowerRestClient mPowerClient;

    public LoyaltyAPI()
    {
    }

    public CustomerLoyalty getCustomerLoyaltyInformation(String s)
    {
        return mPowerClient.getLoyaltyInformation(s);
    }

    public HistoryLoyalty getLoyaltyHistory(String s)
    {
        return mPowerClient.getLoyaltyHistory(s);
    }

    public boolean isLoyaltyAvailable()
    {
        return mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isLoyaltyAvailable();
    }

    public boolean isLoyaltyEnabled()
    {
        return mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isLoyaltyEnabled();
    }

    public void setLoyaltyAvailable(boolean flag)
    {
        if (mConfigurationManager.getApplicationConfiguration() != null)
        {
            mConfigurationManager.getApplicationConfiguration().setLoyaltyAvailable(flag);
        }
    }

    public void setLoyaltyEnabled(boolean flag)
    {
        if (mConfigurationManager.getApplicationConfiguration() != null)
        {
            mConfigurationManager.getApplicationConfiguration().setLoyaltyEnabled(flag);
        }
    }
}
