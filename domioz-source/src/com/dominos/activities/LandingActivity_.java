// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.user.UserService_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.fordsync.service.AppLinkManager_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.pebble.PebbleManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            LandingActivity, BaseActivity

public final class LandingActivity_ extends LandingActivity
    implements a, b
{

    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LandingActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        prefs = new DominosPrefs_(this);
        c.a(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        user = UserService_.getInstance_(this);
        controllerLocator = ControllerLocator_.getInstance_(this);
        mAppLinkManager = AppLinkManager_.getInstance_(this);
        pebbleManager = PebbleManager_.getInstance_(this);
        onBaseAfterInject();
        initialize();
        onAfterInject();
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

    public final void checkForPebbleApp()
    {
        handler_.postDelayed(new _cls16(), 5000L);
    }

    public final void dismissProgressSpinner()
    {
        handler_.post(new _cls15());
    }

    public final void goToCart()
    {
        handler_.post(new _cls5());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls8());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls6());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f030079);
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onSessionTimedOut()
    {
        handler_.post(new _cls10());
    }

    public final void onViewChanged(a a1)
    {
        mLoyaltySuccessBanner = (LinearLayout)a1.findViewById(0x7f0f0314);
        mLoyaltyLearnMoreBanner = (LinearLayout)a1.findViewById(0x7f0f0316);
        titleText = (TextView)a1.findViewById(0x7f0f0100);
        welcomeHeader = (LinearLayout)a1.findViewById(0x7f0f0311);
        mLoyaltySignBanner = (LinearLayout)a1.findViewById(0x7f0f0315);
        landingContainer = (RelativeLayout)a1.findViewById(0x7f0f030f);
        mLoyaltyMicroWidgetHolder = (LinearLayout)a1.findViewById(0x7f0f00a9);
        fragmentWindow = (LinearLayout)a1.findViewById(0x7f0f0317);
        newOrderHeader = (LinearLayout)a1.findViewById(0x7f0f0312);
        placeHolderNinaInvokeButton = a1.findViewById(0x7f0f02e8);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        if (mLoyaltyLearnMoreBanner != null)
        {
            mLoyaltyLearnMoreBanner.setOnClickListener(new _cls2());
        }
        if (mLoyaltySignBanner != null)
        {
            mLoyaltySignBanner.setOnClickListener(new _cls3());
        }
        a1 = a1.findViewById(0x7f0f02e7);
        if (a1 != null)
        {
            a1.setOnLongClickListener(new _cls4());
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

    public final void showErrorToast()
    {
        handler_.post(new _cls17());
    }

    public final void showLoading()
    {
        handler_.post(new _cls7());
    }

    public final void showNetworkError()
    {
        handler_.post(new _cls14());
    }

    public final void showNoCachedAddressFragment()
    {
        handler_.post(new _cls9());
    }

    public final void showProfiledUserFragment()
    {
        handler_.post(new _cls11());
    }

    public final void showProgressSpinner()
    {
        handler_.post(new _cls12());
    }

    public final void updateLoyaltyDisplay()
    {
        handler_.post(new _cls13());
    }














    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

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
            super(fragment.getActivity(), com/dominos/activities/LandingActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/LandingActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/LandingActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls16
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            checkForPebbleApp();
        }

        _cls16()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls15
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            dismissProgressSpinner();
        }

        _cls15()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls5()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls8()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls6()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            onSessionTimedOut();
        }

        _cls10()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LandingActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LandingActivity_ this$0;

        public void onClick(View view)
        {
            onLoyaltyLearnMoreClick();
        }

        _cls2()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LandingActivity_ this$0;

        public void onClick(View view)
        {
            onSignInClick();
        }

        _cls3()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnLongClickListener
    {

        final LandingActivity_ this$0;

        public boolean onLongClick(View view)
        {
            goToSettings();
            return true;
        }

        _cls4()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls17
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showErrorToast();
        }

        _cls17()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls7()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls14
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showNetworkError();
        }

        _cls14()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showNoCachedAddressFragment();
        }

        _cls9()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showProfiledUserFragment();
        }

        _cls11()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            showProgressSpinner();
        }

        _cls12()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final LandingActivity_ this$0;

        public void run()
        {
            updateLoyaltyDisplay();
        }

        _cls13()
        {
            this$0 = LandingActivity_.this;
            super();
        }
    }

}
