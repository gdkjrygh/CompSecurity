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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.adapters.LabsCouponWizardListAdapter_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            LabsCouponWizardActivity, BaseActivity

public final class LabsCouponWizardActivity_ extends LabsCouponWizardActivity
    implements a, b
{

    public static final String AVOID_COUPON_AUTO_FULFILL_EXTRA = "avoidCouponAutoFulfill";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LabsCouponWizardActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        bundle = getResources();
        mCouponWizardTitleText = bundle.getString(0x7f0800df);
        mLoyaltyHeader = bundle.getString(0x7f080281);
        mCouponSelectProductsText = bundle.getString(0x7f0800de);
        inflater = (LayoutInflater)getSystemService("layout_inflater");
        mMobileSession = MobileSession_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mControllerLocator = ControllerLocator_.getInstance_(this);
        wizAdapter = LabsCouponWizardListAdapter_.getInstance_(this);
        injectExtras_();
        onBaseAfterInject();
        initialize();
        onAfterInject();
    }

    private void injectExtras_()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("avoidCouponAutoFulfill"))
        {
            avoidCouponAutoFulfill = bundle.getBoolean("avoidCouponAutoFulfill");
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

    public final void goToCart()
    {
        handler_.post(new _cls6());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls7());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls9());
    }

    public final void onAddAnotherItemClick()
    {
        handler_.post(new _cls13());
    }

    public final void onAddAnotherItemRequested(com.dominos.bus.events.OriginatedFromSpeech.CouponAddAnotherItemRequested couponaddanotheritemrequested)
    {
        onAddAnotherItemRequested(couponaddanotheritemrequested);
    }

    public final void onCouponDone(com.dominos.bus.events.OriginatedFromSpeech.CouponDone coupondone)
    {
        onCouponDone(coupondone);
    }

    public final void onCouponFulfilled()
    {
        handler_.post(new _cls11());
    }

    public final void onCouponRemoved()
    {
        handler_.post(new _cls12());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f030051);
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onProductReplaced(com.dominos.bus.events.OriginatedFromSpeech.ShowProductReplaced showproductreplaced)
    {
        onProductReplaced(showproductreplaced);
    }

    public final void onViewChanged(a a1)
    {
        mCpnName = (TextView)a1.findViewById(0x7f0f01cc);
        editButton = (RelativeLayout)a1.findViewById(0x7f0f01d3);
        deleteButton = (ImageView)a1.findViewById(0x7f0f01d6);
        mCouponLinePriceTextView = (TextView)a1.findViewById(0x7f0f01cd);
        editButtonText = (TextView)a1.findViewById(0x7f0f01d4);
        mBigProductImageView = (ImageView)a1.findViewById(0x7f0f0287);
        mCouponLineDesctiptionTextView = (TextView)a1.findViewById(0x7f0f01d8);
        mTitleTextView = (TextView)a1.findViewById(0x7f0f000f);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        if (deleteButton != null)
        {
            deleteButton.setOnClickListener(new _cls2());
        }
        view = a1.findViewById(0x7f0f01d1);
        if (view != null)
        {
            view.setOnClickListener(new _cls3());
        }
        if (editButton != null)
        {
            editButton.setOnClickListener(new _cls4());
        }
        a1 = a1.findViewById(0x7f0f0437);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls5());
        }
        setupFonts();
        doTheSetup();
    }

    public final void onVoiceRemove(com.dominos.bus.events.OriginatedFromSpeech.CouponRemoved couponremoved)
    {
        onVoiceRemove(couponremoved);
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

    public final void showLoading()
    {
        handler_.post(new _cls8());
    }

    public final void showProductReplacedAlert(final String productCode)
    {
        handler_.post(new _cls10());
    }













    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ avoidCouponAutoFulfill(boolean flag)
        {
            return (IntentBuilder_)super.extra("avoidCouponAutoFulfill", flag);
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
            super(fragment.getActivity(), com/dominos/activities/LabsCouponWizardActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/LabsCouponWizardActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/LabsCouponWizardActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls6
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls6()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls7()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls9()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            onAddAnotherItemClick();
        }

        _cls13()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            onCouponFulfilled();
        }

        _cls11()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            onCouponRemoved();
        }

        _cls12()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity_ this$0;

        public void onClick(View view)
        {
            onCouponRemoveClick();
        }

        _cls2()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity_ this$0;

        public void onClick(View view)
        {
            onCouponRemoveClick();
        }

        _cls3()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity_ this$0;

        public void onClick(View view)
        {
            onCouponEditClick();
        }

        _cls4()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final LabsCouponWizardActivity_ this$0;

        public void onClick(View view)
        {
            doneWithCoupon();
        }

        _cls5()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls8()
        {
            this$0 = LabsCouponWizardActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final LabsCouponWizardActivity_ this$0;
        final String val$productCode;

        public void run()
        {
            showProductReplacedAlert(productCode);
        }

        _cls10()
        {
            this$0 = LabsCouponWizardActivity_.this;
            productCode = s;
            super();
        }
    }

}
