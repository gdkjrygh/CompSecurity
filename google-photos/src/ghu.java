// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ghu extends AnimatorListenerAdapter
{

    final ghs a;

    ghu(ghs ghs1)
    {
        a = ghs1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = ghs.d(a);
        ghv ghv1 = new ghv(this);
        long l;
        if (ghs.b(a))
        {
            l = 100L;
        } else
        {
            l = 1500L;
        }
        animator.a(ghv1, l);
    }
}
