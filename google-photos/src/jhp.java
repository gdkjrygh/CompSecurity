// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.view.View;
import android.view.animation.Animation;

final class jhp
    implements jhv
{

    View a;
    boolean b;
    boolean c;
    boolean d;
    final jhm e;
    private float f;

    jhp(jhm jhm1, View view)
    {
        e = jhm1;
        super();
        f = 1.0F;
        a = view;
    }

    public final void a()
    {
        c = true;
        jhm.h(e);
    }

    public final void a(float f1)
    {
        if ((a.getAnimation() == null || a.getAnimation().hasEnded()) && !d)
        {
            f = (1.0F / (1.0F - (f1 - 1.0F))) * 0.3333333F + 0.6666667F;
            f = Math.min(1.0F, f);
            a.setScaleX(f);
            a.setScaleY(f);
            if (f < 1.0F && !b)
            {
                b = true;
                a.postDelayed(new jhq(this), 600L);
                return;
            }
            if (f == 1.0F && b)
            {
                b = false;
                return;
            }
        }
    }

    public final void a(float f1, Point point)
    {
        jhm.c(e).a = true;
    }
}
