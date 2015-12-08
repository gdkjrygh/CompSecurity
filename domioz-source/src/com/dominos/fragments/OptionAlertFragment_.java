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
//            OptionAlertFragment

public final class OptionAlertFragment_ extends OptionAlertFragment
    implements a
{

    public static final String M_MESSAGE_ARG = "mMessage";
    public static final String M_NEGATIVE_BUTTON_TEXT_ARG = "mNegativeButtonText";
    public static final String M_NEUTRAL_BUTTON_TEXT_ARG = "mNeutralButtonText";
    public static final String M_POSITIVE_BUTTON_TEXT_ARG = "mPositiveButtonText";
    public static final String M_TITLE_ARG = "mTitle";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public OptionAlertFragment_()
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
            if (bundle.containsKey("mNeutralButtonText"))
            {
                mNeutralButtonText = bundle.getString("mNeutralButtonText");
            }
            if (bundle.containsKey("mMessage"))
            {
                mMessage = bundle.getString("mMessage");
            }
            if (bundle.containsKey("mNegativeButtonText"))
            {
                mNegativeButtonText = bundle.getString("mNegativeButtonText");
            }
            if (bundle.containsKey("mTitle"))
            {
                mTitle = bundle.getString("mTitle");
            }
            if (bundle.containsKey("mPositiveButtonText"))
            {
                mPositiveButtonText = bundle.getString("mPositiveButtonText");
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

        public OptionAlertFragment build()
        {
            OptionAlertFragment_ optionalertfragment_ = new OptionAlertFragment_();
            optionalertfragment_.setArguments(args);
            return optionalertfragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mMessage(String s)
        {
            args.putString("mMessage", s);
            return this;
        }

        public FragmentBuilder_ mNegativeButtonText(String s)
        {
            args.putString("mNegativeButtonText", s);
            return this;
        }

        public FragmentBuilder_ mNeutralButtonText(String s)
        {
            args.putString("mNeutralButtonText", s);
            return this;
        }

        public FragmentBuilder_ mPositiveButtonText(String s)
        {
            args.putString("mPositiveButtonText", s);
            return this;
        }

        public FragmentBuilder_ mTitle(String s)
        {
            args.putString("mTitle", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }

}
