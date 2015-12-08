// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

public final class LoginDialogFragment_ extends LoginDialogFragment
    implements a, b
{

    public static final String M_FIRST_NAME_ARG = "mFirstName";
    public static final String M_MESSAGE_ARG = "mMessage";
    public static final String M_SHOW_CANCEL_ARG = "mShowCancel";
    public static final String M_SHOW_GUEST_ARG = "mShowGuest";
    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LoginDialogFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        injectFragmentArguments_();
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        onAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("mMessage"))
            {
                mMessage = bundle.getString("mMessage");
            }
            if (bundle.containsKey("mShowGuest"))
            {
                mShowGuest = bundle.getBoolean("mShowGuest");
            }
            if (bundle.containsKey("mShowCancel"))
            {
                mShowCancel = bundle.getBoolean("mShowCancel");
            }
            if (bundle.containsKey("mFirstName"))
            {
                mFirstName = bundle.getString("mFirstName");
            }
        }
    }

    public final void executeLogin(String s)
    {
        org.androidannotations.api.a.a(new _cls5(0, "", s));
    }

    public final View findViewById(int i)
    {
        if (contentView_ == null)
        {
            return null;
        } else
        {
            return contentView_.findViewById(i);
        }
    }

    public final void handleLoginSuccess()
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

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        contentView_ = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (contentView_ == null)
        {
            contentView_ = layoutinflater.inflate(0x7f0300bf, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewChanged(a a1)
    {
        mContinueAsGuestText = (TextView)a1.findViewById(0x7f0f0420);
        mMessageText = (TextView)a1.findViewById(0x7f0f041c);
        mCancelText = (TextView)a1.findViewById(0x7f0f041e);
        mResetPasswordText = (TextView)a1.findViewById(0x7f0f0414);
        mSignoutText = (TextView)a1.findViewById(0x7f0f041f);
        mPasswordEntry = (EditText)a1.findViewById(0x7f0f040d);
        mPasswordHint = (TextView)a1.findViewById(0x7f0f041d);
        mCloseButton = (Button)a1.findViewById(0x7f0f041b);
        mLoginButton = (Button)a1.findViewById(0x7f0f040f);
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showLoading()
    {
        handler_.post(new _cls2());
    }

    public final void showLoginError()
    {
        handler_.post(new _cls4());
    }

    public final void showLoginFailedAlert()
    {
        handler_.post(new _cls1());
    }






    private class FragmentBuilder_ extends d
    {

        public LoginDialogFragment build()
        {
            LoginDialogFragment_ logindialogfragment_ = new LoginDialogFragment_();
            logindialogfragment_.setArguments(args);
            return logindialogfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mFirstName(String s)
        {
            args.putString("mFirstName", s);
            return this;
        }

        public FragmentBuilder_ mMessage(String s)
        {
            args.putString("mMessage", s);
            return this;
        }

        public FragmentBuilder_ mShowCancel(boolean flag)
        {
            args.putBoolean("mShowCancel", flag);
            return this;
        }

        public FragmentBuilder_ mShowGuest(boolean flag)
        {
            args.putBoolean("mShowGuest", flag);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls5 extends org.androidannotations.api.c
    {

        final LoginDialogFragment_ this$0;
        final String val$password;

        public void execute()
        {
            try
            {
                executeLogin(password);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls5(int i, String s1, String s2)
        {
            this$0 = LoginDialogFragment_.this;
            password = s2;
            super(final_s, i, s1);
        }
    }


    private class _cls3
        implements Runnable
    {

        final LoginDialogFragment_ this$0;

        public void run()
        {
            handleLoginSuccess();
        }

        _cls3()
        {
            this$0 = LoginDialogFragment_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final LoginDialogFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls2()
        {
            this$0 = LoginDialogFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final LoginDialogFragment_ this$0;

        public void run()
        {
            showLoginError();
        }

        _cls4()
        {
            this$0 = LoginDialogFragment_.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final LoginDialogFragment_ this$0;

        public void run()
        {
            showLoginFailedAlert();
        }

        _cls1()
        {
            this$0 = LoginDialogFragment_.this;
            super();
        }
    }

}
