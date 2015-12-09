// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyPointsConfirmationWidget

public final class LoyaltyPointsConfirmationWidget_ extends LoyaltyPointsConfirmationWidget
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyPointsConfirmationWidget_(Context context, int i, int j)
    {
        super(context, i, j);
        alreadyInflated_ = false;
        init_();
    }

    public static LoyaltyPointsConfirmationWidget build(Context context, int i, int j)
    {
        context = new LoyaltyPointsConfirmationWidget_(context, i, j);
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
            inflate(getContext(), 0x7f0300d6, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mLoyaltyPointsBonusTextView = (TextView)a1.findViewById(0x7f0f0484);
        mLoyaltyNoPointsEarned = (LinearLayout)a1.findViewById(0x7f0f0481);
        mLoyaltyPointsEarnedTextView = (TextView)a1.findViewById(0x7f0f0483);
        mLoyaltyPointsEarned = (LinearLayout)a1.findViewById(0x7f0f0482);
        afterViews();
    }
}
