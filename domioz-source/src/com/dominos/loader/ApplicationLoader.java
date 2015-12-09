// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.loader;

import android.content.Context;
import com.dominos.App;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.ConfigProvider;
import com.dominos.android.sdk.common.DeviceCapabilities;
import com.dominos.android.sdk.common.GoogleWalletUtil;
import com.dominos.android.sdk.common.LocalizationUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.prompt.PromptManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.setup.exception.NetworkNotAvailableException;
import com.dominos.android.sdk.core.upsell.UpsellManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.advertising.AdvertisingManager;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.ApplicationVersionUtil;
import com.dominos.wear.manager.WearManager;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ApplicationLoader
{

    private static final String ENVIRONMENT_PROD = "prod";
    private static final String ENVIRONMENT_QA = "qa";
    public static final String TAG = com/dominos/loader/ApplicationLoader.getSimpleName();
    private boolean applicationInitialized;
    private AdvertisingManager mAdvertisingManager;
    AnalyticsUtil mAnalyticsUtil;
    ApplicationVersionUtil mApplicationVersionUtil;
    ConfigProvider mConfigProvider;
    private ConfigurationManager mConfigurationManager;
    Context mContext;
    DeviceCapabilities mDeviceCapabilities;
    FacebookAnalyticsProcessor mFacebookAnalyticsProcessor;
    GoogleWalletUtil mGoogleWalletUtil;
    DominosPrefs_ mPrefs;
    SpeechManager mSpeechManager;
    private UpsellManager mUpsellManager;
    private UserProfileManager mUserProfileManager;
    WearManager mWearManager;

    public ApplicationLoader()
    {
        applicationInitialized = false;
    }

    private void changeInactiveTimeout()
    {
        if (mConfigurationManager.getApplicationConfiguration() != null)
        {
            UserAuthorization_.getInstance_(mContext).setInactiveTimeLimit(mConfigurationManager.getApplicationConfiguration().getInactiveTimeLimit());
        }
    }

    private int getApplicationConfiguration(String s, String s1)
    {
        mConfigurationManager.loadApplicationConfiguration(s, s1);
        if (mConfigurationManager.getApplicationConfiguration() != null)
        {
            return 0;
        }
        try
        {
            trackAnalytics(6);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            trackAnalytics(7);
            return 7;
        }
        return 6;
    }

    private int getLoyaltyFaqs()
    {
        String s = LocalizationUtil.getPhoneLang();
        mConfigurationManager.loadLoyaltyFaqConfiguration(s);
        return 0;
    }

    private int getReplacedProductList()
    {
        mConfigurationManager.loadReplacedProductList();
        return 0;
    }

    private int getUpsellBarData(String s)
    {
        mUpsellManager.loadUpsellBarList(s);
        return 0;
    }

    private int getUpsellData()
    {
        mConfigurationManager.loadUpsellConfiguration();
        return 0;
    }

    private int handleAndroidAdvertisingId()
    {
        mAdvertisingManager.initializeAdId();
        return 0;
    }

    private int handleOrderingStatus()
    {
        if (!mApplicationVersionUtil.isLatestVersion(mConfigurationManager.getApplicationConfiguration().getApplicationVersion()) && mConfigurationManager.getApplicationConfiguration().isUpgradeRequired())
        {
            return 3;
        }
        return mConfigurationManager.getApplicationConfiguration().isOrderingAvailable() ? 0 : 8;
    }

    private int handleRememberMeUser()
    {
        if (mUserProfileManager.isRemembered())
        {
            mUserProfileManager.loadRememberedUser();
        }
        if (mUserProfileManager.getCurrentUser() != null)
        {
            mAnalyticsUtil.postLogin(mUserProfileManager.getCurrentUser().getCustomerId());
        }
        return 0;
    }

    private int handleSpeech(ApplicationConfiguration applicationconfiguration)
    {
        if (verifySpeechCapabilities(applicationconfiguration))
        {
            String s = mSpeechManager.getPromptManager().createVersionedFileName(applicationconfiguration.getNuancePromptsVersion(), "nuance.json");
            String s1 = mConfigurationManager.getApplicationConfiguration().getPromptsURL();
            mSpeechManager.getPromptManager().loadPromptModel(s1, s);
            if (mSpeechManager.getPromptManager().getPromptModel() != null)
            {
                mSpeechManager.enableSpeech(applicationconfiguration.getNuanceGateway(), applicationconfiguration.getGrammarVersion());
                return 0;
            } else
            {
                applicationconfiguration.setSpeechEnabled(false);
                return 0;
            }
        } else
        {
            applicationconfiguration.setSpeechEnabled(false);
            return 0;
        }
    }

    private void setManagerDependencies(Session session)
    {
        mConfigurationManager = (ConfigurationManager)session.getManager("configuration_manager");
        mUserProfileManager = (UserProfileManager)session.getManager("user_manager");
        mAdvertisingManager = (AdvertisingManager)session.getManager("advertising_manager");
        mUpsellManager = (UpsellManager)session.getManager("upsell_manager");
    }

    private void trackAnalytics(int i)
    {
        switch (i)
        {
        default:
            mAnalyticsUtil.postDominosUnavailable();
            return;

        case 7: // '\007'
            mAnalyticsUtil.postNoNetworkConnection();
            break;
        }
    }

    private boolean verifySpeechCapabilities(ApplicationConfiguration applicationconfiguration)
    {
        String s = Locale.getDefault().getLanguage();
        boolean flag = mDeviceCapabilities.hasSpeechCapabilities();
        return applicationconfiguration.isSpeechEnabled() && Arrays.asList(SpeechManager.AVAILABLE_LANGUAGES).contains(s) && flag;
    }

    public boolean isApplicationInitialized()
    {
        return applicationInitialized;
    }

    public int setup(Session session)
    {
        setManagerDependencies(session);
        applicationInitialized = false;
        int i;
        if (App.isDebugMode())
        {
            session = "qa";
        } else
        {
            session = "prod";
        }
        i = getApplicationConfiguration(mConfigProvider.getConfigRootUrl(), "3.0.1");
        if (i == 0)
        {
            changeInactiveTimeout();
            i = getUpsellData();
            if (i != 0)
            {
                return i;
            }
            int j = getUpsellBarData(session);
            i = j;
            if (j == 0)
            {
                int k = handleSpeech(mConfigurationManager.getApplicationConfiguration());
                i = k;
                if (k == 0)
                {
                    int l = handleOrderingStatus();
                    i = l;
                    if (l == 0)
                    {
                        int i1 = handleRememberMeUser();
                        i = i1;
                        if (i1 == 0)
                        {
                            int j1 = getLoyaltyFaqs();
                            i = j1;
                            if (j1 == 0)
                            {
                                mWearManager.setup();
                                int k1 = handleAndroidAdvertisingId();
                                i = k1;
                                if (k1 == 0)
                                {
                                    int l1 = getReplacedProductList();
                                    i = l1;
                                    if (l1 == 0)
                                    {
                                        applicationInitialized = true;
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    public void setupAsync(Session session, SetupLoadCallback setuploadcallback)
    {
        int i = setup(session);
        if (i == 0)
        {
            setuploadcallback.onSetupSuccess();
            return;
        } else
        {
            setuploadcallback.onSetupFailure(i, mConfigurationManager.getUpgradeMessage(Locale.getDefault().getLanguage()));
            return;
        }
    }


    private class SetupLoadCallback
    {

        public abstract void onSetupFailure(int i, String s);

        public abstract void onSetupSuccess();
    }

}
