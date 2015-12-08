// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyEnrollView

public final class LoyaltyEnrollView_ extends LoyaltyEnrollView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public LoyaltyEnrollView_(Context context, String s, String s1, boolean flag)
    {
        super(context, s, s1, flag);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LoyaltyEnrollView_(Context context, String s, boolean flag)
    {
        super(context, s, flag);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LoyaltyEnrollView_(Context context, String s, boolean flag, boolean flag1)
    {
        super(context, s, flag, flag1);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static LoyaltyEnrollView build(Context context, String s, String s1, boolean flag)
    {
        context = new LoyaltyEnrollView_(context, s, s1, flag);
        context.onFinishInflate();
        return context;
    }

    public static LoyaltyEnrollView build(Context context, String s, boolean flag)
    {
        context = new LoyaltyEnrollView_(context, s, flag);
        context.onFinishInflate();
        return context;
    }

    public static LoyaltyEnrollView build(Context context, String s, boolean flag, boolean flag1)
    {
        context = new LoyaltyEnrollView_(context, s, flag, flag1);
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
            inflate(getContext(), 0x7f0300d2, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mEnrollCheckBox = (CheckBox)a1.findViewById(0x7f0f045f);
        mTitle = (TextView)a1.findViewById(0x7f0f045c);
        mLoyaltyTerms = (TextView)a1.findViewById(0x7f0f045e);
        mLoyaltySummary = (TextView)a1.findViewById(0x7f0f045d);
        a1 = a1.findViewById(0x7f0f0460);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        if (mLoyaltyTerms != null)
        {
            mLoyaltyTerms.setOnClickListener(new _cls2());
        }
        afterViews();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyEnrollView_ this$0;

        public void onClick(View view)
        {
            loyaltyInfoClick();
        }

        _cls1()
        {
            this$0 = LoyaltyEnrollView_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoyaltyEnrollView_ this$0;

        public void onClick(View view)
        {
            onTermsClick();
        }

        _cls2()
        {
            this$0 = LoyaltyEnrollView_.this;
            super();
        }
    }

}
