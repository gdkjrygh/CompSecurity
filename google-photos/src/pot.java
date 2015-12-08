// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pot extends qlq
{

    private static volatile pot a[];
    private String b;
    private ppc c;
    private ppp d;
    private int e;
    private poo f;
    private pop g;
    private ppc h;
    private ppp i;
    private String j[];
    private ppc k[];
    private ppp l[];
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private int p;
    private ppg q;
    private String r;

    public pot()
    {
        b = null;
        c = null;
        d = null;
        e = 0x80000000;
        f = null;
        g = null;
        h = null;
        i = null;
        j = qmb.f;
        k = ppc.b();
        l = ppp.b();
        m = null;
        n = null;
        o = null;
        p = 0x80000000;
        q = null;
        r = null;
        F = null;
        G = -1;
    }

    public static pot[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pot[0];
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
        int j1 = super.a() + qlp.b(1, b);
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(2, c);
        }
        j1 = i1;
        if (e != 0x80000000)
        {
            j1 = i1 + qlp.e(3, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.c(4, f);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(5, h);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1;
            if (j.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                int k2;
                int l2;
                for (k2 = 0; i1 < j.length; k2 = l2)
                {
                    String s = j[i1];
                    int i3 = l1;
                    l2 = k2;
                    if (s != null)
                    {
                        l2 = k2 + 1;
                        i3 = l1 + qlp.a(s);
                    }
                    i1++;
                    l1 = i3;
                }

                i1 = j1 + l1 + k2 * 1;
            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    ppc ppc1 = k[j1];
                    int i2 = i1;
                    if (ppc1 != null)
                    {
                        i2 = i1 + qlp.c(7, ppc1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (m != null)
        {
            m.booleanValue();
            i1 = j1 + (qlp.c(8) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (qlp.c(9) + 1);
        }
        i1 = j1;
        if (p != 0x80000000)
        {
            i1 = j1 + qlp.e(10, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + qlp.c(11, q);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(12, g);
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (qlp.c(13) + 1);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + qlp.b(14, r);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.c(15, d);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(16, i);
        }
        int j2 = i1;
        if (l != null)
        {
            j2 = i1;
            if (l.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j2 = i1;
                    if (k1 >= l.length)
                    {
                        break;
                    }
                    ppp ppp1 = l[k1];
                    j2 = i1;
                    if (ppp1 != null)
                    {
                        j2 = i1 + qlp.c(17, ppp1);
                    }
                    k1++;
                    i1 = j2;
                } while (true);
            }
        }
        return j2;
    }

    public final qlw a(qlo qlo1)
    {
_L20:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 182
    //                   24: 211
    //                   34: 267
    //                   42: 296
    //                   50: 325
    //                   58: 427
    //                   64: 551
    //                   72: 565
    //                   80: 579
    //                   90: 619
    //                   98: 648
    //                   104: 677
    //                   114: 691
    //                   122: 702
    //                   130: 731
    //                   138: 760;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.a(qlo1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L20
_L4:
        if (c == null)
        {
            c = new ppc();
        }
        qlo1.a(c);
          goto _L20
_L5:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (f == null)
        {
            f = new poo();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L7:
        if (h == null)
        {
            h = new ppc();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L8:
        int k2 = qmb.b(qlo1, 50);
        String as[];
        int k1;
        if (j == null)
        {
            k1 = 0;
        } else
        {
            k1 = j.length;
        }
        as = new String[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(j, 0, as, 0, k1);
            k2 = k1;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = qlo1.g();
            qlo1.a();
        }

        as[k2] = qlo1.g();
        j = as;
        continue; /* Loop/switch isn't completed */
_L9:
        int l2 = qmb.b(qlo1, 58);
        ppc appc[];
        int l1;
        if (k == null)
        {
            l1 = 0;
        } else
        {
            l1 = k.length;
        }
        appc = new ppc[l2 + l1];
        l2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(k, 0, appc, 0, l1);
            l2 = l1;
        }
        for (; l2 < appc.length - 1; l2++)
        {
            appc[l2] = new ppc();
            qlo1.a(appc[l2]);
            qlo1.a();
        }

        appc[l2] = new ppc();
        qlo1.a(appc[l2]);
        k = appc;
        continue; /* Loop/switch isn't completed */
_L10:
        m = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L11:
        n = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L12:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 1: // '\001'
        case 2: // '\002'
            p = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        if (q == null)
        {
            q = new ppg();
        }
        qlo1.a(q);
        continue; /* Loop/switch isn't completed */
_L14:
        if (g == null)
        {
            g = new pop();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L15:
        o = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        r = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L17:
        if (d == null)
        {
            d = new ppp();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L18:
        if (i == null)
        {
            i = new ppp();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L19:
        int i3 = qmb.b(qlo1, 138);
        ppp appp[];
        int j2;
        if (l == null)
        {
            j2 = 0;
        } else
        {
            j2 = l.length;
        }
        appp = new ppp[i3 + j2];
        i3 = j2;
        if (j2 != 0)
        {
            System.arraycopy(l, 0, appp, 0, j2);
            i3 = j2;
        }
        for (; i3 < appp.length - 1; i3++)
        {
            appp[i3] = new ppp();
            qlo1.a(appp[i3]);
            qlo1.a();
        }

        appp[i3] = new ppp();
        qlo1.a(appp[i3]);
        l = appp;
        if (true) goto _L20; else goto _L21
_L21:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        qlp1.a(1, b);
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (e != 0x80000000)
        {
            qlp1.a(3, e);
        }
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (h != null)
        {
            qlp1.a(5, h);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                String s = j[i1];
                if (s != null)
                {
                    qlp1.a(6, s);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int j1 = 0; j1 < k.length; j1++)
            {
                ppc ppc1 = k[j1];
                if (ppc1 != null)
                {
                    qlp1.a(7, ppc1);
                }
            }

        }
        if (m != null)
        {
            qlp1.a(8, m.booleanValue());
        }
        if (n != null)
        {
            qlp1.a(9, n.booleanValue());
        }
        if (p != 0x80000000)
        {
            qlp1.a(10, p);
        }
        if (q != null)
        {
            qlp1.a(11, q);
        }
        if (g != null)
        {
            qlp1.a(12, g);
        }
        if (o != null)
        {
            qlp1.a(13, o.booleanValue());
        }
        if (r != null)
        {
            qlp1.a(14, r);
        }
        if (d != null)
        {
            qlp1.a(15, d);
        }
        if (i != null)
        {
            qlp1.a(16, i);
        }
        if (l != null && l.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < l.length; k1++)
            {
                ppp ppp1 = l[k1];
                if (ppp1 != null)
                {
                    qlp1.a(17, ppp1);
                }
            }

        }
        super.a(qlp1);
    }
}
