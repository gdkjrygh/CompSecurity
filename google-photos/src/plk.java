// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plk extends qlq
{

    public String a;
    public pll b[];
    public Boolean c;
    public Boolean d;
    private String e[];
    private int f;

    public plk()
    {
        a = null;
        e = qmb.f;
        b = pll.b();
        c = null;
        d = null;
        f = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int l1 = super.a() + qlp.b(1, a);
        int i;
        int k;
        if (e != null && e.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int j1;
            for (l = 0; i < e.length; l = j1)
            {
                String s = e[i];
                int k1 = j;
                j1 = l;
                if (s != null)
                {
                    j1 = l + 1;
                    k1 = j + qlp.a(s);
                }
                i++;
                j = k1;
            }

            i = l1 + j + l * 1;
        } else
        {
            i = l1;
        }
        k = i;
        if (d != null)
        {
            d.booleanValue();
            k = i + (qlp.c(3) + 1);
        }
        i = k;
        if (f != 0x80000000)
        {
            i = k + qlp.e(4, f);
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k = i;
                    if (i1 >= b.length)
                    {
                        break;
                    }
                    pll pll1 = b[i1];
                    k = i;
                    if (pll1 != null)
                    {
                        k = i + qlp.c(5, pll1);
                    }
                    i1++;
                    i = k;
                } while (true);
            }
        }
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (qlp.c(6) + 1);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L9:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   24: 196
    //                   32: 210
    //                   42: 255
    //                   48: 379;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L9
_L4:
        int i1 = qmb.b(qlo1, 18);
        String as[];
        int j;
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.length;
        }
        as = new String[i1 + j];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(e, 0, as, 0, j);
            i1 = j;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = qlo1.g();
            qlo1.a();
        }

        as[i1] = qlo1.g();
        e = as;
          goto _L9
_L5:
        d = Boolean.valueOf(qlo1.f());
          goto _L9
_L6:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = qmb.b(qlo1, 42);
        pll apll[];
        int l;
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        apll = new pll[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, apll, 0, l);
            j1 = l;
        }
        for (; j1 < apll.length - 1; j1++)
        {
            apll[j1] = new pll();
            qlo1.a(apll[j1]);
            qlo1.a();
        }

        apll[j1] = new pll();
        qlo1.a(apll[j1]);
        b = apll;
        continue; /* Loop/switch isn't completed */
_L8:
        c = Boolean.valueOf(qlo1.f());
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        qlp1.a(1, a);
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        if (f != 0x80000000)
        {
            qlp1.a(4, f);
        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                pll pll1 = b[j];
                if (pll1 != null)
                {
                    qlp1.a(5, pll1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(6, c.booleanValue());
        }
        super.a(qlp1);
    }
}
