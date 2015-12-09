// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.TextView;
import com.dominos.MobileSession_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LoyaltyPointsExpireView

public final class LoyaltyPointsExpireView_ extends LoyaltyPointsExpireView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LoyaltyPointsExpireView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LoyaltyPointsExpireView build(Context context)
    {
        context = new LoyaltyPointsExpireView_(context);
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
            inflate(getContext(), 0x7f0300d7, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mLoyaltyPointsExpire = (TextView)a1.findViewById(0x7f0f047d);
        afterViews();
    }
}
