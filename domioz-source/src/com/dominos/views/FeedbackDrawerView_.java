// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            FeedbackDrawerView

public final class FeedbackDrawerView_ extends FeedbackDrawerView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public FeedbackDrawerView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public FeedbackDrawerView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static FeedbackDrawerView build(Context context)
    {
        context = new FeedbackDrawerView_(context);
        context.onFinishInflate();
        return context;
    }

    public static FeedbackDrawerView build(Context context, AttributeSet attributeset)
    {
        context = new FeedbackDrawerView_(context, attributeset);
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
            inflate(getContext(), 0x7f0300cb, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mQuestionContainer = (LinearLayout)a1.findViewById(0x7f0f0448);
        mSubmitRatingsButton = (Button)a1.findViewById(0x7f0f0449);
        mDrawer = (SlidingDrawer)a1.findViewById(0x7f0f0445);
        onAfterViews();
    }
}
