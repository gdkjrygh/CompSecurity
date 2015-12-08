// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pex extends qlq
{

    public int a;
    public Integer b;
    public Integer c;
    public per d;
    public pei e;
    public int f;

    public pex()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
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
            j = i + qlp.f(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.f(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.c(5, e);
        }
        j = i;
        if (f != 0x80000000)
        {
            j = i + qlp.e(6, f);
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
    //                   16: 143
    //                   24: 157
    //                   34: 171
    //                   42: 200
    //                   48: 229;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
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
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new per();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new pei();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
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
            f = k;
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.c(2, b.intValue());
        }
        if (c != null)
        {
            qlp1.c(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e);
        }
        if (f != 0x80000000)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
