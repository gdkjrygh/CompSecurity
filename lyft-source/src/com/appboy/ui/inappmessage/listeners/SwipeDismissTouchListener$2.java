// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//            SwipeDismissTouchListener

class val.originalHeight extends AnimatorListenerAdapter
{

    final SwipeDismissTouchListener this$0;
    final android.view.eDismissTouchListener val$lp;
    final int val$originalHeight;

    public void onAnimationEnd(Animator animator)
    {
        SwipeDismissTouchListener.access$200(SwipeDismissTouchListener.this).onDismiss(SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this), SwipeDismissTouchListener.access$100(SwipeDismissTouchListener.this));
        SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setAlpha(1.0F);
        SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setTranslationX(0.0F);
        val$lp.t = val$originalHeight;
        SwipeDismissTouchListener.access$000(SwipeDismissTouchListener.this).setLayoutParams(val$lp);
    }

    smissCallbacks()
    {
        this$0 = final_swipedismisstouchlistener;
        val$lp = edismisstouchlistener;
        val$originalHeight = I.this;
        super();
    }
}
