// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import com.dominos.MobileSession_;
import com.dominos.fragments.BaseFragment;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.address:
//            AddressHotelFragment

public final class AddressHotelFragment_ extends AddressHotelFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public AddressHotelFragment_()
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
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
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
        handler_.post(new _cls1());
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
            contentView_ = layoutinflater.inflate(0x7f03005e, viewgroup, false);
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
        mStreetAddressEntry = (EditText)a1.findViewById(0x7f0f0258);
        mCityEntry = (EditText)a1.findViewById(0x7f0f025e);
        mLocationEntry = (EditText)a1.findViewById(0x7f0f0255);
        mDeliveryInstEntry = (EditText)a1.findViewById(0x7f0f0267);
        mStateSpinner = (Spinner)a1.findViewById(0x7f0f0261);
        mRoomEntry = (EditText)a1.findViewById(0x7f0f025b);
        mZipEntry = (EditText)a1.findViewById(0x7f0f0264);
        afterView();
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



    private class FragmentBuilder_ extends d
    {

        public AddressHotelFragment build()
        {
            AddressHotelFragment_ addresshotelfragment_ = new AddressHotelFragment_();
            addresshotelfragment_.setArguments(args);
            return addresshotelfragment_;
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

        final AddressHotelFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls1()
        {
            this$0 = AddressHotelFragment_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final AddressHotelFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls2()
        {
            this$0 = AddressHotelFragment_.this;
            super();
        }
    }

}
