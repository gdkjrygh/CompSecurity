// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            HomeFragmentFooterView

public final class HomeFragmentFooterView_ extends HomeFragmentFooterView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public HomeFragmentFooterView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public HomeFragmentFooterView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public HomeFragmentFooterView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static HomeFragmentFooterView build(Context context)
    {
        context = new HomeFragmentFooterView_(context);
        context.onFinishInflate();
        return context;
    }

    public static HomeFragmentFooterView build(Context context, AttributeSet attributeset)
    {
        context = new HomeFragmentFooterView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static HomeFragmentFooterView build(Context context, AttributeSet attributeset, int i)
    {
        context = new HomeFragmentFooterView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300d1, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mLoginSeparator = (TextView)a1.findViewById(0x7f0f0458);
        mTrackerSeparator = (TextView)a1.findViewById(0x7f0f045a);
        mLoginText = (TextView)a1.findViewById(0x7f0f0457);
        mTrackerText = (TextView)a1.findViewById(0x7f0f045b);
        mNewsFeedText = (TextView)a1.findViewById(0x7f0f0459);
        if (mTrackerText != null)
        {
            mTrackerText.setOnClickListener(new _cls1());
        }
        if (mNewsFeedText != null)
        {
            mNewsFeedText.setOnClickListener(new _cls2());
        }
        if (mLoginText != null)
        {
            mLoginText.setOnClickListener(new _cls3());
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final HomeFragmentFooterView_ this$0;

        public void onClick(View view)
        {
            onTrackerClick();
        }

        _cls1()
        {
            this$0 = HomeFragmentFooterView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final HomeFragmentFooterView_ this$0;

        public void onClick(View view)
        {
            onNewsClick();
        }

        _cls2()
        {
            this$0 = HomeFragmentFooterView_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final HomeFragmentFooterView_ this$0;

        public void onClick(View view)
        {
            onLoginClick();
        }

        _cls3()
        {
            this$0 = HomeFragmentFooterView_.this;
            super();
        }
    }

}
