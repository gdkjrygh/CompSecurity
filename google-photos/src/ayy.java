// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ayy
    implements ayo, ayp
{

    public ayo a;
    public ayo b;
    private ayp c;
    private boolean d;

    public ayy()
    {
        this(null);
    }

    public ayy(ayp ayp1)
    {
        c = ayp1;
    }

    public final void a()
    {
        d = true;
        if (!b.e())
        {
            b.a();
        }
        if (d && !a.e())
        {
            a.a();
        }
    }

    public final boolean a(ayo ayo1)
    {
        boolean flag;
        if (c == null || c.a(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && (ayo1.equals(a) || !a.g());
    }

    public final boolean b()
    {
        boolean flag1 = false;
        boolean flag;
        if (c != null && c.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || g())
        {
            flag1 = true;
        }
        return flag1;
    }

    public final boolean b(ayo ayo1)
    {
        boolean flag;
        if (c == null || c.b(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && ayo1.equals(a) && !b();
    }

    public final void c()
    {
        d = false;
        a.c();
        b.c();
    }

    public final void c(ayo ayo1)
    {
        if (!ayo1.equals(b))
        {
            if (c != null)
            {
                c.c(this);
            }
            if (!b.f())
            {
                b.d();
                return;
            }
        }
    }

    public final void d()
    {
        d = false;
        b.d();
        a.d();
    }

    public final boolean e()
    {
        return a.e();
    }

    public final boolean f()
    {
        return a.f() || b.f();
    }

    public final boolean g()
    {
        return a.g() || b.g();
    }

    public final boolean h()
    {
        return a.h();
    }

    public final void i()
    {
        a.i();
        b.i();
    }
}
