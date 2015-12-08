// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.view.ViewGroup;

// Referenced classes of package com.snapchat.android.ui:
//            CashReceiverView

final class c
    implements android.animation.stener
{

    private float a;
    private float b;
    private int c;
    private CashReceiverView d;

    public final void onAnimationCancel(Animator animator)
    {
        CashReceiverView.d(d);
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (CashReceiverView.c(d))
        {
            return;
        }
        if (a + b < 0.0F)
        {
            CashReceiverView.a(d, 1);
            return;
        }
        if (a + b + (float)CashReceiverView.b(d).getMeasuredWidth() > (float)d.getMeasuredWidth())
        {
            CashReceiverView.a(d, 2);
            return;
        } else
        {
            CashReceiverView.a(d, c);
            return;
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (CashReceiverView cashreceiverview, float f, float f1, int i)
    {
        d = cashreceiverview;
        a = f;
        b = f1;
        c = i;
        super();
    }
}
