// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.fragments:
//            ItemUnavailableFragment

public final class ItemUnavailableFragment_ extends ItemUnavailableFragment
    implements a, b
{

    public static final String M_MORE_INFO_CONTENT_ARG = "mMoreInfoContent";
    public static final String M_SUMMARY_ARG = "mSummary";
    private View contentView_;
    private final c onViewChangedNotifier_ = new c();

    public ItemUnavailableFragment_()
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
    }

    private void injectFragmentArguments_()
    {
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            if (bundle.containsKey("mMoreInfoContent"))
            {
                mMoreInfoContent = bundle.getString("mMoreInfoContent");
            }
            if (bundle.containsKey("mSummary"))
            {
                mSummary = bundle.getString("mSummary");
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
            contentView_ = layoutinflater.inflate(0x7f030064, viewgroup, false);
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
        mItemUnavailableScrollView = (ScrollView)a1.findViewById(0x7f0f029c);
        mMoreInfoContentView = (TextView)a1.findViewById(0x7f0f02a0);
        mMoreInfoActionView = (TextView)a1.findViewById(0x7f0f029f);
        mItemUnavailableRootLayout = (LinearLayout)a1.findViewById(0x7f0f029b);
        mSummaryView = (TextView)a1.findViewById(0x7f0f029d);
        if (mMoreInfoActionView != null)
        {
            mMoreInfoActionView.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f029e);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        onAfterViews();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        onViewChangedNotifier_.a(this);
    }

    private class FragmentBuilder_ extends d
    {

        public ItemUnavailableFragment build()
        {
            ItemUnavailableFragment_ itemunavailablefragment_ = new ItemUnavailableFragment_();
            itemunavailablefragment_.setArguments(args);
            return itemunavailablefragment_;
        }

        public volatile Object build()
        {
            return build();
        }

        public FragmentBuilder_ mMoreInfoContent(String s)
        {
            args.putString("mMoreInfoContent", s);
            return this;
        }

        public FragmentBuilder_ mSummary(String s)
        {
            args.putString("mSummary", s);
            return this;
        }

        public FragmentBuilder_()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ItemUnavailableFragment_ this$0;

        public void onClick(View view)
        {
            onItemUnavailableMoreInfoActionClicked();
        }

        _cls1()
        {
            this$0 = ItemUnavailableFragment_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final ItemUnavailableFragment_ this$0;

        public void onClick(View view)
        {
            onItemUnavailableOkButtonClicked();
        }

        _cls2()
        {
            this$0 = ItemUnavailableFragment_.this;
            super();
        }
    }

}
