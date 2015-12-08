// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etw
    implements ett
{

    private boolean a;
    private final etr b;
    private final etk c;
    private boolean d;
    private boolean e;
    private etu f;

    public etw(etr etr1, etk etk1)
    {
        b = etr1;
        c = etk1;
    }

    private void f()
    {
        if (!a)
        {
            a = true;
            c.a();
            b.K();
            if (f != null)
            {
                f.a();
                return;
            }
        }
    }

    private void g()
    {
        if (!e && !d && a)
        {
            a = false;
            b.L();
        }
    }

    public final void a(etu etu1)
    {
        f = etu1;
    }

    public final void a(boolean flag, boolean flag1)
    {
        d = flag;
        if (flag)
        {
            if (flag1)
            {
                f();
            }
            return;
        } else
        {
            g();
            return;
        }
    }

    public final boolean a()
    {
        return a;
    }

    public final boolean b()
    {
        return e;
    }

    public final boolean c()
    {
        return d;
    }

    public final void d()
    {
        e = false;
        g();
    }

    public final void e()
    {
        e = true;
        f();
    }
}
