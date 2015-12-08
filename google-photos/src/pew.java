// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pew extends qlq
{

    private static volatile pew f[];
    public int a;
    public String b;
    public pet c;
    public pex d;
    public String e[];
    private pqb g;
    private String h[];
    private String i;

    public pew()
    {
        a = 0x80000000;
        b = null;
        g = null;
        c = null;
        h = qmb.f;
        d = null;
        i = null;
        e = qmb.f;
        F = null;
        G = -1;
    }

    public static pew[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new pew[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int k = super.a();
        int j = k;
        if (a != 0x80000000)
        {
            j = k + qlp.e(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + qlp.b(3, b);
        }
        int l = k;
        if (g != null)
        {
            l = k + qlp.c(4, g);
        }
        j = l;
        if (c != null)
        {
            j = l + qlp.c(8, c);
        }
        k = j;
        if (h != null)
        {
            k = j;
            if (h.length > 0)
            {
                k = 0;
                l = 0;
                int j1;
                int l1;
                for (j1 = 0; k < h.length; j1 = l1)
                {
                    String s = h[k];
                    int j2 = l;
                    l1 = j1;
                    if (s != null)
                    {
                        l1 = j1 + 1;
                        j2 = l + qlp.a(s);
                    }
                    k++;
                    l = j2;
                }

                k = j + l + j1 * 1;
            }
        }
        l = k;
        if (d != null)
        {
            l = k + qlp.c(11, d);
        }
        j = l;
        if (i != null)
        {
            j = l + qlp.b(12, i);
        }
        k = j;
        if (e != null)
        {
            k = j;
            if (e.length > 0)
            {
                int i1 = 0;
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < e.length;)
                {
                    String s1 = e[k];
                    int k2 = i1;
                    int i2 = k1;
                    if (s1 != null)
                    {
                        i2 = k1 + 1;
                        k2 = i1 + qlp.a(s1);
                    }
                    k++;
                    i1 = k2;
                    k1 = i2;
                }

                k = j + i1 + k1 * 1;
            }
        }
        return k;
    }

    public final qlw a(qlo qlo1)
    {
_L11:
        int j = qlo1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   26: 195
    //                   34: 206
    //                   66: 235
    //                   74: 264
    //                   90: 366
    //                   98: 395
    //                   106: 406;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int k = qlo1.i();
        switch (k)
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
        case 11: // '\013'
        case 12: // '\f'
        case 14: // '\016'
        case 15: // '\017'
            a = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        if (g == null)
        {
            g = new pqb();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new pet();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = qmb.b(qlo1, 74);
        String as[];
        int l;
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.length;
        }
        as = new String[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(h, 0, as, 0, l);
            j1 = l;
        }
        for (; j1 < as.length - 1; j1++)
        {
            as[j1] = qlo1.g();
            qlo1.a();
        }

        as[j1] = qlo1.g();
        h = as;
        continue; /* Loop/switch isn't completed */
_L8:
        if (d == null)
        {
            d = new pex();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L9:
        i = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        int k1 = qmb.b(qlo1, 106);
        String as1[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        as1 = new String[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, as1, 0, i1);
            k1 = i1;
        }
        for (; k1 < as1.length - 1; k1++)
        {
            as1[k1] = qlo1.g();
            qlo1.a();
        }

        as1[k1] = qlo1.g();
        e = as1;
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(3, b);
        }
        if (g != null)
        {
            qlp1.a(4, g);
        }
        if (c != null)
        {
            qlp1.a(8, c);
        }
        if (h != null && h.length > 0)
        {
            for (int j = 0; j < h.length; j++)
            {
                String s = h[j];
                if (s != null)
                {
                    qlp1.a(9, s);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(11, d);
        }
        if (i != null)
        {
            qlp1.a(12, i);
        }
        if (e != null && e.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < e.length; k++)
            {
                String s1 = e[k];
                if (s1 != null)
                {
                    qlp1.a(13, s1);
                }
            }

        }
        super.a(qlp1);
    }
}
