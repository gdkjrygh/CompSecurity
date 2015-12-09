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
//            LoyaltyFAQRowView

public final class LoyaltyFAQRowView_ extends LoyaltyFAQRowView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyFAQRowView_(Context context, LoyaltyFAQRowView.LoyaltyOptOutListener loyaltyoptoutlistener)
    {
        super(context, loyaltyoptoutlistener);
        alreadyInflated_ = false;
        init_();
    }

    public static LoyaltyFAQRowView build(Context context, LoyaltyFAQRowView.LoyaltyOptOutListener loyaltyoptoutlistener)
    {
        context = new LoyaltyFAQRowView_(context, loyaltyoptoutlistener);
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
            inflate(getContext(), 0x7f030058, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mExpandableButton = (ImageView)a1.findViewById(0x7f0f01ee);
        mAnswer = (TextView)a1.findViewById(0x7f0f01f1);
        mLoyaltyAnswer = (RelativeLayout)a1.findViewById(0x7f0f01f0);
        mQuestion = (TextView)a1.findViewById(0x7f0f01ef);
        mOptOutButton = (TextView)a1.findViewById(0x7f0f01f2);
        if (mOptOutButton != null)
        {
            mOptOutButton.setOnClickListener(new _cls1());
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyFAQRowView_ this$0;

        public void onClick(View view)
        {
            onOptOutButtonClick();
        }

        _cls1()
        {
            this$0 = LoyaltyFAQRowView_.this;
            super();
        }
    }

}
