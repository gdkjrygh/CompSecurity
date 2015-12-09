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
//            DrawerQuestionView

public final class DrawerQuestionView_ extends DrawerQuestionView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public DrawerQuestionView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static DrawerQuestionView build(Context context)
    {
        context = new DrawerQuestionView_(context);
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
            inflate(getContext(), 0x7f0300ca, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mDrawerQuestion = (TextView)a1.findViewById(0x7f0f0442);
        mDrawerRatingBar = (RatingBar)a1.findViewById(0x7f0f0443);
    }
}
