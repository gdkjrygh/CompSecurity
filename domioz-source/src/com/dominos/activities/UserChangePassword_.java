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
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword, BaseActivity

public final class UserChangePassword_ extends UserChangePassword
    implements a, b
{

    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public UserChangePassword_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        mDominosPreferences = new DominosPrefs_(this);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        initialize();
        onBaseAfterInject();
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

    public final void getAllSavedCreditCards(String s)
    {
        org.androidannotations.api.a.a(new _cls11(0, "", s));
    }

    public final void goToCart()
    {
        handler_.post(new _cls2());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls5());
    }

    public final void handleSavedCreditCardsFetch(final String response)
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
        a1 = a1.findViewById(0x7f0f007f);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        setupFonts();
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

    public final void showErrorAlert()
    {
        handler_.post(new _cls9());
    }

    public final void showInvalid()
    {
        handler_.post(new _cls8());
    }

    public final void showInvalidEmail()
    {
        handler_.post(new _cls10());
    }

    public final void showLoading()
    {
        handler_.post(new _cls4());
    }

    public final void showPasswordResetDialog()
    {
        handler_.post(new _cls7());
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
            super(fragment.getActivity(), com/dominos/activities/UserChangePassword_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/UserChangePassword_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/UserChangePassword_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls11 extends org.androidannotations.api.c
    {

        final UserChangePassword_ this$0;
        final String val$customerId;

        public void execute()
        {
            try
            {
                getAllSavedCreditCards(customerId);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls11(int i, String s1, String s2)
        {
            this$0 = UserChangePassword_.this;
            customerId = s2;
            super(final_s, i, s1);
        }
    }


    private class _cls2
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls2()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls5()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final UserChangePassword_ this$0;
        final String val$response;

        public void run()
        {
            handleSavedCreditCardsFetch(response);
        }

        _cls6()
        {
            this$0 = UserChangePassword_.this;
            response = s;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls3()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserChangePassword_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            showErrorAlert();
        }

        _cls9()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            showInvalid();
        }

        _cls8()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            showInvalidEmail();
        }

        _cls10()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls4()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final UserChangePassword_ this$0;

        public void run()
        {
            showPasswordResetDialog();
        }

        _cls7()
        {
            this$0 = UserChangePassword_.this;
            super();
        }
    }

}
