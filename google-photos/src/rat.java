// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class rat extends qlq
{

    public Boolean a;
    public Boolean b;
    public Integer c;
    public Integer d;
    public Integer e;
    public rbs f;
    public int g;

    public rat()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (qlp.c(1) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(2) + 1);
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
        if (e != null)
        {
            i = j + qlp.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.c(6, f);
        }
        i = j;
        if (g != 0x80000000)
        {
            i = j + qlp.e(7, g);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L10:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   16: 105
    //                   24: 119
    //                   32: 133
    //                   40: 147
    //                   50: 161
    //                   56: 190;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.a(qlo1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        a = Boolean.valueOf(qlo1.f());
          goto _L10
_L4:
        b = Boolean.valueOf(qlo1.f());
          goto _L10
_L5:
        c = Integer.valueOf(qlo1.i());
          goto _L10
_L6:
        d = Integer.valueOf(qlo1.i());
          goto _L10
_L7:
        e = Integer.valueOf(qlo1.i());
          goto _L10
_L8:
        if (f == null)
        {
            f = new rbs();
        }
        qlo1.a(f);
          goto _L10
_L9:
        int j = qlo1.i();
        switch (j)
        {
        case 963760070: 
        case 1544277195: 
            g = j;
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(5, e.intValue());
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != 0x80000000)
        {
            qlp1.a(7, g);
        }
        super.a(qlp1);
    }
}
