// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Jo;
import android.view.MotionEvent;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class <init> extends android.view.impleOnGestureListener
{

    private CashSwiperView a;

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Jo.b(f1, a.getContext()) < -1500F)
        {
            CashSwiperView.a(a, f1);
        }
        return true;
    }

    private ureListener(CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }

    ureListener(CashSwiperView cashswiperview, byte byte0)
    {
        this(cashswiperview);
    }
}
