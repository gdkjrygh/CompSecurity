// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class dgq extends AnimatorListenerAdapter
{

    private dge a;
    private dgk b;

    dgq(dgk dgk1, dge dge)
    {
        b = dgk1;
        a = dge;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        dgk.a(b, a);
        dgk.a(b, false);
        if (dgk.c(b) != null)
        {
            animator = dgk.c(b);
            dgk.b(b, null);
            b.a(animator);
        }
    }
}
