// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jlu extends jlp
{

    private boolean b;
    private long c;
    private int d;

    public jlu(jkq jkq1)
    {
        super(jkq1);
        jkq1.a(jjh.a(-1, "application/id3", -1, -1L));
    }

    public final void a()
    {
        b = false;
    }

    public final void a(jnl jnl1, long l, boolean flag)
    {
        if (flag)
        {
            b = true;
            c = l;
            d = 0;
        }
        if (b)
        {
            d = d + jnl1.b();
            a.a(jnl1, jnl1.b());
        }
    }

    public final void b()
    {
        a.a(c, 1, d, 0, null);
        b = false;
    }
}
