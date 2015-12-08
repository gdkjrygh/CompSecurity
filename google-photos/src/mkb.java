// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

public final class mkb extends mka
{

    public final Animator a;
    private final mkd b = mkd.a();
    private final Runnable c;
    private mkf d;

    private mkb(Animator animator, Runnable runnable)
    {
        d = new mkc(this);
        a = animator;
        c = runnable;
    }

    static Runnable a(mkb mkb1)
    {
        return mkb1.c;
    }

    public static mkb a(Animator animator, Runnable runnable)
    {
        runnable = new mkb(animator, runnable);
        animator.addListener(runnable);
        return runnable;
    }

    public static mkb b(Animator animator)
    {
        return a(animator, null);
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (!a(animator))
        {
            b.a(d);
        }
    }
}
