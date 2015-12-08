// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfp extends qlq
{

    private static volatile pfp l[];
    public int a;
    public pgk b;
    public pfo c;
    public pfp d[];
    public Integer e;
    public byte f[];
    public String g;
    public pfq h;
    public int i[];
    public pfp j;
    public Integer k;

    public pfp()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = b();
        e = null;
        f = null;
        g = null;
        h = null;
        i = qmb.a;
        j = null;
        k = null;
        F = null;
        G = -1;
    }

    public static pfp[] b()
    {
        if (l == null)
        {
            synchronized (qlu.a)
            {
                if (l == null)
                {
                    l = new pfp[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (a != 0x80000000)
        {
            i1 = j1 + qlp.e(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    pfp pfp1 = d[j1];
                    int k1 = i1;
                    if (pfp1 != null)
                    {
                        k1 = i1 + qlp.c(4, pfp1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.e(5, e.intValue());
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.b(6, f);
        }
        int l1 = j1;
        if (g != null)
        {
            l1 = j1 + qlp.b(7, g);
        }
        i1 = l1;
        if (h != null)
        {
            i1 = l1 + qlp.c(8, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                int i2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i.length; j1++)
                {
                    i2 += qlp.b(i[j1]);
                }

                j1 = i1 + i2 + i.length * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(10, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.e(11, k.intValue());
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L15:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 13: default 124
    //                   0: 134
    //                   8: 136
    //                   18: 184
    //                   26: 213
    //                   34: 242
    //                   40: 373
    //                   50: 387
    //                   58: 398
    //                   66: 409
    //                   72: 438
    //                   74: 624
    //                   82: 830
    //                   88: 859;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.a(qlo1, i1)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new pgk();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new pfo();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = qmb.b(qlo1, 34);
        pfp apfp[];
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        apfp = new pfp[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(d, 0, apfp, 0, i1);
            j1 = i1;
        }
        for (; j1 < apfp.length - 1; j1++)
        {
            apfp[j1] = new pfp();
            qlo1.a(apfp[j1]);
            qlo1.a();
        }

        apfp[j1] = new pfp();
        qlo1.a(apfp[j1]);
        d = apfp;
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        f = qlo1.h();
        continue; /* Loop/switch isn't completed */
_L9:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new pfq();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L11:
        int ai[];
        int k1;
        int j2;
        j2 = qmb.b(qlo1, 72);
        ai = new int[j2];
        k1 = 0;
        i1 = 0;
_L21:
        if (k1 >= j2) goto _L17; else goto _L16
_L16:
        int k2;
        if (k1 != 0)
        {
            qlo1.a();
        }
        k2 = qlo1.i();
        k2;
        JVM INSTR tableswitch 0 2: default 508
    //                   0 517
    //                   1 517
    //                   2 517;
           goto _L18 _L19 _L19 _L19
_L18:
        k1++;
        continue; /* Loop/switch isn't completed */
_L19:
        int l1 = i1 + 1;
        ai[i1] = k2;
        i1 = l1;
        if (true) goto _L18; else goto _L17
_L17:
        if (i1 != 0)
        {
            if (i == null)
            {
                k1 = 0;
            } else
            {
                k1 = i.length;
            }
            if (k1 == 0 && i1 == ai.length)
            {
                i = ai;
            } else
            {
                int ai1[] = new int[k1 + i1];
                if (k1 != 0)
                {
                    System.arraycopy(i, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, i1);
                i = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L21; else goto _L20
_L20:
_L12:
        int i2;
        i2 = qlo1.c(qlo1.i());
        i1 = qlo1.o();
        k1 = 0;
_L27:
        if (qlo1.m() > 0)
        {
            switch (qlo1.i())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L23; else goto _L22
_L22:
        qlo1.e(i1);
        if (i == null)
        {
            i1 = 0;
        } else
        {
            i1 = i.length;
        }
        ai = new int[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(i, 0, ai, 0, i1);
            k1 = i1;
        }
_L25:
        if (qlo1.m() > 0)
        {
            i1 = qlo1.i();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                ai[k1] = i1;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        i = ai;
_L23:
        qlo1.d(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L25; else goto _L24
_L24:
        if (true) goto _L27; else goto _L26
_L26:
_L13:
        if (j == null)
        {
            j = new pfp();
        }
        qlo1.a(j);
        continue; /* Loop/switch isn't completed */
_L14:
        k = Integer.valueOf(qlo1.i());
        if (true) goto _L15; else goto _L28
_L28:
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
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                pfp pfp1 = d[i1];
                if (pfp1 != null)
                {
                    qlp1.a(4, pfp1);
                }
            }

        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < i.length; j1++)
            {
                qlp1.a(9, i[j1]);
            }

        }
        if (j != null)
        {
            qlp1.a(10, j);
        }
        if (k != null)
        {
            qlp1.a(11, k.intValue());
        }
        super.a(qlp1);
    }
}
