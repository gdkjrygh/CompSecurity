// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.fragments.BaseFragment;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.checkout:
//            UserInfoInputFragment

public final class UserInfoInputFragment_ extends UserInfoInputFragment
    implements a, b
{

    public static final String M_DATA_ARG = "mData";
    private View contentView_;
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public UserInfoInputFragment_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        prefs = new DominosPrefs_(getActivity());
        c.a(this);
        injectFragmentArguments_();
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
        mActivityHelper = ActivityHelper_.getInstance_(getActivity());
        mMobileSession = MobileSession_.getInstance_(getActivity());
        onBaseAfterInject();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null && bundle.containsKey("mData"))
        {
            mData = bundle.getBundle("mData");
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
            contentView_ = layoutinflater.inflate(0x7f030068, viewgroup, false);
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
        deliveryInstructionsTextBox = (EditText)a1.findViewById(0x7f0f02b5);
        phoneTextBox = (EditText)a1.findViewById(0x7f0f02b1);
        firstNameTextBox = (EditText)a1.findViewById(0x7f0f02af);
        phoneExtensionText = (EditText)a1.findViewById(0x7f0f02b2);
        lastNameTextBox = (EditText)a1.findViewById(0x7f0f02b0);
        deliveryDivider = (LinearLayout)a1.findViewById(0x7f0f02b4);
        emailTextBox = (EditText)a1.findViewById(0x7f0f02b3);
        onAfterViews();
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

        public UserInfoInputFragment build()
        {
            UserInfoInputFragment_ userinfoinputfragment_ = new UserInfoInputFragment_();
            userinfoinputfragment_.setArguments(args);
            return userinfoinputfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mData(Bundle bundle)
        {
            args.putBundle("mData", bundle);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements Runnable
    {

        final UserInfoInputFragment_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls1()
        {
            this$0 = UserInfoInputFragment_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final UserInfoInputFragment_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls2()
        {
            this$0 = UserInfoInputFragment_.this;
            super();
        }
    }

}
