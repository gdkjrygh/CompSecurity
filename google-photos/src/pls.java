// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pls extends qlq
{

    public String a;
    public String b;
    public pnp c;
    public Boolean d;
    public int e;
    public plg f;
    public Boolean g;
    public qgh h;
    private String i;
    private Boolean j;
    private Boolean k;

    public pls()
    {
        a = null;
        i = null;
        b = null;
        j = null;
        c = null;
        d = null;
        e = 0x80000000;
        k = null;
        f = null;
        g = null;
        h = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int i1 = super.a();
        int l = i1;
        if (a != null)
        {
            l = i1 + qlp.b(1, a);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + qlp.b(2, i);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + qlp.c(3, c);
        }
        i1 = l;
        if (d != null)
        {
            d.booleanValue();
            i1 = l + (qlp.c(4) + 1);
        }
        l = i1;
        if (e != 0x80000000)
        {
            l = i1 + qlp.e(5, e);
        }
        i1 = l;
        if (k != null)
        {
            k.booleanValue();
            i1 = l + (qlp.c(6) + 1);
        }
        l = i1;
        if (f != null)
        {
            l = i1 + qlp.c(7, f);
        }
        i1 = l;
        if (g != null)
        {
            g.booleanValue();
            i1 = l + (qlp.c(8) + 1);
        }
        l = i1;
        if (b != null)
        {
            l = i1 + qlp.b(9, b);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.c(10, h);
        }
        l = i1;
        if (j != null)
        {
            j.booleanValue();
            l = i1 + (qlp.c(12) + 1);
        }
        return l;
    }

    public final qlw a(qlo qlo1)
    {
_L14:
        int l = qlo1.a();
        l;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   10: 123
    //                   18: 134
    //                   26: 145
    //                   32: 174
    //                   40: 188
    //                   48: 235
    //                   58: 249
    //                   64: 278
    //                   74: 292
    //                   82: 303
    //                   96: 332;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (super.a(qlo1, l)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L14
_L4:
        i = qlo1.g();
          goto _L14
_L5:
        if (c == null)
        {
            c = new pnp();
        }
        qlo1.a(c);
          goto _L14
_L6:
        d = Boolean.valueOf(qlo1.f());
          goto _L14
_L7:
        int i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        k = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L9:
        if (f == null)
        {
            f = new plg();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L10:
        g = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L11:
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        if (h == null)
        {
            h = new qgh();
        }
        qlo1.a(h);
        continue; /* Loop/switch isn't completed */
_L13:
        j = Boolean.valueOf(qlo1.f());
        if (true) goto _L14; else goto _L15
_L15:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (i != null)
        {
            qlp1.a(2, i);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d.booleanValue());
        }
        if (e != 0x80000000)
        {
            qlp1.a(5, e);
        }
        if (k != null)
        {
            qlp1.a(6, k.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(7, f);
        }
        if (g != null)
        {
            qlp1.a(8, g.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(9, b);
        }
        if (h != null)
        {
            qlp1.a(10, h);
        }
        if (j != null)
        {
            qlp1.a(12, j.booleanValue());
        }
        super.a(qlp1);
    }
}
