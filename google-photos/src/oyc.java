// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oyc extends qlq
{

    private static volatile oyc l[];
    public String a;
    public String b;
    public ozc c;
    public int d;
    public int e;
    public Long f;
    public Long g;
    public Boolean h;
    public oyi i;
    public oyb j;
    public int k;
    private oyf m[];
    private Long n;
    private String o;

    public oyc()
    {
        a = null;
        b = null;
        m = oyf.b();
        c = null;
        d = 0x80000000;
        n = null;
        e = 0x80000000;
        o = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = 0x80000000;
        F = null;
        G = -1;
    }

    public static oyc[] b()
    {
        if (l == null)
        {
            synchronized (qlu.a)
            {
                if (l == null)
                {
                    l = new oyc[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i1 = super.a();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1 + qlp.b(1, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.b(2, b);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    oyf oyf1 = m[j1];
                    int k1 = i1;
                    if (oyf1 != null)
                    {
                        k1 = i1 + qlp.c(3, oyf1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(4, c);
        }
        j1 = i1;
        if (d != 0x80000000)
        {
            j1 = i1 + qlp.e(5, d);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.d(6, n.longValue());
        }
        j1 = i1;
        if (e != 0x80000000)
        {
            j1 = i1 + qlp.e(7, e);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.b(8, o);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.d(9, f.longValue());
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.d(10, g.longValue());
        }
        j1 = i1;
        if (h != null)
        {
            h.booleanValue();
            j1 = i1 + (qlp.c(11) + 1);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(12, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.c(13, j);
        }
        i1 = j1;
        if (k != 0x80000000)
        {
            i1 = j1 + qlp.e(14, k);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L17:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   10: 147
    //                   18: 158
    //                   26: 169
    //                   34: 293
    //                   40: 322
    //                   48: 379
    //                   56: 393
    //                   66: 443
    //                   72: 454
    //                   80: 468
    //                   88: 482
    //                   98: 496
    //                   106: 525
    //                   112: 554;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.a(qlo1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L17
_L4:
        b = qlo1.g();
          goto _L17
_L5:
        int j2 = qmb.b(qlo1, 26);
        oyf aoyf[];
        int j1;
        if (m == null)
        {
            j1 = 0;
        } else
        {
            j1 = m.length;
        }
        aoyf = new oyf[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(m, 0, aoyf, 0, j1);
            j2 = j1;
        }
        for (; j2 < aoyf.length - 1; j2++)
        {
            aoyf[j2] = new oyf();
            qlo1.a(aoyf[j2]);
            qlo1.a();
        }

        aoyf[j2] = new oyf();
        qlo1.a(aoyf[j2]);
        m = aoyf;
          goto _L17
_L6:
        if (c == null)
        {
            c = new ozc();
        }
        qlo1.a(c);
          goto _L17
_L7:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        n = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L9:
        int l1 = qlo1.i();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            e = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        o = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        f = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L12:
        g = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L13:
        h = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        if (i == null)
        {
            i = new oyi();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L15:
        if (j == null)
        {
            j = new oyb();
        }
        qlo1.a(j);
        continue; /* Loop/switch isn't completed */
_L16:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = i2;
            break;
        }
        if (true) goto _L17; else goto _L18
_L18:
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
        if (m != null && m.length > 0)
        {
            for (int i1 = 0; i1 < m.length; i1++)
            {
                oyf oyf1 = m[i1];
                if (oyf1 != null)
                {
                    qlp1.a(3, oyf1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != 0x80000000)
        {
            qlp1.a(5, d);
        }
        if (n != null)
        {
            qlp1.a(6, n.longValue());
        }
        if (e != 0x80000000)
        {
            qlp1.a(7, e);
        }
        if (o != null)
        {
            qlp1.a(8, o);
        }
        if (f != null)
        {
            qlp1.a(9, f.longValue());
        }
        if (g != null)
        {
            qlp1.a(10, g.longValue());
        }
        if (h != null)
        {
            qlp1.a(11, h.booleanValue());
        }
        if (i != null)
        {
            qlp1.a(12, i);
        }
        if (j != null)
        {
            qlp1.a(13, j);
        }
        if (k != 0x80000000)
        {
            qlp1.a(14, k);
        }
        super.a(qlp1);
    }
}
