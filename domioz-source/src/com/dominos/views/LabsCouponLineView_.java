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
//            LabsCouponLineView

public final class LabsCouponLineView_ extends LabsCouponLineView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LabsCouponLineView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LabsCouponLineView build(Context context)
    {
        context = new LabsCouponLineView_(context);
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
            inflate(getContext(), 0x7f03004f, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        header = (TextView)a1.findViewById(0x7f0f0170);
        couponLabelText = (TextView)a1.findViewById(0x7f0f01cc);
        couponViewContainer = (LinearLayout)a1.findViewById(0x7f0f01cb);
        couponPriceText = (TextView)a1.findViewById(0x7f0f01cd);
    }
}
