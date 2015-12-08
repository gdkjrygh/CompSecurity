// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jly extends jlp
{

    public jly(jkq jkq1)
    {
        super(jkq1);
        jkq1.a(jjh.a(-1, "application/eia-608", -1, -1L, null));
    }

    public final void a()
    {
    }

    public final void a(jnl jnl1, long l, boolean flag)
    {
        while (jnl1.b() > 1) 
        {
            int i = 0;
            int j;
            int k;
            do
            {
                k = jnl1.d();
                j = i + k;
                i = j;
            } while (k == 255);
            i = 0;
            int i1;
            do
            {
                i1 = jnl1.d();
                k = i + i1;
                i = k;
            } while (i1 == 255);
            if (jmm.a(j, k, jnl1))
            {
                a.a(jnl1, k);
                a.a(l, 1, k, 0, null);
            } else
            {
                jnl1.c(k);
            }
        }
    }

    public final void b()
    {
    }
}
