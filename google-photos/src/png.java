// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class png extends qlq
{

    public pnc a[];
    public pmv b;
    public int c;
    public int d;
    public Boolean e;
    public Boolean f;
    private String g;
    private Boolean h;
    private String i;
    private String j;
    private String k;
    private String l;

    public png()
    {
        a = pnc.b();
        b = null;
        c = 0x80000000;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        d = 0x80000000;
        l = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i1 = super.a();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                int k1 = 0;
                do
                {
                    j1 = i1;
                    if (k1 >= a.length)
                    {
                        break;
                    }
                    pnc pnc1 = a[k1];
                    j1 = i1;
                    if (pnc1 != null)
                    {
                        j1 = i1 + qlp.c(1, pnc1);
                    }
                    k1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.c(2, b);
        }
        j1 = i1;
        if (c != 0x80000000)
        {
            j1 = i1 + qlp.e(3, c);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.b(4, g);
        }
        j1 = i1;
        if (h != null)
        {
            h.booleanValue();
            j1 = i1 + (qlp.c(5) + 1);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.b(6, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.b(7, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.b(8, k);
        }
        j1 = i1;
        if (d != 0x80000000)
        {
            j1 = i1 + qlp.e(9, d);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.b(10, l);
        }
        j1 = i1;
        if (e != null)
        {
            e.booleanValue();
            j1 = i1 + (qlp.c(11) + 1);
        }
        i1 = j1;
        if (f != null)
        {
            f.booleanValue();
            i1 = j1 + (qlp.c(12) + 1);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L15:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   10: 131
    //                   18: 255
    //                   24: 284
    //                   34: 327
    //                   40: 338
    //                   50: 352
    //                   58: 363
    //                   66: 374
    //                   72: 385
    //                   82: 427
    //                   88: 438
    //                   96: 452;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.a(qlo1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        int i2 = qmb.b(qlo1, 10);
        pnc apnc[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        apnc = new pnc[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, apnc, 0, j1);
            i2 = j1;
        }
        for (; i2 < apnc.length - 1; i2++)
        {
            apnc[i2] = new pnc();
            qlo1.a(apnc[i2]);
            qlo1.a();
        }

        apnc[i2] = new pnc();
        qlo1.a(apnc[i2]);
        a = apnc;
          goto _L15
_L4:
        if (b == null)
        {
            b = new pmv();
        }
        qlo1.a(b);
          goto _L15
_L5:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        h = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        i = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        j = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        k = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        int l1 = qlo1.i();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        l = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L13:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        f = Boolean.valueOf(qlo1.f());
        if (true) goto _L15; else goto _L16
_L16:
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                pnc pnc1 = a[i1];
                if (pnc1 != null)
                {
                    qlp1.a(1, pnc1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != 0x80000000)
        {
            qlp1.a(3, c);
        }
        if (g != null)
        {
            qlp1.a(4, g);
        }
        if (h != null)
        {
            qlp1.a(5, h.booleanValue());
        }
        if (i != null)
        {
            qlp1.a(6, i);
        }
        if (j != null)
        {
            qlp1.a(7, j);
        }
        if (k != null)
        {
            qlp1.a(8, k);
        }
        if (d != 0x80000000)
        {
            qlp1.a(9, d);
        }
        if (l != null)
        {
            qlp1.a(10, l);
        }
        if (e != null)
        {
            qlp1.a(11, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(12, f.booleanValue());
        }
        super.a(qlp1);
    }
}
