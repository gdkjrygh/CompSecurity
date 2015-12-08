// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ozm extends qlq
{

    public int a;
    public String b[];

    public ozm()
    {
        a = 0x80000000;
        b = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
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
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s = b[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + qlp.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
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
    //                   18: 99;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = qmb.b(qlo1, 18);
        String as[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = qlo1.g();
            qlo1.a();
        }

        as[l] = qlo1.g();
        b = as;
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
                String s = b[i];
                if (s != null)
                {
                    qlp1.a(2, s);
                }
            }

        }
        super.a(qlp1);
    }
}
