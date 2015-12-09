// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.swipedismiss;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.swipedismiss:
//            SwipeDismissTouchListener

final class val.originalHeight extends AnimatorListenerAdapter
{

    final SwipeDismissTouchListener this$0;
    final android.view.issTouchListener val$lp;
    final int val$originalHeight;

    public final void onAnimationEnd(Animator animator)
    {
        SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this).setAlpha(1.0F);
        SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this).setTranslationX(0.0F);
        val$lp.t = val$originalHeight;
        SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this).setLayoutParams(val$lp);
    }

    A()
    {
        this$0 = final_swipedismisstouchlistener;
        val$lp = isstouchlistener;
        val$originalHeight = I.this;
        super();
    }
}
