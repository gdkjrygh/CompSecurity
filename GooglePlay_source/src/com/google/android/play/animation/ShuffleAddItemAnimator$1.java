// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

// Referenced classes of package com.google.android.play.animation:
//            ShuffleAddItemAnimator

final class val.animation extends AnimatorListenerAdapter
{

    final ShuffleAddItemAnimator this$0;
    final ViewPropertyAnimator val$animation;
    final android.support.v7.widget.mator val$holder;
    final View val$view;

    public final void onAnimationCancel(Animator animator)
    {
        ShuffleAddItemAnimator.reset(val$view);
    }

    public final void onAnimationEnd(Animator animator)
    {
        val$animation.setListener(null);
        dispatchAddFinished(val$holder);
        mRunningAddAnimations.remove(val$holder);
        ShuffleAddItemAnimator.access$200(ShuffleAddItemAnimator.this);
    }

    public final void onAnimationStart(Animator animator)
    {
        val$view.setAlpha(1.0F);
    }

    ()
    {
        this$0 = final_shuffleadditemanimator;
        val$view = view1;
        val$holder = mator;
        val$animation = ViewPropertyAnimator.this;
        super();
    }
}
