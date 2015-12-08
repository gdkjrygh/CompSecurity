// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

final class fta extends AnimatorListenerAdapter
{

    private fsv a;

    fta(fsv fsv1)
    {
        a = fsv1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (((Float)fsv.a(a).getAnimatedValue()).floatValue() == 0.0F)
        {
            a.a(ftk.a);
        }
    }
}
