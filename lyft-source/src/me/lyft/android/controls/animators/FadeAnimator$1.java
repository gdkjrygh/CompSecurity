// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls.animators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

// Referenced classes of package me.lyft.android.controls.animators:
//            FadeAnimator

final class val.animator extends AnimatorListenerAdapter
{

    final ObjectAnimator val$animator;
    final View val$view;

    public void onAnimationEnd(Animator animator1)
    {
        val$view.setVisibility(8);
        val$animator.removeAllListeners();
    }

    ()
    {
        val$view = view1;
        val$animator = objectanimator;
        super();
    }
}
