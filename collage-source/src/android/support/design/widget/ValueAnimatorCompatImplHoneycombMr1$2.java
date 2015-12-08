// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//            ValueAnimatorCompatImplHoneycombMr1

class nerProxy extends AnimatorListenerAdapter
{

    final ValueAnimatorCompatImplHoneycombMr1 this$0;
    final nerProxy val$listener;

    public void onAnimationCancel(Animator animator)
    {
        val$listener.onAnimationCancel();
    }

    public void onAnimationEnd(Animator animator)
    {
        val$listener.onAnimationEnd();
    }

    public void onAnimationStart(Animator animator)
    {
        val$listener.onAnimationStart();
    }

    nerProxy()
    {
        this$0 = final_valueanimatorcompatimplhoneycombmr1;
        val$listener = nerProxy.this;
        super();
    }
}
