// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plv extends qlq
{

    public String a;
    public String b;
    private int c;
    private String d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private String h;
    private String i;
    private String j[];
    private String k[];

    public plv()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = qmb.f;
        k = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int l = i1;
        if (a != null)
        {
            l = i1 + qlp.b(1, a);
        }
        i1 = l;
        if (b != null)
        {
            i1 = l + qlp.b(2, b);
        }
        l = i1;
        if (c != 0x80000000)
        {
            l = i1 + qlp.e(3, c);
        }
        i1 = l;
        if (e != null)
        {
            e.booleanValue();
            i1 = l + (qlp.c(4) + 1);
        }
        l = i1;
        if (d != null)
        {
            l = i1 + qlp.b(5, d);
        }
        i1 = l;
        if (f != null)
        {
            f.booleanValue();
            i1 = l + (qlp.c(6) + 1);
        }
        l = i1;
        if (g != null)
        {
            g.booleanValue();
            l = i1 + (qlp.c(7) + 1);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.b(8, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + qlp.b(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l;
            if (j.length > 0)
            {
                i1 = 0;
                int j1 = 0;
                int l1;
                int j2;
                for (l1 = 0; i1 < j.length; l1 = j2)
                {
                    String s = j[i1];
                    int l2 = j1;
                    j2 = l1;
                    if (s != null)
                    {
                        j2 = l1 + 1;
                        l2 = j1 + qlp.a(s);
                    }
                    i1++;
                    j1 = l2;
                }

                i1 = l + j1 + l1 * 1;
            }
        }
        l = i1;
        if (k != null)
        {
            l = i1;
            if (k.length > 0)
            {
                int k1 = 0;
                int i2 = 0;
                for (l = ((flag) ? 1 : 0); l < k.length;)
                {
                    String s1 = k[l];
                    int i3 = k1;
                    int k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        i3 = k1 + qlp.a(s1);
                    }
                    l++;
                    k1 = i3;
                    i2 = k2;
                }

                l = i1 + k1 + i2 * 1;
            }
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
_L14:
        int l = qlo1.a();
        l;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   24: 145
    //                   32: 199
    //                   42: 213
    //                   48: 224
    //                   56: 238
    //                   66: 252
    //                   74: 263
    //                   82: 274
    //                   90: 376;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.a(qlo1, l)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L14
_L4:
        b = qlo1.g();
          goto _L14
_L5:
        int i1 = qlo1.i();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L10:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        i = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = qmb.b(qlo1, 82);
        String as[];
        int j1;
        if (j == null)
        {
            j1 = 0;
        } else
        {
            j1 = j.length;
        }
        as = new String[l1 + j1];
        l1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(j, 0, as, 0, j1);
            l1 = j1;
        }
        for (; l1 < as.length - 1; l1++)
        {
            as[l1] = qlo1.g();
            qlo1.a();
        }

        as[l1] = qlo1.g();
        j = as;
        continue; /* Loop/switch isn't completed */
_L13:
        int i2 = qmb.b(qlo1, 90);
        String as1[];
        int k1;
        if (k == null)
        {
            k1 = 0;
        } else
        {
            k1 = k.length;
        }
        as1 = new String[i2 + k1];
        i2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(k, 0, as1, 0, k1);
            i2 = k1;
        }
        for (; i2 < as1.length - 1; i2++)
        {
            as1[i2] = qlo1.g();
            qlo1.a();
        }

        as1[i2] = qlo1.g();
        k = as1;
        if (true) goto _L14; else goto _L15
_L15:
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
            qlp1.a(2, b);
        }
        if (c != 0x80000000)
        {
            qlp1.a(3, c);
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (f != null)
        {
            qlp1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.booleanValue());
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null)
        {
            qlp1.a(9, i);
        }
        if (j != null && j.length > 0)
        {
            for (int l = 0; l < j.length; l++)
            {
                String s = j[l];
                if (s != null)
                {
                    qlp1.a(10, s);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < k.length; i1++)
            {
                String s1 = k[i1];
                if (s1 != null)
                {
                    qlp1.a(11, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
