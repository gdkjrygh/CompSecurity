// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.OrderUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LabsSubtotalView

public final class LabsSubtotalView_ extends LabsSubtotalView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_;

    public LabsSubtotalView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public LabsSubtotalView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        alreadyInflated_ = false;
        onViewChangedNotifier_ = new c();
        init_();
    }

    public static LabsSubtotalView build(Context context)
    {
        context = new LabsSubtotalView_(context);
        context.onFinishInflate();
        return context;
    }

    public static LabsSubtotalView build(Context context, AttributeSet attributeset)
    {
        context = new LabsSubtotalView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        mOrderUtil = OrderUtil_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300b3, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        subTotalPromotionRow = (TableRow)a1.findViewById(0x7f0f012e);
        subTotalDeliveryRow = (TableRow)a1.findViewById(0x7f0f0131);
        grandTotalViewAmount = (TextView)a1.findViewById(0x7f0f0139);
        subTotalDepositRow = (TableRow)a1.findViewById(0x7f0f03b9);
        subTotalViewNetAmount = (TextView)a1.findViewById(0x7f0f012d);
        subTotalViewPromotionAmount = (TextView)a1.findViewById(0x7f0f0130);
        subTotalViewDepositAmount = (TextView)a1.findViewById(0x7f0f03bb);
        subTotalViewDeliveryAmountText = (TextView)a1.findViewById(0x7f0f0133);
        subTotalViewTaxAmount = (TextView)a1.findViewById(0x7f0f0136);
        mSrLogo = (ImageView)a1.findViewById(0x7f0f03b8);
    }
}
