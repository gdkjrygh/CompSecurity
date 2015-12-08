// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.activities:
//            LoyaltyInfoFragment

public final class LoyaltyInfoFragment_ extends LoyaltyInfoFragment
    implements a, b
{

    public static final String M_INFO_TYPE_ARG = "mInfoType";
    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyInfoFragment_()
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
        mUserAuthorization = UserAuthorization_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        afterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("mInfoType"))
        {
            mInfoType = (LoyaltyInfoFragment.InfoType)bundle.getSerializable("mInfoType");
        }
    }

    public final void dismissDialog()
    {
        handler_.post(new _cls6());
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
            contentView_ = layoutinflater.inflate(0x7f030066, viewgroup, false);
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
        mActivateButton = (Button)a1.findViewById(0x7f0f02a8);
        mLoyaltyTerms = (TextView)a1.findViewById(0x7f0f02ab);
        mAlreadyHaveAProfile = (TextView)a1.findViewById(0x7f0f02a9);
        mSignInToActivate = (TextView)a1.findViewById(0x7f0f02aa);
        mImageShopRunner = (ImageView)a1.findViewById(0x7f0f02a7);
        mShoprunnerSignIn = (TextView)a1.findViewById(0x7f0f02ac);
        mImageLoyalty = (ImageView)a1.findViewById(0x7f0f02a6);
        if (mShoprunnerSignIn != null)
        {
            mShoprunnerSignIn.setOnClickListener(new _cls1());
        }
        if (mActivateButton != null)
        {
            mActivateButton.setOnClickListener(new _cls2());
        }
        if (mSignInToActivate != null)
        {
            mSignInToActivate.setOnClickListener(new _cls3());
        }
        a1 = a1.findViewById(0x7f0f02a5);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls4());
        }
        if (mLoyaltyTerms != null)
        {
            mLoyaltyTerms.setOnClickListener(new _cls5());
        }
        afterView();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void popLoginDialog()
    {
        handler_.post(new _cls7());
    }

    public final void saveCustomerWithLoyalty()
    {
        org.androidannotations.api.a.a(new _cls8("", 0, ""));
    }




    private class FragmentBuilder_ extends d
    {

        public LoyaltyInfoFragment build()
        {
            LoyaltyInfoFragment_ loyaltyinfofragment_ = new LoyaltyInfoFragment_();
            loyaltyinfofragment_.setArguments(args);
            return loyaltyinfofragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mInfoType(LoyaltyInfoFragment.InfoType infotype)
        {
            args.putSerializable("mInfoType", infotype);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls6
        implements Runnable
    {

        final LoyaltyInfoFragment_ this$0;

        public void run()
        {
            dismissDialog();
        }

        _cls6()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyInfoFragment_ this$0;

        public void onClick(View view)
        {
            shoprunnerSignIn();
        }

        _cls1()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoyaltyInfoFragment_ this$0;

        public void onClick(View view)
        {
            onActivateClick();
        }

        _cls2()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LoyaltyInfoFragment_ this$0;

        public void onClick(View view)
        {
            onSignInToActivateClick();
        }

        _cls3()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final LoyaltyInfoFragment_ this$0;

        public void onClick(View view)
        {
            onCloseClick();
        }

        _cls4()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final LoyaltyInfoFragment_ this$0;

        public void onClick(View view)
        {
            onTermsClick();
        }

        _cls5()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final LoyaltyInfoFragment_ this$0;

        public void run()
        {
            popLoginDialog();
        }

        _cls7()
        {
            this$0 = LoyaltyInfoFragment_.this;
            super();
        }
    }


    private class _cls8 extends org.androidannotations.api.c
    {

        final LoyaltyInfoFragment_ this$0;

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

        _cls8(String s, int i, String s1)
        {
            this$0 = LoyaltyInfoFragment_.this;
            super(s, i, s1);
        }
    }

}
