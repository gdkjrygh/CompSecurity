// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyMicroWidget

public final class LoyaltyMicroWidget_ extends LoyaltyMicroWidget
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyMicroWidget_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LoyaltyMicroWidget build(Context context)
    {
        context = new LoyaltyMicroWidget_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        afterInject();
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300d4, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mParentLayout = (LinearLayout)a1.findViewById(0x7f0f046f);
        mPie = (ImageView)a1.findViewById(0x7f0f047a);
        mLoyaltyRemainingPoints = (TextView)a1.findViewById(0x7f0f047b);
        mRedemptionAvailable = (LinearLayout)a1.findViewById(0x7f0f0472);
        mRedemptionNotAvailable = (LinearLayout)a1.findViewById(0x7f0f0479);
        mPointsExpire = (TextView)a1.findViewById(0x7f0f047d);
        mWidgetBodyInfoLayout = (LinearLayout)a1.findViewById(0x7f0f0471);
        mRedeemButton = (Button)a1.findViewById(0x7f0f0478);
        mRetryButton = (Button)a1.findViewById(0x7f0f0480);
        mFreePizzas = (TextView)a1.findViewById(0x7f0f0475);
        mWidgetBody = (RelativeLayout)a1.findViewById(0x7f0f0470);
        mLoyaltyBanner = (ImageView)a1.findViewById(0x7f0f00f4);
        mFreePizzasTextView = (TextView)a1.findViewById(0x7f0f0476);
        mWidgetBodyErrorLayout = (RelativeLayout)a1.findViewById(0x7f0f047e);
        mLoyaltyPendingPointsBanner = (TextView)a1.findViewById(0x7f0f047c);
        if (mRetryButton != null)
        {
            mRetryButton.setOnClickListener(new _cls1());
        }
        a1 = a1.findViewById(0x7f0f0474);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls2());
        }
        if (mRedeemButton != null)
        {
            mRedeemButton.setOnClickListener(new _cls3());
        }
        afterView();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LoyaltyMicroWidget_ this$0;

        public void onClick(View view)
        {
            onLoyaltyRetryClick();
        }

        _cls1()
        {
            this$0 = LoyaltyMicroWidget_.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LoyaltyMicroWidget_ this$0;

        public void onClick(View view)
        {
            onFullPieRedeemClick();
        }

        _cls2()
        {
            this$0 = LoyaltyMicroWidget_.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final LoyaltyMicroWidget_ this$0;

        public void onClick(View view)
        {
            onRedeemClick();
        }

        _cls3()
        {
            this$0 = LoyaltyMicroWidget_.this;
            super();
        }
    }

}
