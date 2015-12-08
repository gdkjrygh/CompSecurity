// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.a:
//            f, h, i

final class g extends AnimatorListenerAdapter
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = a;
        android.view.ViewGroup.LayoutParams layoutparams = ((f) (animator)).b.getLayoutParams();
        int j = ((f) (animator)).b.getHeight();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            j, 1
        }).setDuration(((f) (animator)).a);
        valueanimator.addListener(new h(animator, layoutparams, j));
        valueanimator.addUpdateListener(new i(animator, layoutparams));
        valueanimator.start();
    }
}
