// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.setup;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.common.ConnectionUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsUpsellData;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.core.setup.exception.NetworkNotAvailableException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.setup:
//            ConfigurationAPI

public class ConfigurationManager extends Manager
{

    private static final String LANGUAGE_DEFAULT = "en";
    private ApplicationConfiguration mApplicationConfiguration;
    ApplicationService mApplicationService;
    ConfigurationAPI mConfigurationAPI;
    ConnectionUtil mConnectionUtil;
    private List mLoyaltyFaqs;
    private ReplacedProducts mReplacedProducts;
    private LabsUpsellData mUpsellData;

    public ConfigurationManager()
    {
    }

    public ApplicationConfiguration getApplicationConfiguration()
    {
        return mApplicationConfiguration;
    }

    public String getItemAvailabilityMessage(String s)
    {
        if (mApplicationConfiguration != null)
        {
            String s1 = s;
            if (!mApplicationConfiguration.getItemAvailabilityMessage().containsKey(s))
            {
                s1 = "en";
            }
            return (String)mApplicationConfiguration.getItemAvailabilityMessage().get(s1);
        } else
        {
            return null;
        }
    }

    public List getLoyaltyFaqs()
    {
        return mLoyaltyFaqs;
    }

    public String getName()
    {
        return "configuration_manager";
    }

    public ReplacedProducts getReplacedProducts()
    {
        return mReplacedProducts;
    }

    public String getUpgradeMessage(String s)
    {
        if (mApplicationConfiguration != null)
        {
            String s1 = s;
            if (!mApplicationConfiguration.getUpgradeMessage().containsKey(s))
            {
                s1 = "en";
            }
            return (String)mApplicationConfiguration.getUpgradeMessage().get(s1);
        } else
        {
            return null;
        }
    }

    public LabsUpsellData getUpsellData()
    {
        return mUpsellData;
    }

    public void loadApplicationConfiguration(String s, String s1)
    {
        if (!mConnectionUtil.isNetworkAvailable())
        {
            throw new NetworkNotAvailableException();
        } else
        {
            mConfigurationAPI.setRootURL(s);
            mApplicationConfiguration = mConfigurationAPI.loadApplicationConfiguration(s1);
            return;
        }
    }

    public void loadLoyaltyFaqConfiguration(String s)
    {
        if (mApplicationConfiguration != null)
        {
            mLoyaltyFaqs = mConfigurationAPI.loadLoyaltyConfiguration(s);
        }
    }

    public void loadReplacedProductList()
    {
        mReplacedProducts = mConfigurationAPI.loadReplacedProducts();
    }

    public void loadUpsellConfiguration()
    {
        if (mApplicationConfiguration != null)
        {
            mUpsellData = mConfigurationAPI.loadUpsellConfiguration(mApplicationConfiguration.getUpsellFile());
        }
    }

    protected void onSessionSet()
    {
    }
}
