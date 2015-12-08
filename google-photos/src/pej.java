// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pej extends qlq
{

    public String a;
    public String b;
    private Integer c;
    private Integer d;
    private int e;
    private prz f;

    public pej()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0x80000000;
        f = null;
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
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
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
            j = i + qlp.c(6, f);
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
    //                   24: 105
    //                   32: 119
    //                   40: 133
    //                   50: 179;
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
        c = Integer.valueOf(qlo1.i());
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
            e = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new prz();
        }
        qlo1.a(f);
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
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != 0x80000000)
        {
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
