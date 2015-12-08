// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

final class fti extends AnimatorListenerAdapter
{

    private ftf a;

    fti(ftf ftf1, fsv fsv)
    {
        a = ftf1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (((Float)a.k.getAnimatedValue()).floatValue() == 0.0F)
        {
            a.l = false;
        }
        a.m = false;
    }
}
