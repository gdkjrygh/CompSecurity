// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pdr extends qlq
{

    public pds a[];
    public Boolean b;
    private int c;

    public pdr()
    {
        a = pds.b();
        c = 0x80000000;
        b = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i = super.a();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    pds pds1 = a[k];
                    j = i;
                    if (pds1 != null)
                    {
                        j = i + qlp.c(3, pds1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + qlp.e(4, c);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(5) + 1);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L6:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   26: 59
    //                   32: 183
    //                   40: 231;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int l = qmb.b(qlo1, 26);
        pds apds[];
        int j;
        if (a == null)
        {
            j = 0;
        } else
        {
            j = a.length;
        }
        apds = new pds[l + j];
        l = j;
        if (j != 0)
        {
            System.arraycopy(a, 0, apds, 0, j);
            l = j;
        }
        for (; l < apds.length - 1; l++)
        {
            apds[l] = new pds();
            qlo1.a(apds[l]);
            qlo1.a();
        }

        apds[l] = new pds();
        qlo1.a(apds[l]);
        a = apds;
          goto _L6
_L4:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            c = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        b = Boolean.valueOf(qlo1.f());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                pds pds1 = a[i];
                if (pds1 != null)
                {
                    qlp1.a(3, pds1);
                }
            }

        }
        if (c != 0x80000000)
        {
            qlp1.a(4, c);
        }
        if (b != null)
        {
            qlp1.a(5, b.booleanValue());
        }
        super.a(qlp1);
    }
}
