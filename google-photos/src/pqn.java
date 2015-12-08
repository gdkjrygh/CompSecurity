// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pqn extends qlq
{

    private String a;
    private String b;
    private String c;
    private Integer d;
    private int e;
    private String f[];

    public pqn()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0x80000000;
        f = qmb.f;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(4, d.intValue());
        }
        i = j;
        if (e != 0x80000000)
        {
            i = j + qlp.e(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
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
_L9:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   32: 116
    //                   40: 130
    //                   50: 187;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L9
_L4:
        b = qlo1.g();
          goto _L9
_L5:
        c = qlo1.g();
          goto _L9
_L6:
        d = Integer.valueOf(qlo1.i());
          goto _L9
_L7:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l = qmb.b(qlo1, 50);
        String as[];
        int k;
        if (f == null)
        {
            k = 0;
        } else
        {
            k = f.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(f, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = qlo1.g();
            qlo1.a();
        }

        as[l] = qlo1.g();
        f = as;
        if (true) goto _L9; else goto _L10
_L10:
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
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != 0x80000000)
        {
            qlp1.a(5, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                String s = f[i];
                if (s != null)
                {
                    qlp1.a(6, s);
                }
            }

        }
        super.a(qlp1);
    }
}
