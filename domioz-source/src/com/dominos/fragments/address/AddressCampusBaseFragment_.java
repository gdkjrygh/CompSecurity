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
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.fragments.BaseFragment;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.address:
//            AddressCampusBaseFragment

public final class AddressCampusBaseFragment_ extends AddressCampusBaseFragment
    implements a, b
{

    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public AddressCampusBaseFragment_()
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
            contentView_ = layoutinflater.inflate(0x7f03005b, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onGetBuildingCompleted(final BuildingResult buildingResult)
    {
        handler_.post(new _cls4());
    }

    public final void onGetRegionCompleted(final RegionResult regionResult)
    {
        handler_.post(new _cls3());
    }

    public final void onGetSitesCompleted(final SiteResult siteResult)
    {
        handler_.post(new _cls5());
    }

    public final void onViewChanged(a a1)
    {
        mDormBuildingSpinner = (Spinner)a1.findViewById(0x7f0f0225);
        mCampusBaseSpinner = (Spinner)a1.findViewById(0x7f0f0222);
        mRoomEntry = (EditText)a1.findViewById(0x7f0f0228);
        mDeliveryInstEntry = (EditText)a1.findViewById(0x7f0f022b);
        mStateSpinner = (Spinner)a1.findViewById(0x7f0f021f);
        afterView();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    public final void showLoading()
    {
        handler_.post(new _cls1());
    }






    private class FragmentBuilder_ extends d
    {

        public AddressCampusBaseFragment build()
        {
            AddressCampusBaseFragment_ addresscampusbasefragment_ = new AddressCampusBaseFragment_();
            addresscampusbasefragment_.setArguments(args);
            return addresscampusbasefragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls2
        implements Runnable
    {

        final AddressCampusBaseFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = AddressCampusBaseFragment_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final AddressCampusBaseFragment_ this$0;
        final BuildingResult val$buildingResult;

        public void run()
        {
            onGetBuildingCompleted(buildingResult);
        }

        _cls4()
        {
            this$0 = AddressCampusBaseFragment_.this;
            buildingResult = buildingresult;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final AddressCampusBaseFragment_ this$0;
        final RegionResult val$regionResult;

        public void run()
        {
            onGetRegionCompleted(regionResult);
        }

        _cls3()
        {
            this$0 = AddressCampusBaseFragment_.this;
            regionResult = regionresult;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final AddressCampusBaseFragment_ this$0;
        final SiteResult val$siteResult;

        public void run()
        {
            onGetSitesCompleted(siteResult);
        }

        _cls5()
        {
            this$0 = AddressCampusBaseFragment_.this;
            siteResult = siteresult;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final AddressCampusBaseFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls1()
        {
            this$0 = AddressCampusBaseFragment_.this;
            super();
        }
    }

}
