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
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.feedback.FeedbackQuestions;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.loader.ApplicationLoader_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.samsungtv.SamsungTVManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.utils.ResUtils_;
import com.dominos.views.FeedbackDrawerView;
import com.dominos.views.TrackerOrderDetailsView;
import com.dominos.views.TrackerStatusView;
import com.dominos.views.TrackerStoreAddressView;
import com.dominos.views.TrackerTopBarView;
import java.util.List;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            TrackerActivity, BaseActivity

public final class TrackerActivity_ extends TrackerActivity
    implements a, b
{

    public static final String M_ERROR_CODE_EXTRA = "mErrorCode";
    public static final String M_FROM_CHECKOUT_EXTRA = "mFromCheckout";
    public static final String M_ORDER_ID_EXTRA = "mOrderId";
    public static final String M_ORDER_STATUS_EXTRA = "mOrderStatus";
    public static final String M_PHONE_EXTRA = "mPhone";
    public static final String M_SERVICE_METHOD_EXTRA = "mServiceMethod";
    public static final String M_STORE_PROFILE_EXTRA = "mStoreProfile";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public TrackerActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        mDominosPrefs = new DominosPrefs_(this);
        c.a(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mSamsungTVManager = SamsungTVManager_.getInstance_(this);
        resUtils = ResUtils_.getInstance_(this);
        mApplicationLoader = ApplicationLoader_.getInstance_(this);
        injectExtras_();
        initialize();
        onBaseAfterInject();
        onAfterInject();
    }

    private void injectExtras_()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("mServiceMethod"))
            {
                mServiceMethod = bundle.getString("mServiceMethod");
            }
            if (bundle.containsKey("mStoreProfile"))
            {
                mStoreProfile = (StoreProfile)bundle.getParcelable("mStoreProfile");
            }
            if (bundle.containsKey("mErrorCode"))
            {
                mErrorCode = (PlaceOrderErrorCode)bundle.getSerializable("mErrorCode");
            }
            if (bundle.containsKey("mFromCheckout"))
            {
                mFromCheckout = bundle.getBoolean("mFromCheckout");
            }
            if (bundle.containsKey("mOrderId"))
            {
                mOrderId = bundle.getString("mOrderId");
            }
            if (bundle.containsKey("mPhone"))
            {
                mPhone = bundle.getString("mPhone");
            }
            if (bundle.containsKey("mOrderStatus"))
            {
                mOrderStatus = (TrackerOrderStatus)bundle.getParcelable("mOrderStatus");
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

    public final void goToCart()
    {
        handler_.post(new _cls2());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls4());
    }

    public final void handleDevicesFound(final List deviceList)
    {
        handler_.post(new _cls6());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls3());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f030029);
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
        mLoyaltyBanner = (LinearLayout)a1.findViewById(0x7f0f00f4);
        mLoyaltyBannerText = (TextView)a1.findViewById(0x7f0f00f5);
        mTrackerStatusView = (TrackerStatusView)a1.findViewById(0x7f0f00f6);
        mOrderDetailView = (TrackerOrderDetailsView)a1.findViewById(0x7f0f00fd);
        mStoreAddressView = (TrackerStoreAddressView)a1.findViewById(0x7f0f00f8);
        mOrderDetailContainer = (LinearLayout)a1.findViewById(0x7f0f00fc);
        mLoyaltyWidgetHolder = (FrameLayout)a1.findViewById(0x7f0f00f7);
        mTopBarView = (TrackerTopBarView)a1.findViewById(0x7f0f00f3);
        mFeedbackDrawerView = (FeedbackDrawerView)a1.findViewById(0x7f0f00fe);
        a1 = a1.findViewById(0x7f0f007f);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        setupFonts();
        onAfterViews();
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
        handler_.post(new _cls5());
    }

    public final void showTrackerNotAvailableDialog()
    {
        handler_.post(new _cls7());
    }

    public final void updateFeedbackData(final FeedbackQuestions feedbackQuestions)
    {
        handler_.post(new _cls8());
    }








    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ mErrorCode(PlaceOrderErrorCode placeordererrorcode)
        {
            return (IntentBuilder_)super.extra("mErrorCode", placeordererrorcode);
        }

        public IntentBuilder_ mFromCheckout(boolean flag)
        {
            return (IntentBuilder_)super.extra("mFromCheckout", flag);
        }

        public IntentBuilder_ mOrderId(String s)
        {
            return (IntentBuilder_)super.extra("mOrderId", s);
        }

        public IntentBuilder_ mOrderStatus(TrackerOrderStatus trackerorderstatus)
        {
            return (IntentBuilder_)super.extra("mOrderStatus", trackerorderstatus);
        }

        public IntentBuilder_ mPhone(String s)
        {
            return (IntentBuilder_)super.extra("mPhone", s);
        }

        public IntentBuilder_ mServiceMethod(String s)
        {
            return (IntentBuilder_)super.extra("mServiceMethod", s);
        }

        public IntentBuilder_ mStoreProfile(StoreProfile storeprofile)
        {
            return (IntentBuilder_)super.extra("mStoreProfile", storeprofile);
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
            super(fragment.getActivity(), com/dominos/activities/TrackerActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/TrackerActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/TrackerActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls2
        implements Runnable
    {

        final TrackerActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls2()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final TrackerActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls4()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final TrackerActivity_ this$0;
        final List val$deviceList;

        public void run()
        {
            handleDevicesFound(deviceList);
        }

        _cls6()
        {
            this$0 = TrackerActivity_.this;
            deviceList = list;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final TrackerActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls3()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackerActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final TrackerActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls5()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final TrackerActivity_ this$0;

        public void run()
        {
            showTrackerNotAvailableDialog();
        }

        _cls7()
        {
            this$0 = TrackerActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final TrackerActivity_ this$0;
        final FeedbackQuestions val$feedbackQuestions;

        public void run()
        {
            updateFeedbackData(feedbackQuestions);
        }

        _cls8()
        {
            this$0 = TrackerActivity_.this;
            feedbackQuestions = feedbackquestions;
            super();
        }
    }

}
