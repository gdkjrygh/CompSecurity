// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pje extends qlq
{

    public String a[];
    public String b[];
    public String c;
    public String d;
    public Boolean e;
    public int f;
    public String g;
    public pnp h;
    public qga i;
    public Boolean j;
    public Boolean k;
    private int l;
    private String m;
    private String n;
    private Boolean o;

    public pje()
    {
        a = qmb.f;
        b = qmb.f;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
        l = 0x80000000;
        g = null;
        m = null;
        n = null;
        o = null;
        h = null;
        i = null;
        j = null;
        k = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l3 = super.a();
        int j1;
        int k1;
        int i2;
        if (a != null && a.length > 0)
        {
            int i1 = 0;
            k1 = 0;
            int l1;
            int k2;
            for (l1 = 0; i1 < a.length; l1 = k2)
            {
                String s = a[i1];
                int i3 = k1;
                k2 = l1;
                if (s != null)
                {
                    k2 = l1 + 1;
                    i3 = k1 + qlp.a(s);
                }
                i1++;
                k1 = i3;
            }

            k1 = l3 + k1 + l1 * 1;
        } else
        {
            k1 = l3;
        }
        j1 = k1;
        if (c != null)
        {
            j1 = k1 + qlp.b(2, c);
        }
        k1 = j1;
        if (g != null)
        {
            k1 = j1 + qlp.b(3, g);
        }
        j1 = k1;
        if (n != null)
        {
            j1 = k1 + qlp.b(4, n);
        }
        k1 = j1;
        if (o != null)
        {
            o.booleanValue();
            k1 = j1 + (qlp.c(5) + 1);
        }
        i2 = k1;
        if (l != 0x80000000)
        {
            i2 = k1 + qlp.e(6, l);
        }
        j1 = i2;
        if (h != null)
        {
            j1 = i2 + qlp.c(7, h);
        }
        k1 = j1;
        if (b != null)
        {
            k1 = j1;
            if (b.length > 0)
            {
                int j2 = 0;
                int l2 = 0;
                for (k1 = ((flag) ? 1 : 0); k1 < b.length;)
                {
                    String s1 = b[k1];
                    int k3 = j2;
                    int j3 = l2;
                    if (s1 != null)
                    {
                        j3 = l2 + 1;
                        k3 = j2 + qlp.a(s1);
                    }
                    k1++;
                    j2 = k3;
                    l2 = j3;
                }

                k1 = j1 + j2 + l2 * 1;
            }
        }
        j1 = k1;
        if (d != null)
        {
            j1 = k1 + qlp.b(9, d);
        }
        k1 = j1;
        if (i != null)
        {
            k1 = j1 + qlp.c(10, i);
        }
        j1 = k1;
        if (e != null)
        {
            e.booleanValue();
            j1 = k1 + (qlp.c(11) + 1);
        }
        k1 = j1;
        if (j != null)
        {
            j.booleanValue();
            k1 = j1 + (qlp.c(12) + 1);
        }
        j1 = k1;
        if (k != null)
        {
            k.booleanValue();
            j1 = k1 + (qlp.c(13) + 1);
        }
        k1 = j1;
        if (f != 0x80000000)
        {
            k1 = j1 + qlp.e(14, f);
        }
        j1 = k1;
        if (m != null)
        {
            j1 = k1 + qlp.b(15, m);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L18:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 16: default 144
    //                   0: 153
    //                   10: 155
    //                   18: 257
    //                   26: 268
    //                   34: 279
    //                   40: 290
    //                   48: 304
    //                   58: 351
    //                   66: 380
    //                   74: 482
    //                   82: 493
    //                   88: 522
    //                   96: 536
    //                   104: 550
    //                   112: 564
    //                   122: 611;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L1:
        if (super.a(qlo1, i1)) goto _L18; else goto _L2
_L2:
        return this;
_L3:
        int j2 = qmb.b(qlo1, 10);
        String as[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        as = new String[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, as, 0, j1);
            j2 = j1;
        }
        for (; j2 < as.length - 1; j2++)
        {
            as[j2] = qlo1.g();
            qlo1.a();
        }

        as[j2] = qlo1.g();
        a = as;
          goto _L18
_L4:
        c = qlo1.g();
          goto _L18
_L5:
        g = qlo1.g();
          goto _L18
_L6:
        n = qlo1.g();
          goto _L18
_L7:
        o = Boolean.valueOf(qlo1.f());
          goto _L18
_L8:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            l = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (h == null)
        {
            h = new pnp();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L10:
        int k2 = qmb.b(qlo1, 66);
        String as1[];
        int l1;
        if (b == null)
        {
            l1 = 0;
        } else
        {
            l1 = b.length;
        }
        as1 = new String[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(b, 0, as1, 0, l1);
            k2 = l1;
        }
        for (; k2 < as1.length - 1; k2++)
        {
            as1[k2] = qlo1.g();
            qlo1.a();
        }

        as1[k2] = qlo1.g();
        b = as1;
        continue; /* Loop/switch isn't completed */
_L11:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        if (i == null)
        {
            i = new qga();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L13:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L14:
        j = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L15:
        k = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        int i2 = qlo1.i();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 3: // '\003'
            f = i2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        m = qlo1.g();
        if (true) goto _L18; else goto _L19
_L19:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                String s = a[i1];
                if (s != null)
                {
                    qlp1.a(1, s);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (g != null)
        {
            qlp1.a(3, g);
        }
        if (n != null)
        {
            qlp1.a(4, n);
        }
        if (o != null)
        {
            qlp1.a(5, o.booleanValue());
        }
        if (l != 0x80000000)
        {
            qlp1.a(6, l);
        }
        if (h != null)
        {
            qlp1.a(7, h);
        }
        if (b != null && b.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
            {
                String s1 = b[j1];
                if (s1 != null)
                {
                    qlp1.a(8, s1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(9, d);
        }
        if (i != null)
        {
            qlp1.a(10, i);
        }
        if (e != null)
        {
            qlp1.a(11, e.booleanValue());
        }
        if (j != null)
        {
            qlp1.a(12, j.booleanValue());
        }
        if (k != null)
        {
            qlp1.a(13, k.booleanValue());
        }
        if (f != 0x80000000)
        {
            qlp1.a(14, f);
        }
        if (m != null)
        {
            qlp1.a(15, m);
        }
        super.a(qlp1);
    }
}
