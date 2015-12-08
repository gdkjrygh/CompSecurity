// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            AlertFragment

public final class AlertFragment_ extends AlertFragment
    implements a
{

    public static final String CANCELABLE_ARG = "cancelable";
    public static final String MESSAGE_ARG = "message";
    public static final String TITLE_ARG = "title";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public AlertFragment_()
    {
    }

    public static FragmentBuilder_ builder()
    {
        return new FragmentBuilder_();
    }

    private void init_(Bundle bundle)
    {
        injectFragmentArguments_();
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("cancelable"))
            {
                cancelable = bundle.getBoolean("cancelable");
            }
            if (bundle.containsKey("message"))
            {
                message = bundle.getString("message");
            }
            if (bundle.containsKey("title"))
            {
                title = bundle.getString("title");
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

        public AlertFragment build()
        {
            AlertFragment_ alertfragment_ = new AlertFragment_();
            alertfragment_.setArguments(args);
            return alertfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ cancelable(boolean flag)
        {
            args.putBoolean("cancelable", flag);
            return this;
        }

        public FragmentBuilder_ message(String s)
        {
            args.putString("message", s);
            return this;
        }

        public FragmentBuilder_ title(String s)
        {
            args.putString("title", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }

}
