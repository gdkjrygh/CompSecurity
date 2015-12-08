// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqe extends qlq
{

    private int a;
    private Long b;
    private Long c;
    private qmn d[];
    private Integer e;
    private qmk f[];

    public pqe()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = qmn.b();
        e = null;
        f = qmk.b();
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
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    qmn qmn1 = d[j];
                    int l = i;
                    if (qmn1 != null)
                    {
                        l = i + qlp.c(4, qmn1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(5, e.intValue());
        }
        int i1 = i;
        if (f != null)
        {
            i1 = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    qmk qmk1 = f[k];
                    i1 = i;
                    if (qmk1 != null)
                    {
                        i1 = i + qlp.c(6, qmk1);
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
_L9:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 135
    //                   24: 149
    //                   34: 163
    //                   40: 287
    //                   50: 301;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = qmb.b(qlo1, 34);
        qmn aqmn[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        aqmn = new qmn[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, aqmn, 0, k);
            i1 = k;
        }
        for (; i1 < aqmn.length - 1; i1++)
        {
            aqmn[i1] = new qmn();
            qlo1.a(aqmn[i1]);
            qlo1.a();
        }

        aqmn[i1] = new qmn();
        qlo1.a(aqmn[i1]);
        d = aqmn;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = qmb.b(qlo1, 50);
        qmk aqmk[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        aqmk = new qmk[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, aqmk, 0, l);
            j1 = l;
        }
        for (; j1 < aqmk.length - 1; j1++)
        {
            aqmk[j1] = new qmk();
            qlo1.a(aqmk[j1]);
            qlo1.a();
        }

        aqmk[j1] = new qmk();
        qlo1.a(aqmk[j1]);
        f = aqmk;
        if (true) goto _L9; else goto _L10
_L10:
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
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.b(3, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                qmn qmn1 = d[i];
                if (qmn1 != null)
                {
                    qlp1.a(4, qmn1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                qmk qmk1 = f[j];
                if (qmk1 != null)
                {
                    qlp1.a(6, qmk1);
                }
            }

        }
        super.a(qlp1);
    }
}
