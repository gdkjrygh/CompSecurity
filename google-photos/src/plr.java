// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plr extends qlq
{

    public String a;
    public int b;
    public Long c;
    public plm d[];

    public plr()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = plm.b();
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + qlp.e(3, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(4, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    plm plm1 = d[j];
                    int k = i;
                    if (plm1 != null)
                    {
                        k = i + qlp.c(5, plm1);
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
    //                   10: 67
    //                   24: 78
    //                   32: 135
    //                   42: 149;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L7
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L6:
        int l = qmb.b(qlo1, 42);
        plm aplm[];
        int k;
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.length;
        }
        aplm = new plm[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(d, 0, aplm, 0, k);
            l = k;
        }
        for (; l < aplm.length - 1; l++)
        {
            aplm[l] = new plm();
            qlo1.a(aplm[l]);
            qlo1.a();
        }

        aplm[l] = new plm();
        qlo1.a(aplm[l]);
        d = aplm;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != 0x80000000)
        {
            qlp1.a(3, b);
        }
        if (c != null)
        {
            qlp1.b(4, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                plm plm1 = d[i];
                if (plm1 != null)
                {
                    qlp1.a(5, plm1);
                }
            }

        }
        super.a(qlp1);
    }
}
