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
import com.dominos.controllers.FastPathFragmentController_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.fragments.BaseFragment;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.views.HomeFragmentFooterView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.landing:
//            FastPathFragment, ReOrderFragment

public final class FastPathFragment_ extends FastPathFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public FastPathFragment_()
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
        mOrderUtil = OrderUtil_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mSpeechManager = SpeechManager_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        controllerLocator = ControllerLocator_.getInstance_(getActivity());
        controller = FastPathFragmentController_.getInstance_(getActivity());
        onAfterInject();
        onBaseAfterInject();
        onAfterInject();
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
        handler_.post(new _cls5());
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
            contentView_ = layoutinflater.inflate(0x7f030073, viewgroup, false);
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
        mFooter = (HomeFragmentFooterView)a1.findViewById(0x7f0f02fd);
        View view = a1.findViewById(0x7f0f02fb);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f02fc);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        onBaseAfterViews();
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showItemAvailabilityDialog(final LabsOrder order)
    {
        handler_.post(new _cls3());
    }

    public final void showLoading()
    {
        handler_.post(new _cls6());
    }

    public final void showOrderHistoryActivity()
    {
        handler_.post(new _cls8());
    }

    public final void showSessionTimeoutAlert()
    {
        handler_.post(new _cls7());
    }







    private class FragmentBuilder_ extends d
    {

        public FastPathFragment build()
        {
            FastPathFragment_ fastpathfragment_ = new FastPathFragment_();
            fastpathfragment_.setArguments(args);
            return fastpathfragment_;
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

        final FastPathFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls4()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final FastPathFragment_ this$0;

        public void run()
        {
            navigateToCart();
        }

        _cls5()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final FastPathFragment_ this$0;

        public void onClick(View view)
        {
            onNewOrderButtonClick();
        }

        _cls1()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final FastPathFragment_ this$0;

        public void onClick(View view)
        {
            onOrderHistoryButtonClick();
        }

        _cls2()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final FastPathFragment_ this$0;
        final LabsOrder val$order;

        public void run()
        {
            showItemAvailabilityDialog(order);
        }

        _cls3()
        {
            this$0 = FastPathFragment_.this;
            order = labsorder;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final FastPathFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls6()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final FastPathFragment_ this$0;

        public void run()
        {
            showOrderHistoryActivity();
        }

        _cls8()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final FastPathFragment_ this$0;

        public void run()
        {
            showSessionTimeoutAlert();
        }

        _cls7()
        {
            this$0 = FastPathFragment_.this;
            super();
        }
    }

}
