// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phf extends qlq
{

    private static volatile phf a[];
    private Double b;
    private Integer c;
    private String d;
    private pgw e;
    private pgx f[];
    private Integer g;
    private Integer h;
    private int i;
    private Long j;
    private Integer k;
    private String l;
    private Integer m;
    private int n;
    private Integer o;
    private Integer p;
    private pgv q;
    private Long r;
    private pho s[];
    private phn t[];
    private phg u;

    public phf()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = pgx.b();
        g = null;
        h = null;
        i = 0x80000000;
        j = null;
        k = null;
        l = null;
        m = null;
        n = 0x80000000;
        o = null;
        p = null;
        q = null;
        r = null;
        s = pho.b();
        t = phn.b();
        u = null;
        F = null;
        G = -1;
    }

    public static phf[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new phf[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (b != null)
        {
            b.doubleValue();
            i1 = j1 + (qlp.c(1) + 8);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.e(2, c.intValue());
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + qlp.b(3, d);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + qlp.c(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    pgx pgx1 = f[j1];
                    int l1 = i1;
                    if (pgx1 != null)
                    {
                        l1 = i1 + qlp.c(5, pgx1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.e(6, g.intValue());
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.e(7, h.intValue());
        }
        i1 = j1;
        if (i != 0x80000000)
        {
            i1 = j1 + qlp.e(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.d(9, j.longValue());
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.b(10, l);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.e(11, k.intValue());
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.e(12, m.intValue());
        }
        j1 = i1;
        if (n != 0x80000000)
        {
            j1 = i1 + qlp.e(13, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.e(14, o.intValue());
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.e(15, p.intValue());
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.c(16, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + qlp.e(17, r.longValue());
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1;
            if (s.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < s.length;)
                {
                    pho pho1 = s[j1];
                    int i2 = i1;
                    if (pho1 != null)
                    {
                        i2 = i1 + qlp.c(18, pho1);
                    }
                    j1++;
                    i1 = i2;
                }

            }
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j2 >= t.length)
                    {
                        break;
                    }
                    phn phn1 = t[j2];
                    j1 = i1;
                    if (phn1 != null)
                    {
                        j1 = i1 + qlp.c(19, phn1);
                    }
                    j2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + qlp.c(20, u);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L23:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 21: default 184
    //                   0: 193
    //                   9: 195
    //                   16: 212
    //                   26: 226
    //                   34: 237
    //                   42: 266
    //                   48: 390
    //                   56: 404
    //                   64: 418
    //                   72: 519
    //                   82: 533
    //                   88: 544
    //                   96: 558
    //                   104: 572
    //                   112: 631
    //                   120: 645
    //                   130: 659
    //                   136: 688
    //                   146: 702
    //                   154: 827
    //                   162: 952;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (super.a(qlo1, i1)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        b = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
          goto _L23
_L4:
        c = Integer.valueOf(qlo1.i());
          goto _L23
_L5:
        d = qlo1.g();
          goto _L23
_L6:
        if (e == null)
        {
            e = new pgw();
        }
        qlo1.a(e);
          goto _L23
_L7:
        int k2 = qmb.b(qlo1, 42);
        pgx apgx[];
        int j1;
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.length;
        }
        apgx = new pgx[k2 + j1];
        k2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(f, 0, apgx, 0, j1);
            k2 = j1;
        }
        for (; k2 < apgx.length - 1; k2++)
        {
            apgx[k2] = new pgx();
            qlo1.a(apgx[k2]);
            qlo1.a();
        }

        apgx[k2] = new pgx();
        qlo1.a(apgx[k2]);
        f = apgx;
          goto _L23
_L8:
        g = Integer.valueOf(qlo1.i());
          goto _L23
_L9:
        h = Integer.valueOf(qlo1.i());
          goto _L23
_L10:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
            i = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        j = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L12:
        l = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L13:
        k = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L14:
        m = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L15:
        int l1 = qlo1.i();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            n = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        o = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L17:
        p = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L18:
        if (q == null)
        {
            q = new pgv();
        }
        qlo1.a(q);
        continue; /* Loop/switch isn't completed */
_L19:
        r = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L20:
        int l2 = qmb.b(qlo1, 146);
        pho apho[];
        int i2;
        if (s == null)
        {
            i2 = 0;
        } else
        {
            i2 = s.length;
        }
        apho = new pho[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(s, 0, apho, 0, i2);
            l2 = i2;
        }
        for (; l2 < apho.length - 1; l2++)
        {
            apho[l2] = new pho();
            qlo1.a(apho[l2]);
            qlo1.a();
        }

        apho[l2] = new pho();
        qlo1.a(apho[l2]);
        s = apho;
        continue; /* Loop/switch isn't completed */
_L21:
        int i3 = qmb.b(qlo1, 154);
        phn aphn[];
        int j2;
        if (t == null)
        {
            j2 = 0;
        } else
        {
            j2 = t.length;
        }
        aphn = new phn[i3 + j2];
        i3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(t, 0, aphn, 0, j2);
            i3 = j2;
        }
        for (; i3 < aphn.length - 1; i3++)
        {
            aphn[i3] = new phn();
            qlo1.a(aphn[i3]);
            qlo1.a();
        }

        aphn[i3] = new phn();
        qlo1.a(aphn[i3]);
        t = aphn;
        continue; /* Loop/switch isn't completed */
_L22:
        if (u == null)
        {
            u = new phg();
        }
        qlo1.a(u);
        if (true) goto _L23; else goto _L24
_L24:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null)
        {
            qlp1.a(1, b.doubleValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                pgx pgx1 = f[i1];
                if (pgx1 != null)
                {
                    qlp1.a(5, pgx1);
                }
            }

        }
        if (g != null)
        {
            qlp1.a(6, g.intValue());
        }
        if (h != null)
        {
            qlp1.a(7, h.intValue());
        }
        if (i != 0x80000000)
        {
            qlp1.a(8, i);
        }
        if (j != null)
        {
            qlp1.a(9, j.longValue());
        }
        if (l != null)
        {
            qlp1.a(10, l);
        }
        if (k != null)
        {
            qlp1.a(11, k.intValue());
        }
        if (m != null)
        {
            qlp1.a(12, m.intValue());
        }
        if (n != 0x80000000)
        {
            qlp1.a(13, n);
        }
        if (o != null)
        {
            qlp1.a(14, o.intValue());
        }
        if (p != null)
        {
            qlp1.a(15, p.intValue());
        }
        if (q != null)
        {
            qlp1.a(16, q);
        }
        if (r != null)
        {
            qlp1.b(17, r.longValue());
        }
        if (s != null && s.length > 0)
        {
            for (int j1 = 0; j1 < s.length; j1++)
            {
                pho pho1 = s[j1];
                if (pho1 != null)
                {
                    qlp1.a(18, pho1);
                }
            }

        }
        if (t != null && t.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < t.length; k1++)
            {
                phn phn1 = t[k1];
                if (phn1 != null)
                {
                    qlp1.a(19, phn1);
                }
            }

        }
        if (u != null)
        {
            qlp1.a(20, u);
        }
        super.a(qlp1);
    }
}
