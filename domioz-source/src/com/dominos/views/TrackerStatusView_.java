// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.utils.TrackerStatusUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            TrackerStatusView

public final class TrackerStatusView_ extends TrackerStatusView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public TrackerStatusView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public TrackerStatusView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static TrackerStatusView build(Context context)
    {
        context = new TrackerStatusView_(context);
        context.onFinishInflate();
        return context;
    }

    public static TrackerStatusView build(Context context, AttributeSet attributeset)
    {
        context = new TrackerStatusView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mTrackerPillAnimation = AnimationUtils.loadAnimation(getContext(), 0x7f040014);
        mTrackerStatusUtil = TrackerStatusUtil_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300e8, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mCurrentStageAnimationView = (ImageView)a1.findViewById(0x7f0f04c7);
        mCurrentStageImageView = (ImageView)a1.findViewById(0x7f0f04c6);
        mStageSummaryView = (TextView)a1.findViewById(0x7f0f04c8);
        mCompletedStageTitleView = (TextView)a1.findViewById(0x7f0f04c4);
        mStageDetailView = (TextView)a1.findViewById(0x7f0f04c9);
        setupFonts();
    }
}
