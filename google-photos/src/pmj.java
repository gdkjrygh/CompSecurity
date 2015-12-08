// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmj extends qlq
{

    private String a;
    private pmk b;
    private int c;
    private pmi d;
    private Integer e;

    public pmj()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
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
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + qlp.e(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(5, e.intValue());
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
    //                   10: 75
    //                   18: 86
    //                   24: 115
    //                   34: 155
    //                   40: 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L8
_L4:
        if (b == null)
        {
            b = new pmk();
        }
        qlo1.a(b);
          goto _L8
_L5:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pmi();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        e = Integer.valueOf(qlo1.i());
        if (true) goto _L8; else goto _L9
_L9:
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
        if (c != 0x80000000)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        super.a(qlp1);
    }
}
