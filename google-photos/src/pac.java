// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pac extends qlq
{

    public int a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f[];

    public pac()
    {
        a = 0x80000000;
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
        int j = super.a() + qlp.e(1, a);
        int i = j;
        if (b != null)
        {
            i = j + qlp.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(3, c);
        }
        int k = j;
        if (d != null)
        {
            k = j + qlp.b(4, d);
        }
        i = k;
        if (e != 0x80000000)
        {
            i = k + qlp.e(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < f.length;)
                {
                    String s = f[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + qlp.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
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
    //                   8: 83
    //                   18: 243
    //                   26: 254
    //                   34: 265
    //                   40: 276
    //                   50: 331;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
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
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int i1 = qmb.b(qlo1, 50);
        String as[];
        int l;
        if (f == null)
        {
            l = 0;
        } else
        {
            l = f.length;
        }
        as = new String[i1 + l];
        i1 = l;
        if (l != 0)
        {
            System.arraycopy(f, 0, as, 0, l);
            i1 = l;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = qlo1.g();
            qlo1.a();
        }

        as[i1] = qlo1.g();
        f = as;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, a);
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
            qlp1.a(4, d);
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
