// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ValueAnimator;

final class mma
    implements Runnable
{

    private mlx a;

    mma(mlx mlx1)
    {
        a = mlx1;
        super();
    }

    public final void run()
    {
        mlx.e(a);
        mlx.a(a, 0.0F);
        mlx.b(a, (mlx.f(a) + 216F) % 360F);
        mlx.a(a, mlx.g(a));
        mlx.b(a, mlx.h(a)[mlx.i(a)]);
        mlx.j(a).setIntValues(new int[] {
            mlx.h(a)[mlx.i(a)], mlx.h(a)[mlx.g(a)]
        });
    }
}
