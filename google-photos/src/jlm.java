// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jlm extends jlp
{

    private final jnk b = new jnk(new byte[8]);
    private final jnl c;
    private int d;
    private int e;
    private boolean f;
    private long g;
    private jjh h;
    private int i;
    private int j;
    private long k;

    public jlm(jkq jkq1)
    {
        super(jkq1);
        c = new jnl(b.a);
        d = 0;
    }

    public final void a()
    {
        d = 0;
        e = 0;
        f = false;
    }

    public final void a(jnl jnl1, long l, boolean flag)
    {
        if (flag)
        {
            k = l;
        }
_L14:
        if (jnl1.b() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        d;
        JVM INSTR tableswitch 0 2: default 48
    //                   0 51
    //                   1 184
    //                   2 384;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_51;
_L1:
        continue; /* Loop/switch isn't completed */
_L9:
        if (jnl1.b() <= 0) goto _L6; else goto _L5
_L5:
        if (f) goto _L8; else goto _L7
_L7:
        if (jnl1.d() == 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
          goto _L9
_L8:
        int i1 = jnl1.d();
        if (i1 != 119) goto _L11; else goto _L10
_L10:
        f = false;
        i1 = 1;
_L12:
        if (i1 != 0)
        {
            d = 1;
            c.a[0] = 11;
            c.a[1] = 119;
            e = 2;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (i1 == 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
          goto _L9
_L6:
        i1 = 0;
          goto _L12
_L3:
        byte abyte0[] = c.a;
        int j1 = Math.min(jnl1.b(), 8 - e);
        jnl1.a(abyte0, e, j1);
        e = e + j1;
        boolean flag1;
        if (e == 8)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            b.a(0);
            i = jne.a(b);
            if (h == null)
            {
                b.a(0);
                h = jne.a(b, -1, -1L, null);
                a.a(h);
                j = jne.a(i, h.n);
            }
            g = (int)((8000L * (long)i) / (long)j);
            c.b(0);
            a.a(c, 8);
            d = 2;
        }
        continue; /* Loop/switch isn't completed */
          goto _L9
_L4:
        int k1 = Math.min(jnl1.b(), i - e);
        a.a(jnl1, k1);
        e = k1 + e;
        if (e == i)
        {
            a.a(k, 1, i, 0, null);
            k = k + g;
            d = 0;
        }
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final void b()
    {
    }
}
