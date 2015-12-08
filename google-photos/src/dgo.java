// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class dgo extends AnimatorListenerAdapter
{

    private dgk a;

    dgo(dgk dgk1)
    {
        a = dgk1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (dgk.a(a) != null)
        {
            dgk.a(a).a(true);
        }
    }
}
