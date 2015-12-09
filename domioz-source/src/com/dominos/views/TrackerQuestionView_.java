// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.RatingBar;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            TrackerQuestionView

public final class TrackerQuestionView_ extends TrackerQuestionView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public TrackerQuestionView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static TrackerQuestionView build(Context context)
    {
        context = new TrackerQuestionView_(context);
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
            inflate(getContext(), 0x7f0300e7, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mRating = (RatingBar)a1.findViewById(0x7f0f04c1);
        mQuestion = (TextView)a1.findViewById(0x7f0f04c0);
        onAfterViews();
    }
}
