// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;

final class mlz extends mka
{

    private mlx a;

    mlz(mlx mlx1)
    {
        a = mlx1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a(animator))
        {
            mlx.a(a, null);
            return;
        }
        mlx.a(a, mlx.b(a), false);
        if (mlx.c(a) != null)
        {
            mlx.c(a).run();
            mlx.a(a, null);
        }
        mlx.d(a);
    }
}
