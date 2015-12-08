// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

public final class dbe
    implements android.animation.Animator.AnimatorListener
{

    private boolean a;
    private Runnable b;
    private dbd c;

    public dbe(dbd dbd1, Runnable runnable)
    {
        c = dbd1;
        b = runnable;
        super();
        a = false;
    }

    public final void onAnimationCancel(Animator animator)
    {
        if (a)
        {
            if (c.f)
            {
                dbd.c();
            }
            b.run();
            a = false;
        }
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a)
        {
            if (c.f)
            {
                dbd.c();
            }
            b.run();
            a = false;
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        a = true;
    }
}
