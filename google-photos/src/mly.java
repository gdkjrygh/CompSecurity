// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

final class mly extends AnimatorListenerAdapter
{

    private mlx a;

    mly(mlx mlx1)
    {
        a = mlx1;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        if (!mlx.a(a).isStarted())
        {
            mlx.a(a).start();
        }
    }
}
