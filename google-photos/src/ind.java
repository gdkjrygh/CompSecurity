// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ind extends AnimatorListenerAdapter
{

    private imz a;

    ind(imz imz1)
    {
        a = imz1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        animator.removeListener(this);
        if (a.O_() != null)
        {
            a.O_().c().c();
        }
        ((am) (a)).r.a(((am) (a)).t, -1, null);
    }
}
