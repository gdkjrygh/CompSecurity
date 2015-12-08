// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppv extends qlq
{

    public String a;
    private String b;
    private int c;
    private String d;
    private ppt e;
    private String f;
    private String g;
    private Double h;
    private ppw i;
    private String j;
    private String k;
    private String l;
    private pps m[];
    private Boolean n;
    private Boolean o;
    private String p;
    private String q;
    private Integer r;
    private Integer s;
    private ppu t[];
    private Boolean u;
    private String v;
    private Boolean w;

    public ppv()
    {
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = pps.b();
        n = null;
        o = null;
        p = null;
        q = null;
        a = null;
        r = null;
        s = null;
        t = ppu.b();
        u = null;
        v = null;
        w = null;
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
            i1 = j1 + qlp.b(1, b);
        }
        j1 = i1;
        if (c != 0x80000000)
        {
            j1 = i1 + qlp.e(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(4, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.b(5, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            h.doubleValue();
            i1 = j1 + (qlp.c(7) + 8);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.c(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.b(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.b(11, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.b(12, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    pps pps1 = m[j1];
                    int k1 = i1;
                    if (pps1 != null)
                    {
                        k1 = i1 + qlp.c(13, pps1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (n != null)
        {
            n.booleanValue();
            i1 = j1 + (qlp.c(14) + 1);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.b(15, p);
        }
        int l1 = j1;
        if (q != null)
        {
            l1 = j1 + qlp.b(16, q);
        }
        i1 = l1;
        if (r != null)
        {
            i1 = l1 + qlp.e(17, r.intValue());
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= t.length)
                    {
                        break;
                    }
                    ppu ppu1 = t[i2];
                    j1 = i1;
                    if (ppu1 != null)
                    {
                        j1 = i1 + qlp.c(18, ppu1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (u != null)
        {
            u.booleanValue();
            i1 = j1 + (qlp.c(19) + 1);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + qlp.e(20, s.intValue());
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (qlp.c(21) + 1);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + qlp.b(22, a);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + qlp.b(23, v);
        }
        j1 = i1;
        if (w != null)
        {
            w.booleanValue();
            j1 = i1 + (qlp.c(24) + 1);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L26:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 24: default 208
    //                   0: 217
    //                   10: 219
    //                   16: 230
    //                   26: 299
    //                   34: 310
    //                   42: 339
    //                   50: 350
    //                   57: 361
    //                   66: 378
    //                   82: 407
    //                   90: 418
    //                   98: 429
    //                   106: 440
    //                   112: 564
    //                   122: 578
    //                   130: 589
    //                   136: 600
    //                   146: 614
    //                   152: 739
    //                   160: 753
    //                   168: 767
    //                   178: 781
    //                   186: 792
    //                   192: 803;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L1:
        if (super.a(qlo1, i1)) goto _L26; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L26
_L4:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            c = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new ppt();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        f = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L8:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        h = Double.valueOf(Double.longBitsToDouble(qlo1.l()));
        continue; /* Loop/switch isn't completed */
_L10:
        if (i == null)
        {
            i = new ppw();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L11:
        j = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        k = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L13:
        l = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L14:
        int i2 = qmb.b(qlo1, 106);
        pps apps[];
        int k1;
        if (m == null)
        {
            k1 = 0;
        } else
        {
            k1 = m.length;
        }
        apps = new pps[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(m, 0, apps, 0, k1);
            i2 = k1;
        }
        for (; i2 < apps.length - 1; i2++)
        {
            apps[i2] = new pps();
            qlo1.a(apps[i2]);
            qlo1.a();
        }

        apps[i2] = new pps();
        qlo1.a(apps[i2]);
        m = apps;
        continue; /* Loop/switch isn't completed */
_L15:
        n = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        p = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L17:
        q = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L18:
        r = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L19:
        int j2 = qmb.b(qlo1, 146);
        ppu appu[];
        int l1;
        if (t == null)
        {
            l1 = 0;
        } else
        {
            l1 = t.length;
        }
        appu = new ppu[j2 + l1];
        j2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(t, 0, appu, 0, l1);
            j2 = l1;
        }
        for (; j2 < appu.length - 1; j2++)
        {
            appu[j2] = new ppu();
            qlo1.a(appu[j2]);
            qlo1.a();
        }

        appu[j2] = new ppu();
        qlo1.a(appu[j2]);
        t = appu;
        continue; /* Loop/switch isn't completed */
_L20:
        u = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L21:
        s = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L22:
        o = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L23:
        a = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L24:
        v = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L25:
        w = Boolean.valueOf(qlo1.f());
        if (true) goto _L26; else goto _L27
_L27:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != 0x80000000)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (h != null)
        {
            qlp1.a(7, h.doubleValue());
        }
        if (i != null)
        {
            qlp1.a(8, i);
        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        if (k != null)
        {
            qlp1.a(11, k);
        }
        if (l != null)
        {
            qlp1.a(12, l);
        }
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                pps pps1 = m[i1];
                if (pps1 != null)
                {
                    qlp1.a(13, pps1);
                }
            }

        }
        if (n != null)
        {
            qlp1.a(14, n.booleanValue());
        }
        if (p != null)
        {
            qlp1.a(15, p);
        }
        if (q != null)
        {
            qlp1.a(16, q);
        }
        if (r != null)
        {
            qlp1.a(17, r.intValue());
        }
        if (t != null && t.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < t.length; j1++)
            {
                ppu ppu1 = t[j1];
                if (ppu1 != null)
                {
                    qlp1.a(18, ppu1);
                }
            }

        }
        if (u != null)
        {
            qlp1.a(19, u.booleanValue());
        }
        if (s != null)
        {
            qlp1.a(20, s.intValue());
        }
        if (o != null)
        {
            qlp1.a(21, o.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(22, a);
        }
        if (v != null)
        {
            qlp1.a(23, v);
        }
        if (w != null)
        {
            qlp1.a(24, w.booleanValue());
        }
        super.a(qlp1);
    }
}
