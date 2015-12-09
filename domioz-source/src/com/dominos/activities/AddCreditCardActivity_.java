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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
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
//            AddCreditCardActivity, BaseActivity

public final class AddCreditCardActivity_ extends AddCreditCardActivity
    implements a, b
{

    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public AddCreditCardActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        onBaseAfterInject();
        initialize();
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

    public final void getAllSavedCreditCardsBeforeReturningToCheckout(String s)
    {
        org.androidannotations.api.a.a(new _cls14(0, "", s));
    }

    public final void goToCart()
    {
        handler_.post(new _cls11());
    }

    public final void goToCheckoutScreen()
    {
        handler_.post(new _cls12());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls9());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls8());
    }

    public final void onActivityResult(int i, int j, Intent intent1)
    {
        super.onActivityResult(i, j, intent1);
        switch (i)
        {
        default:
            return;

        case 6: // '\006'
            onActivityResult(j);
            break;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f03002a);
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
        mSaveToProfileContainer = (RelativeLayout)a1.findViewById(0x7f0f010e);
        mZipCodeHint = (TextView)a1.findViewById(0x7f0f010c);
        mSaveToProfileCheckBox = (CheckBox)a1.findViewById(0x7f0f010d);
        mSecurityCodeEditText = (EditText)a1.findViewById(0x7f0f0108);
        mZipEditText = (EditText)a1.findViewById(0x7f0f010a);
        mSaveToProfileHint = (TextView)a1.findViewById(0x7f0f010f);
        mPrimaryCardControlsContainer = (RelativeLayout)a1.findViewById(0x7f0f0113);
        mPrimaryCardCheckBox = (CheckBox)a1.findViewById(0x7f0f0110);
        mSavedCardControlsContainer = (LinearLayout)a1.findViewById(0x7f0f0112);
        mYearSpinner = (Spinner)a1.findViewById(0x7f0f0106);
        mCardNicknameEditText = (EditText)a1.findViewById(0x7f0f0115);
        mCardNumberEditText = (EditText)a1.findViewById(0x7f0f0103);
        mLineDividerBelowPrimaryCardControls = (LinearLayout)a1.findViewById(0x7f0f0117);
        mMonthSpinner = (Spinner)a1.findViewById(0x7f0f0104);
        View view = a1.findViewById(0x7f0f007f);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        view = a1.findViewById(0x7f0f0118);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        view = a1.findViewById(0x7f0f010b);
        if (view != null)
        {
            view.setOnClickListener(new _cls3());
        }
        view = a1.findViewById(0x7f0f0111);
        if (view != null)
        {
            view.setOnClickListener(new _cls4());
        }
        a1 = a1.findViewById(0x7f0f0116);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls5());
        }
        if (mSaveToProfileCheckBox != null)
        {
            mSaveToProfileCheckBox.setOnClickListener(new _cls6());
        }
        if (mPrimaryCardCheckBox != null)
        {
            mPrimaryCardCheckBox.setOnClickListener(new _cls7());
        }
        setupFonts();
        afterViews();
    }

    public final void sendToUserLoginActivity()
    {
        handler_.post(new _cls13());
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

    public final void showLoading()
    {
        handler_.post(new _cls10());
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
            super(fragment.getActivity(), com/dominos/activities/AddCreditCardActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/AddCreditCardActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/AddCreditCardActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls14 extends org.androidannotations.api.c
    {

        final AddCreditCardActivity_ this$0;
        final String val$customerId;

        public void execute()
        {
            try
            {
                getAllSavedCreditCardsBeforeReturningToCheckout(customerId);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls14(int i, String s1, String s2)
        {
            this$0 = AddCreditCardActivity_.this;
            customerId = s2;
            super(final_s, i, s1);
        }
    }


    private class _cls11
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls11()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            goToCheckoutScreen();
        }

        _cls12()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls9()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls8()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            onUseThisCreditCardClick();
        }

        _cls2()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            secureCodeHelpClicked();
        }

        _cls3()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            saveToProfileHelpClicked();
        }

        _cls4()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            primaryCardHelpClicked();
        }

        _cls5()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            onSaveToProfileClick();
        }

        _cls6()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final AddCreditCardActivity_ this$0;

        public void onClick(View view)
        {
            onSaveToProfileClick();
        }

        _cls7()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            sendToUserLoginActivity();
        }

        _cls13()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final AddCreditCardActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls10()
        {
            this$0 = AddCreditCardActivity_.this;
            super();
        }
    }

}
