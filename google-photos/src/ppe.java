// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppe extends qlq
{

    private String a;
    private int b;
    private ppf c[];
    private Long d;
    private poy e;
    private String f;
    private Boolean g;
    private ppf h;
    private int i;
    private ppf j[];
    private int k[];

    public ppe()
    {
        a = null;
        b = 0x80000000;
        c = ppf.b();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0x80000000;
        j = ppf.b();
        k = qmb.a;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l = super.a();
        int i1 = l;
        if (a != null)
        {
            i1 = l + qlp.b(1, a);
        }
        l = i1;
        if (b != 0x80000000)
        {
            l = i1 + qlp.e(2, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                for (i1 = 0; i1 < c.length;)
                {
                    ppf ppf1 = c[i1];
                    int j1 = l;
                    if (ppf1 != null)
                    {
                        j1 = l + qlp.c(3, ppf1);
                    }
                    i1++;
                    l = j1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (d != null)
        {
            l = i1 + qlp.e(4, d.longValue());
        }
        i1 = l;
        if (e != null)
        {
            i1 = l + qlp.c(5, e);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + qlp.b(6, f);
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (qlp.c(7) + 1);
        }
        int k1 = i1;
        if (h != null)
        {
            k1 = i1 + qlp.c(8, h);
        }
        l = k1;
        if (i != 0x80000000)
        {
            l = k1 + qlp.e(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                for (i1 = 0; i1 < j.length;)
                {
                    ppf ppf2 = j[i1];
                    int l1 = l;
                    if (ppf2 != null)
                    {
                        l1 = l + qlp.c(10, ppf2);
                    }
                    i1++;
                    l = l1;
                }

                i1 = l;
            }
        }
        l = i1;
        if (k != null)
        {
            l = i1;
            if (k.length > 0)
            {
                int i2 = 0;
                for (l = ((flag) ? 1 : 0); l < k.length; l++)
                {
                    i2 += qlp.b(k[l]);
                }

                l = i1 + i2 + k.length * 1;
            }
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
_L15:
        int l = qlo1.a();
        l;
        JVM INSTR lookupswitch 13: default 124
    //                   0: 134
    //                   10: 136
    //                   16: 147
    //                   26: 200
    //                   32: 331
    //                   42: 345
    //                   50: 374
    //                   56: 385
    //                   66: 399
    //                   72: 428
    //                   82: 484
    //                   88: 615
    //                   90: 796;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.a(qlo1, l)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L15
_L4:
        l = qlo1.i();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = l;
            break;
        }
          goto _L16
_L5:
        int i1 = qmb.b(qlo1, 26);
        ppf appf[];
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        appf = new ppf[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, appf, 0, l);
            i1 = l;
        }
        for (; i1 < appf.length - 1; i1++)
        {
            appf[i1] = new ppf();
            qlo1.a(appf[i1]);
            qlo1.a();
        }

        appf[i1] = new ppf();
        qlo1.a(appf[i1]);
        c = appf;
          goto _L16
_L6:
        d = Long.valueOf(qlo1.j());
          goto _L16
_L7:
        if (e == null)
        {
            e = new poy();
        }
        qlo1.a(e);
          goto _L16
_L8:
        f = qlo1.g();
          goto _L16
_L9:
        g = Boolean.valueOf(qlo1.f());
          goto _L16
_L10:
        if (h == null)
        {
            h = new ppf();
        }
        qlo1.a(h);
          goto _L16
_L11:
        l = qlo1.i();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            i = l;
            break;
        }
          goto _L16
_L12:
        int j1 = qmb.b(qlo1, 82);
        ppf appf1[];
        if (j == null)
        {
            l = 0;
        } else
        {
            l = j.length;
        }
        appf1 = new ppf[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(j, 0, appf1, 0, l);
            j1 = l;
        }
        for (; j1 < appf1.length - 1; j1++)
        {
            appf1[j1] = new ppf();
            qlo1.a(appf1[j1]);
            qlo1.a();
        }

        appf1[j1] = new ppf();
        qlo1.a(appf1[j1]);
        j = appf1;
          goto _L16
_L13:
        int ai[];
        int k1;
        int j2;
        j2 = qmb.b(qlo1, 88);
        ai = new int[j2];
        k1 = 0;
        l = 0;
_L23:
        if (k1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (k1 != 0)
        {
            qlo1.a();
        }
        k2 = qlo1.i();
        k2;
        JVM INSTR tableswitch 0 1: default 680
    //                   0 689
    //                   1 689;
           goto _L19 _L20 _L20
_L19:
        k1++;
          goto _L21
_L20:
        int l1 = l + 1;
        ai[l] = k2;
        l = l1;
        if (true) goto _L19; else goto _L18
_L18:
        if (l != 0)
        {
            if (k == null)
            {
                k1 = 0;
            } else
            {
                k1 = k.length;
            }
            if (k1 == 0 && l == ai.length)
            {
                k = ai;
            } else
            {
                int ai1[] = new int[k1 + l];
                if (k1 != 0)
                {
                    System.arraycopy(k, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, l);
                k = ai1;
            }
        }
          goto _L16
_L21:
        if (true) goto _L23; else goto _L22
_L22:
_L14:
        int i2;
        i2 = qlo1.c(qlo1.i());
        l = qlo1.o();
        k1 = 0;
_L32:
        if (qlo1.m() <= 0) goto _L25; else goto _L24
_L24:
        switch (qlo1.i())
        {
        case 0: // '\0'
        case 1: // '\001'
            k1++;
            break;
        }
          goto _L26
_L25:
        if (k1 == 0) goto _L28; else goto _L27
_L27:
        qlo1.e(l);
        if (k == null)
        {
            l = 0;
        } else
        {
            l = k.length;
        }
        ai = new int[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(k, 0, ai, 0, l);
            k1 = l;
        }
_L30:
        if (qlo1.m() > 0)
        {
            l = qlo1.i();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[k1] = l;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        k = ai;
_L28:
        qlo1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L30; else goto _L29
_L29:
_L26:
        if (true) goto _L32; else goto _L31
_L31:
_L16:
        if (true) goto _L15; else goto _L33
_L33:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != 0x80000000)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                ppf ppf1 = c[l];
                if (ppf1 != null)
                {
                    qlp1.a(3, ppf1);
                }
            }

        }
        if (d != null)
        {
            qlp1.b(4, d.longValue());
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != 0x80000000)
        {
            qlp1.a(9, i);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                ppf ppf2 = j[i1];
                if (ppf2 != null)
                {
                    qlp1.a(10, ppf2);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < k.length; j1++)
            {
                qlp1.a(11, k[j1]);
            }

        }
        super.a(qlp1);
    }
}
