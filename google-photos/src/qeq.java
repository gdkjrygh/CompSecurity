// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qeq extends qlq
{

    public qcm a[];
    public pzd b;
    public String c;
    public String d;
    public pzy e[];
    public Long f;
    public Long g;
    public Long h;
    public qbg i;
    public qis j;
    public qes k;
    public qem l;
    public qex m;
    public qgk n[];
    public int o;
    private pzh p[];
    private int q;
    private Long r;
    private int s;
    private qak t;
    private qek u;
    private qkn v[];

    public qeq()
    {
        a = qcm.b();
        b = null;
        c = null;
        d = null;
        p = pzh.b();
        e = pzy.b();
        f = null;
        q = 0x80000000;
        g = null;
        r = null;
        h = null;
        s = 0x80000000;
        t = null;
        u = null;
        i = null;
        j = null;
        v = qkn.b();
        k = null;
        l = null;
        m = null;
        n = qgk.b();
        o = 0x80000000;
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
            i1 = j1;
            if (a.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < a.length;)
                {
                    qcm qcm1 = a[j1];
                    int k1 = i1;
                    if (qcm1 != null)
                    {
                        k1 = i1 + qlp.c(1, qcm1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        int l1 = j1;
        if (c != null)
        {
            l1 = j1 + qlp.b(3, c);
        }
        i1 = l1;
        if (d != null)
        {
            i1 = l1 + qlp.b(4, d);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    pzh pzh1 = p[j1];
                    l1 = i1;
                    if (pzh1 != null)
                    {
                        l1 = i1 + qlp.c(5, pzh1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1;
            if (e.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < e.length;)
                {
                    pzy pzy1 = e[j1];
                    l1 = i1;
                    if (pzy1 != null)
                    {
                        l1 = i1 + qlp.c(6, pzy1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.e(7, f.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.e(8, g.longValue());
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + qlp.e(9, r.longValue());
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.e(10, h.longValue());
        }
        j1 = i1;
        if (s != 0x80000000)
        {
            j1 = i1 + qlp.e(11, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + qlp.c(12, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + qlp.c(13, u);
        }
        l1 = j1;
        if (i != null)
        {
            l1 = j1 + qlp.c(15, i);
        }
        i1 = l1;
        if (j != null)
        {
            i1 = l1 + qlp.c(16, j);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1;
            if (v.length > 0)
            {
                for (j1 = 0; j1 < v.length;)
                {
                    qkn qkn1 = v[j1];
                    l1 = i1;
                    if (qkn1 != null)
                    {
                        l1 = i1 + qlp.c(17, qkn1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(18, k);
        }
        j1 = i1;
        if (q != 0x80000000)
        {
            j1 = i1 + qlp.e(19, q);
        }
        l1 = j1;
        if (l != null)
        {
            l1 = j1 + qlp.c(21, l);
        }
        i1 = l1;
        if (m != null)
        {
            i1 = l1 + qlp.c(22, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= n.length)
                    {
                        break;
                    }
                    qgk qgk1 = n[i2];
                    j1 = i1;
                    if (qgk1 != null)
                    {
                        j1 = i1 + qlp.c(23, qgk1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (o != 0x80000000)
        {
            i1 = j1 + qlp.e(24, o);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L25:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 23: default 200
    //                   0: 209
    //                   10: 211
    //                   18: 335
    //                   26: 364
    //                   34: 375
    //                   42: 386
    //                   50: 510
    //                   56: 634
    //                   64: 648
    //                   72: 662
    //                   80: 676
    //                   88: 690
    //                   98: 751
    //                   106: 780
    //                   122: 809
    //                   130: 838
    //                   138: 867
    //                   146: 992
    //                   152: 1021
    //                   170: 1063
    //                   178: 1092
    //                   186: 1121
    //                   192: 1246;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L1:
        if (super.a(qlo1, i1)) goto _L25; else goto _L2
_L2:
        return this;
_L3:
        int j3 = qmb.b(qlo1, 10);
        qcm aqcm[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        aqcm = new qcm[j3 + j1];
        j3 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, aqcm, 0, j1);
            j3 = j1;
        }
        for (; j3 < aqcm.length - 1; j3++)
        {
            aqcm[j3] = new qcm();
            qlo1.a(aqcm[j3]);
            qlo1.a();
        }

        aqcm[j3] = new qcm();
        qlo1.a(aqcm[j3]);
        a = aqcm;
          goto _L25
_L4:
        if (b == null)
        {
            b = new pzd();
        }
        qlo1.a(b);
          goto _L25
_L5:
        c = qlo1.g();
          goto _L25
_L6:
        d = qlo1.g();
          goto _L25
_L7:
        int k3 = qmb.b(qlo1, 42);
        pzh apzh[];
        int k1;
        if (p == null)
        {
            k1 = 0;
        } else
        {
            k1 = p.length;
        }
        apzh = new pzh[k3 + k1];
        k3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(p, 0, apzh, 0, k1);
            k3 = k1;
        }
        for (; k3 < apzh.length - 1; k3++)
        {
            apzh[k3] = new pzh();
            qlo1.a(apzh[k3]);
            qlo1.a();
        }

        apzh[k3] = new pzh();
        qlo1.a(apzh[k3]);
        p = apzh;
          goto _L25
_L8:
        int l3 = qmb.b(qlo1, 50);
        pzy apzy[];
        int l1;
        if (e == null)
        {
            l1 = 0;
        } else
        {
            l1 = e.length;
        }
        apzy = new pzy[l3 + l1];
        l3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(e, 0, apzy, 0, l1);
            l3 = l1;
        }
        for (; l3 < apzy.length - 1; l3++)
        {
            apzy[l3] = new pzy();
            qlo1.a(apzy[l3]);
            qlo1.a();
        }

        apzy[l3] = new pzy();
        qlo1.a(apzy[l3]);
        e = apzy;
          goto _L25
_L9:
        f = Long.valueOf(qlo1.j());
          goto _L25
_L10:
        g = Long.valueOf(qlo1.j());
          goto _L25
_L11:
        r = Long.valueOf(qlo1.j());
          goto _L25
_L12:
        h = Long.valueOf(qlo1.j());
          goto _L25
_L13:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 100: // 'd'
            s = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (t == null)
        {
            t = new qak();
        }
        qlo1.a(t);
        continue; /* Loop/switch isn't completed */
_L15:
        if (u == null)
        {
            u = new qek();
        }
        qlo1.a(u);
        continue; /* Loop/switch isn't completed */
_L16:
        if (i == null)
        {
            i = new qbg();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L17:
        if (j == null)
        {
            j = new qis();
        }
        qlo1.a(j);
        continue; /* Loop/switch isn't completed */
_L18:
        int i4 = qmb.b(qlo1, 138);
        qkn aqkn[];
        int j2;
        if (v == null)
        {
            j2 = 0;
        } else
        {
            j2 = v.length;
        }
        aqkn = new qkn[i4 + j2];
        i4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(v, 0, aqkn, 0, j2);
            i4 = j2;
        }
        for (; i4 < aqkn.length - 1; i4++)
        {
            aqkn[i4] = new qkn();
            qlo1.a(aqkn[i4]);
            qlo1.a();
        }

        aqkn[i4] = new qkn();
        qlo1.a(aqkn[i4]);
        v = aqkn;
        continue; /* Loop/switch isn't completed */
_L19:
        if (k == null)
        {
            k = new qes();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = qlo1.i();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            q = k2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        if (l == null)
        {
            l = new qem();
        }
        qlo1.a(l);
        continue; /* Loop/switch isn't completed */
_L22:
        if (m == null)
        {
            m = new qex();
        }
        qlo1.a(m);
        continue; /* Loop/switch isn't completed */
_L23:
        int j4 = qmb.b(qlo1, 186);
        qgk aqgk[];
        int l2;
        if (n == null)
        {
            l2 = 0;
        } else
        {
            l2 = n.length;
        }
        aqgk = new qgk[j4 + l2];
        j4 = l2;
        if (l2 != 0)
        {
            System.arraycopy(n, 0, aqgk, 0, l2);
            j4 = l2;
        }
        for (; j4 < aqgk.length - 1; j4++)
        {
            aqgk[j4] = new qgk();
            qlo1.a(aqgk[j4]);
            qlo1.a();
        }

        aqgk[j4] = new qgk();
        qlo1.a(aqgk[j4]);
        n = aqgk;
        continue; /* Loop/switch isn't completed */
_L24:
        int i3 = qlo1.i();
        switch (i3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            o = i3;
            break;
        }
        if (true) goto _L25; else goto _L26
_L26:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                qcm qcm1 = a[i1];
                if (qcm1 != null)
                {
                    qlp1.a(1, qcm1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (p != null && p.length > 0)
        {
            for (int j1 = 0; j1 < p.length; j1++)
            {
                pzh pzh1 = p[j1];
                if (pzh1 != null)
                {
                    qlp1.a(5, pzh1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k1 = 0; k1 < e.length; k1++)
            {
                pzy pzy1 = e[k1];
                if (pzy1 != null)
                {
                    qlp1.a(6, pzy1);
                }
            }

        }
        if (f != null)
        {
            qlp1.b(7, f.longValue());
        }
        if (g != null)
        {
            qlp1.b(8, g.longValue());
        }
        if (r != null)
        {
            qlp1.b(9, r.longValue());
        }
        if (h != null)
        {
            qlp1.b(10, h.longValue());
        }
        if (s != 0x80000000)
        {
            qlp1.a(11, s);
        }
        if (t != null)
        {
            qlp1.a(12, t);
        }
        if (u != null)
        {
            qlp1.a(13, u);
        }
        if (i != null)
        {
            qlp1.a(15, i);
        }
        if (j != null)
        {
            qlp1.a(16, j);
        }
        if (v != null && v.length > 0)
        {
            for (int l1 = 0; l1 < v.length; l1++)
            {
                qkn qkn1 = v[l1];
                if (qkn1 != null)
                {
                    qlp1.a(17, qkn1);
                }
            }

        }
        if (k != null)
        {
            qlp1.a(18, k);
        }
        if (q != 0x80000000)
        {
            qlp1.a(19, q);
        }
        if (l != null)
        {
            qlp1.a(21, l);
        }
        if (m != null)
        {
            qlp1.a(22, m);
        }
        if (n != null && n.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < n.length; i2++)
            {
                qgk qgk1 = n[i2];
                if (qgk1 != null)
                {
                    qlp1.a(23, qgk1);
                }
            }

        }
        if (o != 0x80000000)
        {
            qlp1.a(24, o);
        }
        super.a(qlp1);
    }
}
