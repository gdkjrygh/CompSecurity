// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phm extends qlq
{

    public Integer a;
    public Integer b;
    public Integer c;
    public int d;
    private Boolean e;
    private Boolean f;
    private String g;
    private String h;

    public phm()
    {
        a = null;
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        h = null;
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
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
        }
        j = i;
        if (d != 0x80000000)
        {
            j = i + qlp.e(4, d);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (qlp.c(5) + 1);
        }
        j = i;
        if (f != null)
        {
            f.booleanValue();
            j = i + (qlp.c(6) + 1);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.b(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + qlp.b(8, h);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L11:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   16: 113
    //                   24: 127
    //                   32: 141
    //                   40: 191
    //                   48: 205
    //                   58: 219
    //                   66: 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = Integer.valueOf(qlo1.i());
          goto _L11
_L4:
        b = Integer.valueOf(qlo1.i());
          goto _L11
_L5:
        c = Integer.valueOf(qlo1.i());
          goto _L11
_L6:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            d = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        h = qlo1.g();
        if (true) goto _L11; else goto _L12
_L12:
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
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != 0x80000000)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(6, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h);
        }
        super.a(qlp1);
    }
}
