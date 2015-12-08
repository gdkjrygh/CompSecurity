// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.ConnectionUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.core.user.UserProfileManager_;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.fragments.AlertFragment;
import com.dominos.fragments.AlertFragment_;
import com.dominos.news.manager.PushManager;
import com.dominos.nina.dialog.agent.CartConfirmAgent;
import com.dominos.nina.dialog.agent.ProductsAgent;
import com.dominos.nina.dialog.agent.UserIntentionAgent;
import com.dominos.nina.speech.SpeechContext;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.utils.CommandBuilder;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.activities:
//            CartActivity_, LabsCouponWizardActivity_, PizzaTrackerPhoneNumberActivity_

public abstract class BaseActivity extends FragmentActivity
    implements com.dominos.fragments.AlertFragment.OnAlertDismissListener
{

    private static final String NETWORK_DIALOG_TAG = "networkAlertDialog";
    private static final String TAG = com/dominos/activities/BaseActivity.getSimpleName();
    protected ActivityHelper mActivityHelper;
    private boolean mActivityOnTop;
    private boolean mActivityValid;
    protected AnalyticsUtil mAnalyticsUtil;
    private BaseBusSubscriber mBaseBusSubscriber;
    private String mCampaignId;
    protected CartManager mCartManager;
    protected ConfigurationManager mConfigurationManager;
    protected ConnectionUtil mConnectionUtil;
    protected CouponWizardManager mCouponWizardManager;
    protected FacebookAnalyticsProcessor mFBAnalyticsProcessor;
    protected LoyaltyManager mLoyaltyManager;
    protected MenuManager mMenuManager;
    protected MobileSession mMobileSession;
    protected DomProductManager mNinaHelper;
    private FrameLayout mNinaPaddingView;
    protected OrderManager mOrderManager;
    protected PowerRestClient mPowerService;
    protected UserProfileManager mProfileManager;
    private ProgressDialog mProgressDialog;
    protected PushManager mPushManager;
    private Runnable mSessionRunnable;
    protected SpeechManager mSpeechManager;
    protected StoreManager mStoreManager;
    protected UserAuthorization userAuth;

    public BaseActivity()
    {
        mActivityValid = true;
    }

    private void showNoNetworkDialog()
    {
        AlertFragment alertfragment = (AlertFragment)getSupportFragmentManager().a("networkAlertDialog");
        if (alertfragment != null)
        {
            getSupportFragmentManager().a().a(alertfragment).b();
        }
        AlertFragment_.builder().title(getString(0x7f08039a)).message(getString(0x7f080399)).build().show(getSupportFragmentManager(), "networkAlertDialog");
    }

    public void blockOrientation()
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            setRequestedOrientation(6);
            return;
        } else
        {
            setRequestedOrientation(7);
            return;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        mProfileManager.startSessionTimer(mSessionRunnable);
        return super.dispatchTouchEvent(motionevent);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x10a0002, 0x10a0003);
    }

    public void finishFragment(Fragment fragment)
    {
    }

    protected View getNinaPaddingView()
    {
        if (mNinaPaddingView == null)
        {
            mNinaPaddingView = (FrameLayout)getLayoutInflater().inflate(0x7f03008c, null);
        }
        return mNinaPaddingView;
    }

    protected void goToCart()
    {
        mAnalyticsUtil.postGoToCart();
        mOrderManager.getOrder().clearPrices();
        CartConfirmAgent.delayNextFocus((new CommandBuilder()).appendReset(ProductsAgent.NAME).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "cart").build());
        mSpeechManager.preventNinaPause();
        ((CartActivity_.IntentBuilder_)CartActivity_.intent(this).flags(0x4000000)).start();
    }

    protected void goToCouponWizard()
    {
        mNinaHelper.clearPartialProductsResetProductController();
        if (c.i())
        {
            SpeechContext.updateAgents((new CommandBuilder()).appendReset(ProductsAgent.NAME).appendReset("OrderAgency").appendValue(UserIntentionAgent.NAME, "coupon_wizard").build());
        }
        mSpeechManager.preventNinaPause();
        ((LabsCouponWizardActivity_.IntentBuilder_)LabsCouponWizardActivity_.intent(this).flags(0x4000000)).start();
    }

    public void goTracker(View view)
    {
        PizzaTrackerPhoneNumberActivity_.intent(this).start();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
    }

    public boolean handleHomeButtonClicked()
    {
        return false;
    }

    protected void hideLoading()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.hide();
        }
        unblockOrientation();
    }

    protected void initialize()
    {
        mProfileManager = UserProfileManager_.getInstance_(this);
        if (mProfileManager.isSessionTimedOut())
        {
            mProfileManager.clearCurrentUser();
        }
        mProfileManager.updateLastAccessedTime();
        mSessionRunnable = new _cls1();
    }

    public boolean isActivityOnTop()
    {
        return mActivityOnTop;
    }

    protected boolean isActivityValid()
    {
        while (android.os.Build.VERSION.SDK_INT >= 17 && isDestroyed() || !mActivityValid || isFinishing()) 
        {
            return false;
        }
        return true;
    }

    public boolean isOrientationLandscape()
    {
        return getResources().getConfiguration().orientation == 2;
    }

    public void onAlertDismiss()
    {
    }

    public transient void onBackPressed(String as[])
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.UpdateServerState(as));
        super.onBackPressed();
    }

    public void onBaseAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        mNinaHelper = (DomProductManager)mMobileSession.getManager("dom_product_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
        mCouponWizardManager = (CouponWizardManager)mMobileSession.getManager("coupon_wizard_manager");
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
        mCartManager = (CartManager)mMobileSession.getManager("cart_manager");
        mPushManager = (PushManager)mMobileSession.getManager("push_manager");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        initialize();
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.CreateEvent(this));
        if (StringHelper.isNotEmpty(getIntent().getStringExtra("push_campaign")))
        {
            mCampaignId = getIntent().getStringExtra("push_campaign");
        }
    }

    public void onDestroy()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.DestroyEvent(this));
        if (mProgressDialog != null)
        {
            mProgressDialog.dismiss();
        }
        mProfileManager.getSessionHandler().removeCallbacks(mSessionRunnable);
        mActivityValid = false;
        super.onDestroy();
    }

    public void onHomeButtonClick()
    {
        if (!handleHomeButtonClicked())
        {
            goToCart();
        }
    }

    protected void onPause()
    {
        mActivityOnTop = false;
        if (mBaseBusSubscriber != null)
        {
            App.getInstance().bus.unregister(mBaseBusSubscriber);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.PauseEvent(this));
        mProfileManager.getSessionHandler().removeCallbacks(mSessionRunnable);
        super.onPause();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        if (!mConnectionUtil.isNetworkAvailable())
        {
            showNoNetworkDialog();
        }
        if (StringHelper.isNotEmpty(mCampaignId))
        {
            mAnalyticsUtil.postPushNotificationCampaignReceived(mCampaignId);
            mCampaignId = "";
        }
    }

    protected void onRestart()
    {
        super.onRestart();
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.RestartEvent(this));
    }

    protected void onResume()
    {
        super.onResume();
        mActivityOnTop = true;
        if (mBaseBusSubscriber == null)
        {
            mBaseBusSubscriber = new BaseBusSubscriber(null);
        }
        App.getInstance().bus.register(mBaseBusSubscriber);
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent(this));
        int i;
        if (c.i())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setNinaPaddingVisibility(i);
        mProfileManager.startSessionTimer(mSessionRunnable);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        mActivityOnTop = false;
        super.onSaveInstanceState(bundle);
    }

    protected void onSessionTimedOut()
    {
    }

    protected void onUserLeaveHint()
    {
        super.onUserLeaveHint();
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.UserLeftEvent(this));
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        FontManager.applyDominosFont(this);
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.SetContentEvent(this));
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.SetContentEvent(this));
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        App.getInstance().bus.post(new com.dominos.bus.events.ActivityLifecycleEvents.SetContentEvent(this));
    }

    protected void setNinaPaddingVisibility(int i)
    {
        if (mNinaPaddingView == null)
        {
            return;
        } else
        {
            mNinaPaddingView.findViewById(0x7f0f0331).setVisibility(i);
            return;
        }
    }

    protected void setTitle(String s)
    {
        ((TextView)findViewById(0x7f0f0100)).setText(s);
    }

    public void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

    protected void showLoading()
    {
        if (isFinishing())
        {
            LogUtil.d(TAG, "Unable to show loading. Activity is finished/finishing", new Object[0]);
            return;
        }
        blockOrientation();
        if (mProgressDialog == null)
        {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
        mProgressDialog.setContentView(0x7f030032);
    }

    protected void showLongToast(String s)
    {
        mActivityHelper.showToast(s, 1);
    }

    protected void showShortToast(String s)
    {
        mActivityHelper.showToast(s, 0);
    }

    public void startActivity(Intent intent)
    {
        mSpeechManager.preventNinaPause();
        super.startActivity(intent);
        overridePendingTransition(0x7f040012, 0x7f040013);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        mSpeechManager.preventNinaPause();
        super.startActivityForResult(intent, i);
        overridePendingTransition(0x7f040012, 0x7f040013);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle)
    {
        mSpeechManager.preventNinaPause();
        super.startActivityForResult(intent, i, bundle);
        overridePendingTransition(0x7f040012, 0x7f040013);
    }

    public void unblockOrientation()
    {
        setRequestedOrientation(4);
    }


    private class _cls1
        implements Runnable
    {

        final BaseActivity this$0;

        public void run()
        {
            mOrderManager.getOrder().clearPersonalInfo();
            mProfileManager.clearCurrentUser();
            onSessionTimedOut();
        }

        _cls1()
        {
            this$0 = BaseActivity.this;
            super();
        }
    }


    private class BaseBusSubscriber
    {

        final BaseActivity this$0;

        public void onHideSpeechBar(com.dominos.bus.events.SpeechEvents.HideSpeechBarEvent hidespeechbarevent)
        {
            class _cls2
                implements Runnable
            {

                final BaseBusSubscriber this$1;

                public void run()
                {
                    setNinaPaddingVisibility(8);
                    mSpeechManager.isNinaBusy = false;
                    mSpeechManager.enableDisableActivityViews(true, _fld0);
                }

                _cls2()
                {
                    this$1 = BaseBusSubscriber.this;
                    super();
                }
            }

            runOnUiThread(new _cls2());
        }

        public void onHomeClickRequested(com.dominos.bus.events.OriginatedFromSpeech.HomeClickRequested homeclickrequested)
        {
            mSpeechManager.preventNinaPause();
            onHomeButtonClick();
        }

        public void onRedemptionRequested(com.dominos.bus.events.OriginatedFromSpeech.LoyaltyRedeem loyaltyredeem)
        {
            if (!mLoyaltyManager.isLoyaltyAvailable() || !mLoyaltyManager.isCustomerEnrolledInLoyalty())
            {
                loyaltyredeem = (new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).build();
                mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, loyaltyredeem);
            }
        }

        public void onShowSpeechBar(com.dominos.bus.events.SpeechEvents.ShowSpeechBarEvent showspeechbarevent)
        {
            class _cls1
                implements Runnable
            {

                final BaseBusSubscriber this$1;

                public void run()
                {
                    setNinaPaddingVisibility(0);
                    mAnalyticsUtil.postTrackVoiceActive();
                }

                _cls1()
                {
                    this$1 = BaseBusSubscriber.this;
                    super();
                }
            }

            runOnUiThread(new _cls1());
        }

        private BaseBusSubscriber()
        {
            this$0 = BaseActivity.this;
            super();
        }

        BaseBusSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

}
