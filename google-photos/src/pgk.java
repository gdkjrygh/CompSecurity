// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgk extends qlq
{

    public pfy A;
    public int B;
    public Float C;
    public pfi D;
    public pgm E;
    private Float H;
    private int I;
    private pfu J;
    public pfz a;
    public pgf b;
    public Float c;
    public pga d;
    public Integer e;
    public pfh f;
    public pfj g;
    public pfj h;
    public Float i;
    public String j;
    public int k;
    public Integer l;
    public int m;
    public int n;
    public pfv o;
    public pfz p;
    public Float q;
    public pfj r;
    public pfw s;
    public Float t;
    public Float u;
    public pgj v;
    public Integer w;
    public pgl x[];
    public int y[];
    public pfg z;

    public pgk()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = 0x80000000;
        l = null;
        m = 0x80000000;
        n = 0x80000000;
        o = null;
        p = null;
        H = null;
        q = null;
        r = null;
        s = null;
        I = 0x80000000;
        t = null;
        J = null;
        u = null;
        v = null;
        w = null;
        x = pgl.b();
        y = qmb.a;
        z = null;
        A = null;
        B = 0x80000000;
        C = null;
        D = null;
        E = null;
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
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            c.floatValue();
            i1 = j1 + (qlp.c(3) + 4);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(7, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(8, h);
        }
        i1 = j1;
        if (i != null)
        {
            i.floatValue();
            i1 = j1 + (qlp.c(9) + 4);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.b(10, j);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.e(11, l.intValue());
        }
        j1 = i1;
        if (m != 0x80000000)
        {
            j1 = i1 + qlp.e(12, m);
        }
        i1 = j1;
        if (n != 0x80000000)
        {
            i1 = j1 + qlp.e(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + qlp.c(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + qlp.c(15, p);
        }
        j1 = i1;
        if (H != null)
        {
            H.floatValue();
            j1 = i1 + (qlp.c(16) + 4);
        }
        i1 = j1;
        if (q != null)
        {
            q.floatValue();
            i1 = j1 + (qlp.c(17) + 4);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + qlp.c(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + qlp.c(19, s);
        }
        j1 = i1;
        if (I != 0x80000000)
        {
            j1 = i1 + qlp.e(20, I);
        }
        i1 = j1;
        if (t != null)
        {
            t.floatValue();
            i1 = j1 + (qlp.c(21) + 4);
        }
        j1 = i1;
        if (k != 0x80000000)
        {
            j1 = i1 + qlp.e(22, k);
        }
        i1 = j1;
        if (J != null)
        {
            i1 = j1 + qlp.c(23, J);
        }
        j1 = i1;
        if (u != null)
        {
            u.floatValue();
            j1 = i1 + (qlp.c(24) + 4);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + qlp.e(25, w.intValue());
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                for (j1 = 0; j1 < x.length;)
                {
                    pgl pgl1 = x[j1];
                    int k1 = i1;
                    if (pgl1 != null)
                    {
                        k1 = i1 + qlp.c(26, pgl1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1;
            if (y.length > 0)
            {
                int l1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < y.length; i1++)
                {
                    l1 += qlp.b(y[i1]);
                }

                i1 = j1 + l1 + y.length * 2;
            }
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + qlp.c(28, z);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + qlp.c(29, v);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + qlp.c(30, A);
        }
        i1 = j1;
        if (B != 0x80000000)
        {
            i1 = j1 + qlp.e(31, B);
        }
        j1 = i1;
        if (C != null)
        {
            C.floatValue();
            j1 = i1 + (qlp.c(32) + 4);
        }
        i1 = j1;
        if (D != null)
        {
            i1 = j1 + qlp.c(33, D);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + qlp.c(34, E);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L38:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 36: default 308
    //                   0: 318
    //                   10: 320
    //                   18: 349
    //                   29: 378
    //                   34: 395
    //                   40: 424
    //                   50: 438
    //                   58: 467
    //                   66: 496
    //                   77: 525
    //                   82: 542
    //                   88: 553
    //                   96: 567
    //                   104: 616
    //                   114: 660
    //                   122: 689
    //                   133: 718
    //                   141: 735
    //                   146: 752
    //                   154: 781
    //                   160: 810
    //                   173: 860
    //                   176: 877
    //                   186: 924
    //                   197: 953
    //                   200: 970
    //                   210: 984
    //                   216: 1116
    //                   218: 1308
    //                   226: 1522
    //                   234: 1551
    //                   242: 1580
    //                   248: 1609
    //                   261: 1664
    //                   266: 1681
    //                   274: 1710;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.a(qlo1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new pfz();
        }
        qlo1.a(a);
          goto _L38
_L4:
        if (b == null)
        {
            b = new pgf();
        }
        qlo1.a(b);
          goto _L38
_L5:
        c = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
          goto _L38
_L6:
        if (d == null)
        {
            d = new pga();
        }
        qlo1.a(d);
          goto _L38
_L7:
        e = Integer.valueOf(qlo1.i());
          goto _L38
_L8:
        if (f == null)
        {
            f = new pfh();
        }
        qlo1.a(f);
          goto _L38
_L9:
        if (g == null)
        {
            g = new pfj();
        }
        qlo1.a(g);
          goto _L38
_L10:
        if (h == null)
        {
            h = new pfj();
        }
        qlo1.a(h);
          goto _L38
_L11:
        i = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
          goto _L38
_L12:
        j = qlo1.g();
          goto _L38
_L13:
        l = Integer.valueOf(qlo1.i());
          goto _L38
_L14:
        i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            m = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
            n = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L16:
        if (o == null)
        {
            o = new pfv();
        }
        qlo1.a(o);
        continue; /* Loop/switch isn't completed */
_L17:
        if (p == null)
        {
            p = new pfz();
        }
        qlo1.a(p);
        continue; /* Loop/switch isn't completed */
_L18:
        H = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L19:
        q = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L20:
        if (r == null)
        {
            r = new pfj();
        }
        qlo1.a(r);
        continue; /* Loop/switch isn't completed */
_L21:
        if (s == null)
        {
            s = new pfw();
        }
        qlo1.a(s);
        continue; /* Loop/switch isn't completed */
_L22:
        i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            I = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        t = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L24:
        i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (J == null)
        {
            J = new pfu();
        }
        qlo1.a(J);
        continue; /* Loop/switch isn't completed */
_L26:
        u = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L27:
        w = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L28:
        int k1 = qmb.b(qlo1, 210);
        pgl apgl[];
        if (x == null)
        {
            i1 = 0;
        } else
        {
            i1 = x.length;
        }
        apgl = new pgl[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(x, 0, apgl, 0, i1);
            k1 = i1;
        }
        for (; k1 < apgl.length - 1; k1++)
        {
            apgl[k1] = new pgl();
            qlo1.a(apgl[k1]);
            qlo1.a();
        }

        apgl[k1] = new pgl();
        qlo1.a(apgl[k1]);
        x = apgl;
        continue; /* Loop/switch isn't completed */
_L29:
        int ai[];
        int l1;
        int k2;
        k2 = qmb.b(qlo1, 216);
        ai = new int[k2];
        l1 = 0;
        i1 = 0;
_L44:
        if (l1 >= k2) goto _L40; else goto _L39
_L39:
        int l2;
        if (l1 != 0)
        {
            qlo1.a();
        }
        l2 = qlo1.i();
        l2;
        JVM INSTR tableswitch 0 3: default 1192
    //                   0 1201
    //                   1 1201
    //                   2 1201
    //                   3 1201;
           goto _L41 _L42 _L42 _L42 _L42
_L41:
        l1++;
        continue; /* Loop/switch isn't completed */
_L42:
        int i2 = i1 + 1;
        ai[i1] = l2;
        i1 = i2;
        if (true) goto _L41; else goto _L40
_L40:
        if (i1 != 0)
        {
            if (y == null)
            {
                l1 = 0;
            } else
            {
                l1 = y.length;
            }
            if (l1 == 0 && i1 == ai.length)
            {
                y = ai;
            } else
            {
                int ai1[] = new int[l1 + i1];
                if (l1 != 0)
                {
                    System.arraycopy(y, 0, ai1, 0, l1);
                }
                System.arraycopy(ai, 0, ai1, l1, i1);
                y = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L44; else goto _L43
_L43:
_L30:
        int j2;
        j2 = qlo1.c(qlo1.i());
        i1 = qlo1.o();
        l1 = 0;
_L50:
        if (qlo1.m() > 0)
        {
            switch (qlo1.i())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                l1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l1 == 0) goto _L46; else goto _L45
_L45:
        qlo1.e(i1);
        if (y == null)
        {
            i1 = 0;
        } else
        {
            i1 = y.length;
        }
        ai = new int[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(y, 0, ai, 0, i1);
            l1 = i1;
        }
_L48:
        if (qlo1.m() > 0)
        {
            i1 = qlo1.i();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ai[l1] = i1;
                l1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        y = ai;
_L46:
        qlo1.d(j2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L48; else goto _L47
_L47:
        if (true) goto _L50; else goto _L49
_L49:
_L31:
        if (z == null)
        {
            z = new pfg();
        }
        qlo1.a(z);
        continue; /* Loop/switch isn't completed */
_L32:
        if (v == null)
        {
            v = new pgj();
        }
        qlo1.a(v);
        continue; /* Loop/switch isn't completed */
_L33:
        if (A == null)
        {
            A = new pfy();
        }
        qlo1.a(A);
        continue; /* Loop/switch isn't completed */
_L34:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
            B = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L35:
        C = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L36:
        if (D == null)
        {
            D = new pfi();
        }
        qlo1.a(D);
        continue; /* Loop/switch isn't completed */
_L37:
        if (E == null)
        {
            E = new pgm();
        }
        qlo1.a(E);
        if (true) goto _L38; else goto _L51
_L51:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c.floatValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null)
        {
            qlp1.a(9, i.floatValue());
        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        if (l != null)
        {
            qlp1.a(11, l.intValue());
        }
        if (m != 0x80000000)
        {
            qlp1.a(12, m);
        }
        if (n != 0x80000000)
        {
            qlp1.a(13, n);
        }
        if (o != null)
        {
            qlp1.a(14, o);
        }
        if (p != null)
        {
            qlp1.a(15, p);
        }
        if (H != null)
        {
            qlp1.a(16, H.floatValue());
        }
        if (q != null)
        {
            qlp1.a(17, q.floatValue());
        }
        if (r != null)
        {
            qlp1.a(18, r);
        }
        if (s != null)
        {
            qlp1.a(19, s);
        }
        if (I != 0x80000000)
        {
            qlp1.a(20, I);
        }
        if (t != null)
        {
            qlp1.a(21, t.floatValue());
        }
        if (k != 0x80000000)
        {
            qlp1.a(22, k);
        }
        if (J != null)
        {
            qlp1.a(23, J);
        }
        if (u != null)
        {
            qlp1.a(24, u.floatValue());
        }
        if (w != null)
        {
            qlp1.a(25, w.intValue());
        }
        if (x != null && x.length > 0)
        {
            for (int i1 = 0; i1 < x.length; i1++)
            {
                pgl pgl1 = x[i1];
                if (pgl1 != null)
                {
                    qlp1.a(26, pgl1);
                }
            }

        }
        if (y != null && y.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < y.length; j1++)
            {
                qlp1.a(27, y[j1]);
            }

        }
        if (z != null)
        {
            qlp1.a(28, z);
        }
        if (v != null)
        {
            qlp1.a(29, v);
        }
        if (A != null)
        {
            qlp1.a(30, A);
        }
        if (B != 0x80000000)
        {
            qlp1.a(31, B);
        }
        if (C != null)
        {
            qlp1.a(32, C.floatValue());
        }
        if (D != null)
        {
            qlp1.a(33, D);
        }
        if (E != null)
        {
            qlp1.a(34, E);
        }
        super.a(qlp1);
    }
}
