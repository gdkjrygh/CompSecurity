// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinView

final class it> extends AnimatorListenerAdapter
{

    final PinView this$0;
    final int val$progressVisibility;

    public final void onAnimationEnd(Animator animator)
    {
        if (val$progressVisibility == 4)
        {
            PinView.access$200(PinView.this).setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        if (val$progressVisibility == 0)
        {
            PinView.access$200(PinView.this).setAlpha(0.0F);
            PinView.access$200(PinView.this).setVisibility(0);
        }
    }

    ()
    {
        this$0 = final_pinview;
        val$progressVisibility = I.this;
        super();
    }
}
