// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pix extends qlq
{

    public piq a;
    public int b[];
    public pja c;
    private pik d;
    private pin e;
    private pio f;
    private pip g;
    private pit h[];
    private piu i;
    private piv j[];
    private piw k;
    private pjb l;
    private pjc m;
    private pil n;
    private Boolean o;
    private piz p;

    public pix()
    {
        a = null;
        b = qmb.a;
        d = null;
        e = null;
        f = null;
        g = null;
        h = pit.b();
        i = null;
        j = piv.b();
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        c = null;
        p = null;
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
            j1 = i1;
            if (b.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                for (; j1 < b.length; j1++)
                {
                    k1 += qlp.b(b[j1]);
                }

                j1 = i1 + k1 + b.length * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(3, d);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(4, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(5, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    pit pit1 = h[j1];
                    int l1 = i1;
                    if (pit1 != null)
                    {
                        l1 = i1 + qlp.c(7, pit1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= j.length)
                    {
                        break;
                    }
                    piv piv1 = j[i2];
                    j1 = i1;
                    if (piv1 != null)
                    {
                        j1 = i1 + qlp.c(9, piv1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + qlp.c(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(12, m);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(13, e);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + qlp.c(14, p);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.c(15, n);
        }
        i1 = j1;
        if (o != null)
        {
            o.booleanValue();
            i1 = j1 + (qlp.c(16) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(17, c);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L34:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 18: default 164
    //                   0: 174
    //                   10: 176
    //                   16: 205
    //                   18: 512
    //                   26: 958
    //                   34: 987
    //                   42: 1016
    //                   58: 1045
    //                   66: 1176
    //                   74: 1205
    //                   82: 1336
    //                   90: 1365
    //                   98: 1394
    //                   106: 1423
    //                   114: 1452
    //                   122: 1481
    //                   128: 1510
    //                   138: 1524;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.a(qlo1, i1))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new piq();
        }
        qlo1.a(a);
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int l1;
        int i3;
        i3 = qmb.b(qlo1, 16);
        ai = new int[i3];
        l1 = 0;
        i1 = 0;
_L26:
        if (l1 >= i3) goto _L21; else goto _L20
_L20:
        int j3;
        if (l1 != 0)
        {
            qlo1.a();
        }
        j3 = qlo1.i();
        j3;
        JVM INSTR tableswitch 0 32: default 396
    //                   0 405
    //                   1 405
    //                   2 405
    //                   3 405
    //                   4 405
    //                   5 405
    //                   6 405
    //                   7 405
    //                   8 405
    //                   9 405
    //                   10 405
    //                   11 405
    //                   12 405
    //                   13 405
    //                   14 405
    //                   15 405
    //                   16 405
    //                   17 405
    //                   18 405
    //                   19 405
    //                   20 405
    //                   21 405
    //                   22 405
    //                   23 405
    //                   24 405
    //                   25 405
    //                   26 405
    //                   27 405
    //                   28 405
    //                   29 405
    //                   30 405
    //                   31 405
    //                   32 405;
           goto _L22 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23
_L22:
        l1++;
          goto _L24
_L23:
        int k2 = i1 + 1;
        ai[i1] = j3;
        i1 = k2;
        if (true) goto _L22; else goto _L24
_L24:
        if (true) goto _L26; else goto _L25
_L25:
_L21:
        if (i1 != 0)
        {
            if (b == null)
            {
                l1 = 0;
            } else
            {
                l1 = b.length;
            }
            if (l1 == 0 && i1 == ai.length)
            {
                b = ai;
            } else
            {
                int ai1[] = new int[l1 + i1];
                if (l1 != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, l1);
                }
                System.arraycopy(ai, 0, ai1, l1, i1);
                b = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l2;
        l2 = qlo1.c(qlo1.i());
        i1 = qlo1.o();
        l1 = 0;
_L32:
        if (qlo1.m() > 0)
        {
            switch (qlo1.i())
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
                l1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l1 == 0) goto _L28; else goto _L27
_L27:
        qlo1.e(i1);
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.length;
        }
        ai = new int[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(b, 0, ai, 0, i1);
            l1 = i1;
        }
_L30:
        if (qlo1.m() > 0)
        {
            i1 = qlo1.i();
            switch (i1)
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
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
                ai[l1] = i1;
                l1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        b = ai;
          goto _L28
        if (true) goto _L30; else goto _L29
_L29:
        if (true) goto _L32; else goto _L31
_L31:
_L28:
        qlo1.d(l2);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pik();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new pio();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new pip();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        int i2 = qmb.b(qlo1, 58);
        pit apit[];
        int j1;
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.length;
        }
        apit = new pit[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(h, 0, apit, 0, j1);
            i2 = j1;
        }
        for (; i2 < apit.length - 1; i2++)
        {
            apit[i2] = new pit();
            qlo1.a(apit[i2]);
            qlo1.a();
        }

        apit[i2] = new pit();
        qlo1.a(apit[i2]);
        h = apit;
        continue; /* Loop/switch isn't completed */
_L10:
        if (i == null)
        {
            i = new piu();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L11:
        int j2 = qmb.b(qlo1, 74);
        piv apiv[];
        int k1;
        if (j == null)
        {
            k1 = 0;
        } else
        {
            k1 = j.length;
        }
        apiv = new piv[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(j, 0, apiv, 0, k1);
            j2 = k1;
        }
        for (; j2 < apiv.length - 1; j2++)
        {
            apiv[j2] = new piv();
            qlo1.a(apiv[j2]);
            qlo1.a();
        }

        apiv[j2] = new piv();
        qlo1.a(apiv[j2]);
        j = apiv;
        continue; /* Loop/switch isn't completed */
_L12:
        if (k == null)
        {
            k = new piw();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L13:
        if (l == null)
        {
            l = new pjb();
        }
        qlo1.a(l);
        continue; /* Loop/switch isn't completed */
_L14:
        if (m == null)
        {
            m = new pjc();
        }
        qlo1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        if (e == null)
        {
            e = new pin();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L16:
        if (p == null)
        {
            p = new piz();
        }
        qlo1.a(p);
        continue; /* Loop/switch isn't completed */
_L17:
        if (n == null)
        {
            n = new pil();
        }
        qlo1.a(n);
        continue; /* Loop/switch isn't completed */
_L18:
        o = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L19:
        if (c == null)
        {
            c = new pja();
        }
        qlo1.a(c);
        if (true) goto _L34; else goto _L33
_L33:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                qlp1.a(2, b[i1]);
            }

        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (g != null)
        {
            qlp1.a(5, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                pit pit1 = h[j1];
                if (pit1 != null)
                {
                    qlp1.a(7, pit1);
                }
            }

        }
        if (i != null)
        {
            qlp1.a(8, i);
        }
        if (j != null && j.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < j.length; k1++)
            {
                piv piv1 = j[k1];
                if (piv1 != null)
                {
                    qlp1.a(9, piv1);
                }
            }

        }
        if (k != null)
        {
            qlp1.a(10, k);
        }
        if (l != null)
        {
            qlp1.a(11, l);
        }
        if (m != null)
        {
            qlp1.a(12, m);
        }
        if (e != null)
        {
            qlp1.a(13, e);
        }
        if (p != null)
        {
            qlp1.a(14, p);
        }
        if (n != null)
        {
            qlp1.a(15, n);
        }
        if (o != null)
        {
            qlp1.a(16, o.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(17, c);
        }
        super.a(qlp1);
    }
}
