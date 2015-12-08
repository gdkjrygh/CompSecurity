// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.checkout:
//            UserInfoDisplayFragment

public final class UserInfoDisplayFragment_ extends UserInfoDisplayFragment
    implements a, b
{

    public static final String M_DATA_ARG = "mData";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public UserInfoDisplayFragment_()
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
        userAuthorization = UserAuthorization_.getInstance_(getActivity());
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
            contentView_ = layoutinflater.inflate(0x7f030065, viewgroup, false);
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
        email = (TextView)a1.findViewById(0x7f0f02a3);
        phone = (TextView)a1.findViewById(0x7f0f02a4);
        phoneExtensionTextBox = (EditText)a1.findViewById(0x7f0f02b2);
        name = (TextView)a1.findViewById(0x7f0f02a2);
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public UserInfoDisplayFragment build()
        {
            UserInfoDisplayFragment_ userinfodisplayfragment_ = new UserInfoDisplayFragment_();
            userinfodisplayfragment_.setArguments(args);
            return userinfodisplayfragment_;
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

}
