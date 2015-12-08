// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            CashReceiverView

final class c
    implements android.animation.torUpdateListener
{

    private float a;
    private float b;
    private float c;
    private CashReceiverView d;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f2;
        float f = ((Float)CashReceiverView.a(d).getAnimatedValue()).floatValue();
        CashReceiverView.b(d).setTranslationY(a * f * (f - 1.0F));
        f2 = b;
        f2 = f * c + f2;
        if (f2 >= 0.0F) goto _L2; else goto _L1
_L1:
        float f1 = -f2;
_L4:
        CashReceiverView.b(d).setTranslationX(f1);
        return;
_L2:
        f1 = f2;
        if ((float)CashReceiverView.b(d).getMeasuredWidth() + f2 > (float)d.getMeasuredWidth())
        {
            f1 = f2 - 2.0F * (((float)CashReceiverView.b(d).getMeasuredWidth() + f2) - (float)d.getMeasuredWidth());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ateListener(CashReceiverView cashreceiverview, float f, float f1, float f2)
    {
        d = cashreceiverview;
        a = f;
        b = f1;
        c = f2;
        super();
    }
}
