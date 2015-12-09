// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.DeviceCapabilities_;
import com.dominos.android.sdk.common.GoogleWalletUtil_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import com.dominos.android.sdk.core.tracker.TrackerManager_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.google.android.gms.wallet.MaskedWallet;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity, BaseActivity

public final class LabsCheckoutActivity_ extends LabsCheckoutActivity
    implements a, b
{

    public static final String ANONYMOUS_CARD_USED_EXTRA = "anonymousCardUsed";
    public static final String CARD_ID_EXTRA = "cardId";
    public static final String MASKED_WALLET_EXTRA = "maskedWallet";
    public static final String REORDER_PAYMENT_TYPE_EXTRA = "reorderPaymentType";
    public static final String USE_GOOGLE_WALLET_EXTRA = "useGoogleWallet";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LabsCheckoutActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        mPrefs = new DominosPrefs_(this);
        c.a(this);
        bundle = getResources();
        general_error = bundle.getString(0x7f080142);
        pleaseHaveCardAvailable = bundle.getString(0x7f080244);
        storeDoesntAcceptCard = bundle.getString(0x7f0802cd);
        inflater = (LayoutInflater)getSystemService("layout_inflater");
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mOrderUtil = OrderUtil_.getInstance_(this);
        mSrApi = ShopRunnerRestClient_.getInstance_(this);
        mGoogleWalletUtil = GoogleWalletUtil_.getInstance_(this);
        mDeviceCapabilities = DeviceCapabilities_.getInstance_(this);
        mTrackerManager = TrackerManager_.getInstance_(this);
        locator = ControllerLocator_.getInstance_(this);
        mConfigProvider = ConfigProvider_.getInstance_(this);
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
            if (bundle.containsKey("anonymousCardUsed"))
            {
                anonymousCardUsed = bundle.getBoolean("anonymousCardUsed");
            }
            if (bundle.containsKey("maskedWallet"))
            {
                maskedWallet = (MaskedWallet)bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("useGoogleWallet"))
            {
                useGoogleWallet = bundle.getBoolean("useGoogleWallet");
            }
            if (bundle.containsKey("cardId"))
            {
                cardId = bundle.getString("cardId");
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

    public final void displayMethodsOfPayment()
    {
        handler_.post(new _cls16());
    }

    public final void enrollCustomer()
    {
        org.androidannotations.api.a.a(new _cls25("", 0, ""));
    }

    public final void fetchUpdatedCustomerLoyalty(LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
    {
        org.androidannotations.api.a.a(new _cls24("", labsorder, placeordererrorcode));
    }

    public final void getNewShoprunnerToken(LabsOrder labsorder)
    {
        org.androidannotations.api.a.a(new _cls26(0, "", labsorder));
    }

    public final void goToCart()
    {
        handler_.post(new _cls5());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls7());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls8());
    }

    public final void initCheckout()
    {
        handler_.post(new _cls15());
    }

    public final void initSubHeader(final LabsOrder order)
    {
        handler_.post(new _cls23());
    }

    public final void onActivityResult(int i, int j, Intent intent1)
    {
        super.onActivityResult(i, j, intent1);
        switch (i)
        {
        default:
            return;

        case 22: // '\026'
            onRegisterRequestCode(j);
            return;

        case 23: // '\027'
            onEditedPersonalInfoOfOrder();
            return;

        case 61: // '='
            updateGiftCardButton();
            return;

        case 45: // '-'
            onCreditCardAdded(j, intent1);
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f030034);
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onOrderPlacementError(final LabsOrder order, final PlaceOrderErrorCode errorCode)
    {
        handler_.post(new _cls11());
    }

    public final void onOrderSuccess(final LabsOrder order, final PlaceOrderErrorCode errorCode)
    {
        handler_.post(new _cls18());
    }

    public final void onPlaceOrderRequestFail()
    {
        handler_.post(new _cls17());
    }

    public final void onViewChanged(a a1)
    {
        emailOptInLayout = (LinearLayout)a1.findViewById(0x7f0f01e9);
        createProfileSection = (LinearLayout)a1.findViewById(0x7f0f0148);
        easyOrderCheckBox = (CheckBox)a1.findViewById(0x7f0f0154);
        lblGiftCardAmount = (TextView)a1.findViewById(0x7f0f014e);
        easyOrderDividerLayout = (LinearLayout)a1.findViewById(0x7f0f0155);
        easyOrderSection = (LinearLayout)a1.findViewById(0x7f0f0150);
        lblBalanceDue = (TextView)a1.findViewById(0x7f0f0082);
        emailOptInCheckBox = (CheckBox)a1.findViewById(0x7f0f01ec);
        checkoutFormAddress = (TextView)a1.findViewById(0x7f0f0143);
        subHeader = (RelativeLayout)a1.findViewById(0x7f0f0080);
        mLoyaltyPointsEarnedMessage = (TextView)a1.findViewById(0x7f0f0144);
        termsTextView = (TextView)a1.findViewById(0x7f0f015d);
        orderTotalText = (TextView)a1.findViewById(0x7f0f0081);
        lblApplyGiftCardText = (TextView)a1.findViewById(0x7f0f014c);
        lblOrdertotal = (TextView)a1.findViewById(0x7f0f0142);
        mGiftCardSection = (LinearLayout)a1.findViewById(0x7f0f0149);
        paymentSection = (LinearLayout)a1.findViewById(0x7f0f014f);
        easyOrderNickNameLayout = (LinearLayout)a1.findViewById(0x7f0f0156);
        mLoyaltySuccessBanner = (TextView)a1.findViewById(0x7f0f0141);
        mLoginButtonFrame = (FrameLayout)a1.findViewById(0x7f0f0145);
        easyOrderNickNameBox = (EditText)a1.findViewById(0x7f0f0157);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        view = a1.findViewById(0x7f0f0153);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        a1 = a1.findViewById(0x7f0f015b);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls3());
        }
        if (easyOrderCheckBox != null)
        {
            easyOrderCheckBox.setOnClickListener(new _cls4());
        }
        setupFonts();
        initCheckout();
    }

    public final void proceedWithOrder()
    {
        handler_.post(new _cls22());
    }

    public final void restartActivity()
    {
        handler_.post(new _cls14());
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

    public final void setEasyOrderCheckbox(final boolean checked)
    {
        handler_.post(new _cls19());
    }

    public final void setIntent(Intent intent1)
    {
        super.setIntent(intent1);
        injectExtras_();
    }

    public final void showDialog(final String message)
    {
        handler_.post(new _cls20());
    }

    public final void showLoading()
    {
        handler_.post(new _cls6());
    }

    public final void showUserLoginDialog(final LabsOrder order)
    {
        handler_.post(new _cls10());
    }

    public final void showUserLoginDialogForEnrollment()
    {
        handler_.post(new _cls9());
    }

    public final void startPizzaTrackerActivity(final LabsOrder order, final PlaceOrderErrorCode errorCode)
    {
        handler_.post(new _cls21());
    }

    public final void updateLoyaltyViews()
    {
        handler_.post(new _cls13());
    }

    public final void verifyGiftCards()
    {
        handler_.post(new _cls12());
    }























    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ anonymousCardUsed(boolean flag)
        {
            return (IntentBuilder_)super.extra("anonymousCardUsed", flag);
        }

        public IntentBuilder_ cardId(String s)
        {
            return (IntentBuilder_)super.extra("cardId", s);
        }

        public IntentBuilder_ maskedWallet(MaskedWallet maskedwallet)
        {
            return (IntentBuilder_)super.extra("maskedWallet", maskedwallet);
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

        public IntentBuilder_ useGoogleWallet(boolean flag)
        {
            return (IntentBuilder_)super.extra("useGoogleWallet", flag);
        }

        public IntentBuilder_(Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/LabsCheckoutActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/LabsCheckoutActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/LabsCheckoutActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls16
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            displayMethodsOfPayment();
        }

        _cls16()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls25 extends org.androidannotations.api.c
    {

        final LabsCheckoutActivity_ this$0;

        public void execute()
        {
            try
            {
                enrollCustomer();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls25(String s, int i, String s1)
        {
            this$0 = LabsCheckoutActivity_.this;
            super(s, i, s1);
        }
    }


    private class _cls24 extends org.androidannotations.api.c
    {

        final LabsCheckoutActivity_ this$0;
        final PlaceOrderErrorCode val$errorCode;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                fetchUpdatedCustomerLoyalty(order, errorCode);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls24(String s1, LabsOrder labsorder, PlaceOrderErrorCode placeordererrorcode)
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            errorCode = placeordererrorcode;
            super(final_s, final_i, s1);
        }
    }


    private class _cls26 extends org.androidannotations.api.c
    {

        final LabsCheckoutActivity_ this$0;
        final LabsOrder val$order;

        public void execute()
        {
            try
            {
                getNewShoprunnerToken(order);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls26(int i, String s1, LabsOrder labsorder)
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            super(final_s, i, s1);
        }
    }


    private class _cls5
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls5()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls7()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls8()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls15
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            initCheckout();
        }

        _cls15()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls23
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final LabsOrder val$order;

        public void run()
        {
            initSubHeader(order);
        }

        _cls23()
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final PlaceOrderErrorCode val$errorCode;
        final LabsOrder val$order;

        public void run()
        {
            onOrderPlacementError(order, errorCode);
        }

        _cls11()
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            errorCode = placeordererrorcode;
            super();
        }
    }


    private class _cls18
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final PlaceOrderErrorCode val$errorCode;
        final LabsOrder val$order;

        public void run()
        {
            onOrderSuccess(order, errorCode);
        }

        _cls18()
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            errorCode = placeordererrorcode;
            super();
        }
    }


    private class _cls17
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            onPlaceOrderRequestFail();
        }

        _cls17()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity_ this$0;

        public void onClick(View view)
        {
            onEasyOrderHelpButtonClick();
        }

        _cls2()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity_ this$0;

        public void onClick(View view)
        {
            onPlaceOrderClick();
        }

        _cls3()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LabsCheckoutActivity_ this$0;

        public void onClick(View view)
        {
            easyOrderCheckBoxClicked(view);
        }

        _cls4()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls22
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            proceedWithOrder();
        }

        _cls22()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls14
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            restartActivity();
        }

        _cls14()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls19
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final boolean val$checked;

        public void run()
        {
            setEasyOrderCheckbox(checked);
        }

        _cls19()
        {
            this$0 = LabsCheckoutActivity_.this;
            checked = flag;
            super();
        }
    }


    private class _cls20
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final String val$message;

        public void run()
        {
            showDialog(message);
        }

        _cls20()
        {
            this$0 = LabsCheckoutActivity_.this;
            message = s;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls6()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final LabsOrder val$order;

        public void run()
        {
            showUserLoginDialog(order);
        }

        _cls10()
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            showUserLoginDialogForEnrollment();
        }

        _cls9()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls21
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;
        final PlaceOrderErrorCode val$errorCode;
        final LabsOrder val$order;

        public void run()
        {
            startPizzaTrackerActivity(order, errorCode);
        }

        _cls21()
        {
            this$0 = LabsCheckoutActivity_.this;
            order = labsorder;
            errorCode = placeordererrorcode;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            updateLoyaltyViews();
        }

        _cls13()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final LabsCheckoutActivity_ this$0;

        public void run()
        {
            verifyGiftCards();
        }

        _cls12()
        {
            this$0 = LabsCheckoutActivity_.this;
            super();
        }
    }

}
