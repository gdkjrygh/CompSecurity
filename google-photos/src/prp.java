// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class prp extends qlq
{

    private int a;
    private psf b[];
    private Integer c;
    private String d;
    private prk e[];

    public prp()
    {
        a = 0x80000000;
        b = psf.b();
        c = null;
        d = null;
        e = prk.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + qlp.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    psf psf1 = b[j];
                    int l = i;
                    if (psf1 != null)
                    {
                        l = i + qlp.c(2, psf1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        int i1 = j;
        if (c != null)
        {
            i1 = j + qlp.e(3, c.intValue());
        }
        i = i1;
        if (d != null)
        {
            i = i1 + qlp.b(4, d);
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    prk prk1 = e[k];
                    i1 = i;
                    if (prk1 != null)
                    {
                        i1 = i + qlp.c(5, prk1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L8:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 383
    //                   24: 507
    //                   34: 521
    //                   42: 532;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 206: 
        case 207: 
        case 300: 
        case 401: 
        case 402: 
        case 500: 
        case 600: 
        case 601: 
        case 602: 
        case 603: 
        case 604: 
        case 605: 
        case 606: 
        case 700: 
        case 701: 
        case 800: 
        case 801: 
        case 802: 
        case 803: 
        case 900: 
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = qmb.b(qlo1, 18);
        psf apsf[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        apsf = new psf[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, apsf, 0, k);
            i1 = k;
        }
        for (; i1 < apsf.length - 1; i1++)
        {
            apsf[i1] = new psf();
            qlo1.a(apsf[i1]);
            qlo1.a();
        }

        apsf[i1] = new psf();
        qlo1.a(apsf[i1]);
        b = apsf;
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = qmb.b(qlo1, 42);
        prk aprk[];
        int l;
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.length;
        }
        aprk = new prk[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(e, 0, aprk, 0, l);
            j1 = l;
        }
        for (; j1 < aprk.length - 1; j1++)
        {
            aprk[j1] = new prk();
            qlo1.a(aprk[j1]);
            qlo1.a();
        }

        aprk[j1] = new prk();
        qlo1.a(aprk[j1]);
        e = aprk;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                psf psf1 = b[i];
                if (psf1 != null)
                {
                    qlp1.a(2, psf1);
                }
            }

        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                prk prk1 = e[j];
                if (prk1 != null)
                {
                    qlp1.a(5, prk1);
                }
            }

        }
        super.a(qlp1);
    }
}
