// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g;


// Referenced classes of package com.bumptech.glide.g:
//            c, d

public final class g
    implements c, d
{

    private c a;
    private c b;
    private d c;

    public g()
    {
        this(null);
    }

    public g(d d1)
    {
        c = d1;
    }

    public final void a()
    {
        a.a();
        b.a();
    }

    public final void a(c c1, c c2)
    {
        a = c1;
        b = c2;
    }

    public final boolean a(c c1)
    {
        boolean flag;
        if (c == null || c.a(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && (c1.equals(a) || !a.g());
    }

    public final void b()
    {
        if (!b.e())
        {
            b.b();
        }
        if (!a.e())
        {
            a.b();
        }
    }

    public final boolean b(c c1)
    {
        boolean flag;
        if (c == null || c.b(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && c1.equals(a) && !i();
    }

    public final void c()
    {
        b.c();
        a.c();
    }

    public final void c(c c1)
    {
        if (!c1.equals(b))
        {
            if (c != null)
            {
                c.c(this);
            }
            if (!b.f())
            {
                b.c();
                return;
            }
        }
    }

    public final void d()
    {
        a.d();
        b.d();
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

    public final boolean i()
    {
        boolean flag1 = false;
        boolean flag;
        if (c != null && c.i())
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
}
