// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pev extends qlq
{

    public pgp a;
    public pqb b;
    public pgt c;
    public pen d;
    public pef e[];
    public pgn f;
    public pee g;
    public pey h[];
    public Boolean i;
    public ppq j;
    private int k;
    private pgo l;
    private String m;
    private int n;
    private String o;

    public pev()
    {
        a = null;
        k = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = pef.b();
        f = null;
        g = null;
        h = pey.b();
        l = null;
        i = null;
        m = null;
        n = 0x80000000;
        o = null;
        j = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.c(1, a);
        }
        j1 = i1;
        if (k != 0x80000000)
        {
            j1 = i1 + qlp.e(3, k);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(4, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(5, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(6, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    pef pef1 = e[j1];
                    int k1 = i1;
                    if (pef1 != null)
                    {
                        k1 = i1 + qlp.c(7, pef1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        int l1 = j1;
        if (f != null)
        {
            l1 = j1 + qlp.c(9, f);
        }
        i1 = l1;
        if (g != null)
        {
            i1 = l1 + qlp.c(10, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= h.length)
                    {
                        break;
                    }
                    pey pey1 = h[i2];
                    j1 = i1;
                    if (pey1 != null)
                    {
                        j1 = i1 + qlp.c(11, pey1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.c(12, l);
        }
        j1 = i1;
        if (i != null)
        {
            i.booleanValue();
            j1 = i1 + (qlp.c(13) + 1);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.b(14, m);
        }
        j1 = i1;
        if (n != 0x80000000)
        {
            j1 = i1 + qlp.e(15, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.b(16, o);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.c(17, j);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L18:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 16: default 144
    //                   0: 153
    //                   10: 155
    //                   24: 184
    //                   34: 223
    //                   42: 252
    //                   50: 281
    //                   58: 310
    //                   74: 434
    //                   82: 463
    //                   90: 492
    //                   98: 616
    //                   104: 645
    //                   114: 659
    //                   120: 670
    //                   130: 719
    //                   138: 730;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        if (super.a(qlo1, i1)) goto _L18; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new pgp();
        }
        qlo1.a(a);
          goto _L18
_L4:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
            k = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b == null)
        {
            b = new pqb();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new pgt();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new pen();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L8:
        int j2 = qmb.b(qlo1, 58);
        pef apef[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        apef = new pef[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, apef, 0, k1);
            j2 = k1;
        }
        for (; j2 < apef.length - 1; j2++)
        {
            apef[j2] = new pef();
            qlo1.a(apef[j2]);
            qlo1.a();
        }

        apef[j2] = new pef();
        qlo1.a(apef[j2]);
        e = apef;
        continue; /* Loop/switch isn't completed */
_L9:
        if (f == null)
        {
            f = new pgn();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L10:
        if (g == null)
        {
            g = new pee();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L11:
        int k2 = qmb.b(qlo1, 90);
        pey apey[];
        int l1;
        if (h == null)
        {
            l1 = 0;
        } else
        {
            l1 = h.length;
        }
        apey = new pey[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(h, 0, apey, 0, l1);
            k2 = l1;
        }
        for (; k2 < apey.length - 1; k2++)
        {
            apey[k2] = new pey();
            qlo1.a(apey[k2]);
            qlo1.a();
        }

        apey[k2] = new pey();
        qlo1.a(apey[k2]);
        h = apey;
        continue; /* Loop/switch isn't completed */
_L12:
        if (l == null)
        {
            l = new pgo();
        }
        qlo1.a(l);
        continue; /* Loop/switch isn't completed */
_L13:
        i = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        m = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L15:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            n = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        o = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L17:
        if (j == null)
        {
            j = new ppq();
        }
        qlo1.a(j);
        if (true) goto _L18; else goto _L19
_L19:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (k != 0x80000000)
        {
            qlp1.a(3, k);
        }
        if (b != null)
        {
            qlp1.a(4, b);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i1 = 0; i1 < e.length; i1++)
            {
                pef pef1 = e[i1];
                if (pef1 != null)
                {
                    qlp1.a(7, pef1);
                }
            }

        }
        if (f != null)
        {
            qlp1.a(9, f);
        }
        if (g != null)
        {
            qlp1.a(10, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < h.length; j1++)
            {
                pey pey1 = h[j1];
                if (pey1 != null)
                {
                    qlp1.a(11, pey1);
                }
            }

        }
        if (l != null)
        {
            qlp1.a(12, l);
        }
        if (i != null)
        {
            qlp1.a(13, i.booleanValue());
        }
        if (m != null)
        {
            qlp1.a(14, m);
        }
        if (n != 0x80000000)
        {
            qlp1.a(15, n);
        }
        if (o != null)
        {
            qlp1.a(16, o);
        }
        if (j != null)
        {
            qlp1.a(17, j);
        }
        super.a(qlp1);
    }
}
