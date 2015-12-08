// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.Map;

public class ApplicationConfiguration
{

    private String applicationVersion;
    private String beaconConfigURL;
    private boolean beaconEnabled;
    private int beaconVersionCode;
    private boolean fordSyncEnabled;
    private String fordsyncPromptsVersion;
    private boolean giftCardsEnabled;
    private boolean googleWalletEnabled;
    private int googleWalletTipPad;
    private String grammarVersion;
    private int inactiveTimeLimit;
    private boolean loyaltyAvailable;
    private boolean loyaltyEnabled;
    private Map mItemAvailabilityMessage;
    private String nuanceGateway;
    private String nuancePromptsVersion;
    private boolean orderingAvailable;
    private boolean pebbleEnabled;
    private boolean promotionCampaignEnabled;
    private String promptsURL;
    private boolean pushNotificationsEnabled;
    private boolean samsungTVEnabled;
    private boolean shopRunnerDiscontinued;
    private boolean shopRunnerEnabled;
    private boolean shopRunnerHardEnabled;
    private String shopRunnerLearnMoreWebUrl;
    private String shopRunnerLoginWebUrl;
    private String shopRunnerValidateMemberTokenUrl;
    private String shopRunnerValidateSessionTokenUrl;
    private boolean speechEnabled;
    private Map upgradeMessage;
    private boolean upgradeRecommended;
    private boolean upgradeRequired;
    private String upsellFile;

    public ApplicationConfiguration()
    {
    }

    public String getApplicationVersion()
    {
        return applicationVersion;
    }

    public String getBeaconConfigURL()
    {
        return beaconConfigURL;
    }

    public int getBeaconVersionCode()
    {
        return beaconVersionCode;
    }

    public String getFordsyncPromptsVersion()
    {
        return fordsyncPromptsVersion;
    }

    public int getGoogleWalletTipPad()
    {
        return googleWalletTipPad;
    }

    public String getGrammarVersion()
    {
        return grammarVersion;
    }

    public int getInactiveTimeLimit()
    {
        return inactiveTimeLimit;
    }

    public Map getItemAvailabilityMessage()
    {
        return mItemAvailabilityMessage;
    }

    public String getNuanceGateway()
    {
        return nuanceGateway;
    }

    public String getNuancePromptsVersion()
    {
        return nuancePromptsVersion;
    }

    public String getPromptsURL()
    {
        return promptsURL;
    }

    public String getShopRunnerLearnMoreWebUrl()
    {
        return shopRunnerLearnMoreWebUrl;
    }

    public String getShopRunnerLoginWebUrl()
    {
        return shopRunnerLoginWebUrl;
    }

    public String getShopRunnerValidateMemberTokenUrl()
    {
        return shopRunnerValidateMemberTokenUrl;
    }

    public String getShopRunnerValidateSessionTokenUrl()
    {
        return shopRunnerValidateSessionTokenUrl;
    }

    public Map getUpgradeMessage()
    {
        return upgradeMessage;
    }

    public String getUpsellFile()
    {
        return upsellFile;
    }

    public boolean isBeaconEnabled()
    {
        return beaconEnabled;
    }

    public boolean isFordSyncEnabled()
    {
        return fordSyncEnabled;
    }

    public boolean isGiftCardsEnabled()
    {
        return giftCardsEnabled;
    }

    public boolean isGoogleWalletEnabled()
    {
        return googleWalletEnabled;
    }

    public boolean isLoyaltyAvailable()
    {
        return loyaltyAvailable;
    }

    public boolean isLoyaltyEnabled()
    {
        return loyaltyEnabled;
    }

    public boolean isOrderingAvailable()
    {
        return orderingAvailable;
    }

    public boolean isPebbleEnabled()
    {
        return pebbleEnabled;
    }

    public boolean isPromotionCampaignEnabled()
    {
        return promotionCampaignEnabled;
    }

    public boolean isPushNotificationsEnabled()
    {
        return pushNotificationsEnabled;
    }

    public boolean isSamsungTVEnabled()
    {
        return samsungTVEnabled;
    }

    public boolean isShopRunnerDiscontinued()
    {
        return shopRunnerDiscontinued;
    }

    public boolean isShopRunnerEnabled()
    {
        return shopRunnerEnabled;
    }

    public boolean isShopRunnerHardEnabled()
    {
        return shopRunnerHardEnabled;
    }

    public boolean isSpeechEnabled()
    {
        return speechEnabled;
    }

    public boolean isUpgradeRecommended()
    {
        return upgradeRecommended;
    }

    public boolean isUpgradeRequired()
    {
        return upgradeRequired;
    }

    public void setApplicationVersion(String s)
    {
        applicationVersion = s;
    }

    public void setBeaconConfigURL(String s)
    {
        beaconConfigURL = s;
    }

    public void setBeaconEnabled(boolean flag)
    {
        beaconEnabled = flag;
    }

    public void setBeaconVersionCode(int i)
    {
        beaconVersionCode = i;
    }

    public void setFordSyncEnabled(boolean flag)
    {
        fordSyncEnabled = flag;
    }

    public void setFordsyncPromptsVersion(String s)
    {
        fordsyncPromptsVersion = s;
    }

    public void setGiftCardsEnabled(boolean flag)
    {
        giftCardsEnabled = flag;
    }

    public void setGoogleWalletEnabled(boolean flag)
    {
        googleWalletEnabled = flag;
    }

    public void setGoogleWalletTipPad(int i)
    {
        googleWalletTipPad = i;
    }

    public void setGrammarVersion(String s)
    {
        grammarVersion = s;
    }

    public void setInactiveTimeLimit(int i)
    {
        inactiveTimeLimit = i;
    }

    public void setItemAvailabilityMessage(Map map)
    {
        mItemAvailabilityMessage = map;
    }

    public void setLoyaltyAvailable(boolean flag)
    {
        loyaltyAvailable = flag;
    }

    public void setLoyaltyEnabled(boolean flag)
    {
        loyaltyEnabled = flag;
    }

    public void setNuanceGateway(String s)
    {
        nuanceGateway = s;
    }

    public void setNuancePromptsVersion(String s)
    {
        nuancePromptsVersion = s;
    }

    public void setOrderingAvailable(boolean flag)
    {
        orderingAvailable = flag;
    }

    public void setPebbleEnabled(boolean flag)
    {
        pebbleEnabled = flag;
    }

    public void setPromotionCampaignEnabled(boolean flag)
    {
        promotionCampaignEnabled = flag;
    }

    public void setPromptsURL(String s)
    {
        promptsURL = s;
    }

    public void setPushNotificationsEnabled(boolean flag)
    {
        pushNotificationsEnabled = flag;
    }

    public void setSamsungTVEnabled(boolean flag)
    {
        samsungTVEnabled = flag;
    }

    public void setShopRunnerDiscontinued(boolean flag)
    {
        shopRunnerDiscontinued = flag;
    }

    public void setShopRunnerEnabled(boolean flag)
    {
        shopRunnerEnabled = flag;
    }

    public void setShopRunnerHardEnabled(boolean flag)
    {
        shopRunnerHardEnabled = flag;
    }

    public void setShopRunnerLearnMoreWebUrl(String s)
    {
        shopRunnerLearnMoreWebUrl = s;
    }

    public void setShopRunnerLoginWebUrl(String s)
    {
        shopRunnerLoginWebUrl = s;
    }

    public void setShopRunnerValidateMemberTokenUrl(String s)
    {
        shopRunnerValidateMemberTokenUrl = s;
    }

    public void setShopRunnerValidateSessionTokenUrl(String s)
    {
        shopRunnerValidateSessionTokenUrl = s;
    }

    public void setSpeechEnabled(boolean flag)
    {
        speechEnabled = flag;
    }

    public void setUpgradeMessage(Map map)
    {
        upgradeMessage = map;
    }

    public void setUpgradeRecommended(boolean flag)
    {
        upgradeRecommended = flag;
    }

    public void setUpgradeRequired(boolean flag)
    {
        upgradeRequired = flag;
    }

    public void setUpsellFile(String s)
    {
        upsellFile = s;
    }
}
