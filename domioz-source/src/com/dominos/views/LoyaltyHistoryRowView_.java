// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyHistoryRowView

public final class LoyaltyHistoryRowView_ extends LoyaltyHistoryRowView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyHistoryRowView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LoyaltyHistoryRowView build(Context context)
    {
        context = new LoyaltyHistoryRowView_(context);
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
            inflate(getContext(), 0x7f0300d3, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mMoreInfoSelector = (ImageView)a1.findViewById(0x7f0f0462);
        mPointBalance = (TextView)a1.findViewById(0x7f0f0466);
        mOrderNumber = (TextView)a1.findViewById(0x7f0f046b);
        mPreTipView = (RelativeLayout)a1.findViewById(0x7f0f046c);
        mDate = (TextView)a1.findViewById(0x7f0f0465);
        mTransactionType = (TextView)a1.findViewById(0x7f0f0464);
        mMainInfo = (RelativeLayout)a1.findViewById(0x7f0f0461);
        mOrderNumberView = (RelativeLayout)a1.findViewById(0x7f0f0469);
        mAdditionalInfo = (RelativeLayout)a1.findViewById(0x7f0f0467);
        mPreTipTotal = (TextView)a1.findViewById(0x7f0f046d);
        mDescription = (TextView)a1.findViewById(0x7f0f0468);
        mPoints = (TextView)a1.findViewById(0x7f0f0463);
        afterViews();
    }
}
