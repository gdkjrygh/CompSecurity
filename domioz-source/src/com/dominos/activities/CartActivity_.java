// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.adapters.LabsOrderDetailsListAdapter_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.PriceOrderErrorCode;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.views.WarningView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            CartActivity, BaseActivity

public final class CartActivity_ extends CartActivity
    implements a, b
{

    public static final String AUTO_SHOW_NINA_EXTRA = "autoShowNina";
    public static final String REORDER_PAYMENT_TYPE_EXTRA = "reorderPaymentType";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public CartActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        mPrefs = new DominosPrefs_(this);
        c.a(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mOrderUtil = OrderUtil_.getInstance_(this);
        mSrApi = ShopRunnerRestClient_.getInstance_(this);
        mProductDetailAnalytics = AnalyticsUtil_.getInstance_(this);
        orderDetailsListAdapter = LabsOrderDetailsListAdapter_.getInstance_(this);
        injectExtras_();
        onBaseAfterInject();
        initialize();
        onAfterInject();
    }

    private void injectExtras_()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("reorderPaymentType"))
            {
                reorderPaymentType = bundle.getString("reorderPaymentType");
            }
            if (bundle.containsKey("autoShowNina"))
            {
                autoShowNina = bundle.getBoolean("autoShowNina");
            }
        }
    }

    public static IntentBuilder_ intent(Fragment fragment)
    {
        return new IntentBuilder_(fragment);
    }

    public static IntentBuilder_ intent(Context context)
    {
        return new IntentBuilder_(context);
    }

    public static IntentBuilder_ intent(android.support.v4.app.Fragment fragment)
    {
        return new IntentBuilder_(fragment);
    }

    public final void buildLoyaltyMicroWidget()
    {
        handler_.post(new _cls16());
    }

    public final void commonCheckoutClick()
    {
        handler_.post(new _cls9());
    }

    public final void displayUpSellAfterGoogleWallet()
    {
        handler_.post(new _cls23());
    }

    public final void enableCheckoutButton(final boolean enabled)
    {
        handler_.post(new _cls13());
    }

    public final void getCustomerLoyaltyInformation()
    {
        org.androidannotations.api.a.a(new _cls32("", 0, ""));
    }

    public final void goToCart()
    {
        handler_.post(new _cls6());
    }

    public final void goToCouponActivity()
    {
        handler_.post(new _cls14());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls7());
    }

    public final void handleCouponError(final PriceOrderErrorCode errorType, final LabsCouponLine couponLine)
    {
        handler_.post(new _cls30());
    }

    public final void handleCouponNeedCustomization(final LabsCouponLine couponLine)
    {
        handler_.post(new _cls24());
    }

    public final void handleOrderCreated(final LabsOrder order, final boolean canAutoCheckout)
    {
        handler_.post(new _cls10());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls5());
    }

    public final void hideSwipeToRefreshLayout()
    {
        handler_.post(new _cls31());
    }

    public final void navigateToCheckoutActivity()
    {
        handler_.post(new _cls17());
    }

    public final void navigateToLanding()
    {
        handler_.post(new _cls19());
    }

    public final void navigateToOrderSettings()
    {
        handler_.post(new _cls18());
    }

    public final void navigateToPizzaTracker()
    {
        handler_.post(new _cls11());
    }

    public final void navigateToProductDetails()
    {
        handler_.post(new _cls29());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f03001b);
    }

    public final void onGoogleWalletClick()
    {
        handler_.post(new _cls28());
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onViewChanged(a a1)
    {
        mCartSwipeRefreshLayout = (SwipeRefreshLayout)a1.findViewById(0x7f0f00ac);
        mTopWarningView = (WarningView)a1.findViewById(0x7f0f00aa);
        mEditButton = (RelativeLayout)a1.findViewById(0x7f0f00a1);
        mEditButtonSeparator = (ImageView)a1.findViewById(0x7f0f00a0);
        mEditButtonText = (TextView)a1.findViewById(0x7f0f00a2);
        mHeaderCheckoutButton = (RelativeLayout)a1.findViewById(0x7f0f00a6);
        mHeaderCheckoutButtonTextView = (TextView)a1.findViewById(0x7f0f00a8);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        if (mHeaderCheckoutButton != null)
        {
            mHeaderCheckoutButton.setOnClickListener(new _cls2());
        }
        view = a1.findViewById(0x7f0f00a5);
        if (view != null)
        {
            view.setOnClickListener(new _cls3());
        }
        a1 = a1.findViewById(0x7f0f00a4);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls4());
        }
        setupFonts();
        setupCartActivity();
    }

    public final void requestToRetry()
    {
        handler_.post(new _cls22());
    }

    public final void setContentView(int i)
    {
        super.setContentView(i);
        onViewChangedNotifier_.a(this);
    }

    public final void setContentView(View view)
    {
        super.setContentView(view);
        onViewChangedNotifier_.a(this);
    }

    public final void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        onViewChangedNotifier_.a(this);
    }

    public final void setIntent(Intent intent1)
    {
        super.setIntent(intent1);
        injectExtras_();
    }

    public final void showCheckoutConfirmation()
    {
        handler_.post(new _cls25());
    }

    public final void showDelayedLoadingDialog()
    {
        handler_.post(new _cls12());
    }

    public final void showEmptyCartAlert()
    {
        handler_.post(new _cls20());
    }

    public final void showGWUnavailableAlert()
    {
        handler_.post(new _cls21());
    }

    public final void showLoading()
    {
        handler_.post(new _cls8());
    }

    public final void showProductErrorAlert(final PriceOrderErrorCode errorType, final LabsProductLine productLine)
    {
        handler_.post(new _cls27());
    }

    public final void showProductReplacedAlert(final String productCode)
    {
        handler_.post(new _cls26());
    }

    public final void updateLoyaltyWidgetFragment()
    {
        handler_.post(new _cls15());
    }





























    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ autoShowNina(boolean flag)
        {
            return (IntentBuilder_)super.extra("autoShowNina", flag);
        }

        public IntentBuilder_ reorderPaymentType(String s)
        {
            return (IntentBuilder_)super.extra("reorderPaymentType", s);
        }

        public void startForResult(int i)
        {
            if (fragmentSupport_ != null)
            {
                fragmentSupport_.startActivityForResult(intent, i);
                return;
            }
            if (fragment_ != null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    fragment_.startActivityForResult(intent, i, lastOptions);
                    return;
                } else
                {
                    fragment_.startActivityForResult(intent, i);
                    return;
                }
            }
            if (context instanceof Activity)
            {
                android.support.v4.app.a.a((Activity)context, intent, i, lastOptions);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                context.startActivity(intent, lastOptions);
                return;
            } else
            {
                context.startActivity(intent);
                return;
            }
        }

        public IntentBuilder_(Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/CartActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/CartActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/CartActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls16
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            buildLoyaltyMicroWidget();
        }

        _cls16()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            commonCheckoutClick();
        }

        _cls9()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls23
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            displayUpSellAfterGoogleWallet();
        }

        _cls23()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final CartActivity_ this$0;
        final boolean val$enabled;

        public void run()
        {
            enableCheckoutButton(enabled);
        }

        _cls13()
        {
            this$0 = CartActivity_.this;
            enabled = flag;
            super();
        }
    }


    private class _cls32 extends org.androidannotations.api.c
    {

        final CartActivity_ this$0;

        public void execute()
        {
            try
            {
                getCustomerLoyaltyInformation();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls32(String s, int i, String s1)
        {
            this$0 = CartActivity_.this;
            super(s, i, s1);
        }
    }


    private class _cls6
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls6()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls14
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            goToCouponActivity();
        }

        _cls14()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls7()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls30
        implements Runnable
    {

        final CartActivity_ this$0;
        final LabsCouponLine val$couponLine;
        final PriceOrderErrorCode val$errorType;

        public void run()
        {
            handleCouponError(errorType, couponLine);
        }

        _cls30()
        {
            this$0 = CartActivity_.this;
            errorType = priceordererrorcode;
            couponLine = labscouponline;
            super();
        }
    }


    private class _cls24
        implements Runnable
    {

        final CartActivity_ this$0;
        final LabsCouponLine val$couponLine;

        public void run()
        {
            handleCouponNeedCustomization(couponLine);
        }

        _cls24()
        {
            this$0 = CartActivity_.this;
            couponLine = labscouponline;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final CartActivity_ this$0;
        final boolean val$canAutoCheckout;
        final LabsOrder val$order;

        public void run()
        {
            handleOrderCreated(order, canAutoCheckout);
        }

        _cls10()
        {
            this$0 = CartActivity_.this;
            order = labsorder;
            canAutoCheckout = flag;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls5()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls31
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            hideSwipeToRefreshLayout();
        }

        _cls31()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls17
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            navigateToCheckoutActivity();
        }

        _cls17()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls19
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            navigateToLanding();
        }

        _cls19()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls18
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            navigateToOrderSettings();
        }

        _cls18()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            navigateToPizzaTracker();
        }

        _cls11()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls29
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            navigateToProductDetails();
        }

        _cls29()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls28
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            onGoogleWalletClick();
        }

        _cls28()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CartActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CartActivity_ this$0;

        public void onClick(View view)
        {
            uiCheckoutClicked();
        }

        _cls2()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final CartActivity_ this$0;

        public void onClick(View view)
        {
            onCouponsClick();
        }

        _cls3()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final CartActivity_ this$0;

        public void onClick(View view)
        {
            onProductsClick();
        }

        _cls4()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls22
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            requestToRetry();
        }

        _cls22()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls25
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            showCheckoutConfirmation();
        }

        _cls25()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            showDelayedLoadingDialog();
        }

        _cls12()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls20
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            showEmptyCartAlert();
        }

        _cls20()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls21
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            showGWUnavailableAlert();
        }

        _cls21()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls8()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }


    private class _cls27
        implements Runnable
    {

        final CartActivity_ this$0;
        final PriceOrderErrorCode val$errorType;
        final LabsProductLine val$productLine;

        public void run()
        {
            showProductErrorAlert(errorType, productLine);
        }

        _cls27()
        {
            this$0 = CartActivity_.this;
            errorType = priceordererrorcode;
            productLine = labsproductline;
            super();
        }
    }


    private class _cls26
        implements Runnable
    {

        final CartActivity_ this$0;
        final String val$productCode;

        public void run()
        {
            showProductReplacedAlert(productCode);
        }

        _cls26()
        {
            this$0 = CartActivity_.this;
            productCode = s;
            super();
        }
    }


    private class _cls15
        implements Runnable
    {

        final CartActivity_ this$0;

        public void run()
        {
            updateLoyaltyWidgetFragment();
        }

        _cls15()
        {
            this$0 = CartActivity_.this;
            super();
        }
    }

}
