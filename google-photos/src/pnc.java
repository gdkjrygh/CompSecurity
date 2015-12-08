// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnc extends qlq
{

    private static volatile pnc a[];
    private int b;
    private int c;
    private String d;
    private pnf e;
    private pna f;
    private Boolean g;
    private Boolean h;
    private pmz i[];
    private String j;

    public pnc()
    {
        b = 0x80000000;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = pmz.b();
        j = null;
        F = null;
        G = -1;
    }

    public static pnc[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pnc[0];
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
        int l = super.a();
        int k = l;
        if (b != 0x80000000)
        {
            k = l + qlp.e(1, b);
        }
        l = k;
        if (c != 0x80000000)
        {
            l = k + qlp.e(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + qlp.b(3, d);
        }
        l = k;
        if (f != null)
        {
            l = k + qlp.c(4, f);
        }
        int i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (qlp.c(5) + 1);
        }
        k = i1;
        if (h != null)
        {
            h.booleanValue();
            k = i1 + (qlp.c(6) + 1);
        }
        l = k;
        if (i != null)
        {
            l = k;
            if (i.length > 0)
            {
                for (l = 0; l < i.length;)
                {
                    pmz pmz1 = i[l];
                    int j1 = k;
                    if (pmz1 != null)
                    {
                        j1 = k + qlp.c(7, pmz1);
                    }
                    l++;
                    k = j1;
                }

                l = k;
            }
        }
        k = l;
        if (j != null)
        {
            k = l + qlp.b(8, j);
        }
        l = k;
        if (e != null)
        {
            l = k + qlp.c(9, e);
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
_L12:
        int k = qlo1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 195
    //                   26: 247
    //                   34: 258
    //                   40: 287
    //                   48: 301
    //                   58: 315
    //                   66: 439
    //                   74: 450;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.a(qlo1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = qlo1.i();
        switch (l)
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
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            b = l;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = qlo1.i();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            c = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        if (f == null)
        {
            f = new pna();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L7:
        g = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        h = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        int k1 = qmb.b(qlo1, 58);
        pmz apmz[];
        int j1;
        if (i == null)
        {
            j1 = 0;
        } else
        {
            j1 = i.length;
        }
        apmz = new pmz[k1 + j1];
        k1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(i, 0, apmz, 0, j1);
            k1 = j1;
        }
        for (; k1 < apmz.length - 1; k1++)
        {
            apmz[k1] = new pmz();
            qlo1.a(apmz[k1]);
            qlo1.a();
        }

        apmz[k1] = new pmz();
        qlo1.a(apmz[k1]);
        i = apmz;
        continue; /* Loop/switch isn't completed */
_L10:
        j = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        if (e == null)
        {
            e = new pnf();
        }
        qlo1.a(e);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != 0x80000000)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (g != null)
        {
            qlp1.a(5, g.booleanValue());
        }
        if (h != null)
        {
            qlp1.a(6, h.booleanValue());
        }
        if (i != null && i.length > 0)
        {
            for (int k = 0; k < i.length; k++)
            {
                pmz pmz1 = i[k];
                if (pmz1 != null)
                {
                    qlp1.a(7, pmz1);
                }
            }

        }
        if (j != null)
        {
            qlp1.a(8, j);
        }
        if (e != null)
        {
            qlp1.a(9, e);
        }
        super.a(qlp1);
    }
}
