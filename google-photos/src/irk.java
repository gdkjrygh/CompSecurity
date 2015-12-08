// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;

final class irk extends AnimatorListenerAdapter
{

    private irj a;

    irk(irj irj1)
    {
        a = irj1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.c = false;
        if (a.b)
        {
            a.e.setStartDelay(10000L);
            a.e.start();
            a.b();
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        a.c = true;
    }
}
