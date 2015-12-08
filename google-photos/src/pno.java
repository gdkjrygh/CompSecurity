// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pno extends qlq
{

    private static volatile pno a[];
    private String b;
    private String c;
    private int d;
    private pnl e;
    private String f;
    private ppp g;
    private String h;
    private Long i;
    private Long j;
    private String k;
    private String l;
    private pnm m;
    private String n;
    private ppm o;
    private pnq p[];
    private String q;

    public pno()
    {
        b = null;
        c = null;
        d = 0x80000000;
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
        p = pnq.b();
        q = null;
        F = null;
        G = -1;
    }

    public static pno[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pno[0];
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
        int j1 = super.a();
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.b(1, c);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.b(2, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.e(3, i.longValue());
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.b(4, k);
        }
        i1 = j1;
        if (d != 0x80000000)
        {
            i1 = j1 + qlp.e(5, d);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + qlp.c(6, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.b(7, n);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(8, e);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(9, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1;
            if (p.length > 0)
            {
                for (j1 = 0; j1 < p.length;)
                {
                    pnq pnq1 = p[j1];
                    int k1 = i1;
                    if (pnq1 != null)
                    {
                        k1 = i1 + qlp.c(10, pnq1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.e(11, j.longValue());
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.b(12, b);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.b(13, f);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.b(14, l);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.b(15, q);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(16, g);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L19:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   10: 163
    //                   18: 174
    //                   24: 185
    //                   34: 199
    //                   40: 210
    //                   50: 263
    //                   58: 292
    //                   66: 303
    //                   74: 332
    //                   82: 361
    //                   88: 485
    //                   98: 499
    //                   106: 510
    //                   114: 521
    //                   122: 532
    //                   130: 543;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.a(qlo1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        c = qlo1.g();
          goto _L19
_L4:
        h = qlo1.g();
          goto _L19
_L5:
        i = Long.valueOf(qlo1.j());
          goto _L19
_L6:
        k = qlo1.g();
          goto _L19
_L7:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            d = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (m == null)
        {
            m = new pnm();
        }
        qlo1.a(m);
        continue; /* Loop/switch isn't completed */
_L9:
        n = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        if (e == null)
        {
            e = new pnl();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L11:
        if (o == null)
        {
            o = new ppm();
        }
        qlo1.a(o);
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = qmb.b(qlo1, 82);
        pnq apnq[];
        int k1;
        if (p == null)
        {
            k1 = 0;
        } else
        {
            k1 = p.length;
        }
        apnq = new pnq[l1 + k1];
        l1 = k1;
        if (k1 != 0)
        {
            System.arraycopy(p, 0, apnq, 0, k1);
            l1 = k1;
        }
        for (; l1 < apnq.length - 1; l1++)
        {
            apnq[l1] = new pnq();
            qlo1.a(apnq[l1]);
            qlo1.a();
        }

        apnq[l1] = new pnq();
        qlo1.a(apnq[l1]);
        p = apnq;
        continue; /* Loop/switch isn't completed */
_L13:
        j = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L14:
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L15:
        f = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L16:
        l = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L17:
        q = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L18:
        if (g == null)
        {
            g = new ppp();
        }
        qlo1.a(g);
        if (true) goto _L19; else goto _L20
_L20:
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (h != null)
        {
            qlp1.a(2, h);
        }
        if (i != null)
        {
            qlp1.b(3, i.longValue());
        }
        if (k != null)
        {
            qlp1.a(4, k);
        }
        if (d != 0x80000000)
        {
            qlp1.a(5, d);
        }
        if (m != null)
        {
            qlp1.a(6, m);
        }
        if (n != null)
        {
            qlp1.a(7, n);
        }
        if (e != null)
        {
            qlp1.a(8, e);
        }
        if (o != null)
        {
            qlp1.a(9, o);
        }
        if (p != null && p.length > 0)
        {
            for (int i1 = 0; i1 < p.length; i1++)
            {
                pnq pnq1 = p[i1];
                if (pnq1 != null)
                {
                    qlp1.a(10, pnq1);
                }
            }

        }
        if (j != null)
        {
            qlp1.b(11, j.longValue());
        }
        if (b != null)
        {
            qlp1.a(12, b);
        }
        if (f != null)
        {
            qlp1.a(13, f);
        }
        if (l != null)
        {
            qlp1.a(14, l);
        }
        if (q != null)
        {
            qlp1.a(15, q);
        }
        if (g != null)
        {
            qlp1.a(16, g);
        }
        super.a(qlp1);
    }
}
