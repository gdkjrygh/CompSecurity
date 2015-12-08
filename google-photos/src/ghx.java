// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ghx extends AnimatorListenerAdapter
{

    final int a;
    final ghs b;

    ghx(ghs ghs1, int i)
    {
        b = ghs1;
        a = i;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ghs.d(b).a(new ghy(this), 1500L);
    }
}
