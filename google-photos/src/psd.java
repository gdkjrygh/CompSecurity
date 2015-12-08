// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psd extends qlq
{

    private static volatile psd a[];
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Integer i;
    private psc j[];

    public psd()
    {
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = psc.b();
        F = null;
        G = -1;
    }

    public static psd[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new psd[0];
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
        if (c != null)
        {
            l = k + qlp.b(2, c);
        }
        k = l;
        if (d != null)
        {
            k = l + qlp.b(3, d);
        }
        l = k;
        if (e != null)
        {
            l = k + qlp.b(4, e);
        }
        int i1 = l;
        if (f != null)
        {
            i1 = l + qlp.b(5, f);
        }
        k = i1;
        if (g != null)
        {
            k = i1 + qlp.b(6, g);
        }
        l = k;
        if (j != null)
        {
            l = k;
            if (j.length > 0)
            {
                for (l = 0; l < j.length;)
                {
                    psc psc1 = j[l];
                    int j1 = k;
                    if (psc1 != null)
                    {
                        j1 = k + qlp.c(7, psc1);
                    }
                    l++;
                    k = j1;
                }

                l = k;
            }
        }
        k = l;
        if (h != null)
        {
            k = l + qlp.b(8, h);
        }
        l = k;
        if (i != null)
        {
            l = k + qlp.e(9, i.intValue());
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
    //                   18: 191
    //                   26: 202
    //                   34: 213
    //                   42: 224
    //                   50: 235
    //                   58: 246
    //                   66: 370
    //                   72: 381;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.a(qlo1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = qlo1.i();
        switch (l)
        {
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
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        e = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        f = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L8:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        int j1 = qmb.b(qlo1, 58);
        psc apsc[];
        int i1;
        if (j == null)
        {
            i1 = 0;
        } else
        {
            i1 = j.length;
        }
        apsc = new psc[j1 + i1];
        j1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(j, 0, apsc, 0, i1);
            j1 = i1;
        }
        for (; j1 < apsc.length - 1; j1++)
        {
            apsc[j1] = new psc();
            qlo1.a(apsc[j1]);
            qlo1.a();
        }

        apsc[j1] = new psc();
        qlo1.a(apsc[j1]);
        j = apsc;
        continue; /* Loop/switch isn't completed */
_L10:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L11:
        i = Integer.valueOf(qlo1.i());
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
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
        if (j != null && j.length > 0)
        {
            for (int k = 0; k < j.length; k++)
            {
                psc psc1 = j[k];
                if (psc1 != null)
                {
                    qlp1.a(7, psc1);
                }
            }

        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        if (i != null)
        {
            qlp1.a(9, i.intValue());
        }
        super.a(qlp1);
    }
}
