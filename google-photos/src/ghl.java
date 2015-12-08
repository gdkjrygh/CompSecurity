// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.AnimationUtils;

final class ghl extends AnimatorListenerAdapter
{

    private ghj a;

    ghl(ghj ghj1)
    {
        a = ghj1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        long l = AnimationUtils.currentAnimationTimeMillis();
        long l1 = a.d;
        if (a.c && l - l1 >= a.b / 2L)
        {
            b.a(a.e);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        a.d = AnimationUtils.currentAnimationTimeMillis();
    }
}
