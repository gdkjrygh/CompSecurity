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
import android.widget.ImageButton;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            OrderSettingsFragment, BaseFragment

public final class OrderSettingsFragment_ extends OrderSettingsFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public OrderSettingsFragment_()
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
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        onBaseAfterInject();
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
        handler_.post(new _cls6());
    }

    public final void navigateToCart()
    {
        handler_.post(new _cls8());
    }

    public final void navigateToStoreInfo()
    {
        handler_.post(new _cls9());
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
            contentView_ = layoutinflater.inflate(0x7f030077, viewgroup, false);
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
        mDeliveryToggle = (ImageButton)a1.findViewById(0x7f0f0302);
        mCarryoutToggle = (ImageButton)a1.findViewById(0x7f0f0303);
        mAddressView = (TextView)a1.findViewById(0x7f0f00da);
        mAddressTypeText = (TextView)a1.findViewById(0x7f0f0306);
        landingRepeatBox = (TextView)a1.findViewById(0x7f0f02ff);
        mUseThisButton = (Button)a1.findViewById(0x7f0f0308);
        if (mCarryoutToggle != null)
        {
            mCarryoutToggle.setOnClickListener(new _cls1());
        }
        View view = a1.findViewById(0x7f0f0309);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        if (mUseThisButton != null)
        {
            mUseThisButton.setOnClickListener(new _cls3());
        }
        if (mDeliveryToggle != null)
        {
            mDeliveryToggle.setOnClickListener(new _cls4());
        }
        a1 = a1.findViewById(0x7f0f0305);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls5());
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
        handler_.post(new _cls7());
    }





    private class FragmentBuilder_ extends d
    {

        public OrderSettingsFragment build()
        {
            OrderSettingsFragment_ ordersettingsfragment_ = new OrderSettingsFragment_();
            ordersettingsfragment_.setArguments(args);
            return ordersettingsfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls6
        implements Runnable
    {

        final OrderSettingsFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls6()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final OrderSettingsFragment_ this$0;

        public void run()
        {
            navigateToCart();
        }

        _cls8()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final OrderSettingsFragment_ this$0;

        public void run()
        {
            navigateToStoreInfo();
        }

        _cls9()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final OrderSettingsFragment_ this$0;

        public void onClick(View view)
        {
            toggleCarryout();
        }

        _cls1()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final OrderSettingsFragment_ this$0;

        public void onClick(View view)
        {
            onModifyButton();
        }

        _cls2()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final OrderSettingsFragment_ this$0;

        public void onClick(View view)
        {
            onUseThis();
        }

        _cls3()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final OrderSettingsFragment_ this$0;

        public void onClick(View view)
        {
            toggleDelivery();
        }

        _cls4()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final OrderSettingsFragment_ this$0;

        public void onClick(View view)
        {
            onAddressBoxInClick();
        }

        _cls5()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final OrderSettingsFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls7()
        {
            this$0 = OrderSettingsFragment_.this;
            super();
        }
    }

}
