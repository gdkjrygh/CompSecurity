// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pky extends qlq
{

    public int a;
    public plc b;
    public plb c;
    private pkz d;

    public pky()
    {
        a = 0x80000000;
        b = null;
        d = null;
        c = null;
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
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(4, c);
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
    //                   18: 119
    //                   26: 148
    //                   34: 177;
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
        case 3: // '\003'
        case 4: // '\004'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new plc();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new pkz();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new plb();
        }
        qlo1.a(c);
        if (true) goto _L7; else goto _L8
_L8:
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
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        super.a(qlp1);
    }
}
