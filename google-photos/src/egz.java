// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

final class egz extends AnimatorListenerAdapter
{

    private egv a;

    egz(egv egv1)
    {
        a = egv1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        egv.a(a, 0);
        egv.h(a).post(egv.g(a));
    }
}
