// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

final class jma extends jmd
{

    private final jnk a = new jnk(new byte[4]);
    private jlz b;

    public jma(jlz jlz1)
    {
        b = jlz1;
        super();
    }

    public final void a()
    {
    }

    public final void a(jnl jnl1, boolean flag, jkf jkf)
    {
        if (flag)
        {
            jnl1.c(jnl1.d());
        }
        jnl1.a(a, 3);
        a.b(12);
        int i = a.c(12);
        jnl1.c(5);
        int k = (i - 9) / 4;
        for (int j = 0; j < k; j++)
        {
            jnl1.a(a, 4);
            a.b(19);
            int l = a.c(13);
            b.b.put(l, new jmc(b));
        }

    }
}
