// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import IE;
import android.animation.ValueAnimator;
import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class a
    implements android.animation.matorUpdateListener
{

    private CashSwiperView a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f = IE.a((float)Math.log(((Float)valueanimator.getAnimatedValue()).floatValue()));
        if (CashSwiperView.b(a) != null)
        {
            CashSwiperView.b(a).setVolume(f, f);
        }
    }

    pdateListener(CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
