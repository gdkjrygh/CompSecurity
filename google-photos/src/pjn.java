// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjn extends qlq
{

    public String a[];
    public String b[];
    public int c;
    public int d;
    public Boolean e;
    public Boolean f;
    private long g[];
    private String h[];
    private Boolean i;

    public pjn()
    {
        g = qmb.b;
        h = qmb.f;
        a = qmb.f;
        b = qmb.f;
        c = 0x80000000;
        d = 0x80000000;
        i = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j;
        int l;
        if (g != null && g.length > 0)
        {
            j = 0;
            int k = 0;
            for (; j < g.length; j++)
            {
                k += qlp.a(g[j]);
            }

            j = i1 + k + g.length * 1;
        } else
        {
            j = i1;
        }
        l = j;
        if (h != null)
        {
            l = j;
            if (h.length > 0)
            {
                l = 0;
                i1 = 0;
                int j1;
                int i2;
                for (j1 = 0; l < h.length; j1 = i2)
                {
                    String s = h[l];
                    int l2 = i1;
                    i2 = j1;
                    if (s != null)
                    {
                        i2 = j1 + 1;
                        l2 = i1 + qlp.a(s);
                    }
                    l++;
                    i1 = l2;
                }

                l = j + i1 + j1 * 1;
            }
        }
        j = l;
        if (d != 0x80000000)
        {
            j = l + qlp.e(3, d);
        }
        l = j;
        if (i != null)
        {
            i.booleanValue();
            l = j + (qlp.c(4) + 1);
        }
        j = l;
        if (e != null)
        {
            e.booleanValue();
            j = l + (qlp.c(5) + 1);
        }
        l = j;
        if (a != null)
        {
            l = j;
            if (a.length > 0)
            {
                l = 0;
                i1 = 0;
                int k1;
                int j2;
                for (k1 = 0; l < a.length; k1 = j2)
                {
                    String s1 = a[l];
                    int i3 = i1;
                    j2 = k1;
                    if (s1 != null)
                    {
                        j2 = k1 + 1;
                        i3 = i1 + qlp.a(s1);
                    }
                    l++;
                    i1 = i3;
                }

                l = j + i1 + k1 * 1;
            }
        }
        j = l;
        if (b != null)
        {
            j = l;
            if (b.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s2 = b[j];
                    int j3 = i1;
                    int k2 = l1;
                    if (s2 != null)
                    {
                        k2 = l1 + 1;
                        j3 = i1 + qlp.a(s2);
                    }
                    j++;
                    i1 = j3;
                    l1 = k2;
                }

                j = l + i1 + l1 * 1;
            }
        }
        l = j;
        if (c != 0x80000000)
        {
            l = j + qlp.e(8, c);
        }
        j = l;
        if (f != null)
        {
            f.booleanValue();
            j = l + (qlp.c(9) + 1);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L13:
        int j = qlo1.a();
        j;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   10: 216
    //                   18: 344
    //                   24: 446
    //                   32: 495
    //                   40: 509
    //                   50: 523
    //                   58: 625
    //                   64: 727
    //                   72: 771;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.a(qlo1, j)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        int j2 = qmb.b(qlo1, 8);
        long al[];
        int k;
        if (g == null)
        {
            k = 0;
        } else
        {
            k = g.length;
        }
        al = new long[j2 + k];
        j2 = k;
        if (k != 0)
        {
            System.arraycopy(g, 0, al, 0, k);
            j2 = k;
        }
        for (; j2 < al.length - 1; j2++)
        {
            al[j2] = qlo1.j();
            qlo1.a();
        }

        al[j2] = qlo1.j();
        g = al;
          goto _L13
_L4:
        int k3 = qlo1.c(qlo1.i());
        int l = qlo1.o();
        int k2;
        for (k2 = 0; qlo1.m() > 0; k2++)
        {
            qlo1.j();
        }

        qlo1.e(l);
        long al1[];
        if (g == null)
        {
            l = 0;
        } else
        {
            l = g.length;
        }
        al1 = new long[k2 + l];
        k2 = l;
        if (l != 0)
        {
            System.arraycopy(g, 0, al1, 0, l);
            k2 = l;
        }
        for (; k2 < al1.length; k2++)
        {
            al1[k2] = qlo1.j();
        }

        g = al1;
        qlo1.d(k3);
          goto _L13
_L5:
        int l2 = qmb.b(qlo1, 18);
        String as[];
        int i1;
        if (h == null)
        {
            i1 = 0;
        } else
        {
            i1 = h.length;
        }
        as = new String[l2 + i1];
        l2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(h, 0, as, 0, i1);
            l2 = i1;
        }
        for (; l2 < as.length - 1; l2++)
        {
            as[l2] = qlo1.g();
            qlo1.a();
        }

        as[l2] = qlo1.g();
        h = as;
          goto _L13
_L6:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        i = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        int i3 = qmb.b(qlo1, 50);
        String as1[];
        int k1;
        if (a == null)
        {
            k1 = 0;
        } else
        {
            k1 = a.length;
        }
        as1 = new String[i3 + k1];
        i3 = k1;
        if (k1 != 0)
        {
            System.arraycopy(a, 0, as1, 0, k1);
            i3 = k1;
        }
        for (; i3 < as1.length - 1; i3++)
        {
            as1[i3] = qlo1.g();
            qlo1.a();
        }

        as1[i3] = qlo1.g();
        a = as1;
        continue; /* Loop/switch isn't completed */
_L10:
        int j3 = qmb.b(qlo1, 58);
        String as2[];
        int l1;
        if (b == null)
        {
            l1 = 0;
        } else
        {
            l1 = b.length;
        }
        as2 = new String[j3 + l1];
        j3 = l1;
        if (l1 != 0)
        {
            System.arraycopy(b, 0, as2, 0, l1);
            j3 = l1;
        }
        for (; j3 < as2.length - 1; j3++)
        {
            as2[j3] = qlo1.g();
            qlo1.a();
        }

        as2[j3] = qlo1.g();
        b = as2;
        continue; /* Loop/switch isn't completed */
_L11:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        f = Boolean.valueOf(qlo1.f());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (g != null && g.length > 0)
        {
            for (int j = 0; j < g.length; j++)
            {
                qlp1.b(1, g[j]);
            }

        }
        if (h != null && h.length > 0)
        {
            for (int k = 0; k < h.length; k++)
            {
                String s = h[k];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        if (d != 0x80000000)
        {
            qlp1.a(3, d);
        }
        if (i != null)
        {
            qlp1.a(4, i.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.booleanValue());
        }
        if (a != null && a.length > 0)
        {
            for (int l = 0; l < a.length; l++)
            {
                String s1 = a[l];
                if (s1 != null)
                {
                    qlp1.a(6, s1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < b.length; i1++)
            {
                String s2 = b[i1];
                if (s2 != null)
                {
                    qlp1.a(7, s2);
                }
            }

        }
        if (c != 0x80000000)
        {
            qlp1.a(8, c);
        }
        if (f != null)
        {
            qlp1.a(9, f.booleanValue());
        }
        super.a(qlp1);
    }
}
