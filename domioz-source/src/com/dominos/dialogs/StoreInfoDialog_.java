// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dominos.android.sdk.common.DeviceCapabilities_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.dialogs:
//            StoreInfoDialog

public final class StoreInfoDialog_ extends StoreInfoDialog
    implements a, b
{

    public static final String M_BUNDLE_ARG = "mBundle";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public StoreInfoDialog_()
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
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mDeviceCapabilities = DeviceCapabilities_.getInstance_(getActivity());
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("mBundle"))
        {
            mBundle = bundle.getBundle("mBundle");
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
            contentView_ = layoutinflater.inflate(0x7f03006b, viewgroup, false);
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
        mTitleText = (TextView)a1.findViewById(0x7f0f0297);
        mCallStore = (TextView)a1.findViewById(0x7f0f02c1);
        mStoreAddress = (TextView)a1.findViewById(0x7f0f02c0);
        mStoreNumber = (TextView)a1.findViewById(0x7f0f00e4);
        mDeliveryHours = (TextView)a1.findViewById(0x7f0f02c7);
        mCarryOutHours = (TextView)a1.findViewById(0x7f0f02c8);
        if (mCallStore != null)
        {
            mCallStore.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f02c9);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
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

        public StoreInfoDialog build()
        {
            StoreInfoDialog_ storeinfodialog_ = new StoreInfoDialog_();
            storeinfodialog_.setArguments(args);
            return storeinfodialog_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mBundle(Bundle bundle)
        {
            args.putBundle("mBundle", bundle);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StoreInfoDialog_ this$0;

        public void onClick(View view)
        {
            callStoreClicked();
        }

        _cls1()
        {
            this$0 = StoreInfoDialog_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final StoreInfoDialog_ this$0;

        public void onClick(View view)
        {
            gotItButtonClicked();
        }

        _cls2()
        {
            this$0 = StoreInfoDialog_.this;
            super();
        }
    }

}
