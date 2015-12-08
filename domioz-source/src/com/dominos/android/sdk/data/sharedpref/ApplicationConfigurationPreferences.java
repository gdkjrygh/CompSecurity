// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;


public interface ApplicationConfigurationPreferences
{

    public abstract String applicationVersion();

    public abstract String beaconConfigURL();

    public abstract boolean beaconEnabled();

    public abstract int beaconVersionCode();

    public abstract String configURL();

    public abstract int configVersionCode();

    public abstract String creditCardsExpired();

    public abstract String creditCardsNotTakenByStores();

    public abstract boolean fordSyncEnabled();

    public abstract String fordsyncPromptsVersion();

    public abstract boolean giftCardsEnabled();

    public abstract boolean googleWalletEnabled();

    public abstract String googleWalletEnvironment();

    public abstract int googleWalletTipPad();

    public abstract String grammarVersion();

    public abstract String inactiveTimeLimit();

    public abstract String invalidProductsMessage();

    public abstract boolean loyaltyAvailable();

    public abstract boolean loyaltyEnabled();

    public abstract String nuanceGateway();

    public abstract String nuancePromptsVersion();

    public abstract boolean orderingAvailable();

    public abstract boolean pebbleEnabled();

    public abstract String powerURL();

    public abstract boolean promotionCampaignEnabled();

    public abstract String promptsURL();

    public abstract boolean pushNotificationsEnabled();

    public abstract boolean samsungTVEnabled();

    public abstract boolean shopRunnerDiscontinued();

    public abstract boolean shopRunnerEnabled();

    public abstract boolean shopRunnerHardEnabled();

    public abstract String shopRunnerLearnMoreWebUrl();

    public abstract String shopRunnerLoginWebUrl();

    public abstract String shopRunnerValidateMemberTokenUrl();

    public abstract String shopRunnerValidateSessionTokenUrl();

    public abstract boolean speechEnabled();

    public abstract String upgradeMessage();

    public abstract boolean upgradeRecommended();

    public abstract boolean upgradeRequired();

    public abstract String upsellFile();
}
