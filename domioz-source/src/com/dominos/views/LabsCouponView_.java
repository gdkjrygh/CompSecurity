// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.TextView;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LabsCouponView

public final class LabsCouponView_ extends LabsCouponView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LabsCouponView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LabsCouponView build(Context context)
    {
        context = new LabsCouponView_(context);
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
            inflate(getContext(), 0x7f03004e, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        couponChoiceDescription = (TextView)a1.findViewById(0x7f0f01c8);
        couponChoiceLabel = (TextView)a1.findViewById(0x7f0f01c7);
        couponListNumberTextView = (TextView)a1.findViewById(0x7f0f01c4);
        couponChoicePrice = (TextView)a1.findViewById(0x7f0f01c9);
        setupFonts();
    }
}
