// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class otw extends jig
{

    private long a;
    private ott b;

    public otw(ott ott1)
    {
        b = ott1;
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
        if (ott.e(b) != null)
        {
            if (i() == 3 && l >= ott.d(b) * 1000L)
            {
                ott.e(b).a(false);
            }
            if (ott.e(b).b())
            {
                b.post(ott.f(b));
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
        b.post(ott.f(b));
    }

    protected final boolean c()
    {
        return a >= ott.d(b) * 1000L;
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
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
