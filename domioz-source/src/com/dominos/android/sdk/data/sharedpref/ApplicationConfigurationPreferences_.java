// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;

import android.content.Context;
import org.androidannotations.api.c.d;
import org.androidannotations.api.c.i;
import org.androidannotations.api.c.n;
import org.androidannotations.api.c.p;

public final class ApplicationConfigurationPreferences_ extends n
{

    public ApplicationConfigurationPreferences_(Context context)
    {
        super(context.getSharedPreferences("ApplicationConfigurationPreferences", 0));
    }

    public final p applicationVersion()
    {
        return stringField("applicationVersion", "");
    }

    public final p beaconConfigURL()
    {
        return stringField("beaconConfigURL", "");
    }

    public final d beaconEnabled()
    {
        return booleanField("beaconEnabled", false);
    }

    public final i beaconVersionCode()
    {
        return intField("beaconVersionCode", 0);
    }

    public final p configURL()
    {
        return stringField("configURL", "");
    }

    public final i configVersionCode()
    {
        return intField("configVersionCode", 0);
    }

    public final p creditCardsExpired()
    {
        return stringField("creditCardsExpired", "");
    }

    public final p creditCardsNotTakenByStores()
    {
        return stringField("creditCardsNotTakenByStores", "");
    }

    public final ApplicationConfigurationPreferencesEditor_ edit()
    {
        return new ApplicationConfigurationPreferencesEditor_(getSharedPreferences());
    }

    public final d fordSyncEnabled()
    {
        return booleanField("fordSyncEnabled", false);
    }

    public final p fordsyncPromptsVersion()
    {
        return stringField("fordsyncPromptsVersion", "");
    }

    public final d giftCardsEnabled()
    {
        return booleanField("giftCardsEnabled", false);
    }

    public final d googleWalletEnabled()
    {
        return booleanField("googleWalletEnabled", false);
    }

    public final p googleWalletEnvironment()
    {
        return stringField("googleWalletEnvironment", "");
    }

    public final i googleWalletTipPad()
    {
        return intField("googleWalletTipPad", 0);
    }

    public final p grammarVersion()
    {
        return stringField("grammarVersion", "");
    }

    public final p inactiveTimeLimit()
    {
        return stringField("inactiveTimeLimit", "");
    }

    public final p invalidProductsMessage()
    {
        return stringField("invalidProductsMessage", "");
    }

    public final d loyaltyAvailable()
    {
        return booleanField("loyaltyAvailable", false);
    }

    public final d loyaltyEnabled()
    {
        return booleanField("loyaltyEnabled", false);
    }

    public final p nuanceGateway()
    {
        return stringField("nuanceGateway", "");
    }

    public final p nuancePromptsVersion()
    {
        return stringField("nuancePromptsVersion", "");
    }

    public final d orderingAvailable()
    {
        return booleanField("orderingAvailable", false);
    }

    public final d pebbleEnabled()
    {
        return booleanField("pebbleEnabled", false);
    }

    public final p powerURL()
    {
        return stringField("powerURL", "");
    }

    public final d promotionCampaignEnabled()
    {
        return booleanField("promotionCampaignEnabled", false);
    }

    public final p promptsURL()
    {
        return stringField("promptsURL", "");
    }

    public final d pushNotificationsEnabled()
    {
        return booleanField("pushNotificationsEnabled", false);
    }

    public final d samsungTVEnabled()
    {
        return booleanField("samsungTVEnabled", false);
    }

    public final d shopRunnerDiscontinued()
    {
        return booleanField("shopRunnerDiscontinued", false);
    }

    public final d shopRunnerEnabled()
    {
        return booleanField("shopRunnerEnabled", false);
    }

    public final d shopRunnerHardEnabled()
    {
        return booleanField("shopRunnerHardEnabled", false);
    }

    public final p shopRunnerLearnMoreWebUrl()
    {
        return stringField("shopRunnerLearnMoreWebUrl", "");
    }

    public final p shopRunnerLoginWebUrl()
    {
        return stringField("shopRunnerLoginWebUrl", "");
    }

    public final p shopRunnerValidateMemberTokenUrl()
    {
        return stringField("shopRunnerValidateMemberTokenUrl", "");
    }

    public final p shopRunnerValidateSessionTokenUrl()
    {
        return stringField("shopRunnerValidateSessionTokenUrl", "");
    }

    public final d speechEnabled()
    {
        return booleanField("speechEnabled", false);
    }

    public final p upgradeMessage()
    {
        return stringField("upgradeMessage", "");
    }

    public final d upgradeRecommended()
    {
        return booleanField("upgradeRecommended", false);
    }

    public final d upgradeRequired()
    {
        return booleanField("upgradeRequired", false);
    }

    public final p upsellFile()
    {
        return stringField("upsellFile", "");
    }

    private class ApplicationConfigurationPreferencesEditor_ extends e
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

        ApplicationConfigurationPreferencesEditor_(SharedPreferences sharedpreferences)
        {
            super(sharedpreferences);
        }
    }

}
