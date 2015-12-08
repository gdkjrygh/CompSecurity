// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            j, m, t, w, 
//            e, h, q

public static class b extends b
{

    public j a;
    protected boolean b;
    private final j c;

    private b c(e e1, h h)
    {
        e1 = (j)c.g().a(e1, h);
        if (e1 != null)
        {
            a(e1);
        }
        return this;
        h;
        e1 = (j)((m) (h)).a;
        throw h;
        h;
_L2:
        if (e1 != null)
        {
            a(e1);
        }
        throw h;
        h;
        e1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public a a()
    {
        return c();
    }

    public final c a(e e1, h h)
    {
        return c(e1, h);
    }

    public final c a(j j1)
    {
        b();
        a.a(c, j1, null);
        return this;
    }

    public final c b(e e1, h h)
    {
        return c(e1, h);
    }

    public void b()
    {
        if (b)
        {
            j j1 = (j)a.a(e, null, null);
            j1.a(c, a, null);
            a = j1;
            b = false;
        }
    }

    public b c()
    {
        b b1 = c.i();
        b1.a(d());
        return b1;
    }

    public Object clone()
    {
        return c();
    }

    public j d()
    {
        a.a(d, null, null);
        b = true;
        return a;
    }

    public final j e()
    {
        j j1 = d();
        if (!j1.j())
        {
            throw new w();
        } else
        {
            return j1;
        }
    }

    public q f()
    {
        return d();
    }

    public final q g()
    {
        return e();
    }

    public final boolean j()
    {
        return com.google.android.m4b.maps.ct.j.a(a);
    }

    public (j j1)
    {
        c = j1;
        a = (j)j1.a(e, null, null);
        b = false;
    }
}
