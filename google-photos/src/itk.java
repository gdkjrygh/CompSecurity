// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class itk extends AnimatorListenerAdapter
{

    private itj a;

    itk(itj itj1)
    {
        a = itj1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a.b.O_() != null)
        {
            ((am) (a.b)).r.a(((am) (a.b)).t, -1, a.a);
            a.b.O_().c().c();
        }
    }
}
