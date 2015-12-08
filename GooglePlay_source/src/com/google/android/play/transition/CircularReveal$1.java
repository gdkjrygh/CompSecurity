// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.google.android.play.transition:
//            CircularReveal

final class val.view extends AnimatorListenerAdapter
{

    final CircularReveal this$0;
    final View val$view;

    public final void onAnimationEnd(Animator animator)
    {
        if (!isRevealing())
        {
            val$view.setVisibility(4);
            val$view.setAlpha(0.0F);
        }
    }

    _cls9()
    {
        this$0 = final_circularreveal;
        val$view = View.this;
        super();
    }
}
