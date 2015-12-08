// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppq extends qlq
{

    private static volatile ppq a[];
    private String b;
    private String c;
    private String d[];
    private String e;
    private pok f;
    private String g;
    private ppc h;
    private ppp i;
    private Boolean j;
    private ppq k[];
    private int l;

    public ppq()
    {
        b = null;
        c = null;
        d = qmb.f;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = b();
        l = 0x80000000;
        F = null;
        G = -1;
    }

    public static ppq[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppq[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.b(1, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < d.length; j2 = k2)
                {
                    String s = d[j1];
                    int l2 = k1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = k1 + qlp.a(s);
                    }
                    j1++;
                    k1 = l2;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(5, f);
        }
        int l1 = j1;
        if (g != null)
        {
            l1 = j1 + qlp.b(6, g);
        }
        i1 = l1;
        if (j != null)
        {
            j.booleanValue();
            i1 = l1 + (qlp.c(7) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= k.length)
                    {
                        break;
                    }
                    ppq ppq1 = k[i2];
                    j1 = i1;
                    if (ppq1 != null)
                    {
                        j1 = i1 + qlp.c(8, ppq1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (l != 0x80000000)
        {
            i1 = j1 + qlp.e(9, l);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.c(10, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.c(11, i);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L14:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   26: 145
    //                   34: 247
    //                   42: 258
    //                   50: 287
    //                   56: 298
    //                   66: 312
    //                   72: 436
    //                   82: 543
    //                   90: 572;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.a(qlo1, i1)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L14
_L4:
        c = qlo1.g();
          goto _L14
_L5:
        int i2 = qmb.b(qlo1, 26);
        String as[];
        int j1;
        if (d == null)
        {
            j1 = 0;
        } else
        {
            j1 = d.length;
        }
        as = new String[i2 + j1];
        i2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(d, 0, as, 0, j1);
            i2 = j1;
        }
        for (; i2 < as.length - 1; i2++)
        {
            as[i2] = qlo1.g();
            qlo1.a();
        }

        as[i2] = qlo1.g();
        d = as;
          goto _L14
_L6:
        e = qlo1.g();
          goto _L14
_L7:
        if (f == null)
        {
            f = new pok();
        }
        qlo1.a(f);
          goto _L14
_L8:
        g = qlo1.g();
          goto _L14
_L9:
        j = Boolean.valueOf(qlo1.f());
          goto _L14
_L10:
        int j2 = qmb.b(qlo1, 66);
        ppq appq[];
        int k1;
        if (k == null)
        {
            k1 = 0;
        } else
        {
            k1 = k.length;
        }
        appq = new ppq[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(k, 0, appq, 0, k1);
            j2 = k1;
        }
        for (; j2 < appq.length - 1; j2++)
        {
            appq[j2] = new ppq();
            qlo1.a(appq[j2]);
            qlo1.a();
        }

        appq[j2] = new ppq();
        qlo1.a(appq[j2]);
        k = appq;
          goto _L14
_L11:
        int l1 = qlo1.i();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 100: // 'd'
        case 101: // 'e'
        case 110: // 'n'
            l = l1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (h == null)
        {
            h = new ppc();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L13:
        if (i == null)
        {
            i = new ppp();
        }
        qlo1.a(i);
        if (true) goto _L14; else goto _L15
_L15:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s = d[i1];
                if (s != null)
                {
                    qlp1.a(3, s);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (j != null)
        {
            qlp1.a(7, j.booleanValue());
        }
        if (k != null && k.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < k.length; j1++)
            {
                ppq ppq1 = k[j1];
                if (ppq1 != null)
                {
                    qlp1.a(8, ppq1);
                }
            }

        }
        if (l != 0x80000000)
        {
            qlp1.a(9, l);
        }
        if (h != null)
        {
            qlp1.a(10, h);
        }
        if (i != null)
        {
            qlp1.a(11, i);
        }
        super.a(qlp1);
    }
}
