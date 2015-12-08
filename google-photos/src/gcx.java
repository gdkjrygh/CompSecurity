// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class gcx
{

    public final String a;
    public final String b;
    public final qgg c[];
    public final qir d[];
    public final qfu e;
    public final qfz f[];
    public final qfx g[];
    public final boolean h;

    public gcx(geh geh1)
    {
        a = geh1.a.a;
        b = geh1.a.g;
        c = geh1.a.b;
        qfu qfu1;
        boolean flag;
        if (geh1.a.d != null && geh1.a.d.length > 0)
        {
            qfu1 = geh1.a.d[0];
        } else
        {
            qfu1 = null;
        }
        e = qfu1;
        d = geh1.a.f;
        f = geh1.a.c;
        g = geh1.a.e;
        if (geh1.a.h == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean c()
    {
        return c.length > 0 || f.length > 0 || d.length > 0 || g != null && g.length > 0;
    }

    public boolean d()
    {
        return h;
    }

    public Long e()
    {
        if (e != null && e.d != null && e.d.a != null)
        {
            return e.d.a;
        } else
        {
            return null;
        }
    }

    public int f()
    {
        return c.length;
    }

    public qfu g()
    {
        return e;
    }

    public qgg[] h()
    {
        return c;
    }

    public qir[] i()
    {
        return d;
    }

    public qfz[] j()
    {
        return f;
    }

    public qfx[] k()
    {
        return g;
    }
}
