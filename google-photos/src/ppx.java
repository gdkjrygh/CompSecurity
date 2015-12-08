// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ppx extends qlq
{

    private static volatile ppx a[];
    private int b;
    private int c[];
    private Boolean d;
    private Boolean e;
    private Boolean f;

    public ppx()
    {
        b = 0x80000000;
        c = qmb.a;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static ppx[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new ppx[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i = 0;
        int k = super.a();
        int j;
        if (c != null && c.length > 0)
        {
            j = 0;
            for (; i < c.length; i++)
            {
                j += qlp.b(c[i]);
            }

            j = k + j + c.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(2) + 1);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(3) + 1);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + qlp.e(4, b);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(5) + 1);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L9:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   8: 88
    //                   10: 296
    //                   16: 542
    //                   24: 556
    //                   32: 570
    //                   40: 732;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int ai[];
        int k;
        int j1;
        j1 = qmb.b(qlo1, 8);
        ai = new int[j1];
        k = 0;
        i = 0;
_L16:
        if (k >= j1) goto _L11; else goto _L10
_L10:
        int k1;
        if (k != 0)
        {
            qlo1.a();
        }
        k1 = qlo1.i();
        k1;
        JVM INSTR tableswitch 0 7: default 180
    //                   0 189
    //                   1 189
    //                   2 189
    //                   3 189
    //                   4 189
    //                   5 189
    //                   6 189
    //                   7 189;
           goto _L12 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13
_L12:
        k++;
          goto _L14
_L13:
        int l = i + 1;
        ai[i] = k1;
        i = l;
        if (true) goto _L12; else goto _L14
_L14:
        if (true) goto _L16; else goto _L15
_L15:
_L11:
        if (i != 0)
        {
            if (c == null)
            {
                k = 0;
            } else
            {
                k = c.length;
            }
            if (k == 0 && i == ai.length)
            {
                c = ai;
            } else
            {
                int ai1[] = new int[k + i];
                if (k != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, k);
                }
                System.arraycopy(ai, 0, ai1, k, i);
                c = ai1;
            }
        }
          goto _L9
_L4:
        int i1;
        i1 = qlo1.c(qlo1.i());
        i = qlo1.o();
        k = 0;
_L22:
        if (qlo1.m() > 0)
        {
            switch (qlo1.i())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k == 0) goto _L18; else goto _L17
_L17:
        qlo1.e(i);
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.length;
        }
        ai = new int[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(c, 0, ai, 0, i);
            k = i;
        }
_L20:
        if (qlo1.m() > 0)
        {
            i = qlo1.i();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                ai[k] = i;
                k++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        c = ai;
          goto _L18
        if (true) goto _L20; else goto _L19
_L19:
        if (true) goto _L22; else goto _L21
_L21:
_L18:
        qlo1.d(i1);
          goto _L9
_L5:
        d = Boolean.valueOf(qlo1.f());
          goto _L9
_L6:
        e = Boolean.valueOf(qlo1.f());
          goto _L9
_L7:
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
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(qlo1.f());
        if (true) goto _L9; else goto _L23
_L23:
    }

    public final void a(qlp qlp1)
    {
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                qlp1.a(1, c[i]);
            }

        }
        if (d != null)
        {
            qlp1.a(2, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(3, e.booleanValue());
        }
        if (b != 0x80000000)
        {
            qlp1.a(4, b);
        }
        if (f != null)
        {
            qlp1.a(5, f.booleanValue());
        }
        super.a(qlp1);
    }
}
