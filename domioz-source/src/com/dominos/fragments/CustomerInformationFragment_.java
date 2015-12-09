// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.ConversionUtil_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import com.dominos.views.CustomerPersonalInformationView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment, BaseFragment

public final class CustomerInformationFragment_ extends CustomerInformationFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public CustomerInformationFragment_()
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
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mConversionUtil = ConversionUtil_.getInstance_(getActivity());
        onBaseAfterInject();
    }

    public final void deleteAddress(int i)
    {
        org.androidannotations.api.a.a(new _cls8(0, "", i));
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

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 48: // '0'
            onAddressAddResult(j);
            break;
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
            contentView_ = layoutinflater.inflate(0x7f030060, viewgroup, false);
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
        mCustomerNewAddressBracketImageView = (ImageView)a1.findViewById(0x7f0f0281);
        mCustomerAddressDeleteContainer = (LinearLayout)a1.findViewById(0x7f0f027e);
        mCustomerNewAddressContainer = (RelativeLayout)a1.findViewById(0x7f0f0280);
        mCustomerAddressContainer = (LinearLayout)a1.findViewById(0x7f0f027f);
        mCustomerPersonalInformationView = (CustomerPersonalInformationView)a1.findViewById(0x7f0f027b);
        if (mCustomerNewAddressContainer != null)
        {
            mCustomerNewAddressContainer.setOnClickListener(new _cls1());
        }
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void promptAddressDelete(final int addressIndex)
    {
        handler_.post(new _cls4());
    }

    public final void showLoading()
    {
        handler_.post(new _cls3());
    }

    public final void updateAddressViews()
    {
        handler_.post(new _cls5());
    }

    public final void updateEditMode(final boolean editMode)
    {
        handler_.post(new _cls6());
    }

    public final void updateViews()
    {
        handler_.post(new _cls7());
    }








    private class FragmentBuilder_ extends d
    {

        public CustomerInformationFragment build()
        {
            CustomerInformationFragment_ customerinformationfragment_ = new CustomerInformationFragment_();
            customerinformationfragment_.setArguments(args);
            return customerinformationfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls8 extends org.androidannotations.api.c
    {

        final CustomerInformationFragment_ this$0;
        final int val$addressIndex;

        public void execute()
        {
            try
            {
                deleteAddress(addressIndex);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls8(int i, String s1, int j)
        {
            this$0 = CustomerInformationFragment_.this;
            addressIndex = j;
            super(final_s, i, s1);
        }
    }


    private class _cls2
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = CustomerInformationFragment_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CustomerInformationFragment_ this$0;

        public void onClick(View view)
        {
            onAddNewLocationClick();
        }

        _cls1()
        {
            this$0 = CustomerInformationFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;
        final int val$addressIndex;

        public void run()
        {
            promptAddressDelete(addressIndex);
        }

        _cls4()
        {
            this$0 = CustomerInformationFragment_.this;
            addressIndex = i;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls3()
        {
            this$0 = CustomerInformationFragment_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;

        public void run()
        {
            updateAddressViews();
        }

        _cls5()
        {
            this$0 = CustomerInformationFragment_.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;
        final boolean val$editMode;

        public void run()
        {
            updateEditMode(editMode);
        }

        _cls6()
        {
            this$0 = CustomerInformationFragment_.this;
            editMode = flag;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final CustomerInformationFragment_ this$0;

        public void run()
        {
            updateViews();
        }

        _cls7()
        {
            this$0 = CustomerInformationFragment_.this;
            super();
        }
    }

}
