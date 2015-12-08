// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;

import android.content.SharedPreferences;
import org.androidannotations.api.c.c;
import org.androidannotations.api.c.e;
import org.androidannotations.api.c.h;
import org.androidannotations.api.c.o;

public final class  extends e
{

    public final o applicationVersion()
    {
        return stringField("applicationVersion");
    }

    public final o beaconConfigURL()
    {
        return stringField("beaconConfigURL");
    }

    public final c beaconEnabled()
    {
        return booleanField("beaconEnabled");
    }

    public final h beaconVersionCode()
    {
        return intField("beaconVersionCode");
    }

    public final o configURL()
    {
        return stringField("configURL");
    }

    public final h configVersionCode()
    {
        return intField("configVersionCode");
    }

    public final o creditCardsExpired()
    {
        return stringField("creditCardsExpired");
    }

    public final o creditCardsNotTakenByStores()
    {
        return stringField("creditCardsNotTakenByStores");
    }

    public final c fordSyncEnabled()
    {
        return booleanField("fordSyncEnabled");
    }

    public final o fordsyncPromptsVersion()
    {
        return stringField("fordsyncPromptsVersion");
    }

    public final c giftCardsEnabled()
    {
        return booleanField("giftCardsEnabled");
    }

    public final c googleWalletEnabled()
    {
        return booleanField("googleWalletEnabled");
    }

    public final o googleWalletEnvironment()
    {
        return stringField("googleWalletEnvironment");
    }

    public final h googleWalletTipPad()
    {
        return intField("googleWalletTipPad");
    }

    public final o grammarVersion()
    {
        return stringField("grammarVersion");
    }

    public final o inactiveTimeLimit()
    {
        return stringField("inactiveTimeLimit");
    }

    public final o invalidProductsMessage()
    {
        return stringField("invalidProductsMessage");
    }

    public final c loyaltyAvailable()
    {
        return booleanField("loyaltyAvailable");
    }

    public final c loyaltyEnabled()
    {
        return booleanField("loyaltyEnabled");
    }

    public final o nuanceGateway()
    {
        return stringField("nuanceGateway");
    }

    public final o nuancePromptsVersion()
    {
        return stringField("nuancePromptsVersion");
    }

    public final c orderingAvailable()
    {
        return booleanField("orderingAvailable");
    }

    public final c pebbleEnabled()
    {
        return booleanField("pebbleEnabled");
    }

    public final o powerURL()
    {
        return stringField("powerURL");
    }

    public final c promotionCampaignEnabled()
    {
        return booleanField("promotionCampaignEnabled");
    }

    public final o promptsURL()
    {
        return stringField("promptsURL");
    }

    public final c pushNotificationsEnabled()
    {
        return booleanField("pushNotificationsEnabled");
    }

    public final c samsungTVEnabled()
    {
        return booleanField("samsungTVEnabled");
    }

    public final c shopRunnerDiscontinued()
    {
        return booleanField("shopRunnerDiscontinued");
    }

    public final c shopRunnerEnabled()
    {
        return booleanField("shopRunnerEnabled");
    }

    public final c shopRunnerHardEnabled()
    {
        return booleanField("shopRunnerHardEnabled");
    }

    public final o shopRunnerLearnMoreWebUrl()
    {
        return stringField("shopRunnerLearnMoreWebUrl");
    }

    public final o shopRunnerLoginWebUrl()
    {
        return stringField("shopRunnerLoginWebUrl");
    }

    public final o shopRunnerValidateMemberTokenUrl()
    {
        return stringField("shopRunnerValidateMemberTokenUrl");
    }

    public final o shopRunnerValidateSessionTokenUrl()
    {
        return stringField("shopRunnerValidateSessionTokenUrl");
    }

    public final c speechEnabled()
    {
        return booleanField("speechEnabled");
    }

    public final o upgradeMessage()
    {
        return stringField("upgradeMessage");
    }

    public final c upgradeRecommended()
    {
        return booleanField("upgradeRecommended");
    }

    public final c upgradeRequired()
    {
        return booleanField("upgradeRequired");
    }

    public final o upsellFile()
    {
        return stringField("upsellFile");
    }

    (SharedPreferences sharedpreferences)
    {
        super(sharedpreferences);
    }
}
