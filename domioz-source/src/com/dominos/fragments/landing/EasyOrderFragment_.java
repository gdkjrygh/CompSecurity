// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.fragments.BaseFragment;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.landing:
//            EasyOrderFragment, ReOrderFragment

public final class EasyOrderFragment_ extends EasyOrderFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public EasyOrderFragment_()
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
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mSpeechManager = SpeechManager_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mOrderUtil = OrderUtil_.getInstance_(getActivity());
        onAfterInject();
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
        handler_.post(new _cls4());
    }

    public final void navigateToCart()
    {
        handler_.post(new _cls6());
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
            contentView_ = layoutinflater.inflate(0x7f030072, viewgroup, false);
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
        easyOrderReorder = (TextView)a1.findViewById(0x7f0f02f9);
        easyOrderName = (TextView)a1.findViewById(0x7f0f02f8);
        easyOrderHeader = (TextView)a1.findViewById(0x7f0f02f7);
        a1 = a1.findViewById(0x7f0f02f6);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        if (easyOrderReorder != null)
        {
            easyOrderReorder.setOnClickListener(new _cls2());
        }
        onBaseAfterViews();
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void orderEasyOrder()
    {
        handler_.post(new _cls8());
    }

    public final void showEasyOrderDetails()
    {
        handler_.post(new _cls7());
    }

    public final void showItemAvailabilityDialog(final LabsOrder order)
    {
        handler_.post(new _cls5());
    }

    public final void showLoading()
    {
        handler_.post(new _cls3());
    }







    private class FragmentBuilder_ extends d
    {

        public EasyOrderFragment build()
        {
            EasyOrderFragment_ easyorderfragment_ = new EasyOrderFragment_();
            easyorderfragment_.setArguments(args);
            return easyorderfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls4
        implements Runnable
    {

        final EasyOrderFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls4()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final EasyOrderFragment_ this$0;

        public void run()
        {
            navigateToCart();
        }

        _cls6()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final EasyOrderFragment_ this$0;

        public void onClick(View view)
        {
            onEasyOrderDetailsClick();
        }

        _cls1()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EasyOrderFragment_ this$0;

        public void onClick(View view)
        {
            onEasyOrderReorderButton();
        }

        _cls2()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final EasyOrderFragment_ this$0;

        public void run()
        {
            orderEasyOrder();
        }

        _cls8()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final EasyOrderFragment_ this$0;

        public void run()
        {
            showEasyOrderDetails();
        }

        _cls7()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final EasyOrderFragment_ this$0;
        final LabsOrder val$order;

        public void run()
        {
            showItemAvailabilityDialog(order);
        }

        _cls5()
        {
            this$0 = EasyOrderFragment_.this;
            order = labsorder;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final EasyOrderFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls3()
        {
            this$0 = EasyOrderFragment_.this;
            super();
        }
    }

}
