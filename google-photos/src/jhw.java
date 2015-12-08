// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import java.util.EnumMap;

final class jhw
    implements jho, jhv
{

    jhz a;
    jhz b;
    float c;
    int d;
    private final Enum e;
    private final Enum f;
    private final boolean g;
    private View h;
    private View i;
    private ValueAnimator j;
    private boolean k;
    private jhm l;

    public jhw(jhm jhm1, Enum enum, Enum enum1)
    {
        l = jhm1;
        super();
        d = jht.a;
        e = enum;
        f = enum1;
        am am1;
        am am2;
        boolean flag;
        if (enum.ordinal() < enum1.ordinal())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        am1 = (am)jhm.a(jhm1).get(enum);
        am2 = (am)jhm.a(jhm1).get(enum1);
        a = jhm.b(jhm1).a(enum);
        b = jhm.b(jhm1).a(enum1);
        h = am1.R;
        i = am2.R;
    }

    private void a(float f1, int i1, TimeInterpolator timeinterpolator)
    {
        j = ValueAnimator.ofFloat(new float[] {
            c, f1
        }).setDuration(i1);
        j.setInterpolator(timeinterpolator);
        j.addUpdateListener(new jhx(this));
        j.addListener(new jhy(this));
        j.start();
    }

    private void c()
    {
        float f1 = 1.0F;
        if (c == 1.0F || c == 0.0F)
        {
            b();
            return;
        }
        if (c <= 0.2F)
        {
            f1 = 0.0F;
        }
        a(f1, 100, b.e(jhm.e(l).O_()));
    }

    public final void a()
    {
        d = jht.d;
        if (k)
        {
            c();
        }
    }

    public final void a(float f1)
    {
        d = jht.c;
        if (!k)
        {
            return;
        } else
        {
            b(f1);
            a.a(c);
            b.a(c);
            return;
        }
    }

    public final void a(float f1, Point point)
    {
        d = jht.b;
        jhm.c(l).a = true;
        b(f1);
        a(point);
    }

    void a(Point point)
    {
        jhm.a(l, f);
        jhm.d(l).b();
        i.setVisibility(4);
        Object obj;
        if (g)
        {
            i.bringToFront();
        } else
        {
            h.bringToFront();
        }
        obj = a.a(point, g);
        b.a(point, g, obj, this);
    }

    public final void aA_()
    {
        i.setVisibility(0);
        k = true;
        if (d == jht.d)
        {
            c();
            return;
        }
        if (d == jht.e)
        {
            a(1.0F, 200, b.d(jhm.e(l).O_()));
            return;
        } else
        {
            a.a(c);
            b.a(c);
            return;
        }
    }

    void b()
    {
        a.b();
        b.b();
        if (c == 1.0F)
        {
            jhm.b(l, e);
            jhm.c(l, f);
            jhm.f(l).c();
            jhm.g(l).t();
        } else
        {
            jhm.b(l, f);
        }
        jhm.d(l).b();
        jhm.c(l).a = false;
        jhm.g(l).s();
        jhm.h(l);
    }

    void b(float f1)
    {
        if (g)
        {
            f1 = (f1 - 1.0F) / 0.8F;
        } else
        {
            f1 = (1.0F - f1) / 0.64F;
        }
        c = Math.min(1.0F, Math.max(0.0F, f1));
    }
}
