// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pjw extends qlq
{

    private int a;
    private int b;
    private pjv c[];
    private pxd d;

    public pjw()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = pjv.b();
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != 0x80000000)
        {
            j = i + qlp.e(1, a);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + qlp.e(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pjv pjv1 = c[j];
                    int k = i;
                    if (pjv1 != null)
                    {
                        k = i + qlp.c(3, pjv1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L7:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 195
    //                   26: 235
    //                   34: 359;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
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
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = qmb.b(qlo1, 26);
        pjv apjv[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        apjv = new pjv[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, apjv, 0, l);
            i1 = l;
        }
        for (; i1 < apjv.length - 1; i1++)
        {
            apjv[i1] = new pjv();
            qlo1.a(apjv[i1]);
            qlo1.a();
        }

        apjv[i1] = new pjv();
        qlo1.a(apjv[i1]);
        c = apjv;
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pxd();
        }
        qlo1.a(d);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != 0x80000000)
        {
            qlp1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pjv pjv1 = c[i];
                if (pjv1 != null)
                {
                    qlp1.a(3, pjv1);
                }
            }

        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
