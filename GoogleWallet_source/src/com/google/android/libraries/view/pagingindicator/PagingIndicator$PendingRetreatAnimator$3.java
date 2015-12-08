// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class val.initialX2 extends AnimatorListenerAdapter
{

    final  this$1;
    final int val$dotsToHide[];
    final float val$initialX1;
    final float val$initialX2;
    final PagingIndicator val$this$0;

    public final void onAnimationEnd(Animator animator)
    {
        PagingIndicator.access$1202(_fld0, -1F);
        PagingIndicator.access$1302(_fld0, -1F);
        postInvalidateOnAnimation();
    }

    public final void onAnimationStart(Animator animator)
    {
        PagingIndicator.access$1400(_fld0);
        PagingIndicator.access$1500(_fld0);
        animator = val$dotsToHide;
        int j = animator.length;
        for (int i = 0; i < j; i++)
        {
            int k = animator[i];
            PagingIndicator.access$1600(_fld0, k, 1E-05F);
        }

        PagingIndicator.access$1202(_fld0, val$initialX1);
        PagingIndicator.access$1302(_fld0, val$initialX2);
        postInvalidateOnAnimation();
    }

    ()
    {
        this$1 = final_;
        val$this$0 = pagingindicator;
        val$dotsToHide = ai;
        val$initialX1 = f;
        val$initialX2 = F.this;
        super();
    }
}
