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
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.google.android.gms.wallet.MaskedWallet;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            UserLoginActivity, BaseActivity

public final class UserLoginActivity_ extends UserLoginActivity
    implements a, b
{

    public static final String MASKED_WALLET_EXTRA = "maskedWallet";
    public static final String M_ENROLL_IN_LOYALTY_EXTRA = "mEnrollInLoyalty";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public UserLoginActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        prefs = new DominosPrefs_(this);
        c.a(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
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
            if (bundle.containsKey("mEnrollInLoyalty"))
            {
                mEnrollInLoyalty = bundle.getBoolean("mEnrollInLoyalty");
            }
            if (bundle.containsKey("maskedWallet"))
            {
                maskedWallet = (MaskedWallet)bundle.getParcelable("maskedWallet");
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

    public final void dismissDialog()
    {
        handler_.post(new _cls7());
    }

    public final void executeLogin(String s, String s1)
    {
        org.androidannotations.api.a.a(new _cls11("", s, s1));
    }

    public final void goToCart()
    {
        handler_.post(new _cls5());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls4());
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
        setContentView(0x7f0300be);
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
        mNewProfileNoteTextView = (TextView)a1.findViewById(0x7f0f041a);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f0410);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        setupFonts();
        onAfterViews();
    }

    public final void saveCustomerWithLoyalty()
    {
        org.androidannotations.api.a.a(new _cls12("", 0, ""));
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
        handler_.post(new _cls6());
    }

    public final void showLoginErrorToast()
    {
        handler_.post(new _cls8());
    }

    public final void showLoginFailedDialog()
    {
        handler_.post(new _cls10());
    }

    public final void startLandingActivity()
    {
        handler_.post(new _cls9());
    }











    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ mEnrollInLoyalty(boolean flag)
        {
            return (IntentBuilder_)super.extra("mEnrollInLoyalty", flag);
        }

        public IntentBuilder_ maskedWallet(MaskedWallet maskedwallet)
        {
            return (IntentBuilder_)super.extra("maskedWallet", maskedwallet);
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
            super(fragment.getActivity(), com/dominos/activities/UserLoginActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/UserLoginActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/UserLoginActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls7
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            dismissDialog();
        }

        _cls7()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls11 extends org.androidannotations.api.c
    {

        final UserLoginActivity_ this$0;
        final String val$email;
        final String val$password;

        public void execute()
        {
            try
            {
                executeLogin(email, password);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls11(String s1, String s2, String s3)
        {
            this$0 = UserLoginActivity_.this;
            email = s2;
            password = s3;
            super(final_s, final_i, s1);
        }
    }


    private class _cls5
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls5()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls4()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls3()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserLoginActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UserLoginActivity_ this$0;

        public void onClick(View view)
        {
            onRememberMeHelpButtonClick();
        }

        _cls2()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls12 extends org.androidannotations.api.c
    {

        final UserLoginActivity_ this$0;

        public void execute()
        {
            try
            {
                saveCustomerWithLoyalty();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls12(String s, int i, String s1)
        {
            this$0 = UserLoginActivity_.this;
            super(s, i, s1);
        }
    }


    private class _cls6
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls6()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            showLoginErrorToast();
        }

        _cls8()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            showLoginFailedDialog();
        }

        _cls10()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final UserLoginActivity_ this$0;

        public void run()
        {
            startLandingActivity();
        }

        _cls9()
        {
            this$0 = UserLoginActivity_.this;
            super();
        }
    }

}
