// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class peo extends qlq
{

    public pgs a;
    public pej b;
    public pej c;
    private pep d[];
    private int e;

    public peo()
    {
        a = null;
        b = null;
        c = null;
        d = pep.b();
        e = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i + qlp.c(1, a);
        }
        i = j;
        if (b != null)
        {
            i = j + qlp.c(2, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    pep pep1 = d[j];
                    int k = i;
                    if (pep1 != null)
                    {
                        k = i + qlp.c(3, pep1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (e != 0x80000000)
        {
            i = j + qlp.e(4, e);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(5, c);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L8:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   18: 104
    //                   26: 133
    //                   32: 257
    //                   42: 299;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new pgs();
        }
        qlo1.a(a);
          goto _L8
_L4:
        if (b == null)
        {
            b = new pej();
        }
        qlo1.a(b);
          goto _L8
_L5:
        int l = qmb.b(qlo1, 26);
        pep apep[];
        int j;
        if (d == null)
        {
            j = 0;
        } else
        {
            j = d.length;
        }
        apep = new pep[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(d, 0, apep, 0, j);
            l = j;
        }
        for (; l < apep.length - 1; l++)
        {
            apep[l] = new pep();
            qlo1.a(apep[l]);
            qlo1.a();
        }

        apep[l] = new pep();
        qlo1.a(apep[l]);
        d = apep;
          goto _L8
_L6:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            e = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (c == null)
        {
            c = new pej();
        }
        qlo1.a(c);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                pep pep1 = d[i];
                if (pep1 != null)
                {
                    qlp1.a(3, pep1);
                }
            }

        }
        if (e != 0x80000000)
        {
            qlp1.a(4, e);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        super.a(qlp1);
    }
}
