// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pri extends qlq
{

    private static volatile pri a[];
    private qqh A;
    private String b;
    private String c;
    private ptd d;
    private String e;
    private psz f;
    private Long g;
    private String h;
    private String i;
    private pro j;
    private String k;
    private String l;
    private Boolean m;
    private Boolean n;
    private String o;
    private Boolean p;
    private Boolean q;
    private Long r;
    private ppv s;
    private String t;
    private Boolean u;
    private String v;
    private psk w;
    private int x;
    private Boolean y;
    private psf z;

    public pri()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = 0x80000000;
        y = null;
        z = null;
        A = null;
        F = null;
        G = -1;
    }

    public static pri[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pri[0];
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
        int j1 = super.a() + qlp.b(2, b) + qlp.b(3, c) + qlp.e(4, g.longValue()) + qlp.b(5, h);
        int i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.b(6, i);
        }
        j1 = qlp.b(7, k);
        int k1 = qlp.b(8, l);
        m.booleanValue();
        int l1 = qlp.c(9);
        n.booleanValue();
        j1 = i1 + j1 + k1 + (l1 + 1) + (qlp.c(10) + 1);
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.b(11, o);
        }
        p.booleanValue();
        j1 = i1 + (qlp.c(12) + 1);
        i1 = j1;
        if (q != null)
        {
            q.booleanValue();
            i1 = j1 + (qlp.c(13) + 1);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + qlp.e(15, r.longValue());
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + qlp.c(16, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + qlp.b(17, t);
        }
        i1 = j1;
        if (u != null)
        {
            u.booleanValue();
            i1 = j1 + (qlp.c(18) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(19, d);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(20, j);
        }
        j1 = i1;
        if (v != null)
        {
            j1 = i1 + qlp.b(21, v);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + qlp.c(22, w);
        }
        j1 = i1;
        if (x != 0x80000000)
        {
            j1 = i1 + qlp.e(23, x);
        }
        i1 = j1;
        if (y != null)
        {
            y.booleanValue();
            i1 = j1 + (qlp.c(24) + 1);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.b(25, e);
        }
        i1 = j1;
        if (z != null)
        {
            i1 = j1 + qlp.c(26, z);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(27, f);
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + qlp.c(28, A);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L29:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 27: default 232
    //                   0: 241
    //                   18: 243
    //                   26: 254
    //                   32: 265
    //                   42: 279
    //                   50: 290
    //                   58: 301
    //                   66: 312
    //                   72: 323
    //                   80: 337
    //                   90: 351
    //                   96: 362
    //                   104: 376
    //                   120: 390
    //                   130: 404
    //                   138: 433
    //                   144: 444
    //                   154: 458
    //                   162: 487
    //                   170: 516
    //                   178: 527
    //                   184: 556
    //                   192: 603
    //                   202: 617
    //                   210: 628
    //                   218: 657
    //                   226: 686;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L1:
        if (super.a(qlo1, i1)) goto _L29; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L29
_L4:
        c = qlo1.g();
          goto _L29
_L5:
        g = Long.valueOf(qlo1.j());
          goto _L29
_L6:
        h = qlo1.g();
          goto _L29
_L7:
        i = qlo1.g();
          goto _L29
_L8:
        k = qlo1.g();
          goto _L29
_L9:
        l = qlo1.g();
          goto _L29
_L10:
        m = Boolean.valueOf(qlo1.f());
          goto _L29
_L11:
        n = Boolean.valueOf(qlo1.f());
          goto _L29
_L12:
        o = qlo1.g();
          goto _L29
_L13:
        p = Boolean.valueOf(qlo1.f());
          goto _L29
_L14:
        q = Boolean.valueOf(qlo1.f());
          goto _L29
_L15:
        r = Long.valueOf(qlo1.j());
          goto _L29
_L16:
        if (s == null)
        {
            s = new ppv();
        }
        qlo1.a(s);
          goto _L29
_L17:
        t = qlo1.g();
          goto _L29
_L18:
        u = Boolean.valueOf(qlo1.f());
          goto _L29
_L19:
        if (d == null)
        {
            d = new ptd();
        }
        qlo1.a(d);
          goto _L29
_L20:
        if (j == null)
        {
            j = new pro();
        }
        qlo1.a(j);
          goto _L29
_L21:
        v = qlo1.g();
          goto _L29
_L22:
        if (w == null)
        {
            w = new psk();
        }
        qlo1.a(w);
          goto _L29
_L23:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            x = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        y = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L25:
        e = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L26:
        if (z == null)
        {
            z = new psf();
        }
        qlo1.a(z);
        continue; /* Loop/switch isn't completed */
_L27:
        if (f == null)
        {
            f = new psz();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L28:
        if (A == null)
        {
            A = new qqh();
        }
        qlo1.a(A);
        if (true) goto _L29; else goto _L30
_L30:
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(2, b);
        qlp1.a(3, c);
        qlp1.b(4, g.longValue());
        qlp1.a(5, h);
        if (i != null)
        {
            qlp1.a(6, i);
        }
        qlp1.a(7, k);
        qlp1.a(8, l);
        qlp1.a(9, m.booleanValue());
        qlp1.a(10, n.booleanValue());
        if (o != null)
        {
            qlp1.a(11, o);
        }
        qlp1.a(12, p.booleanValue());
        if (q != null)
        {
            qlp1.a(13, q.booleanValue());
        }
        if (r != null)
        {
            qlp1.b(15, r.longValue());
        }
        if (s != null)
        {
            qlp1.a(16, s);
        }
        if (t != null)
        {
            qlp1.a(17, t);
        }
        if (u != null)
        {
            qlp1.a(18, u.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(19, d);
        }
        if (j != null)
        {
            qlp1.a(20, j);
        }
        if (v != null)
        {
            qlp1.a(21, v);
        }
        if (w != null)
        {
            qlp1.a(22, w);
        }
        if (x != 0x80000000)
        {
            qlp1.a(23, x);
        }
        if (y != null)
        {
            qlp1.a(24, y.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(25, e);
        }
        if (z != null)
        {
            qlp1.a(26, z);
        }
        if (f != null)
        {
            qlp1.a(27, f);
        }
        if (A != null)
        {
            qlp1.a(28, A);
        }
        super.a(qlp1);
    }
}
