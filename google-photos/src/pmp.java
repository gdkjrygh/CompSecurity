// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pmp extends qlq
{

    public int a;
    public pmr b;
    public int c;
    private pmm d;
    private pmq e;
    private psq f;
    private ptz g;
    private Integer h;

    public pmp()
    {
        a = 0x80000000;
        b = null;
        d = null;
        e = null;
        f = null;
        c = 0x80000000;
        g = null;
        h = null;
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
        if (e != null)
        {
            j = i + qlp.c(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
        }
        j = i;
        if (c != 0x80000000)
        {
            j = i + qlp.e(6, c);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.c(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + qlp.e(8, h.intValue());
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
    //                   18: 155
    //                   26: 184
    //                   34: 213
    //                   42: 242
    //                   48: 271
    //                   58: 311
    //                   64: 340;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 3: // '\003'
        case 5: // '\005'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new pmr();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new pmm();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new pmq();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new psq();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        int k = qlo1.i();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new ptz();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        h = Integer.valueOf(qlo1.i());
        if (true) goto _L11; else goto _L12
_L12:
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
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        if (c != 0x80000000)
        {
            qlp1.a(6, c);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != null)
        {
            qlp1.a(8, h.intValue());
        }
        super.a(qlp1);
    }
}
