// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class poq extends qlq
{

    private Boolean A;
    private int B;
    private Boolean C;
    private Long D;
    private ppa E;
    private poi H;
    private pnz I;
    private pow J;
    private poc K;
    private pox L;
    private Boolean M;
    private ppb N;
    private pou O;
    public Boolean a;
    public por b;
    public pov c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public poa h;
    private String i;
    private String j;
    private pqv k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private Boolean t;
    private pnx u[];
    private Boolean v;
    private Long w;
    private Long x;
    private Integer y;
    private Boolean z;

    public poq()
    {
        i = null;
        j = null;
        k = null;
        l = null;
        a = null;
        m = null;
        n = null;
        b = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = pnx.b();
        v = null;
        c = null;
        w = null;
        x = null;
        y = null;
        d = null;
        e = null;
        z = null;
        A = null;
        B = 0x80000000;
        f = null;
        C = null;
        D = null;
        E = null;
        H = null;
        I = null;
        J = null;
        K = null;
        L = null;
        g = null;
        M = null;
        N = null;
        h = null;
        O = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.b(1, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.b(2, j);
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (qlp.c(3) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (qlp.c(4) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (qlp.c(5) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (qlp.c(6) + 1);
        }
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (qlp.c(7) + 1);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1;
            if (u.length > 0)
            {
                for (j1 = 0; j1 < u.length;)
                {
                    pnx pnx1 = u[j1];
                    int k1 = i1;
                    if (pnx1 != null)
                    {
                        k1 = i1 + qlp.c(8, pnx1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (v != null)
        {
            v.booleanValue();
            i1 = j1 + (qlp.c(9) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(10, c);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + qlp.e(11, w.longValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + qlp.e(12, x.longValue());
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + qlp.e(13, y.intValue());
        }
        j1 = i1;
        if (e != null)
        {
            e.booleanValue();
            j1 = i1 + (qlp.c(14) + 1);
        }
        i1 = j1;
        if (A != null)
        {
            A.booleanValue();
            i1 = j1 + (qlp.c(15) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (qlp.c(16) + 1);
        }
        i1 = j1;
        if (z != null)
        {
            z.booleanValue();
            i1 = j1 + (qlp.c(17) + 1);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (qlp.c(18) + 1);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + qlp.e(19, D.longValue());
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + qlp.c(20, E);
        }
        i1 = j1;
        if (H != null)
        {
            i1 = j1 + qlp.c(21, H);
        }
        j1 = i1;
        if (B != 0x80000000)
        {
            j1 = i1 + qlp.e(22, B);
        }
        i1 = j1;
        if (I != null)
        {
            i1 = j1 + qlp.c(24, I);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1 + qlp.c(25, J);
        }
        i1 = j1;
        if (r != null)
        {
            r.booleanValue();
            i1 = j1 + (qlp.c(26) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            s.booleanValue();
            j1 = i1 + (qlp.c(27) + 1);
        }
        i1 = j1;
        if (t != null)
        {
            t.booleanValue();
            i1 = j1 + (qlp.c(28) + 1);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + qlp.c(29, K);
        }
        i1 = j1;
        if (L != null)
        {
            i1 = j1 + qlp.c(30, L);
        }
        j1 = i1;
        if (g != null)
        {
            g.booleanValue();
            j1 = i1 + (qlp.c(31) + 1);
        }
        i1 = j1;
        if (C != null)
        {
            C.booleanValue();
            i1 = j1 + (qlp.c(32) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(33, k);
        }
        i1 = j1;
        if (M != null)
        {
            M.booleanValue();
            i1 = j1 + (qlp.c(35) + 1);
        }
        j1 = i1;
        if (a != null)
        {
            a.booleanValue();
            j1 = i1 + (qlp.c(36) + 1);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(37, b);
        }
        j1 = i1;
        if (d != null)
        {
            d.booleanValue();
            j1 = i1 + (qlp.c(38) + 1);
        }
        i1 = j1;
        if (N != null)
        {
            i1 = j1 + qlp.c(39, N);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(40, h);
        }
        i1 = j1;
        if (O != null)
        {
            i1 = j1 + qlp.c(41, O);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L42:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 40: default 336
    //                   0: 345
    //                   10: 347
    //                   18: 358
    //                   24: 369
    //                   32: 383
    //                   40: 397
    //                   48: 411
    //                   56: 425
    //                   66: 439
    //                   72: 563
    //                   82: 577
    //                   88: 606
    //                   96: 620
    //                   104: 634
    //                   112: 648
    //                   120: 662
    //                   128: 676
    //                   136: 690
    //                   144: 704
    //                   152: 718
    //                   162: 732
    //                   170: 761
    //                   176: 790
    //                   194: 839
    //                   202: 868
    //                   208: 897
    //                   216: 911
    //                   224: 925
    //                   234: 939
    //                   242: 968
    //                   248: 997
    //                   256: 1011
    //                   266: 1025
    //                   280: 1054
    //                   288: 1068
    //                   298: 1082
    //                   304: 1111
    //                   314: 1125
    //                   322: 1154
    //                   330: 1183;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41
_L1:
        if (super.a(qlo1, i1)) goto _L42; else goto _L2
_L2:
        return this;
_L3:
        i = qlo1.g();
          goto _L42
_L4:
        j = qlo1.g();
          goto _L42
_L5:
        l = Boolean.valueOf(qlo1.f());
          goto _L42
_L6:
        n = Boolean.valueOf(qlo1.f());
          goto _L42
_L7:
        o = Boolean.valueOf(qlo1.f());
          goto _L42
_L8:
        p = Boolean.valueOf(qlo1.f());
          goto _L42
_L9:
        q = Boolean.valueOf(qlo1.f());
          goto _L42
_L10:
        int l1 = qmb.b(qlo1, 66);
        pnx apnx[];
        int j1;
        if (u == null)
        {
            j1 = 0;
        } else
        {
            j1 = u.length;
        }
        apnx = new pnx[l1 + j1];
        l1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(u, 0, apnx, 0, j1);
            l1 = j1;
        }
        for (; l1 < apnx.length - 1; l1++)
        {
            apnx[l1] = new pnx();
            qlo1.a(apnx[l1]);
            qlo1.a();
        }

        apnx[l1] = new pnx();
        qlo1.a(apnx[l1]);
        u = apnx;
          goto _L42
_L11:
        v = Boolean.valueOf(qlo1.f());
          goto _L42
_L12:
        if (c == null)
        {
            c = new pov();
        }
        qlo1.a(c);
          goto _L42
_L13:
        w = Long.valueOf(qlo1.j());
          goto _L42
_L14:
        x = Long.valueOf(qlo1.j());
          goto _L42
_L15:
        y = Integer.valueOf(qlo1.i());
          goto _L42
_L16:
        e = Boolean.valueOf(qlo1.f());
          goto _L42
_L17:
        A = Boolean.valueOf(qlo1.f());
          goto _L42
_L18:
        f = Boolean.valueOf(qlo1.f());
          goto _L42
_L19:
        z = Boolean.valueOf(qlo1.f());
          goto _L42
_L20:
        m = Boolean.valueOf(qlo1.f());
          goto _L42
_L21:
        D = Long.valueOf(qlo1.j());
          goto _L42
_L22:
        if (E == null)
        {
            E = new ppa();
        }
        qlo1.a(E);
          goto _L42
_L23:
        if (H == null)
        {
            H = new poi();
        }
        qlo1.a(H);
          goto _L42
_L24:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 2: // '\002'
        case 3: // '\003'
            B = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (I == null)
        {
            I = new pnz();
        }
        qlo1.a(I);
        continue; /* Loop/switch isn't completed */
_L26:
        if (J == null)
        {
            J = new pow();
        }
        qlo1.a(J);
        continue; /* Loop/switch isn't completed */
_L27:
        r = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L28:
        s = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L29:
        t = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L30:
        if (K == null)
        {
            K = new poc();
        }
        qlo1.a(K);
        continue; /* Loop/switch isn't completed */
_L31:
        if (L == null)
        {
            L = new pox();
        }
        qlo1.a(L);
        continue; /* Loop/switch isn't completed */
_L32:
        g = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L33:
        C = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L34:
        if (k == null)
        {
            k = new pqv();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L35:
        M = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L36:
        a = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L37:
        if (b == null)
        {
            b = new por();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L38:
        d = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L39:
        if (N == null)
        {
            N = new ppb();
        }
        qlo1.a(N);
        continue; /* Loop/switch isn't completed */
_L40:
        if (h == null)
        {
            h = new poa();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L41:
        if (O == null)
        {
            O = new pou();
        }
        qlo1.a(O);
        if (true) goto _L42; else goto _L43
_L43:
    }

    public final void a(qlp qlp1)
    {
        if (i != null)
        {
            qlp1.a(1, i);
        }
        if (j != null)
        {
            qlp1.a(2, j);
        }
        if (l != null)
        {
            qlp1.a(3, l.booleanValue());
        }
        if (n != null)
        {
            qlp1.a(4, n.booleanValue());
        }
        if (o != null)
        {
            qlp1.a(5, o.booleanValue());
        }
        if (p != null)
        {
            qlp1.a(6, p.booleanValue());
        }
        if (q != null)
        {
            qlp1.a(7, q.booleanValue());
        }
        if (u != null && u.length > 0)
        {
            for (int i1 = 0; i1 < u.length; i1++)
            {
                pnx pnx1 = u[i1];
                if (pnx1 != null)
                {
                    qlp1.a(8, pnx1);
                }
            }

        }
        if (v != null)
        {
            qlp1.a(9, v.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(10, c);
        }
        if (w != null)
        {
            qlp1.b(11, w.longValue());
        }
        if (x != null)
        {
            qlp1.b(12, x.longValue());
        }
        if (y != null)
        {
            qlp1.a(13, y.intValue());
        }
        if (e != null)
        {
            qlp1.a(14, e.booleanValue());
        }
        if (A != null)
        {
            qlp1.a(15, A.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(16, f.booleanValue());
        }
        if (z != null)
        {
            qlp1.a(17, z.booleanValue());
        }
        if (m != null)
        {
            qlp1.a(18, m.booleanValue());
        }
        if (D != null)
        {
            qlp1.b(19, D.longValue());
        }
        if (E != null)
        {
            qlp1.a(20, E);
        }
        if (H != null)
        {
            qlp1.a(21, H);
        }
        if (B != 0x80000000)
        {
            qlp1.a(22, B);
        }
        if (I != null)
        {
            qlp1.a(24, I);
        }
        if (J != null)
        {
            qlp1.a(25, J);
        }
        if (r != null)
        {
            qlp1.a(26, r.booleanValue());
        }
        if (s != null)
        {
            qlp1.a(27, s.booleanValue());
        }
        if (t != null)
        {
            qlp1.a(28, t.booleanValue());
        }
        if (K != null)
        {
            qlp1.a(29, K);
        }
        if (L != null)
        {
            qlp1.a(30, L);
        }
        if (g != null)
        {
            qlp1.a(31, g.booleanValue());
        }
        if (C != null)
        {
            qlp1.a(32, C.booleanValue());
        }
        if (k != null)
        {
            qlp1.a(33, k);
        }
        if (M != null)
        {
            qlp1.a(35, M.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(36, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(37, b);
        }
        if (d != null)
        {
            qlp1.a(38, d.booleanValue());
        }
        if (N != null)
        {
            qlp1.a(39, N);
        }
        if (h != null)
        {
            qlp1.a(40, h);
        }
        if (O != null)
        {
            qlp1.a(41, O);
        }
        super.a(qlp1);
    }
}
