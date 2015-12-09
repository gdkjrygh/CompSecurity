// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.OrderUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            HistoricalItemView, HistoricalAddressView, HistoricalPaymentView

public final class HistoricalItemView_ extends HistoricalItemView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public HistoricalItemView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static HistoricalItemView build(Context context)
    {
        context = new HistoricalItemView_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mOrderUtil = OrderUtil_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300cd, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mItemDateTextView = (TextView)a1.findViewById(0x7f0f0348);
        mItemNumberTextView = (TextView)a1.findViewById(0x7f0f0347);
        mHistoricalProductListView = (LinearLayout)a1.findViewById(0x7f0f044d);
        mHistoricalAddressView = (HistoricalAddressView)a1.findViewById(0x7f0f044e);
        mHistoricalPaymentView = (HistoricalPaymentView)a1.findViewById(0x7f0f044f);
        mItemReorderButton = (Button)a1.findViewById(0x7f0f0349);
    }
}
