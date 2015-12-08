// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psl extends qlq
{

    private String a;
    private int b;
    private int c;
    private prh d;
    private psa e;
    private psv f;
    private prw g;
    private int h;

    public psl()
    {
        a = null;
        b = 0x80000000;
        c = 0x80000000;
        d = null;
        e = null;
        f = null;
        g = null;
        h = 0x80000000;
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
        if (b != 0x80000000)
        {
            j = i + qlp.e(2, b);
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
            i = j + qlp.c(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.c(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.c(7, g);
        }
        j = i;
        if (h != 0x80000000)
        {
            j = i + qlp.e(8, h);
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
    //                   10: 99
    //                   16: 110
    //                   24: 191
    //                   34: 231
    //                   42: 260
    //                   50: 289
    //                   58: 318
    //                   64: 347;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.a(qlo1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L11
_L4:
        int j = qlo1.i();
        switch (j)
        {
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
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = qlo1.i();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            c = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new prh();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new psa();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new psv();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new prw();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        int l = qlo1.i();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            h = l;
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != 0x80000000)
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
            qlp1.a(5, e);
        }
        if (f != null)
        {
            qlp1.a(6, f);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        if (h != 0x80000000)
        {
            qlp1.a(8, h);
        }
        super.a(qlp1);
    }
}
