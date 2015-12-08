// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pkn extends qlq
{

    public int a;
    public pkr b;
    private pko c[];
    private pku d;

    public pkn()
    {
        a = 0x80000000;
        c = pko.b();
        b = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + qlp.e(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pko pko1 = c[j];
                    int k = i;
                    if (pko1 != null)
                    {
                        k = i + qlp.c(4, pko1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L7:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 111
    //                   26: 140
    //                   34: 169;
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new pkr();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new pku();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        int l = qmb.b(qlo1, 34);
        pko apko[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        apko = new pko[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, apko, 0, k);
            l = k;
        }
        for (; l < apko.length - 1; l++)
        {
            apko[l] = new pko();
            qlo1.a(apko[l]);
            qlo1.a();
        }

        apko[l] = new pko();
        qlo1.a(apko[l]);
        c = apko;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                pko pko1 = c[i];
                if (pko1 != null)
                {
                    qlp1.a(4, pko1);
                }
            }

        }
        super.a(qlp1);
    }
}
