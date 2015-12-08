// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui:
//            CashSwiperView

final class a
    implements android.view.ner
{

    private CashSwiperView a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return CashSwiperView.a(a, motionevent, CashSwiperView.a(a));
    }

    (CashSwiperView cashswiperview)
    {
        a = cashswiperview;
        super();
    }
}
