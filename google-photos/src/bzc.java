// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bzc extends jig
{

    private long a;
    private bza b;

    public bzc(bza bza1)
    {
        b = bza1;
        super();
    }

    protected final jjh a(int i)
    {
        return jjh.a(-1, "application/octet-stream", -1, -2L);
    }

    protected final void a(int i, long l, boolean flag)
    {
        a = l;
    }

    protected final void a(long l, long l1)
    {
        a = l;
        if (b.a != null)
        {
            if (i() == 3 && l >= b.e() * 1000L)
            {
                b.a.a(false);
            }
            if (b.a.b())
            {
                b.g();
                return;
            }
        }
    }

    protected final boolean a(long l)
    {
        return true;
    }

    protected final int aB_()
    {
        return 1;
    }

    protected final void b(long l)
    {
        a = l;
        b.g();
    }

    protected final boolean c()
    {
        return a >= b.e() * 1000L;
    }

    protected final boolean d()
    {
        return true;
    }

    public final void e()
    {
    }

    protected final long f()
    {
        return -2L;
    }

    protected final long g()
    {
        return -3L;
    }
}
