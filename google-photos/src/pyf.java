// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pyf extends qlq
{

    public int a;
    public pyk b;
    public pyb c;
    public pxn d;
    public Boolean e;

    public pyf()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        e = null;
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
            j = i + qlp.c(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (qlp.c(5) + 1);
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
    //                   18: 183
    //                   26: 212
    //                   34: 241
    //                   40: 270;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
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
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new pyk();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new pyb();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pxn();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(qlo1.f());
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
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
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.booleanValue());
        }
        super.a(qlp1);
    }
}
