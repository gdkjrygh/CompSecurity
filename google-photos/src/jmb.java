// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class jmb extends jmd
{

    private final jnk a = new jnk(new byte[10]);
    private final jlp b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private long k;
    private jlz l;

    public jmb(jlz jlz1, jlp jlp1)
    {
        l = jlz1;
        super();
        b = jlp1;
        c = 0;
    }

    private void a(int i1)
    {
        c = i1;
        d = 0;
    }

    private boolean a(jnl jnl1, byte abyte0[], int i1)
    {
        int j1 = Math.min(jnl1.b(), i1 - d);
        if (j1 > 0)
        {
            if (abyte0 == null)
            {
                jnl1.c(j1);
            } else
            {
                jnl1.a(abyte0, d, j1);
            }
            d = j1 + d;
            if (d != i1)
            {
                return false;
            }
        }
        return true;
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = false;
        h = false;
        b.a();
    }

    public final void a(jnl jnl1, boolean flag, jkf jkf)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        c;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 40
    //                   1 40
    //                   2 102
    //                   3 113;
           goto _L3 _L3 _L3 _L4 _L5
_L3:
        a(1);
_L2:
        if (jnl1.b() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        switch (c)
        {
        case 0: // '\0'
            jnl1.c(jnl1.b());
            break;

        case 1: // '\001'
            if (a(jnl1, a.a, 9))
            {
                a.a(0);
                int j1 = a.c(24);
                if (j1 != 1)
                {
                    Log.w("TsExtractor", (new StringBuilder(41)).append("Unexpected start code prefix: ").append(j1).toString());
                    j = -1;
                    j1 = 0;
                } else
                {
                    a.b(8);
                    j1 = a.c(16);
                    a.b(8);
                    f = a.b();
                    g = a.b();
                    a.b(6);
                    i = a.c(8);
                    if (j1 == 0)
                    {
                        j = -1;
                    } else
                    {
                        j = (j1 + 6) - 9 - i;
                    }
                    j1 = 1;
                }
                if (j1 != 0)
                {
                    j1 = 2;
                } else
                {
                    j1 = 0;
                }
                a(j1);
            }
            break;

        case 2: // '\002'
            int k1 = Math.min(10, i);
            if (a(jnl1, a.a, k1) && a(jnl1, ((byte []) (null)), i))
            {
                a.a(0);
                k = 0L;
                if (f)
                {
                    a.b(4);
                    long l2 = a.c(3);
                    a.b(1);
                    long l4 = a.c(15) << 15;
                    a.b(1);
                    long l5 = a.c(15);
                    a.b(1);
                    if (!h && g)
                    {
                        a.b(4);
                        long l6 = a.c(3);
                        a.b(1);
                        long l7 = a.c(15) << 15;
                        a.b(1);
                        long l8 = a.c(15);
                        a.b(1);
                        jlz.b(l).a(l6 << 30 | l7 | l8);
                        h = true;
                    }
                    k = jlz.b(l).a(l2 << 30 | l4 | l5);
                }
                e = false;
                a(3);
            }
            break;

        case 3: // '\003'
            int j2 = jnl1.b();
            int l1;
            int i2;
            long l3;
            if (j == -1)
            {
                l1 = 0;
            } else
            {
                l1 = j2 - j;
            }
            i2 = j2;
            if (l1 > 0)
            {
                i2 = j2 - l1;
                jnl1.a(jnl1.b + i2);
            }
            jkf = b;
            l3 = k;
            if (!e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jkf.a(jnl1, l3, flag);
            e = true;
            if (j != -1)
            {
                j = j - i2;
                if (j == 0)
                {
                    b.b();
                    a(1);
                }
            }
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Log.w("TsExtractor", "Unexpected start indicator reading extended header");
        continue; /* Loop/switch isn't completed */
_L5:
        if (j != -1)
        {
            i1 = j;
            Log.w("TsExtractor", (new StringBuilder(59)).append("Unexpected start indicator: expected ").append(i1).append(" more bytes").toString());
        }
        if (e)
        {
            b.b();
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L6
_L6:
        return;
        if (true) goto _L3; else goto _L7
_L7:
    }
}
