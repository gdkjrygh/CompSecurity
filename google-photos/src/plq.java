// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plq extends qlq
{

    public String a;
    public String b;
    public String c;
    public String d[];
    public int e;
    private String f[];
    private String g[];
    private String h;
    private String i;
    private String j;

    public plq()
    {
        a = null;
        b = null;
        c = null;
        f = qmb.f;
        d = qmb.f;
        g = qmb.f;
        e = 0x80000000;
        h = null;
        i = null;
        j = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l3 = super.a() + qlp.b(1, a) + qlp.b(2, b);
        int k;
        int i1;
        int l1;
        if (f != null && f.length > 0)
        {
            k = 0;
            int l = 0;
            int j1;
            int j2;
            for (j1 = 0; k < f.length; j1 = j2)
            {
                String s = f[k];
                int i3 = l;
                j2 = j1;
                if (s != null)
                {
                    j2 = j1 + 1;
                    i3 = l + qlp.a(s);
                }
                k++;
                l = i3;
            }

            k = l3 + l + j1 * 1;
        } else
        {
            k = l3;
        }
        i1 = k + qlp.e(4, e);
        k = i1;
        if (h != null)
        {
            k = i1 + qlp.b(5, h);
        }
        i1 = k;
        if (d != null)
        {
            i1 = k;
            if (d.length > 0)
            {
                i1 = 0;
                int k1 = 0;
                int k2;
                int j3;
                for (k2 = 0; i1 < d.length; k2 = j3)
                {
                    String s1 = d[i1];
                    l3 = k1;
                    j3 = k2;
                    if (s1 != null)
                    {
                        j3 = k2 + 1;
                        l3 = k1 + qlp.a(s1);
                    }
                    i1++;
                    k1 = l3;
                }

                i1 = k + k1 + k2 * 1;
            }
        }
        l1 = i1;
        if (i != null)
        {
            l1 = i1 + qlp.b(7, i);
        }
        k = l1;
        if (c != null)
        {
            k = l1 + qlp.b(8, c);
        }
        i1 = k;
        if (g != null)
        {
            i1 = k;
            if (g.length > 0)
            {
                int i2 = 0;
                int l2 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < g.length;)
                {
                    String s2 = g[i1];
                    l3 = i2;
                    int k3 = l2;
                    if (s2 != null)
                    {
                        k3 = l2 + 1;
                        l3 = i2 + qlp.a(s2);
                    }
                    i1++;
                    i2 = l3;
                    l2 = k3;
                }

                i1 = k + i2 + l2 * 1;
            }
        }
        k = i1;
        if (j != null)
        {
            k = i1 + qlp.b(10, j);
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
_L13:
        int k = qlo1.a();
        k;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 126
    //                   26: 137
    //                   32: 239
    //                   42: 283
    //                   50: 294
    //                   58: 396
    //                   66: 407
    //                   74: 418
    //                   82: 520;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.a(qlo1, k)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L13
_L4:
        b = qlo1.g();
          goto _L13
_L5:
        int l1 = qmb.b(qlo1, 26);
        String as[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        as = new String[l1 + l];
        l1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, as, 0, l);
            l1 = l;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = qlo1.g();
            qlo1.a();
        }

        as[l1] = qlo1.g();
        f = as;
          goto _L13
_L6:
        int i1 = qlo1.i();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L8:
        int i2 = qmb.b(qlo1, 50);
        String as1[];
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = d.length;
        }
        as1 = new String[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(d, 0, as1, 0, j1);
            i2 = j1;
        }
        for (; i2 < as1.length - 1; i2++)
        {
            as1[i2] = qlo1.g();
            qlo1.a();
        }

        as1[i2] = qlo1.g();
        d = as1;
        continue; /* Loop/switch isn't completed */
_L9:
        i = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        int j2 = qmb.b(qlo1, 74);
        String as2[];
        int k1;
        if (g == null)
        {
            k1 = 0;
        } else
        {
            k1 = g.length;
        }
        as2 = new String[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(g, 0, as2, 0, k1);
            j2 = k1;
        }
        for (; j2 < as2.length - 1; j2++)
        {
            as2[j2] = qlo1.g();
            qlo1.a();
        }

        as2[j2] = qlo1.g();
        g = as2;
        continue; /* Loop/switch isn't completed */
_L12:
        j = qlo1.g();
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        qlp1.a(1, a);
        qlp1.a(2, b);
        if (f != null && f.length > 0)
        {
            for (int k = 0; k < f.length; k++)
            {
                String s = f[k];
                if (s != null)
                {
                    qlp1.a(3, s);
                }
            }

        }
        qlp1.a(4, e);
        if (h != null)
        {
            qlp1.a(5, h);
        }
        if (d != null && d.length > 0)
        {
            for (int l = 0; l < d.length; l++)
            {
                String s1 = d[l];
                if (s1 != null)
                {
                    qlp1.a(6, s1);
                }
            }

        }
        if (i != null)
        {
            qlp1.a(7, i);
        }
        if (c != null)
        {
            qlp1.a(8, c);
        }
        if (g != null && g.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < g.length; i1++)
            {
                String s2 = g[i1];
                if (s2 != null)
                {
                    qlp1.a(9, s2);
                }
            }

        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        super.a(qlp1);
    }
}
