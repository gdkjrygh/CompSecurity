// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;
import java.util.ArrayList;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungDevicesDialog, SamsungDevicesPopUpListAdapter_

public final class SamsungDevicesDialog_ extends SamsungDevicesDialog
    implements a, b
{

    public static final String M_DEVICE_LIST_ARG = "mDeviceList";
    public static final String M_FIRST_TIME_ARG = "mFirstTime";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public SamsungDevicesDialog_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        injectFragmentArguments_();
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mSamsungDevicesPopUpListAdapter = SamsungDevicesPopUpListAdapter_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("mDeviceList"))
            {
                mDeviceList = (ArrayList)bundle.getSerializable("mDeviceList");
            }
            if (bundle.containsKey("mFirstTime"))
            {
                mFirstTime = bundle.getBoolean("mFirstTime");
            }
        }
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
            contentView_ = layoutinflater.inflate(0x7f030054, viewgroup, false);
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
        mArrowImage = (ImageView)a1.findViewById(0x7f0f01e3);
        mDeviceListView = (ListView)a1.findViewById(0x7f0f01e1);
        mLayout = (RelativeLayout)a1.findViewById(0x7f0f01e0);
        mButtonImage = (ImageView)a1.findViewById(0x7f0f01e2);
        if (mLayout != null)
        {
            mLayout.setOnClickListener(new _cls1());
        }
        if (mDeviceListView != null)
        {
            mDeviceListView.setOnItemClickListener(new _cls2());
        }
        afterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public SamsungDevicesDialog build()
        {
            SamsungDevicesDialog_ samsungdevicesdialog_ = new SamsungDevicesDialog_();
            samsungdevicesdialog_.setArguments(args);
            return samsungdevicesdialog_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mDeviceList(ArrayList arraylist)
        {
            args.putSerializable("mDeviceList", arraylist);
            return this;
        }

        public FragmentBuilder_ mFirstTime(boolean flag)
        {
            args.putBoolean("mFirstTime", flag);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SamsungDevicesDialog_ this$0;

        public void onClick(View view)
        {
            onLayoutClick();
        }

        _cls1()
        {
            this$0 = SamsungDevicesDialog_.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SamsungDevicesDialog_ this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onDeviceListItemClick((Device)adapterview.getAdapter().getItem(i));
        }

        _cls2()
        {
            this$0 = SamsungDevicesDialog_.this;
            super();
        }
    }

}
