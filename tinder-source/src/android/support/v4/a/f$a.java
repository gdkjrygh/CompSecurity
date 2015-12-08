// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.animation.Animator;

// Referenced classes of package android.support.v4.a:
//            f, b, g

static final class b
    implements android.animation.ator.AnimatorListener
{

    final b a;
    final g b;

    public final void onAnimationCancel(Animator animator)
    {
        a.onAnimationCancel(b);
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.onAnimationEnd(b);
    }

    public final void onAnimationRepeat(Animator animator)
    {
        a.onAnimationRepeat(b);
    }

    public final void onAnimationStart(Animator animator)
    {
        a.onAnimationStart(b);
    }

    public r(b b1, g g)
    {
        a = b1;
        b = g;
    }
}
