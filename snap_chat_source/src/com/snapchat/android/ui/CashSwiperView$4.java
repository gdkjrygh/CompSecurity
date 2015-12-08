// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class <init> extends <init>
{

    private CashSwiperView a;

    public final void onAnimationEnd(Animator animator)
    {
        if (CashSwiperView.b(a) != null && CashSwiperView.o(a))
        {
            CashSwiperView.b(a).stop();
            CashSwiperView.b(a).release();
            CashSwiperView.q(a);
        }
        CashSwiperView.r(a);
    }

    (CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
