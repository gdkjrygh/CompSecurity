// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.FrameLayout;
import com.dominos.MobileSession_;
import com.dominos.android.sdk.common.OrderUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            CartFooterView

public final class CartFooterView_ extends CartFooterView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public CartFooterView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static CartFooterView build(Context context)
    {
        context = new CartFooterView_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mOrderUtil = OrderUtil_.getInstance_(getContext());
        mMobileSession = MobileSession_.getInstance_(getContext());
        onAfterInject();
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300c3, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mSubTotalLayout = (FrameLayout)a1.findViewById(0x7f0f042a);
        mUpSellBarLayout = (FrameLayout)a1.findViewById(0x7f0f0429);
        mDomLayout = (FrameLayout)a1.findViewById(0x7f0f042c);
        mCheckoutLayout = (FrameLayout)a1.findViewById(0x7f0f042b);
    }
}
