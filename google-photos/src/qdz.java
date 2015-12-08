// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qdz extends qlq
{

    public String a;
    public Long b;
    public Long c;
    public qge d;
    public qea e[];
    public int f;
    private qif g[];
    private int h[];

    public qdz()
    {
        a = null;
        g = qif.b();
        b = null;
        c = null;
        d = null;
        e = qea.b();
        f = 0x80000000;
        h = qmb.a;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    qea qea1 = e[j];
                    int k = i;
                    if (qea1 != null)
                    {
                        k = i + qlp.c(5, qea1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (f != 0x80000000)
        {
            i = j + qlp.e(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                for (j = 0; j < g.length;)
                {
                    qif qif1 = g[j];
                    int l = i;
                    if (qif1 != null)
                    {
                        l = i + qlp.c(7, qif1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(9, d);
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < h.length; j++)
                {
                    i1 += qlp.b(h[j]);
                }

                j = i + i1 + h.length * 1;
            }
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L12:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   16: 118
    //                   24: 132
    //                   42: 146
    //                   48: 270
    //                   58: 311
    //                   74: 435
    //                   80: 464
    //                   82: 565;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.a(qlo1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L12
_L4:
        b = Long.valueOf(qlo1.j());
          goto _L12
_L5:
        c = Long.valueOf(qlo1.j());
          goto _L12
_L6:
        int k1 = qmb.b(qlo1, 42);
        qea aqea[];
        int j;
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.length;
        }
        aqea = new qea[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(e, 0, aqea, 0, j);
            k1 = j;
        }
        for (; k1 < aqea.length - 1; k1++)
        {
            aqea[k1] = new qea();
            qlo1.a(aqea[k1]);
            qlo1.a();
        }

        aqea[k1] = new qea();
        qlo1.a(aqea[k1]);
        e = aqea;
          goto _L12
_L7:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            f = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = qmb.b(qlo1, 58);
        qif aqif[];
        int l;
        if (g == null)
        {
            l = 0;
        } else
        {
            l = g.length;
        }
        aqif = new qif[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(g, 0, aqif, 0, l);
            l1 = l;
        }
        for (; l1 < aqif.length - 1; l1++)
        {
            aqif[l1] = new qif();
            qlo1.a(aqif[l1]);
            qlo1.a();
        }

        aqif[l1] = new qif();
        qlo1.a(aqif[l1]);
        g = aqif;
        continue; /* Loop/switch isn't completed */
_L9:
        if (d == null)
        {
            d = new qge();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L10:
        int i2 = qmb.b(qlo1, 80);
        int ai[];
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, ai, 0, i1);
            i2 = i1;
        }
        for (; i2 < ai.length - 1; i2++)
        {
            ai[i2] = qlo1.i();
            qlo1.a();
        }

        ai[i2] = qlo1.i();
        h = ai;
        continue; /* Loop/switch isn't completed */
_L11:
        int k2 = qlo1.c(qlo1.i());
        int j1 = qlo1.o();
        int j2;
        for (j2 = 0; qlo1.m() > 0; j2++)
        {
            qlo1.i();
        }

        qlo1.e(j1);
        int ai1[];
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.length;
        }
        ai1 = new int[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(h, 0, ai1, 0, j1);
            j2 = j1;
        }
        for (; j2 < ai1.length; j2++)
        {
            ai1[j2] = qlo1.i();
        }

        h = ai1;
        qlo1.d(k2);
        if (true) goto _L12; else goto _L13
_L13:
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
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.b(3, c.longValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                qea qea1 = e[i];
                if (qea1 != null)
                {
                    qlp1.a(5, qea1);
                }
            }

        }
        if (f != 0x80000000)
        {
            qlp1.a(6, f);
        }
        if (g != null && g.length > 0)
        {
            for (int j = 0; j < g.length; j++)
            {
                qif qif1 = g[j];
                if (qif1 != null)
                {
                    qlp1.a(7, qif1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(9, d);
        }
        if (h != null && h.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < h.length; k++)
            {
                qlp1.a(10, h[k]);
            }

        }
        super.a(qlp1);
    }
}
