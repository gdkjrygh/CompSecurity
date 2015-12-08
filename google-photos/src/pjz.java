// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjz extends qlq
{

    private Integer A;
    private pmi B;
    private Integer C;
    private Long D;
    private String E;
    private int H;
    public String a;
    public String b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public pjg j;
    public pjr k;
    public String l;
    public pkv m;
    public String n[];
    public String o;
    public int p;
    public qgh q;
    public pkw r;
    public int s;
    private String t;
    private Boolean u;
    private String v;
    private String w;
    private String x;
    private pkq y;
    private pkb z;

    public pjz()
    {
        a = null;
        b = null;
        t = null;
        u = null;
        v = null;
        w = null;
        c = null;
        d = null;
        x = null;
        y = null;
        e = null;
        f = null;
        z = null;
        A = null;
        B = null;
        C = null;
        g = null;
        h = null;
        i = null;
        D = null;
        j = null;
        k = null;
        l = null;
        E = null;
        m = null;
        n = qmb.f;
        H = 0x80000000;
        o = null;
        p = 0x80000000;
        q = null;
        r = null;
        s = 0x80000000;
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
            i1 = j1 + qlp.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.b(2, b);
        }
        i1 = j1;
        if (u != null)
        {
            u.booleanValue();
            i1 = j1 + (qlp.c(3) + 1);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + qlp.b(4, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + qlp.b(5, w);
        }
        j1 = i1;
        if (c != null)
        {
            c.booleanValue();
            j1 = i1 + (qlp.c(6) + 1);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.b(7, d);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + qlp.b(8, x);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1 + qlp.c(9, y);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.b(10, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.b(11, f);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + qlp.c(12, z);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + qlp.e(13, A.intValue());
        }
        j1 = i1;
        if (B != null)
        {
            j1 = i1 + qlp.c(14, B);
        }
        i1 = j1;
        if (C != null)
        {
            i1 = j1 + qlp.e(15, C.intValue());
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.d(16, g.longValue());
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(17, j);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.b(18, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(19, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                int k1 = 0;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < n.length;)
                {
                    String s1 = n[j1];
                    int j2 = k1;
                    int i2 = l1;
                    if (s1 != null)
                    {
                        i2 = l1 + 1;
                        j2 = k1 + qlp.a(s1);
                    }
                    j1++;
                    k1 = j2;
                    l1 = i2;
                }

                j1 = i1 + k1 + l1 * 2;
            }
        }
        i1 = j1;
        if (H != 0x80000000)
        {
            i1 = j1 + qlp.e(21, H);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.d(22, h.longValue());
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.d(23, i.longValue());
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + qlp.d(24, D.longValue());
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.b(25, o);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(26, k);
        }
        i1 = j1;
        if (p != 0x80000000)
        {
            i1 = j1 + qlp.e(27, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + qlp.c(28, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + qlp.c(29, r);
        }
        j1 = i1;
        if (E != null)
        {
            j1 = i1 + qlp.b(30, E);
        }
        i1 = j1;
        if (s != 0x80000000)
        {
            i1 = j1 + qlp.e(31, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + qlp.b(33, t);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L35:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 33: default 280
    //                   0: 289
    //                   10: 291
    //                   18: 302
    //                   24: 313
    //                   34: 327
    //                   42: 338
    //                   48: 349
    //                   58: 363
    //                   66: 374
    //                   74: 385
    //                   82: 414
    //                   90: 425
    //                   98: 436
    //                   104: 465
    //                   114: 479
    //                   120: 508
    //                   128: 522
    //                   138: 536
    //                   146: 565
    //                   154: 576
    //                   162: 605
    //                   168: 708
    //                   176: 751
    //                   184: 765
    //                   192: 779
    //                   202: 793
    //                   210: 804
    //                   216: 833
    //                   226: 879
    //                   234: 908
    //                   242: 937
    //                   248: 948
    //                   266: 995;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
        if (super.a(qlo1, i1)) goto _L35; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L35
_L4:
        b = qlo1.g();
          goto _L35
_L5:
        u = Boolean.valueOf(qlo1.f());
          goto _L35
_L6:
        v = qlo1.g();
          goto _L35
_L7:
        w = qlo1.g();
          goto _L35
_L8:
        c = Boolean.valueOf(qlo1.f());
          goto _L35
_L9:
        d = qlo1.g();
          goto _L35
_L10:
        x = qlo1.g();
          goto _L35
_L11:
        if (y == null)
        {
            y = new pkq();
        }
        qlo1.a(y);
          goto _L35
_L12:
        e = qlo1.g();
          goto _L35
_L13:
        f = qlo1.g();
          goto _L35
_L14:
        if (z == null)
        {
            z = new pkb();
        }
        qlo1.a(z);
          goto _L35
_L15:
        A = Integer.valueOf(qlo1.i());
          goto _L35
_L16:
        if (B == null)
        {
            B = new pmi();
        }
        qlo1.a(B);
          goto _L35
_L17:
        C = Integer.valueOf(qlo1.i());
          goto _L35
_L18:
        g = Long.valueOf(qlo1.j());
          goto _L35
_L19:
        if (j == null)
        {
            j = new pjg();
        }
        qlo1.a(j);
          goto _L35
_L20:
        l = qlo1.g();
          goto _L35
_L21:
        if (m == null)
        {
            m = new pkv();
        }
        qlo1.a(m);
          goto _L35
_L22:
        int j2 = qmb.b(qlo1, 162);
        String as[];
        int j1;
        if (n == null)
        {
            j1 = 0;
        } else
        {
            j1 = n.length;
        }
        as = new String[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(n, 0, as, 0, j1);
            j2 = j1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = qlo1.g();
            qlo1.a();
        }

        as[j2] = qlo1.g();
        n = as;
          goto _L35
_L23:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            H = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        h = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L25:
        i = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L26:
        D = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L27:
        o = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L28:
        if (k == null)
        {
            k = new pjr();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L29:
        int l1 = qlo1.i();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            p = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L30:
        if (q == null)
        {
            q = new qgh();
        }
        qlo1.a(q);
        continue; /* Loop/switch isn't completed */
_L31:
        if (r == null)
        {
            r = new pkw();
        }
        qlo1.a(r);
        continue; /* Loop/switch isn't completed */
_L32:
        E = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L33:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            s = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L34:
        t = qlo1.g();
        if (true) goto _L35; else goto _L36
_L36:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (u != null)
        {
            qlp1.a(3, u.booleanValue());
        }
        if (v != null)
        {
            qlp1.a(4, v);
        }
        if (w != null)
        {
            qlp1.a(5, w);
        }
        if (c != null)
        {
            qlp1.a(6, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(7, d);
        }
        if (x != null)
        {
            qlp1.a(8, x);
        }
        if (y != null)
        {
            qlp1.a(9, y);
        }
        if (e != null)
        {
            qlp1.a(10, e);
        }
        if (f != null)
        {
            qlp1.a(11, f);
        }
        if (z != null)
        {
            qlp1.a(12, z);
        }
        if (A != null)
        {
            qlp1.a(13, A.intValue());
        }
        if (B != null)
        {
            qlp1.a(14, B);
        }
        if (C != null)
        {
            qlp1.a(15, C.intValue());
        }
        if (g != null)
        {
            qlp1.a(16, g.longValue());
        }
        if (j != null)
        {
            qlp1.a(17, j);
        }
        if (l != null)
        {
            qlp1.a(18, l);
        }
        if (m != null)
        {
            qlp1.a(19, m);
        }
        if (n != null && n.length > 0)
        {
            for (int i1 = 0; i1 < n.length; i1++)
            {
                String s1 = n[i1];
                if (s1 != null)
                {
                    qlp1.a(20, s1);
                }
            }

        }
        if (H != 0x80000000)
        {
            qlp1.a(21, H);
        }
        if (h != null)
        {
            qlp1.a(22, h.longValue());
        }
        if (i != null)
        {
            qlp1.a(23, i.longValue());
        }
        if (D != null)
        {
            qlp1.a(24, D.longValue());
        }
        if (o != null)
        {
            qlp1.a(25, o);
        }
        if (k != null)
        {
            qlp1.a(26, k);
        }
        if (p != 0x80000000)
        {
            qlp1.a(27, p);
        }
        if (q != null)
        {
            qlp1.a(28, q);
        }
        if (r != null)
        {
            qlp1.a(29, r);
        }
        if (E != null)
        {
            qlp1.a(30, E);
        }
        if (s != 0x80000000)
        {
            qlp1.a(31, s);
        }
        if (t != null)
        {
            qlp1.a(33, t);
        }
        super.a(qlp1);
    }
}
