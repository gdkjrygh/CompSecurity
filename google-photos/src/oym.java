// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oym extends qlq
{

    public String a;
    public int b;
    public Boolean c;
    public oyn d;
    private Boolean e;

    public oym()
    {
        a = null;
        e = null;
        b = 0x80000000;
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
            i = j + qlp.b(1, a);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + qlp.e(3, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (qlp.c(4) + 1);
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
    //                   10: 75
    //                   16: 86
    //                   24: 100
    //                   32: 151
    //                   42: 165;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L8
_L4:
        e = Boolean.valueOf(qlo1.f());
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
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        c = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new oyn();
        }
        qlo1.a(d);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (e != null)
        {
            qlp1.a(2, e.booleanValue());
        }
        if (b != 0x80000000)
        {
            qlp1.a(3, b);
        }
        if (c != null)
        {
            qlp1.a(4, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        super.a(qlp1);
    }
}
