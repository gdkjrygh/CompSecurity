// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfb extends qlq
{

    public int a;
    public float b[];
    public pfk c[];

    public pfb()
    {
        a = 0x80000000;
        b = qmb.c;
        c = pfk.b();
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
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j + b.length * 4 + b.length * 1;
            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    pfk pfk1 = c[j];
                    int k = i;
                    if (pfk1 != null)
                    {
                        k = i + qlp.c(3, pfk1);
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
    //                   18: 218
    //                   21: 111
    //                   26: 322;
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
_L5:
        int j1 = qmb.b(qlo1, 21);
        float af[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        af = new float[j1 + k];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, af, 0, k);
            j1 = k;
        }
        for (; j1 < af.length - 1; j1++)
        {
            af[j1] = Float.intBitsToFloat(qlo1.k());
            qlo1.a();
        }

        af[j1] = Float.intBitsToFloat(qlo1.k());
        b = af;
        continue; /* Loop/switch isn't completed */
_L4:
        int l = qlo1.i();
        int i2 = qlo1.c(l);
        int k1 = l / 4;
        float af1[];
        if (b == null)
        {
            l = 0;
        } else
        {
            l = b.length;
        }
        af1 = new float[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(b, 0, af1, 0, l);
            k1 = l;
        }
        for (; k1 < af1.length; k1++)
        {
            af1[k1] = Float.intBitsToFloat(qlo1.k());
        }

        b = af1;
        qlo1.d(i2);
        continue; /* Loop/switch isn't completed */
_L6:
        int l1 = qmb.b(qlo1, 26);
        pfk apfk[];
        int i1;
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.length;
        }
        apfk = new pfk[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(c, 0, apfk, 0, i1);
            l1 = i1;
        }
        for (; l1 < apfk.length - 1; l1++)
        {
            apfk[l1] = new pfk();
            qlo1.a(apfk[l1]);
            qlo1.a();
        }

        apfk[l1] = new pfk();
        qlo1.a(apfk[l1]);
        c = apfk;
        if (true) goto _L7; else goto _L8
_L8:
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
                qlp1.a(2, b[i]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                pfk pfk1 = c[j];
                if (pfk1 != null)
                {
                    qlp1.a(3, pfk1);
                }
            }

        }
        super.a(qlp1);
    }
}
