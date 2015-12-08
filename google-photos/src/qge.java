// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qge extends qlq
{

    public Integer a;
    public Integer b;
    public qfw c;
    public qgd d;
    private int e;

    public qge()
    {
        a = null;
        b = null;
        e = 0x80000000;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.intValue());
        }
        i = j;
        if (e != 0x80000000)
        {
            i = j + qlp.e(3, e);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(5, d);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L8:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   16: 89
    //                   24: 103
    //                   34: 191
    //                   42: 220;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(qlo1.i());
          goto _L8
_L4:
        b = Integer.valueOf(qlo1.i());
          goto _L8
_L5:
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
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            e = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new qfw();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new qgd();
        }
        qlo1.a(d);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.intValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.intValue());
        }
        if (e != 0x80000000)
        {
            qlp1.a(3, e);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        super.a(qlp1);
    }
}
