// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request;


// Referenced classes of package com.bumptech.glide.request:
//            c, d

public class g
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

    private boolean j()
    {
        return c == null || c.a(this);
    }

    private boolean k()
    {
        return c == null || c.b(this);
    }

    private boolean l()
    {
        return c != null && c.c();
    }

    public void a()
    {
        a.a();
        b.a();
    }

    public void a(c c1, c c2)
    {
        a = c1;
        b = c2;
    }

    public boolean a(c c1)
    {
        return j() && (c1.equals(a) || !a.h());
    }

    public void b()
    {
        if (!b.f())
        {
            b.b();
        }
        if (!a.f())
        {
            a.b();
        }
    }

    public boolean b(c c1)
    {
        return k() && c1.equals(a) && !c();
    }

    public void c(c c1)
    {
        if (!c1.equals(b))
        {
            if (c != null)
            {
                c.c(this);
            }
            if (!b.g())
            {
                b.d();
                return;
            }
        }
    }

    public boolean c()
    {
        return l() || h();
    }

    public void d()
    {
        b.d();
        a.d();
    }

    public void e()
    {
        a.e();
        b.e();
    }

    public boolean f()
    {
        return a.f();
    }

    public boolean g()
    {
        return a.g() || b.g();
    }

    public boolean h()
    {
        return a.h() || b.h();
    }

    public boolean i()
    {
        return a.i();
    }
}
