// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class iti extends AnimatorListenerAdapter
{

    private ith a;

    iti(ith ith1)
    {
        a = ith1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        itf.q(a.a);
        itf.a(a.a, iua.c);
    }
}
