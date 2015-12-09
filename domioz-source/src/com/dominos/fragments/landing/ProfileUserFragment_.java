// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments.landing:
//            ProfileUserFragment

public final class ProfileUserFragment_ extends ProfileUserFragment
    implements a
{

    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public ProfileUserFragment_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        mMobileSession = MobileSession_.getInstance_(getActivity());
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(getActivity());
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
            contentView_ = layoutinflater.inflate(0x7f0300a5, viewgroup, false);
        }
        return contentView_;
    }

    public final void onDestroyView()
    {
        contentView_ = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public ProfileUserFragment build()
        {
            ProfileUserFragment_ profileuserfragment_ = new ProfileUserFragment_();
            profileuserfragment_.setArguments(args);
            return profileuserfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_()
        {
        }
    }

}
