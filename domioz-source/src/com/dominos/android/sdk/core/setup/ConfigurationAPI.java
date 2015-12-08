// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.setup;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.core.models.ApplicationConfigVersion;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.LabsUpsellData;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.data.http.cdn.ContentRestClient;
import com.dominos.android.sdk.data.sharedpref.ApplicationConfigurationPreferences_;
import com.google.b.k;
import java.util.List;
import java.util.Map;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.i;
import org.androidannotations.api.c.p;

public class ConfigurationAPI
{

    ApplicationService mApplicationService;
    ApplicationConfigurationPreferences_ mConfigurationPreferences;
    ContentRestClient mContentService;

    public ConfigurationAPI()
    {
    }

    private ApplicationConfiguration getApplicationConfiguration()
    {
        ApplicationConfiguration applicationconfiguration = new ApplicationConfiguration();
        applicationconfiguration.setFordSyncEnabled(((Boolean)mConfigurationPreferences.fordSyncEnabled().c()).booleanValue());
        applicationconfiguration.setGiftCardsEnabled(((Boolean)mConfigurationPreferences.giftCardsEnabled().c()).booleanValue());
        applicationconfiguration.setGoogleWalletEnabled(((Boolean)mConfigurationPreferences.googleWalletEnabled().c()).booleanValue());
        applicationconfiguration.setOrderingAvailable(((Boolean)mConfigurationPreferences.orderingAvailable().c()).booleanValue());
        applicationconfiguration.setPromotionCampaignEnabled(((Boolean)mConfigurationPreferences.promotionCampaignEnabled().c()).booleanValue());
        applicationconfiguration.setPebbleEnabled(((Boolean)mConfigurationPreferences.pebbleEnabled().c()).booleanValue());
        applicationconfiguration.setSamsungTVEnabled(((Boolean)mConfigurationPreferences.samsungTVEnabled().c()).booleanValue());
        applicationconfiguration.setShopRunnerEnabled(((Boolean)mConfigurationPreferences.shopRunnerEnabled().c()).booleanValue());
        applicationconfiguration.setShopRunnerHardEnabled(((Boolean)mConfigurationPreferences.shopRunnerHardEnabled().c()).booleanValue());
        applicationconfiguration.setShopRunnerDiscontinued(((Boolean)mConfigurationPreferences.shopRunnerDiscontinued().c()).booleanValue());
        applicationconfiguration.setSpeechEnabled(((Boolean)mConfigurationPreferences.speechEnabled().c()).booleanValue());
        applicationconfiguration.setLoyaltyAvailable(((Boolean)mConfigurationPreferences.loyaltyAvailable().c()).booleanValue());
        applicationconfiguration.setLoyaltyEnabled(((Boolean)mConfigurationPreferences.loyaltyEnabled().c()).booleanValue());
        applicationconfiguration.setPushNotificationsEnabled(((Boolean)mConfigurationPreferences.pushNotificationsEnabled().c()).booleanValue());
        applicationconfiguration.setApplicationVersion((String)mConfigurationPreferences.applicationVersion().c());
        applicationconfiguration.setGoogleWalletTipPad(((Integer)mConfigurationPreferences.googleWalletTipPad().c()).intValue());
        applicationconfiguration.setInactiveTimeLimit(Integer.parseInt((String)mConfigurationPreferences.inactiveTimeLimit().c()));
        applicationconfiguration.setUpgradeRecommended(((Boolean)mConfigurationPreferences.upgradeRecommended().c()).booleanValue());
        applicationconfiguration.setUpgradeRequired(((Boolean)mConfigurationPreferences.upgradeRequired().c()).booleanValue());
        applicationconfiguration.setUpsellFile((String)mConfigurationPreferences.upsellFile().c());
        applicationconfiguration.setPromptsURL((String)mConfigurationPreferences.promptsURL().c());
        applicationconfiguration.setNuancePromptsVersion((String)mConfigurationPreferences.nuancePromptsVersion().c());
        applicationconfiguration.setFordsyncPromptsVersion((String)mConfigurationPreferences.fordsyncPromptsVersion().c());
        applicationconfiguration.setGrammarVersion((String)mConfigurationPreferences.grammarVersion().c());
        applicationconfiguration.setNuanceGateway((String)mConfigurationPreferences.nuanceGateway().c());
        applicationconfiguration.setBeaconEnabled(((Boolean)mConfigurationPreferences.beaconEnabled().c()).booleanValue());
        applicationconfiguration.setBeaconVersionCode(((Integer)mConfigurationPreferences.beaconVersionCode().c()).intValue());
        applicationconfiguration.setBeaconConfigURL((String)mConfigurationPreferences.beaconConfigURL().c());
        applicationconfiguration.setShopRunnerLearnMoreWebUrl((String)mConfigurationPreferences.shopRunnerLearnMoreWebUrl().c());
        applicationconfiguration.setShopRunnerLoginWebUrl((String)mConfigurationPreferences.shopRunnerLoginWebUrl().c());
        applicationconfiguration.setShopRunnerValidateMemberTokenUrl((String)mConfigurationPreferences.shopRunnerValidateMemberTokenUrl().c());
        applicationconfiguration.setShopRunnerValidateSessionTokenUrl((String)mConfigurationPreferences.shopRunnerValidateSessionTokenUrl().c());
        applicationconfiguration.setUpgradeMessage((Map)(new k()).a((String)mConfigurationPreferences.upgradeMessage().c(), (new _cls1()).getType()));
        applicationconfiguration.setItemAvailabilityMessage((Map)(new k()).a((String)mConfigurationPreferences.invalidProductsMessage().c(), (new _cls2()).getType()));
        return applicationconfiguration;
    }

    public ApplicationConfiguration loadApplicationConfiguration(String s)
    {
        Object obj = null;
        ApplicationConfigVersion applicationconfigversion = mContentService.getApplicationConfigVersion(s);
        if (applicationconfigversion != null)
        {
            if (mConfigurationPreferences.configVersionCode().a() && ((Integer)mConfigurationPreferences.configVersionCode().c()).intValue() == applicationconfigversion.getConfigVersionCode())
            {
                obj = getApplicationConfiguration();
            } else
            {
                s = mContentService.getApplicationConfiguration(s);
                obj = s;
                if (s != null)
                {
                    persistApplicationConfiguration(s);
                    s = getApplicationConfiguration();
                    mConfigurationPreferences.configVersionCode().b(Integer.valueOf(applicationconfigversion.getConfigVersionCode()));
                    return s;
                }
            }
        }
        return ((ApplicationConfiguration) (obj));
    }

    public List loadLoyaltyConfiguration(String s)
    {
        return mContentService.getLoyaltyFaqs(s);
    }

    public ReplacedProducts loadReplacedProducts()
    {
        return mContentService.getReplacedProducts();
    }

    public LabsUpsellData loadUpsellConfiguration(String s)
    {
        return mContentService.getUpsellConfiguration(s);
    }

    public void persistApplicationConfiguration(ApplicationConfiguration applicationconfiguration)
    {
        mConfigurationPreferences.clear();
        mConfigurationPreferences.fordSyncEnabled().b(Boolean.valueOf(applicationconfiguration.isFordSyncEnabled()));
        mConfigurationPreferences.giftCardsEnabled().b(Boolean.valueOf(applicationconfiguration.isGiftCardsEnabled()));
        mConfigurationPreferences.googleWalletEnabled().b(Boolean.valueOf(applicationconfiguration.isGoogleWalletEnabled()));
        mConfigurationPreferences.orderingAvailable().b(Boolean.valueOf(applicationconfiguration.isOrderingAvailable()));
        mConfigurationPreferences.promotionCampaignEnabled().b(Boolean.valueOf(applicationconfiguration.isPromotionCampaignEnabled()));
        mConfigurationPreferences.pebbleEnabled().b(Boolean.valueOf(applicationconfiguration.isPebbleEnabled()));
        mConfigurationPreferences.samsungTVEnabled().b(Boolean.valueOf(applicationconfiguration.isSamsungTVEnabled()));
        mConfigurationPreferences.shopRunnerEnabled().b(Boolean.valueOf(applicationconfiguration.isShopRunnerEnabled()));
        mConfigurationPreferences.shopRunnerHardEnabled().b(Boolean.valueOf(applicationconfiguration.isShopRunnerHardEnabled()));
        mConfigurationPreferences.shopRunnerDiscontinued().b(Boolean.valueOf(applicationconfiguration.isShopRunnerDiscontinued()));
        mConfigurationPreferences.speechEnabled().b(Boolean.valueOf(applicationconfiguration.isSpeechEnabled()));
        mConfigurationPreferences.loyaltyAvailable().b(Boolean.valueOf(applicationconfiguration.isLoyaltyAvailable()));
        mConfigurationPreferences.loyaltyEnabled().b(Boolean.valueOf(applicationconfiguration.isLoyaltyEnabled()));
        mConfigurationPreferences.pushNotificationsEnabled().b(Boolean.valueOf(applicationconfiguration.isPushNotificationsEnabled()));
        mConfigurationPreferences.applicationVersion().b(applicationconfiguration.getApplicationVersion());
        mConfigurationPreferences.googleWalletTipPad().b(Integer.valueOf(applicationconfiguration.getGoogleWalletTipPad()));
        mConfigurationPreferences.inactiveTimeLimit().b(String.valueOf(applicationconfiguration.getInactiveTimeLimit()));
        mConfigurationPreferences.upgradeRecommended().b(Boolean.valueOf(applicationconfiguration.isUpgradeRecommended()));
        mConfigurationPreferences.upgradeRequired().b(Boolean.valueOf(applicationconfiguration.isUpgradeRequired()));
        mConfigurationPreferences.upsellFile().b(applicationconfiguration.getUpsellFile());
        mConfigurationPreferences.promptsURL().b(applicationconfiguration.getPromptsURL());
        mConfigurationPreferences.nuancePromptsVersion().b(applicationconfiguration.getNuancePromptsVersion());
        mConfigurationPreferences.fordsyncPromptsVersion().b(applicationconfiguration.getFordsyncPromptsVersion());
        mConfigurationPreferences.grammarVersion().b(applicationconfiguration.getGrammarVersion());
        mConfigurationPreferences.nuanceGateway().b(applicationconfiguration.getNuanceGateway());
        mConfigurationPreferences.beaconEnabled().b(Boolean.valueOf(applicationconfiguration.isBeaconEnabled()));
        mConfigurationPreferences.beaconVersionCode().b(Integer.valueOf(applicationconfiguration.getBeaconVersionCode()));
        mConfigurationPreferences.beaconConfigURL().b(applicationconfiguration.getBeaconConfigURL());
        mConfigurationPreferences.shopRunnerLearnMoreWebUrl().b(applicationconfiguration.getShopRunnerLearnMoreWebUrl());
        mConfigurationPreferences.shopRunnerLoginWebUrl().b(applicationconfiguration.getShopRunnerLoginWebUrl());
        mConfigurationPreferences.shopRunnerValidateMemberTokenUrl().b(applicationconfiguration.getShopRunnerValidateMemberTokenUrl());
        mConfigurationPreferences.shopRunnerValidateSessionTokenUrl().b(applicationconfiguration.getShopRunnerValidateSessionTokenUrl());
        if (applicationconfiguration.getUpgradeMessage() != null)
        {
            mConfigurationPreferences.upgradeMessage().b((new k()).a(applicationconfiguration.getUpgradeMessage()));
        }
        if (applicationconfiguration.getItemAvailabilityMessage() != null)
        {
            mConfigurationPreferences.invalidProductsMessage().b((new k()).a(applicationconfiguration.getItemAvailabilityMessage()));
        }
    }

    public void setRootURL(String s)
    {
        mContentService.setRootUrl(s);
    }

    private class _cls1 extends a
    {

        final ConfigurationAPI this$0;

        _cls1()
        {
            this$0 = ConfigurationAPI.this;
            super();
        }
    }


    private class _cls2 extends a
    {

        final ConfigurationAPI this$0;

        _cls2()
        {
            this$0 = ConfigurationAPI.this;
            super();
        }
    }

}
