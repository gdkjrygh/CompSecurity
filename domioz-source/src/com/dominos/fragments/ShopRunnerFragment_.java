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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            ShopRunnerFragment

public final class ShopRunnerFragment_ extends ShopRunnerFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public ShopRunnerFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        mPrefs = new DominosPrefs_(getActivity());
        c.a(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        setup();
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
            contentView_ = layoutinflater.inflate(0x7f0300ab, viewgroup, false);
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
        mSrSignIn = (TextView)a1.findViewById(0x7f0f03ac);
        mSrLogoLayout = (LinearLayout)a1.findViewById(0x7f0f03a7);
        mSrLookingFor = (TextView)a1.findViewById(0x7f0f03a8);
        mSrLearnMore = (TextView)a1.findViewById(0x7f0f03ae);
        mSrSignInLayout = (LinearLayout)a1.findViewById(0x7f0f03ab);
        mSrFreeDelivery = (TextView)a1.findViewById(0x7f0f03aa);
        mSrSignOut = (TextView)a1.findViewById(0x7f0f03ad);
        mSrLogo = (ImageView)a1.findViewById(0x7f0f03a9);
        if (mSrSignIn != null)
        {
            mSrSignIn.setOnClickListener(new _cls1());
        }
        if (mSrSignOut != null)
        {
            mSrSignOut.setOnClickListener(new _cls2());
        }
        if (mSrLearnMore != null)
        {
            mSrLearnMore.setOnClickListener(new _cls3());
        }
        init();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void srSignin()
    {
        handler_.post(new _cls4());
    }


    private class FragmentBuilder_ extends d
    {

        public ShopRunnerFragment build()
        {
            ShopRunnerFragment_ shoprunnerfragment_ = new ShopRunnerFragment_();
            shoprunnerfragment_.setArguments(args);
            return shoprunnerfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ShopRunnerFragment_ this$0;

        public void onClick(View view)
        {
            srSignin();
        }

        _cls1()
        {
            this$0 = ShopRunnerFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ShopRunnerFragment_ this$0;

        public void onClick(View view)
        {
            srSignOut();
        }

        _cls2()
        {
            this$0 = ShopRunnerFragment_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final ShopRunnerFragment_ this$0;

        public void onClick(View view)
        {
            srLookingFore();
        }

        _cls3()
        {
            this$0 = ShopRunnerFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final ShopRunnerFragment_ this$0;

        public void run()
        {
            srSignin();
        }

        _cls4()
        {
            this$0 = ShopRunnerFragment_.this;
            super();
        }
    }

}
