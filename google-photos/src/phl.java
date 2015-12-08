// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phl extends qlq
{

    public Integer a;
    private phh b[];
    private pha c[];
    private long d[];
    private phr e[];
    private pgw f[];
    private pgx g[];
    private phf h[];
    private Integer i;
    private String j;
    private pgw k;
    private String l;
    private Integer m;
    private phb n;
    private int o;
    private phk p;
    private pgu q;

    public phl()
    {
        b = phh.b();
        c = pha.b();
        d = qmb.b;
        e = phr.b();
        f = pgw.b();
        g = pgx.b();
        h = phf.b();
        i = null;
        j = null;
        a = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = 0x80000000;
        p = null;
        q = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < b.length;)
                {
                    phh phh1 = b[j1];
                    int k1 = i1;
                    if (phh1 != null)
                    {
                        k1 = i1 + qlp.c(1, phh1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    pha pha1 = c[j1];
                    int l1 = i1;
                    if (pha1 != null)
                    {
                        l1 = i1 + qlp.c(2, pha1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (d.length > 0)
            {
                i1 = j1 + d.length * 8 + d.length * 1;
            }
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    phr phr1 = e[j1];
                    int i2 = i1;
                    if (phr1 != null)
                    {
                        i2 = i1 + qlp.c(4, phr1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        int j2 = j1;
        if (f != null)
        {
            j2 = j1;
            if (f.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < f.length;)
                {
                    pgw pgw1 = f[j1];
                    j2 = i1;
                    if (pgw1 != null)
                    {
                        j2 = i1 + qlp.c(5, pgw1);
                    }
                    j1++;
                    i1 = j2;
                }

                j2 = i1;
            }
        }
        i1 = j2;
        if (g != null)
        {
            i1 = j2;
            if (g.length > 0)
            {
                i1 = j2;
                for (j1 = 0; j1 < g.length;)
                {
                    pgx pgx1 = g[j1];
                    int k2 = i1;
                    if (pgx1 != null)
                    {
                        k2 = i1 + qlp.c(6, pgx1);
                    }
                    j1++;
                    i1 = k2;
                }

            }
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                int l2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l2 >= h.length)
                    {
                        break;
                    }
                    phf phf1 = h[l2];
                    j1 = i1;
                    if (phf1 != null)
                    {
                        j1 = i1 + qlp.c(7, phf1);
                    }
                    l2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.e(8, i.intValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.b(9, j);
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.e(10, a.intValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + qlp.e(13, m.intValue());
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.c(14, n);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.c(15, p);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.c(16, q);
        }
        j1 = i1;
        if (o != 0x80000000)
        {
            j1 = i1 + qlp.e(33, o);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L21:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 19: default 168
    //                   0: 177
    //                   10: 179
    //                   18: 303
    //                   25: 427
    //                   26: 528
    //                   34: 630
    //                   42: 754
    //                   50: 878
    //                   58: 1002
    //                   64: 1126
    //                   74: 1140
    //                   80: 1151
    //                   90: 1165
    //                   98: 1194
    //                   104: 1205
    //                   114: 1219
    //                   122: 1248
    //                   130: 1277
    //                   264: 1306;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L1:
        if (super.a(qlo1, i1)) goto _L21; else goto _L2
_L2:
        return this;
_L3:
        int k3 = qmb.b(qlo1, 10);
        phh aphh[];
        int j1;
        if (b == null)
        {
            j1 = 0;
        } else
        {
            j1 = b.length;
        }
        aphh = new phh[k3 + j1];
        k3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(b, 0, aphh, 0, j1);
            k3 = j1;
        }
        for (; k3 < aphh.length - 1; k3++)
        {
            aphh[k3] = new phh();
            qlo1.a(aphh[k3]);
            qlo1.a();
        }

        aphh[k3] = new phh();
        qlo1.a(aphh[k3]);
        b = aphh;
          goto _L21
_L4:
        int l3 = qmb.b(qlo1, 18);
        pha apha[];
        int k1;
        if (c == null)
        {
            k1 = 0;
        } else
        {
            k1 = c.length;
        }
        apha = new pha[l3 + k1];
        l3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(c, 0, apha, 0, k1);
            l3 = k1;
        }
        for (; l3 < apha.length - 1; l3++)
        {
            apha[l3] = new pha();
            qlo1.a(apha[l3]);
            qlo1.a();
        }

        apha[l3] = new pha();
        qlo1.a(apha[l3]);
        c = apha;
          goto _L21
_L5:
        int i4 = qmb.b(qlo1, 25);
        long al[];
        int l1;
        if (d == null)
        {
            l1 = 0;
        } else
        {
            l1 = d.length;
        }
        al = new long[i4 + l1];
        i4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(d, 0, al, 0, l1);
            i4 = l1;
        }
        for (; i4 < al.length - 1; i4++)
        {
            al[i4] = qlo1.l();
            qlo1.a();
        }

        al[i4] = qlo1.l();
        d = al;
          goto _L21
_L6:
        int i2 = qlo1.i();
        int k5 = qlo1.c(i2);
        int j4 = i2 / 8;
        long al1[];
        if (d == null)
        {
            i2 = 0;
        } else
        {
            i2 = d.length;
        }
        al1 = new long[j4 + i2];
        j4 = i2;
        if (i2 != 0)
        {
            System.arraycopy(d, 0, al1, 0, i2);
            j4 = i2;
        }
        for (; j4 < al1.length; j4++)
        {
            al1[j4] = qlo1.l();
        }

        d = al1;
        qlo1.d(k5);
          goto _L21
_L7:
        int k4 = qmb.b(qlo1, 34);
        phr aphr[];
        int j2;
        if (e == null)
        {
            j2 = 0;
        } else
        {
            j2 = e.length;
        }
        aphr = new phr[k4 + j2];
        k4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(e, 0, aphr, 0, j2);
            k4 = j2;
        }
        for (; k4 < aphr.length - 1; k4++)
        {
            aphr[k4] = new phr();
            qlo1.a(aphr[k4]);
            qlo1.a();
        }

        aphr[k4] = new phr();
        qlo1.a(aphr[k4]);
        e = aphr;
          goto _L21
_L8:
        int l4 = qmb.b(qlo1, 42);
        pgw apgw[];
        int k2;
        if (f == null)
        {
            k2 = 0;
        } else
        {
            k2 = f.length;
        }
        apgw = new pgw[l4 + k2];
        l4 = k2;
        if (k2 != 0)
        {
            System.arraycopy(f, 0, apgw, 0, k2);
            l4 = k2;
        }
        for (; l4 < apgw.length - 1; l4++)
        {
            apgw[l4] = new pgw();
            qlo1.a(apgw[l4]);
            qlo1.a();
        }

        apgw[l4] = new pgw();
        qlo1.a(apgw[l4]);
        f = apgw;
          goto _L21
_L9:
        int i5 = qmb.b(qlo1, 50);
        pgx apgx[];
        int l2;
        if (g == null)
        {
            l2 = 0;
        } else
        {
            l2 = g.length;
        }
        apgx = new pgx[i5 + l2];
        i5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(g, 0, apgx, 0, l2);
            i5 = l2;
        }
        for (; i5 < apgx.length - 1; i5++)
        {
            apgx[i5] = new pgx();
            qlo1.a(apgx[i5]);
            qlo1.a();
        }

        apgx[i5] = new pgx();
        qlo1.a(apgx[i5]);
        g = apgx;
          goto _L21
_L10:
        int j5 = qmb.b(qlo1, 58);
        phf aphf[];
        int i3;
        if (h == null)
        {
            i3 = 0;
        } else
        {
            i3 = h.length;
        }
        aphf = new phf[j5 + i3];
        j5 = i3;
        if (i3 != 0)
        {
            System.arraycopy(h, 0, aphf, 0, i3);
            j5 = i3;
        }
        for (; j5 < aphf.length - 1; j5++)
        {
            aphf[j5] = new phf();
            qlo1.a(aphf[j5]);
            qlo1.a();
        }

        aphf[j5] = new phf();
        qlo1.a(aphf[j5]);
        h = aphf;
          goto _L21
_L11:
        i = Integer.valueOf(qlo1.i());
          goto _L21
_L12:
        j = qlo1.g();
          goto _L21
_L13:
        a = Integer.valueOf(qlo1.i());
          goto _L21
_L14:
        if (k == null)
        {
            k = new pgw();
        }
        qlo1.a(k);
          goto _L21
_L15:
        l = qlo1.g();
          goto _L21
_L16:
        m = Integer.valueOf(qlo1.i());
          goto _L21
_L17:
        if (n == null)
        {
            n = new phb();
        }
        qlo1.a(n);
          goto _L21
_L18:
        if (p == null)
        {
            p = new phk();
        }
        qlo1.a(p);
          goto _L21
_L19:
        if (q == null)
        {
            q = new pgu();
        }
        qlo1.a(q);
          goto _L21
_L20:
        int j3 = qlo1.i();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            o = j3;
            break;
        }
        if (true) goto _L21; else goto _L22
_L22:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                phh phh1 = b[i1];
                if (phh1 != null)
                {
                    qlp1.a(1, phh1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                pha pha1 = c[j1];
                if (pha1 != null)
                {
                    qlp1.a(2, pha1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k1 = 0; k1 < d.length; k1++)
            {
                qlp1.c(3, d[k1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l1 = 0; l1 < e.length; l1++)
            {
                phr phr1 = e[l1];
                if (phr1 != null)
                {
                    qlp1.a(4, phr1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int i2 = 0; i2 < f.length; i2++)
            {
                pgw pgw1 = f[i2];
                if (pgw1 != null)
                {
                    qlp1.a(5, pgw1);
                }
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j2 = 0; j2 < g.length; j2++)
            {
                pgx pgx1 = g[j2];
                if (pgx1 != null)
                {
                    qlp1.a(6, pgx1);
                }
            }

        }
        if (h != null && h.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < h.length; k2++)
            {
                phf phf1 = h[k2];
                if (phf1 != null)
                {
                    qlp1.a(7, phf1);
                }
            }

        }
        if (i != null)
        {
            qlp1.a(8, i.intValue());
        }
        if (j != null)
        {
            qlp1.a(9, j);
        }
        if (a != null)
        {
            qlp1.a(10, a.intValue());
        }
        if (k != null)
        {
            qlp1.a(11, k);
        }
        if (l != null)
        {
            qlp1.a(12, l);
        }
        if (m != null)
        {
            qlp1.a(13, m.intValue());
        }
        if (n != null)
        {
            qlp1.a(14, n);
        }
        if (p != null)
        {
            qlp1.a(15, p);
        }
        if (q != null)
        {
            qlp1.a(16, q);
        }
        if (o != 0x80000000)
        {
            qlp1.a(33, o);
        }
        super.a(qlp1);
    }
}
