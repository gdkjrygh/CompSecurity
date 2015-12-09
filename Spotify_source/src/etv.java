// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class etv
    implements ett
{

    private boolean a;
    private final etr b;
    private final etk c;
    private boolean d;
    private boolean e;
    private etu f;

    public etv(etr etr1, etk etk1)
    {
        b = etr1;
        c = etk1;
    }

    public final void a(etu etu1)
    {
        f = etu1;
    }

    public final void a(boolean flag, boolean flag1)
    {
        e = flag;
    }

    public final boolean a()
    {
        return a;
    }

    public final boolean b()
    {
        return d;
    }

    public final boolean c()
    {
        return e;
    }

    public final void d()
    {
        d = false;
        if (a)
        {
            a = false;
            b.L();
        }
    }

    public final void e()
    {
        d = true;
        if (!a)
        {
            a = true;
            c.a();
            b.K();
            if (f != null)
            {
                f.a();
            }
        }
    }
}
