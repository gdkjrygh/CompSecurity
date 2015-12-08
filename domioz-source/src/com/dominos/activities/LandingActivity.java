// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.support.v4.app.v;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.core.user.UserService;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.beacon.manager.BeaconManager;
import com.dominos.controllers.LandingScreenController;
import com.dominos.controllers.interfaces.IDominosLandingScreen;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.fragments.LoyaltyWidgetFragment;
import com.dominos.fragments.landing.NoCachedAddressFragment;
import com.dominos.fragments.landing.ProfileUserFragment;
import com.dominos.nina.dialog.agent.GlobalAgent;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.pebble.PebbleManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.AnalyticsUtil;
import com.ford.syncV4.e.c.a.e;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.activities:
//            IndexingActivity, PrivacyWebActivity, SettingsPreferenceActivity, LandingActivity_, 
//            SavedAddressActivity_, AddressTypeActivity_, LoyaltyInfoFragment

public class LandingActivity extends IndexingActivity
    implements LoyaltyInfoFragment.OnFinishLoyaltyInfoFragment, IDominosLandingScreen, com.dominos.fragments.landing.NoCachedAddressFragment.OnServiceMethodListener, com.dominos.fragments.landing.ProfileUserFragment.ProfileActionListener, com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener
{

    public static final String EXTRA_NEW_ORDER = "com.dominos.intent.extra.NEW_ORDER";
    private static final int FADE_START_DELAY = 2500;
    private static final String FINISH_FRAGMENT = "FINISH_FRAGMENT";
    private static final String NONE = "none";
    private static final String PAGE_NAME = "Landing";
    private static final String PEBBLE_APP_ID = "5425b1b2f8ab4100cb0000e1";
    private static final String PEBBLE_APP_URI = "pebble://appstore/";
    private static final String TAG = com/dominos/activities/LandingActivity.getName();
    private static LandingActivity_ instance;
    private LandingScreenController controller;
    ControllerLocator controllerLocator;
    private boolean finishNoCachedFragment;
    LinearLayout fragmentWindow;
    RelativeLayout landingContainer;
    AppLinkManager mAppLinkManager;
    private BeaconManager mBeaconManager;
    private BusSubscriber mBusSubscriber;
    LinearLayout mLoyaltyLearnMoreBanner;
    LinearLayout mLoyaltyMicroWidgetHolder;
    LinearLayout mLoyaltySignBanner;
    LinearLayout mLoyaltySuccessBanner;
    private LoyaltyWidgetFragment mLoyaltyWidgetFragment;
    LinearLayout newOrderHeader;
    PebbleManager pebbleManager;
    View placeHolderNinaInvokeButton;
    DominosPrefs_ prefs;
    TextView titleText;
    UserService user;
    LinearLayout welcomeHeader;

    public LandingActivity()
    {
        finishNoCachedFragment = false;
    }

    private void addFragment(Fragment fragment, String s)
    {
        LogUtil.d(TAG, (new StringBuilder("add fragment : ")).append(s).toString(), new Object[0]);
        if (!isActivityValid())
        {
            LogUtil.d(TAG, "Activity is destroyed", new Object[0]);
            return;
        } else
        {
            getSupportFragmentManager().a().b(0x7f0f0317, fragment, s).a(s).b();
            getSupportFragmentManager().b();
            return;
        }
    }

    private boolean checkFragmentInBackStack(String s)
    {
        boolean flag1 = false;
        u u1 = getSupportFragmentManager();
        boolean flag = flag1;
        if (u1.e() > 0)
        {
            flag = flag1;
            if (u1.a(s) != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    private void clearFragmentBackStack()
    {
        u u1 = getSupportFragmentManager();
        for (int i = 0; i < u1.e(); i++)
        {
            u1.c();
        }

    }

    public static LandingActivity_ getInstance()
    {
        return instance;
    }

    private Fragment getTopFragment()
    {
        u u1 = getSupportFragmentManager();
        if (u1.e() > 0)
        {
            return u1.a(u1.c(u1.e() - 1).c());
        } else
        {
            return null;
        }
    }

    private void initProfiledUser()
    {
        ProfileUserFragment profileuserfragment = ProfileUserFragment.newInstance();
        addFragment(profileuserfragment, com/dominos/fragments/landing/ProfileUserFragment.getSimpleName());
        profileuserfragment.setProfileActionListener(this);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingFragmentTransition());
    }

    private boolean isCenterWindowInNewOrderMode()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mProfileManager.isUserWithOrderHistory())
        {
            Fragment fragment = getTopFragment();
            flag = flag1;
            if (fragment != null)
            {
                flag = flag1;
                if (fragment instanceof NoCachedAddressFragment)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void navigateToNoCachedAddressFragment()
    {
        removeLoyaltyWidget();
        addFragment(NoCachedAddressFragment.newInstance(this), com/dominos/fragments/landing/NoCachedAddressFragment.getSimpleName());
        if (mProfileManager.isUserWithOrderHistory())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.NewOrderFragmentTransition());
            return;
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingFragmentTransition());
            return;
        }
    }

    private void redeemClick()
    {
        mLoyaltyManager.setLoyaltyCouponAdded();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.LandingNewOrderTapped());
        showNoCachedAddressFragment();
    }

    private void refreshFragment()
    {
        boolean flag;
label0:
        {
label1:
            {
                if (getSupportFragmentManager().e() > 0)
                {
                    flag = checkFragmentInBackStack(com/dominos/fragments/landing/ProfileUserFragment.getSimpleName());
                    if (!mProfileManager.isAuthorizedUser())
                    {
                        break label0;
                    }
                    if (flag)
                    {
                        break label1;
                    }
                    clearFragmentBackStack();
                }
                controller.showFragment();
                return;
            }
            if (isCenterWindowInNewOrderMode())
            {
                if (finishNoCachedFragment)
                {
                    getSupportFragmentManager().b(com/dominos/fragments/landing/NoCachedAddressFragment.getSimpleName());
                    App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingFragmentTransition());
                } else
                {
                    App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.NewOrderFragmentTransition());
                }
            } else
            {
                App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingFragmentTransition());
            }
            finishNoCachedFragment = false;
            return;
        }
        if (flag)
        {
            clearFragmentBackStack();
            showNoCachedAddressFragment();
            return;
        } else
        {
            App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingFragmentTransition());
            return;
        }
    }

    private void refreshHeaderView()
    {
        if (isCenterWindowInNewOrderMode())
        {
            welcomeHeader.setVisibility(8);
            newOrderHeader.setVisibility(0);
            sendNewOrderAnalytics();
            return;
        }
        welcomeHeader.setVisibility(0);
        newOrderHeader.setVisibility(8);
        String s;
        if (controller.isFirstTimeUser())
        {
            if (mLoyaltySignBanner != null)
            {
                setSignInBannerText(0x7f0801b5);
            }
            s = getString(0x7f080186);
        } else
        {
            if (mLoyaltySignBanner != null)
            {
                setSignInBannerText(0x7f0801b6);
            }
            String s1 = getString(0x7f080340);
            if (mProfileManager.getCurrentUser() != null)
            {
                s = (new StringBuilder("\n")).append(mProfileManager.getCurrentUser().getFirstName().toUpperCase()).toString();
            } else
            {
                s = "";
            }
            s = String.format(s1, new Object[] {
                s
            });
        }
        titleText.setText(s);
    }

    private void removeLoyaltyWidget()
    {
        if (mLoyaltyWidgetFragment != null)
        {
            getSupportFragmentManager().a().a(mLoyaltyWidgetFragment).b();
        }
    }

    private void sendNewOrderAnalytics()
    {
        mAnalyticsUtil.postNewOrderPageLoaded();
    }

    private void setSignInBannerText(int i)
    {
        ((TextView)mLoyaltySignBanner.findViewById(0x7f0f02fe)).setText(getString(i));
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addContentView(view, layoutparams);
        if (placeHolderNinaInvokeButton != null)
        {
            view = placeHolderNinaInvokeButton;
            int i;
            if (App.getInstance().isSpeechEnabled())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void analyticsUpdate()
    {
        boolean flag = false;
        if (mProfileManager.isAuthorizedUser())
        {
            AnalyticsUtil analyticsutil = mAnalyticsUtil;
            boolean flag1 = mProfileManager.isUserLoggedIn();
            boolean flag2 = mProfileManager.isRemembered();
            if (mProfileManager.getEasyOrder() != null)
            {
                flag = true;
            }
            analyticsutil.postHomePage(flag1, flag2, flag);
            return;
        } else
        {
            mAnalyticsUtil.postHomePage(false, false, false);
            return;
        }
    }

    public void checkForPebbleApp()
    {
        LogUtil.d(TAG, "check for pebble connection", new Object[0]);
        if (pebbleManager.showPebbleAppDialog())
        {
            mActivityHelper.showOptionAlert(AlertType.PEBBLE_DETECTED_MESSAGE, null, new _cls2());
            mAnalyticsUtil.postPebbleDownloadPrompt();
        }
    }

    public void dismissProgressSpinner()
    {
        hideLoading();
    }

    public void displayEspanol(View view)
    {
        mActivityHelper.showAlert(AlertType.DISPLAY_ESPANOL);
    }

    public void displayPrivacy(View view)
    {
        startActivityForResult(new Intent(this, com/dominos/activities/PrivacyWebActivity), 0);
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
    }

    public void finishFragment(Fragment fragment)
    {
        if (fragment instanceof NoCachedAddressFragment)
        {
            finishNoCachedFragment = true;
        }
    }

    public int getIndexingResourceId()
    {
        return 0x7f090003;
    }

    void goToSettings()
    {
        if (App.isDebugMode())
        {
            startActivity(new Intent(this, com/dominos/activities/SettingsPreferenceActivity));
        }
    }

    public boolean handleHomeButtonClicked()
    {
        if (c.i())
        {
            SpeechContext.updateAgents(new String[] {
                GlobalAgent.NAME, "repeat"
            });
        }
        return true;
    }

    void onAfterInject()
    {
        controller = controllerLocator.getLandingScreenController(this);
        mBeaconManager = (BeaconManager)mMobileSession.getManager("beacon_manager");
        getSupportFragmentManager().a(new _cls1());
    }

    void onAfterViews()
    {
        refreshHeaderView();
        if (pebbleManager.isPebbleConnectedAndEnabled())
        {
            pebbleManager.openPebbleApp(getApplicationContext());
        }
        checkForPebbleApp();
    }

    public void onBackPressed()
    {
        if (getSupportFragmentManager().e() == 1)
        {
            instance = null;
            finish();
            return;
        }
        if (isCenterWindowInNewOrderMode())
        {
            App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.BackPressedOnLandingActivity());
            getSupportFragmentManager().b(com/dominos/fragments/landing/NoCachedAddressFragment.getSimpleName());
            updateLoyaltyDisplay();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        instance = (LandingActivity_)this;
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle = (ProfileUserFragment)getSupportFragmentManager().a(com/dominos/fragments/landing/ProfileUserFragment.getSimpleName());
            if (bundle != null)
            {
                bundle.setProfileActionListener(this);
            }
            bundle = (NoCachedAddressFragment)getSupportFragmentManager().a(com/dominos/fragments/landing/NoCachedAddressFragment.getSimpleName());
            if (bundle != null)
            {
                bundle.setOnServiceMethodListener(this);
            }
        }
    }

    public void onDeliveryButtonSelected()
    {
        if (isCenterWindowInNewOrderMode())
        {
            mAnalyticsUtil.postProfiledDeliveryClicked();
        } else
        {
            mAnalyticsUtil.postAnonymousDeliveryClicked();
        }
        onDeliverySelected();
    }

    public void onDeliverySelected()
    {
        if (mProfileManager.isSavedAddressExists())
        {
            SavedAddressActivity_.intent(this).start();
            return;
        } else
        {
            AddressTypeActivity_.intent(this).start();
            return;
        }
    }

    public void onDestroy()
    {
        LogUtil.d(TAG, "Activity destroy", new Object[0]);
        super.onDestroy();
    }

    public void onFinishLoyaltyInfoFragment()
    {
        updateLoyaltyDisplay();
    }

    public void onLoyaltyLearnMoreClick()
    {
        mAnalyticsUtil.postRewardsLearnMoreTap();
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
        LoyaltyInfoFragment.newInstance(LoyaltyInfoFragment.InfoType.ACTIVATE).show(getSupportFragmentManager(), LoyaltyInfoFragment.TAG);
    }

    protected void onNewIntent(Intent intent)
    {
        if (intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("com.dominos.intent.extra.NEW_ORDER"))
        {
            navigateToNoCachedAddressFragment();
        }
        super.onNewIntent(intent);
    }

    public void onNewOrder()
    {
        showNoCachedAddressFragment();
    }

    public void onPause()
    {
        LogUtil.d(TAG, "Activity Pause", new Object[0]);
        super.onPause();
        if (mBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mBusSubscriber);
        }
        hideLoading();
    }

    public void onPieImageRedeemButtonClick()
    {
        mAnalyticsUtil.postLandingPieImageRedeemClick();
        redeemClick();
    }

    protected void onPostResume()
    {
        LogUtil.d(TAG, "Activity PostResume", new Object[0]);
        super.onPostResume();
        refreshHeaderView();
        refreshFragment();
        updateLoyaltyDisplay();
        mBeaconManager.checkInProfiledCustomerIfPending(new _cls3());
    }

    public void onRedeemButtonClick()
    {
        mAnalyticsUtil.postLandingRedeemClick();
        redeemClick();
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        finishNoCachedFragment = bundle.getBoolean("FINISH_FRAGMENT");
    }

    public void onResume()
    {
        analyticsUpdate();
        LogUtil.d(TAG, "Activity Resume", new Object[0]);
        super.onResume();
        if (mBusSubscriber == null)
        {
            mBusSubscriber = new BusSubscriber(null);
        }
        App.getInstance().bus.register(mBusSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.LandingScreenTransition());
        if (mAppLinkManager.isProxyOnHMILevel(e.a))
        {
            mAppLinkManager.showLockScreen();
        }
    }

    public void onRetryButtonClick()
    {
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("FINISH_FRAGMENT", finishNoCachedFragment);
        super.onSaveInstanceState(bundle);
    }

    protected void onSessionTimedOut()
    {
        mActivityHelper.showAlert(AlertType.SESSION_TIMED_OUT, new _cls4());
    }

    public void onSignInClick()
    {
        mAnalyticsUtil.postRewardsSignInTap();
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
        LoyaltyInfoFragment.newInstance(LoyaltyInfoFragment.InfoType.REGISTER).show(getSupportFragmentManager(), LoyaltyInfoFragment.TAG);
    }

    protected void onStop()
    {
        LogUtil.d(TAG, "Activity stop", new Object[0]);
        super.onStop();
    }

    public void showErrorToast()
    {
        showShortToast(getString(0x7f080060));
    }

    public void showNetworkError()
    {
        mActivityHelper.showAlert(AlertType.SIGN_IN_FAILURE);
    }

    public void showNoCachedAddressFragment()
    {
        navigateToNoCachedAddressFragment();
    }

    public void showProfiledUserFragment()
    {
        initProfiledUser();
    }

    public void showProgressSpinner()
    {
        showLoading();
    }

    protected void updateLoyaltyDisplay()
    {
        if (!isOrientationLandscape())
        {
            mLoyaltySignBanner.setVisibility(8);
            mLoyaltyLearnMoreBanner.setVisibility(8);
            mLoyaltyMicroWidgetHolder.setVisibility(8);
            mLoyaltySuccessBanner.setVisibility(8);
            if (mLoyaltyManager.isLoyaltyAvailable() && !isCenterWindowInNewOrderMode())
            {
                if (mProfileManager.isAuthorizedUser())
                {
                    if (mLoyaltyManager.isCustomerEnrolledInLoyalty())
                    {
                        boolean flag = mLoyaltyManager.isNewLoyaltyMemberSingleUse();
                        mLoyaltyWidgetFragment = (LoyaltyWidgetFragment)getSupportFragmentManager().a(LoyaltyWidgetFragment.TAG);
                        if (mLoyaltyWidgetFragment == null)
                        {
                            mLoyaltyWidgetFragment = LoyaltyWidgetFragment.newInstance(com.dominos.fragments.LoyaltyWidgetFragment.LoyaltyWidgetType.NORMAL);
                            getSupportFragmentManager().a().b(0x7f0f00a9, mLoyaltyWidgetFragment, LoyaltyWidgetFragment.TAG).a();
                        }
                        mLoyaltyWidgetFragment.updateView();
                        if (flag)
                        {
                            mLoyaltySuccessBanner.setVisibility(0);
                            mLoyaltyMicroWidgetHolder.setVisibility(8);
                            return;
                        } else
                        {
                            mLoyaltySuccessBanner.setVisibility(8);
                            mLoyaltyMicroWidgetHolder.setVisibility(0);
                            return;
                        }
                    } else
                    {
                        mLoyaltyLearnMoreBanner.setVisibility(0);
                        return;
                    }
                } else
                {
                    mLoyaltySignBanner.setVisibility(0);
                    return;
                }
            }
        }
    }







/*
    static boolean access$502(LandingActivity landingactivity, boolean flag)
    {
        landingactivity.finishNoCachedFragment = flag;
        return flag;
    }

*/

    private class _cls2 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final LandingActivity this$0;

        public void onNegativeButtonClicked()
        {
            prefs.firstTimePebbleDetected().b(Boolean.valueOf(false));
            mAnalyticsUtil.postDownloadPebbleAppDecline();
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mAnalyticsUtil.postDownloadPebbleAppAccept();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("pebble://appstore/5425b1b2f8ab4100cb0000e1"));
            startActivity(intent);
        }

        _cls2()
        {
            this$0 = LandingActivity.this;
            super();
        }
    }


    private class _cls1
        implements w
    {

        final LandingActivity this$0;

        public void onBackStackChanged()
        {
            refreshHeaderView();
        }

        _cls1()
        {
            this$0 = LandingActivity.this;
            super();
        }
    }


    private class _cls3 extends com.dominos.beacon.manager.BeaconManager.BeaconCheckInCallback
    {

        final LandingActivity this$0;

        public void onCheckInFailed()
        {
            LogUtil.d(LandingActivity.TAG, "Profiled customer check in failed!", new Object[0]);
        }

        public void onCheckInSuccess()
        {
            mActivityHelper.showAlert(getString(0x7f080360), getString(0x7f08035f), null);
        }

        _cls3()
        {
            this$0 = LandingActivity.this;
            super();
        }
    }


    private class BusSubscriber
    {

        final LandingActivity this$0;

        public void SpeechAction(final com.dominos.bus.events.SpeechEvents.SpeechActionEvent actionEvent)
        {
            class _cls1
                implements Runnable
            {

                final BusSubscriber this$1;
                final com.dominos.bus.events.SpeechEvents.SpeechActionEvent val$actionEvent;

                public void run()
                {
                    _cls5..SwitchMap.com.dominos.bus.events.SpeechEvents.ActionType[actionEvent.getActionType().ordinal()];
                    JVM INSTR tableswitch 1 3: default 40
                //                               1 41
                //                               2 68
                //                               3 138;
                       goto _L1 _L2 _L3 _L4
_L1:
                    return;
_L2:
                    if (mProfileManager.isAuthorizedUser())
                    {
                        showNoCachedAddressFragment();
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    App.editor().putString("orderMode", "Carryout").commit();
                    mSpeechManager.preventNinaPause();
                    StoreListActivity_.intent(_fld0).start();
                    if (isCenterWindowInNewOrderMode())
                    {
                        finishNoCachedFragment = true;
                        return;
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                    App.editor().putString("orderMode", "Delivery").commit();
                    mSpeechManager.preventNinaPause();
                    onDeliverySelected();
                    if (isCenterWindowInNewOrderMode())
                    {
                        finishNoCachedFragment = true;
                        return;
                    }
                    if (true) goto _L1; else goto _L5
_L5:
                }

                _cls1()
                {
                    this$1 = BusSubscriber.this;
                    actionEvent = speechactionevent;
                    super();
                }

                private class _cls5
                {

                    static final int $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[];

                    static 
                    {
                        $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType = new int[com.dominos.bus.events.SpeechEvents.ActionType.values().length];
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.NEW_ORDER.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.CARRYOUT.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$dominos$bus$events$SpeechEvents$ActionType[com.dominos.bus.events.SpeechEvents.ActionType.DELIVERY.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

            }

            runOnUiThread(new _cls1());
        }

        private BusSubscriber()
        {
            this$0 = LandingActivity.this;
            super();
        }

        BusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls4 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final LandingActivity this$0;

        public void onAlertDismissed()
        {
            refreshFragment();
            updateLoyaltyDisplay();
        }

        _cls4()
        {
            this$0 = LandingActivity.this;
            super();
        }
    }

}
