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
//            ReOrderFragment

public final class ReOrderFragment_ extends ReOrderFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public ReOrderFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mSpeechManager = SpeechManager_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mOrderUtil = OrderUtil_.getInstance_(getActivity());
        onBaseAfterInject();
        onAfterInject();
        c.a(this);
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
        handler_.post(new _cls1());
    }

    public final void navigateToCart()
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
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewChanged(a a1)
    {
        onBaseAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showItemAvailabilityDialog(final LabsOrder order)
    {
        handler_.post(new _cls4());
    }

    public final void showLoading()
    {
        handler_.post(new _cls2());
    }





    private class FragmentBuilder_ extends d
    {

        public ReOrderFragment build()
        {
            ReOrderFragment_ reorderfragment_ = new ReOrderFragment_();
            reorderfragment_.setArguments(args);
            return reorderfragment_;
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
        implements Runnable
    {

        final ReOrderFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls1()
        {
            this$0 = ReOrderFragment_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final ReOrderFragment_ this$0;

        public void run()
        {
            navigateToCart();
        }

        _cls3()
        {
            this$0 = ReOrderFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final ReOrderFragment_ this$0;
        final LabsOrder val$order;

        public void run()
        {
            showItemAvailabilityDialog(order);
        }

        _cls4()
        {
            this$0 = ReOrderFragment_.this;
            order = labsorder;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final ReOrderFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls2()
        {
            this$0 = ReOrderFragment_.this;
            super();
        }
    }

}
