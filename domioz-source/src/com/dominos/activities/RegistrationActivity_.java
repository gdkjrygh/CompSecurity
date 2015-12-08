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
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            RegistrationActivity, BaseActivity

public final class RegistrationActivity_ extends RegistrationActivity
    implements a, b
{

    public static final String M_BUNDLE_EXTRA = "mBundle";
    public static final String M_PRE_SELECT_LOYALTY_EXTRA = "mPreSelectLoyalty";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public RegistrationActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        injectExtras_();
        onBaseAfterInject();
        initialize();
    }

    private void injectExtras_()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("mPreSelectLoyalty"))
            {
                mPreSelectLoyalty = bundle.getBoolean("mPreSelectLoyalty");
            }
            if (bundle.containsKey("mBundle"))
            {
                mBundle = bundle.getBundle("mBundle");
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

    public final void executeLogin(String s, String s1, boolean flag, boolean flag1)
    {
        org.androidannotations.api.a.a(new _cls11(s1, flag, flag1));
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
        handler_.post(new _cls8());
    }

    public final void login()
    {
        handler_.post(new _cls9());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f0300a6);
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
        lblTermsOfUse = (TextView)a1.findViewById(0x7f0f015d);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        view = a1.findViewById(0x7f0f0395);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        if (lblTermsOfUse != null)
        {
            lblTermsOfUse.setOnClickListener(new _cls3());
        }
        a1 = a1.findViewById(0x7f0f0397);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls4());
        }
        setupFonts();
        afterViews();
    }

    public final void requestFocus()
    {
        handler_.post(new _cls10());
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








    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ mBundle(Bundle bundle)
        {
            return (IntentBuilder_)super.extra("mBundle", bundle);
        }

        public IntentBuilder_ mPreSelectLoyalty(boolean flag)
        {
            return (IntentBuilder_)super.extra("mPreSelectLoyalty", flag);
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
            super(fragment.getActivity(), com/dominos/activities/RegistrationActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/RegistrationActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/RegistrationActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls11 extends org.androidannotations.api.c
    {

        final RegistrationActivity_ this$0;
        final String val$email;
        final boolean val$enrollInLoyalty;
        final String val$password;
        final boolean val$remember;

        public void execute()
        {
            try
            {
                executeLogin(email, password, remember, enrollInLoyalty);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls11(String s3, boolean flag, 
                boolean flag1)
        {
            this$0 = RegistrationActivity_.this;
            email = s2;
            password = s3;
            remember = flag;
            enrollInLoyalty = flag1;
            super(final_s, final_i, final_s1);
        }
    }


    private class _cls6
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls6()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls7()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls8()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            login();
        }

        _cls9()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final RegistrationActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final RegistrationActivity_ this$0;

        public void onClick(View view)
        {
            onRegisterClick();
        }

        _cls2()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final RegistrationActivity_ this$0;

        public void onClick(View view)
        {
            displayTerms();
        }

        _cls3()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final RegistrationActivity_ this$0;

        public void onClick(View view)
        {
            onRememberMeHelpButtonClick();
        }

        _cls4()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            requestFocus();
        }

        _cls10()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final RegistrationActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls5()
        {
            this$0 = RegistrationActivity_.this;
            super();
        }
    }

}
