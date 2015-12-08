// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.analytics.facebook.FacebookManager;
import com.dominos.android.sdk.common.AmazonUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import com.dominos.beacon.manager.BeaconManager;
import com.dominos.controllers.interfaces.IDominosSplashScreen;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.loader.ApplicationLoader;
import com.dominos.news.manager.PushManager;
import com.google.android.gms.common.e;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

public class SplashScreenController
    implements IDominosViewController
{

    private static final String TAG = com/dominos/controllers/SplashScreenController.getSimpleName();
    AppLinkManager mAppLinkManager;
    ApplicationLoader mApplicationLoader;
    private BeaconManager mBeaconManager;
    private ConfigurationManager mConfigurationManager;
    private Context mContext;
    private FacebookManager mFacebookManager;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    private PushManager mPushManager;
    private ShoprunnerManager mShoprunnerManager;
    private IDominosSplashScreen mView;
    private CountDownLatch verificationInterruptionLatch;

    public SplashScreenController(Context context)
    {
        mContext = context;
    }

    private void checkApplicationUpdateRecommendation()
    {
        if (mConfigurationManager.getApplicationConfiguration().isUpgradeRecommended())
        {
            String s = mConfigurationManager.getUpgradeMessage(Locale.getDefault().getLanguage());
            mView.showAlertDialog(4, s);
            interruptVerification();
        }
    }

    private void interruptVerification()
    {
        verificationInterruptionLatch = new CountDownLatch(1);
        try
        {
            verificationInterruptionLatch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    private void setupBeacon(boolean flag)
    {
        if (!mConfigurationManager.getApplicationConfiguration().isBeaconEnabled())
        {
            LogUtil.d(TAG, "Beacon not enabled", new Object[0]);
        } else
        if (!flag)
        {
            mBeaconManager.setup(mConfigurationManager.getApplicationConfiguration().getBeaconConfigURL(), mConfigurationManager.getApplicationConfiguration().getBeaconVersionCode());
            return;
        }
    }

    private void startFacebookTracking()
    {
        mFacebookManager.setup(App.getInstance());
    }

    private void startPushTracking()
    {
        if (mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isPushNotificationsEnabled())
        {
            mPushManager.setup(App.getInstance());
        }
    }

    private void verifyNonMandatoryFeatures(boolean flag)
    {
        mShoprunnerManager.loadShopRunnerMember(mOrderManager.getOrder());
        if (mConfigurationManager.getApplicationConfiguration().isFordSyncEnabled())
        {
            mAppLinkManager.start();
        }
        if (!AmazonUtil.isAmazonDevice())
        {
            verifyGooglePlayService();
        }
        setupBeacon(flag);
        checkApplicationUpdateRecommendation();
        startPushTracking();
        startFacebookTracking();
        mView.onLoadingComplete();
    }

    public void checkGooglePlayServicesAndContinueVerification()
    {
        if (e.a(mContext) != 0)
        {
            disableGoogleWallet();
        }
        continueVerification();
    }

    public void continueVerification()
    {
        if (verificationInterruptionLatch != null)
        {
            verificationInterruptionLatch.countDown();
        }
    }

    public void disableGoogleWallet()
    {
        mConfigurationManager.getApplicationConfiguration().setGoogleWalletEnabled(false);
    }

    public void dispose()
    {
    }

    public void onAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        mShoprunnerManager = (ShoprunnerManager)mMobileSession.getManager("shoprunner_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mPushManager = (PushManager)mMobileSession.getManager("push_manager");
        mBeaconManager = (BeaconManager)mMobileSession.getManager("beacon_manager");
        mFacebookManager = (FacebookManager)mMobileSession.getManager("facebook_manager");
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        mView = (IDominosSplashScreen)idominosview;
        return this;
    }

    public void setupApplication(final boolean beaconLaunchMode)
    {
        mApplicationLoader.setupAsync(mMobileSession, new _cls1());
    }

    public void verifyGooglePlayService()
    {
        int i = e.a(mContext);
        switch (i)
        {
        default:
            _cls2 _lcls2 = new _cls2();
            mView.showGooglePlayServicesDialog(i, _lcls2);
            interruptVerification();
            // fall through

        case 0: // '\0'
            return;
        }
    }




    private class _cls1
        implements com.dominos.loader.ApplicationLoader.SetupLoadCallback
    {

        final SplashScreenController this$0;
        final boolean val$beaconLaunchMode;

        public void onSetupFailure(int i, String s)
        {
            mView.showAlertDialog(i, s);
        }

        public void onSetupSuccess()
        {
            verifyNonMandatoryFeatures(beaconLaunchMode);
        }

        _cls1()
        {
            this$0 = SplashScreenController.this;
            beaconLaunchMode = flag;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnCancelListener
    {

        final SplashScreenController this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            disableGoogleWallet();
        }

        _cls2()
        {
            this$0 = SplashScreenController.this;
            super();
        }
    }

}
