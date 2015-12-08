// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            SignInFragment, BaseFragment

public final class SignInFragment_ extends SignInFragment
    implements a, b
{

    public static final String M_MESSAGE_ARG = "mMessage";
    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public SignInFragment_()
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
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        onBaseAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("mMessage"))
        {
            mMessage = bundle.getString("mMessage");
        }
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

    public final void hideLoading()
    {
        handler_.post(new _cls2());
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
            contentView_ = layoutinflater.inflate(0x7f03006a, viewgroup, false);
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
        mSignInButton = (Button)a1.findViewById(0x7f0f02be);
        mTextInfo = (TextView)a1.findViewById(0x7f0f02bf);
        if (mSignInButton != null)
        {
            mSignInButton.setOnClickListener(new _cls1());
        }
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showLoading()
    {
        handler_.post(new _cls3());
    }



    private class FragmentBuilder_ extends d
    {

        public SignInFragment build()
        {
            SignInFragment_ signinfragment_ = new SignInFragment_();
            signinfragment_.setArguments(args);
            return signinfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mMessage(String s)
        {
            args.putString("mMessage", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls2
        implements Runnable
    {

        final SignInFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = SignInFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SignInFragment_ this$0;

        public void onClick(View view)
        {
            onSignInButtonClicked();
        }

        _cls1()
        {
            this$0 = SignInFragment_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final SignInFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls3()
        {
            this$0 = SignInFragment_.this;
            super();
        }
    }

}
