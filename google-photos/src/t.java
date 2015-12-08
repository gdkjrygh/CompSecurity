// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class t
    implements android.animation.Animator.AnimatorListener
{

    private m a;
    private w b;

    public t(m m1, w w)
    {
        a = m1;
        b = w;
    }

    public final void onAnimationCancel(Animator animator)
    {
        a.a();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.a(b);
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }
}
