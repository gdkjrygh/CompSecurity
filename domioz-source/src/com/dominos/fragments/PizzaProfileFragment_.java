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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dominos.MobileSession_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.views.CustomerPersonalInformationView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            PizzaProfileFragment, BaseFragment

public final class PizzaProfileFragment_ extends PizzaProfileFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public PizzaProfileFragment_()
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
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        onBaseAfterInject();
    }

    public final void enrollCustomerInLoyalty()
    {
        org.androidannotations.api.a.a(new _cls9("", 0, ""));
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
        handler_.post(new _cls5());
    }

    public final void loadLoyaltyHistory()
    {
        org.androidannotations.api.a.a(new _cls10("", 0, ""));
    }

    public final void navigateToLoyaltyDetails(final boolean historyCallFail)
    {
        handler_.post(new _cls7());
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
            contentView_ = layoutinflater.inflate(0x7f030069, viewgroup, false);
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
        mCustomerPersonalInformationView = (CustomerPersonalInformationView)a1.findViewById(0x7f0f027b);
        mProfileLoyaltyContainerLayout = (FrameLayout)a1.findViewById(0x7f0f02b7);
        mProfileLoyaltyEnrolledLayout = (LinearLayout)a1.findViewById(0x7f0f02b8);
        mProfileLoyaltyWidgetLayout = (FrameLayout)a1.findViewById(0x7f0f02b9);
        View view = a1.findViewById(0x7f0f02bb);
        if (view != null)
        {
            view.setOnClickListener(new _cls1());
        }
        view = a1.findViewById(0x7f0f02ba);
        if (view != null)
        {
            view.setOnClickListener(new _cls2());
        }
        view = a1.findViewById(0x7f0f02bd);
        if (view != null)
        {
            view.setOnClickListener(new _cls3());
        }
        a1 = a1.findViewById(0x7f0f02bc);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls4());
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
        handler_.post(new _cls6());
    }

    public final void updateViews()
    {
        handler_.post(new _cls8());
    }







    private class FragmentBuilder_ extends d
    {

        public PizzaProfileFragment build()
        {
            PizzaProfileFragment_ pizzaprofilefragment_ = new PizzaProfileFragment_();
            pizzaprofilefragment_.setArguments(args);
            return pizzaprofilefragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls9 extends org.androidannotations.api.c
    {

        final PizzaProfileFragment_ this$0;

        public void execute()
        {
            try
            {
                enrollCustomerInLoyalty();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls9(String s, int i, String s1)
        {
            this$0 = PizzaProfileFragment_.this;
            super(s, i, s1);
        }
    }


    private class _cls5
        implements Runnable
    {

        final PizzaProfileFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls5()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls10 extends org.androidannotations.api.c
    {

        final PizzaProfileFragment_ this$0;

        public void execute()
        {
            try
            {
                loadLoyaltyHistory();
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls10(String s, int i, String s1)
        {
            this$0 = PizzaProfileFragment_.this;
            super(s, i, s1);
        }
    }


    private class _cls7
        implements Runnable
    {

        final PizzaProfileFragment_ this$0;
        final boolean val$historyCallFail;

        public void run()
        {
            navigateToLoyaltyDetails(historyCallFail);
        }

        _cls7()
        {
            this$0 = PizzaProfileFragment_.this;
            historyCallFail = flag;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PizzaProfileFragment_ this$0;

        public void onClick(View view)
        {
            onLoyaltyFaqButton();
        }

        _cls1()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PizzaProfileFragment_ this$0;

        public void onClick(View view)
        {
            onLoyaltyRewardDetailsButton();
        }

        _cls2()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PizzaProfileFragment_ this$0;

        public void onClick(View view)
        {
            onChangePasswordButtonClick();
        }

        _cls3()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PizzaProfileFragment_ this$0;

        public void onClick(View view)
        {
            onSignOutButtonClick();
        }

        _cls4()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final PizzaProfileFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls6()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final PizzaProfileFragment_ this$0;

        public void run()
        {
            updateViews();
        }

        _cls8()
        {
            this$0 = PizzaProfileFragment_.this;
            super();
        }
    }

}
