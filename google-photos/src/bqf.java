// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.RectF;

final class bqf
    implements cvf
{

    private bqa a;

    bqf(bqa bqa1)
    {
        a = bqa1;
        super();
    }

    public final void a()
    {
        a.a(null);
    }

    public final void a(int i, boolean flag)
    {
        bqa.s(a);
        if (((bmb) (a)).d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        bqv bqv1;
        bqv1 = (bqv)bqa.h(a).b;
        bqa.q(a);
        bqa.c(a, 0L);
        if (i != 0)
        {
            if (i != 2)
            {
                continue; /* Loop/switch isn't completed */
            }
            bqa.t(a).a();
        }
_L5:
        bqv1.b(false);
        bqa.g(a).a("buffering", false);
        if (!flag) goto _L1; else goto _L3
_L3:
        bqv1.a(0L, a.c.m());
        a.c.e(false);
        a.c.a(0L);
        bqa.m(a);
        a.t();
        return;
        if (bqa.u(a)) goto _L1; else goto _L4
_L4:
        if (i == 3)
        {
            i = c.bU;
        } else
        {
            i = c.bT;
        }
        bqv1.a(true, i);
          goto _L5
    }

    public final void a(long l)
    {
        if (!((bmb) (a)).d)
        {
            return;
        } else
        {
            bqa.g(a).a("buffering", true);
            return;
        }
    }

    public final void a(long l, RectF rectf)
    {
        if (!((bmb) (a)).d)
        {
            return;
        }
        if (rectf != null)
        {
            a.c.c.j.set(rectf);
        }
        a.c.a(l);
        bqa.d(a, l);
    }

    public final void a(Bitmap bitmap)
    {
        if (((bmb) (a)).d)
        {
            bitmap = (bqv)bqa.h(a).b;
            bqa.q(a);
            bitmap.b(false);
            bqa.g(a).a("buffering", false);
            a.c.e(false);
            bqa.b(a, false);
            bqa.a(a, false);
            bqa.c(a, false);
            if (a.c.b.I)
            {
                a.k();
                bqa.r(a).a();
                return;
            }
        }
    }

    public final void b()
    {
        if (!((bmb) (a)).d)
        {
            return;
        } else
        {
            bqv bqv1 = (bqv)bqa.h(a).b;
            bqv1.b(true);
            bqv1.a(false, 0);
            bqv1.e();
            bqa.g(a).a("buffering", false);
            bqv1.e_(true);
            a.c.e(true);
            bqa.b(a, false);
            return;
        }
    }

    public final void c()
    {
        if (!((bmb) (a)).d)
        {
            return;
        } else
        {
            bqa.g(a).a("buffering", true);
            return;
        }
    }

    public final void d()
    {
        if (a.c.b.a == bxf.i)
        {
            bqa.r(a).b();
        }
    }
}
