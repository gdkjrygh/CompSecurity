// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import java.util.List;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class <init> extends <init>
{

    private CashSwiperView a;

    public final void onAnimationEnd(Animator animator)
    {
        CashSwiperView.c(a).clear();
        CashSwiperView.d(a);
        CashSwiperView.d();
    }

    (CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
