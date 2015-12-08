// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pny extends qlq
{

    private Integer A;
    private Integer B;
    private Boolean C;
    private String D;
    private String E;
    private String H[];
    private Integer I;
    private Integer J;
    private qmo K[];
    private pno L[];
    private Long M;
    private Long N;
    private String O[];
    private Boolean P;
    private pod Q[];
    private pnl R[];
    private Boolean S;
    private int T;
    public String a;
    private int b;
    private pom c;
    private Boolean d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Integer i;
    private int j;
    private String k;
    private String l;
    private String m;
    private pqv n;
    private pta o[];
    private pom p[];
    private String q[];
    private ppc r;
    private int s;
    private Boolean t;
    private int u;
    private String v;
    private psf w[];
    private Integer x;
    private Integer y;
    private Boolean z;

    public pny()
    {
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        a = null;
        j = 0x80000000;
        k = null;
        l = null;
        m = null;
        n = null;
        o = pta.b();
        p = pom.b();
        q = qmb.f;
        r = null;
        s = 0x80000000;
        t = null;
        u = 0x80000000;
        v = null;
        w = psf.b();
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        H = qmb.f;
        I = null;
        J = null;
        K = qmo.b();
        L = pno.b();
        M = null;
        N = null;
        O = qmb.f;
        P = null;
        Q = pod.b();
        R = pnl.b();
        S = null;
        T = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (b != 0x80000000)
        {
            i1 = j1 + qlp.e(1, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(2, c);
        }
        j1 += qlp.b(3, g);
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + qlp.b(4, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.e(5, i.intValue());
        }
        j1 += qlp.b(6, a);
        i1 = j1;
        if (j != 0x80000000)
        {
            i1 = j1 + qlp.e(7, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.b(8, k);
        }
        int k1 = j1;
        if (l != null)
        {
            k1 = j1 + qlp.b(9, l);
        }
        i1 = k1;
        if (m != null)
        {
            i1 = k1 + qlp.b(10, m);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    pom pom1 = p[j1];
                    k1 = i1;
                    if (pom1 != null)
                    {
                        k1 = i1 + qlp.c(11, pom1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1;
            if (o.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < o.length;)
                {
                    pta pta1 = o[j1];
                    k1 = i1;
                    if (pta1 != null)
                    {
                        k1 = i1 + qlp.c(12, pta1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1;
            if (q.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int j2;
                int i3;
                for (j2 = 0; j1 < q.length; j2 = i3)
                {
                    String s1 = q[j1];
                    int l3 = k1;
                    i3 = j2;
                    if (s1 != null)
                    {
                        i3 = j2 + 1;
                        l3 = k1 + qlp.a(s1);
                    }
                    j1++;
                    k1 = l3;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        k1 = j1;
        if (r != null)
        {
            k1 = j1 + qlp.c(14, r);
        }
        i1 = k1;
        if (s != 0x80000000)
        {
            i1 = k1 + qlp.e(15, s);
        }
        j1 = i1;
        if (H != null)
        {
            j1 = i1;
            if (H.length > 0)
            {
                j1 = 0;
                k1 = 0;
                int k2;
                int j3;
                for (k2 = 0; j1 < H.length; k2 = j3)
                {
                    String s2 = H[j1];
                    int i4 = k1;
                    j3 = k2;
                    if (s2 != null)
                    {
                        j3 = k2 + 1;
                        i4 = k1 + qlp.a(s2);
                    }
                    j1++;
                    k1 = i4;
                }

                j1 = i1 + k1 + k2 * 2;
            }
        }
        i1 = j1;
        if (u != 0x80000000)
        {
            i1 = j1 + qlp.e(17, u);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + qlp.b(18, v);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (qlp.c(19) + 1);
        }
        j1 = i1;
        if (w != null)
        {
            j1 = i1;
            if (w.length > 0)
            {
                for (j1 = 0; j1 < w.length;)
                {
                    psf psf1 = w[j1];
                    k1 = i1;
                    if (psf1 != null)
                    {
                        k1 = i1 + qlp.c(20, psf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (x != null)
        {
            i1 = j1 + qlp.e(21, x.intValue());
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + qlp.e(22, y.intValue());
        }
        i1 = j1;
        if (z != null)
        {
            z.booleanValue();
            i1 = j1 + (qlp.c(23) + 1);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + qlp.e(24, A.intValue());
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + qlp.e(25, B.intValue());
        }
        j1 = i1;
        if (C != null)
        {
            C.booleanValue();
            j1 = i1 + (qlp.c(26) + 1);
        }
        i1 = j1;
        if (E != null)
        {
            i1 = j1 + qlp.b(27, E);
        }
        j1 = i1;
        if (I != null)
        {
            j1 = i1 + qlp.e(28, I.intValue());
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + qlp.e(29, J.intValue());
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1;
            if (K.length > 0)
            {
                for (j1 = 0; j1 < K.length;)
                {
                    qmo qmo1 = K[j1];
                    k1 = i1;
                    if (qmo1 != null)
                    {
                        k1 = i1 + qlp.c(30, qmo1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + qlp.b(31, D);
        }
        j1 = i1;
        if (M != null)
        {
            j1 = i1 + qlp.e(32, M.longValue());
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (qlp.c(33) + 1);
        }
        j1 = i1;
        if (N != null)
        {
            j1 = i1 + qlp.e(34, N.longValue());
        }
        i1 = j1;
        if (O != null)
        {
            i1 = j1;
            if (O.length > 0)
            {
                i1 = 0;
                k1 = 0;
                int l2;
                int k3;
                for (l2 = 0; i1 < O.length; l2 = k3)
                {
                    String s3 = O[i1];
                    int j4 = k1;
                    k3 = l2;
                    if (s3 != null)
                    {
                        k3 = l2 + 1;
                        j4 = k1 + qlp.a(s3);
                    }
                    i1++;
                    k1 = j4;
                }

                i1 = j1 + k1 + l2 * 2;
            }
        }
        k1 = i1;
        if (L != null)
        {
            k1 = i1;
            if (L.length > 0)
            {
                for (j1 = 0; j1 < L.length;)
                {
                    pno pno1 = L[j1];
                    k1 = i1;
                    if (pno1 != null)
                    {
                        k1 = i1 + qlp.c(36, pno1);
                    }
                    j1++;
                    i1 = k1;
                }

                k1 = i1;
            }
        }
        j1 = k1;
        if (P != null)
        {
            P.booleanValue();
            j1 = k1 + (qlp.c(37) + 1);
        }
        i1 = j1;
        if (Q != null)
        {
            i1 = j1;
            if (Q.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < Q.length;)
                {
                    pod pod1 = Q[j1];
                    int l1 = i1;
                    if (pod1 != null)
                    {
                        l1 = i1 + qlp.c(38, pod1);
                    }
                    j1++;
                    i1 = l1;
                }

            }
        }
        j1 = i1;
        if (R != null)
        {
            j1 = i1;
            if (R.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= R.length)
                    {
                        break;
                    }
                    pnl pnl1 = R[i2];
                    j1 = i1;
                    if (pnl1 != null)
                    {
                        j1 = i1 + qlp.c(39, pnl1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.b(40, e);
        }
        j1 = i1;
        if (S != null)
        {
            S.booleanValue();
            j1 = i1 + (qlp.c(41) + 1);
        }
        i1 = j1;
        if (T != 0x80000000)
        {
            i1 = j1 + qlp.e(42, T);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.c(43, n);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.b(44, f);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L47:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 45: default 376
    //                   0: 385
    //                   8: 387
    //                   18: 435
    //                   26: 464
    //                   34: 475
    //                   40: 486
    //                   50: 500
    //                   56: 511
    //                   66: 579
    //                   74: 590
    //                   82: 601
    //                   90: 612
    //                   98: 736
    //                   106: 860
    //                   114: 962
    //                   120: 991
    //                   130: 1047
    //                   136: 1150
    //                   146: 1207
    //                   152: 1218
    //                   162: 1232
    //                   168: 1357
    //                   176: 1371
    //                   184: 1385
    //                   192: 1399
    //                   200: 1413
    //                   208: 1427
    //                   218: 1441
    //                   224: 1452
    //                   232: 1466
    //                   242: 1480
    //                   250: 1605
    //                   256: 1616
    //                   264: 1630
    //                   272: 1644
    //                   282: 1658
    //                   290: 1761
    //                   296: 1886
    //                   306: 1900
    //                   314: 2025
    //                   322: 2150
    //                   328: 2161
    //                   336: 2175
    //                   346: 2223
    //                   354: 2252;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L1:
        if (super.a(qlo1, i1)) goto _L47; else goto _L2
_L2:
        return this;
_L3:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new pom();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L5:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        i = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        a = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
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
            j = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        k = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        l = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        m = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L13:
        int i5 = qmb.b(qlo1, 90);
        pom apom[];
        int l1;
        if (p == null)
        {
            l1 = 0;
        } else
        {
            l1 = p.length;
        }
        apom = new pom[i5 + l1];
        i5 = l1;
        if (l1 != 0)
        {
            System.arraycopy(p, 0, apom, 0, l1);
            i5 = l1;
        }
        for (; i5 < apom.length - 1; i5++)
        {
            apom[i5] = new pom();
            qlo1.a(apom[i5]);
            qlo1.a();
        }

        apom[i5] = new pom();
        qlo1.a(apom[i5]);
        p = apom;
        continue; /* Loop/switch isn't completed */
_L14:
        int j5 = qmb.b(qlo1, 98);
        pta apta[];
        int i2;
        if (o == null)
        {
            i2 = 0;
        } else
        {
            i2 = o.length;
        }
        apta = new pta[j5 + i2];
        j5 = i2;
        if (i2 != 0)
        {
            System.arraycopy(o, 0, apta, 0, i2);
            j5 = i2;
        }
        for (; j5 < apta.length - 1; j5++)
        {
            apta[j5] = new pta();
            qlo1.a(apta[j5]);
            qlo1.a();
        }

        apta[j5] = new pta();
        qlo1.a(apta[j5]);
        o = apta;
        continue; /* Loop/switch isn't completed */
_L15:
        int k5 = qmb.b(qlo1, 106);
        String as[];
        int j2;
        if (q == null)
        {
            j2 = 0;
        } else
        {
            j2 = q.length;
        }
        as = new String[k5 + j2];
        k5 = j2;
        if (j2 != 0)
        {
            System.arraycopy(q, 0, as, 0, j2);
            k5 = j2;
        }
        for (; k5 < as.length - 1; k5++)
        {
            as[k5] = qlo1.g();
            qlo1.a();
        }

        as[k5] = qlo1.g();
        q = as;
        continue; /* Loop/switch isn't completed */
_L16:
        if (r == null)
        {
            r = new ppc();
        }
        qlo1.a(r);
        continue; /* Loop/switch isn't completed */
_L17:
        int k2 = qlo1.i();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            s = k2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L18:
        int l5 = qmb.b(qlo1, 130);
        String as1[];
        int l2;
        if (H == null)
        {
            l2 = 0;
        } else
        {
            l2 = H.length;
        }
        as1 = new String[l5 + l2];
        l5 = l2;
        if (l2 != 0)
        {
            System.arraycopy(H, 0, as1, 0, l2);
            l5 = l2;
        }
        for (; l5 < as1.length - 1; l5++)
        {
            as1[l5] = qlo1.g();
            qlo1.a();
        }

        as1[l5] = qlo1.g();
        H = as1;
        continue; /* Loop/switch isn't completed */
_L19:
        int i3 = qlo1.i();
        switch (i3)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            u = i3;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        v = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L21:
        t = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L22:
        int i6 = qmb.b(qlo1, 162);
        psf apsf[];
        int j3;
        if (w == null)
        {
            j3 = 0;
        } else
        {
            j3 = w.length;
        }
        apsf = new psf[i6 + j3];
        i6 = j3;
        if (j3 != 0)
        {
            System.arraycopy(w, 0, apsf, 0, j3);
            i6 = j3;
        }
        for (; i6 < apsf.length - 1; i6++)
        {
            apsf[i6] = new psf();
            qlo1.a(apsf[i6]);
            qlo1.a();
        }

        apsf[i6] = new psf();
        qlo1.a(apsf[i6]);
        w = apsf;
        continue; /* Loop/switch isn't completed */
_L23:
        x = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L24:
        y = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L25:
        z = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L26:
        A = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L27:
        B = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L28:
        C = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        E = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L30:
        I = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L31:
        J = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L32:
        int j6 = qmb.b(qlo1, 242);
        qmo aqmo[];
        int k3;
        if (K == null)
        {
            k3 = 0;
        } else
        {
            k3 = K.length;
        }
        aqmo = new qmo[j6 + k3];
        j6 = k3;
        if (k3 != 0)
        {
            System.arraycopy(K, 0, aqmo, 0, k3);
            j6 = k3;
        }
        for (; j6 < aqmo.length - 1; j6++)
        {
            aqmo[j6] = new qmo();
            qlo1.a(aqmo[j6]);
            qlo1.a();
        }

        aqmo[j6] = new qmo();
        qlo1.a(aqmo[j6]);
        K = aqmo;
        continue; /* Loop/switch isn't completed */
_L33:
        D = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L34:
        M = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L35:
        d = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L36:
        N = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L37:
        int k6 = qmb.b(qlo1, 282);
        String as2[];
        int l3;
        if (O == null)
        {
            l3 = 0;
        } else
        {
            l3 = O.length;
        }
        as2 = new String[k6 + l3];
        k6 = l3;
        if (l3 != 0)
        {
            System.arraycopy(O, 0, as2, 0, l3);
            k6 = l3;
        }
        for (; k6 < as2.length - 1; k6++)
        {
            as2[k6] = qlo1.g();
            qlo1.a();
        }

        as2[k6] = qlo1.g();
        O = as2;
        continue; /* Loop/switch isn't completed */
_L38:
        int l6 = qmb.b(qlo1, 290);
        pno apno[];
        int i4;
        if (L == null)
        {
            i4 = 0;
        } else
        {
            i4 = L.length;
        }
        apno = new pno[l6 + i4];
        l6 = i4;
        if (i4 != 0)
        {
            System.arraycopy(L, 0, apno, 0, i4);
            l6 = i4;
        }
        for (; l6 < apno.length - 1; l6++)
        {
            apno[l6] = new pno();
            qlo1.a(apno[l6]);
            qlo1.a();
        }

        apno[l6] = new pno();
        qlo1.a(apno[l6]);
        L = apno;
        continue; /* Loop/switch isn't completed */
_L39:
        P = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L40:
        int i7 = qmb.b(qlo1, 306);
        pod apod[];
        int j4;
        if (Q == null)
        {
            j4 = 0;
        } else
        {
            j4 = Q.length;
        }
        apod = new pod[i7 + j4];
        i7 = j4;
        if (j4 != 0)
        {
            System.arraycopy(Q, 0, apod, 0, j4);
            i7 = j4;
        }
        for (; i7 < apod.length - 1; i7++)
        {
            apod[i7] = new pod();
            qlo1.a(apod[i7]);
            qlo1.a();
        }

        apod[i7] = new pod();
        qlo1.a(apod[i7]);
        Q = apod;
        continue; /* Loop/switch isn't completed */
_L41:
        int j7 = qmb.b(qlo1, 314);
        pnl apnl[];
        int k4;
        if (R == null)
        {
            k4 = 0;
        } else
        {
            k4 = R.length;
        }
        apnl = new pnl[j7 + k4];
        j7 = k4;
        if (k4 != 0)
        {
            System.arraycopy(R, 0, apnl, 0, k4);
            j7 = k4;
        }
        for (; j7 < apnl.length - 1; j7++)
        {
            apnl[j7] = new pnl();
            qlo1.a(apnl[j7]);
            qlo1.a();
        }

        apnl[j7] = new pnl();
        qlo1.a(apnl[j7]);
        R = apnl;
        continue; /* Loop/switch isn't completed */
_L42:
        e = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L43:
        S = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L44:
        int l4 = qlo1.i();
        switch (l4)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            T = l4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L45:
        if (n == null)
        {
            n = new pqv();
        }
        qlo1.a(n);
        continue; /* Loop/switch isn't completed */
_L46:
        f = qlo1.g();
        if (true) goto _L47; else goto _L48
_L48:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        qlp1.a(3, g);
        if (h != null)
        {
            qlp1.a(4, h);
        }
        if (i != null)
        {
            qlp1.a(5, i.intValue());
        }
        qlp1.a(6, a);
        if (j != 0x80000000)
        {
            qlp1.a(7, j);
        }
        if (k != null)
        {
            qlp1.a(8, k);
        }
        if (l != null)
        {
            qlp1.a(9, l);
        }
        if (m != null)
        {
            qlp1.a(10, m);
        }
        if (p != null && p.length > 0)
        {
            for (int i1 = 0; i1 < p.length; i1++)
            {
                pom pom1 = p[i1];
                if (pom1 != null)
                {
                    qlp1.a(11, pom1);
                }
            }

        }
        if (o != null && o.length > 0)
        {
            for (int j1 = 0; j1 < o.length; j1++)
            {
                pta pta1 = o[j1];
                if (pta1 != null)
                {
                    qlp1.a(12, pta1);
                }
            }

        }
        if (q != null && q.length > 0)
        {
            for (int k1 = 0; k1 < q.length; k1++)
            {
                String s1 = q[k1];
                if (s1 != null)
                {
                    qlp1.a(13, s1);
                }
            }

        }
        if (r != null)
        {
            qlp1.a(14, r);
        }
        if (s != 0x80000000)
        {
            qlp1.a(15, s);
        }
        if (H != null && H.length > 0)
        {
            for (int l1 = 0; l1 < H.length; l1++)
            {
                String s2 = H[l1];
                if (s2 != null)
                {
                    qlp1.a(16, s2);
                }
            }

        }
        if (u != 0x80000000)
        {
            qlp1.a(17, u);
        }
        if (v != null)
        {
            qlp1.a(18, v);
        }
        if (t != null)
        {
            qlp1.a(19, t.booleanValue());
        }
        if (w != null && w.length > 0)
        {
            for (int i2 = 0; i2 < w.length; i2++)
            {
                psf psf1 = w[i2];
                if (psf1 != null)
                {
                    qlp1.a(20, psf1);
                }
            }

        }
        if (x != null)
        {
            qlp1.a(21, x.intValue());
        }
        if (y != null)
        {
            qlp1.a(22, y.intValue());
        }
        if (z != null)
        {
            qlp1.a(23, z.booleanValue());
        }
        if (A != null)
        {
            qlp1.a(24, A.intValue());
        }
        if (B != null)
        {
            qlp1.a(25, B.intValue());
        }
        if (C != null)
        {
            qlp1.a(26, C.booleanValue());
        }
        if (E != null)
        {
            qlp1.a(27, E);
        }
        if (I != null)
        {
            qlp1.a(28, I.intValue());
        }
        if (J != null)
        {
            qlp1.a(29, J.intValue());
        }
        if (K != null && K.length > 0)
        {
            for (int j2 = 0; j2 < K.length; j2++)
            {
                qmo qmo1 = K[j2];
                if (qmo1 != null)
                {
                    qlp1.a(30, qmo1);
                }
            }

        }
        if (D != null)
        {
            qlp1.a(31, D);
        }
        if (M != null)
        {
            qlp1.b(32, M.longValue());
        }
        if (d != null)
        {
            qlp1.a(33, d.booleanValue());
        }
        if (N != null)
        {
            qlp1.b(34, N.longValue());
        }
        if (O != null && O.length > 0)
        {
            for (int k2 = 0; k2 < O.length; k2++)
            {
                String s3 = O[k2];
                if (s3 != null)
                {
                    qlp1.a(35, s3);
                }
            }

        }
        if (L != null && L.length > 0)
        {
            for (int l2 = 0; l2 < L.length; l2++)
            {
                pno pno1 = L[l2];
                if (pno1 != null)
                {
                    qlp1.a(36, pno1);
                }
            }

        }
        if (P != null)
        {
            qlp1.a(37, P.booleanValue());
        }
        if (Q != null && Q.length > 0)
        {
            for (int i3 = 0; i3 < Q.length; i3++)
            {
                pod pod1 = Q[i3];
                if (pod1 != null)
                {
                    qlp1.a(38, pod1);
                }
            }

        }
        if (R != null && R.length > 0)
        {
            for (int j3 = ((flag) ? 1 : 0); j3 < R.length; j3++)
            {
                pnl pnl1 = R[j3];
                if (pnl1 != null)
                {
                    qlp1.a(39, pnl1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(40, e);
        }
        if (S != null)
        {
            qlp1.a(41, S.booleanValue());
        }
        if (T != 0x80000000)
        {
            qlp1.a(42, T);
        }
        if (n != null)
        {
            qlp1.a(43, n);
        }
        if (f != null)
        {
            qlp1.a(44, f);
        }
        super.a(qlp1);
    }
}
