// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psv extends qlq
{

    private int a;
    private psx b[];

    public psv()
    {
        a = 0x80000000;
        b = psx.b();
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
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    psx psx1 = b[j];
                    int k = i;
                    if (psx1 != null)
                    {
                        k = i + qlp.c(2, psx1);
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
_L5:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 95;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = qmb.b(qlo1, 18);
        psx apsx[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        apsx = new psx[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, apsx, 0, k);
            l = k;
        }
        for (; l < apsx.length - 1; l++)
        {
            apsx[l] = new psx();
            qlo1.a(apsx[l]);
            qlo1.a();
        }

        apsx[l] = new psx();
        qlo1.a(apsx[l]);
        b = apsx;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                psx psx1 = b[i];
                if (psx1 != null)
                {
                    qlp1.a(2, psx1);
                }
            }

        }
        super.a(qlp1);
    }
}
