// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class prd extends qlq
{

    private static volatile prd a[];
    private pty b;
    private String c;
    private int d;
    private pre e;
    private pqf f;
    private prg g;
    private pqg h;

    public prd()
    {
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

    public static prd[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new prd[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (b != null)
        {
            i = j + qlp.c(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + qlp.e(3, d);
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
        if (g != null)
        {
            j = i + qlp.c(6, g);
        }
        i = j;
        if (h != null)
        {
            i = j + qlp.c(7, h);
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
    //                   10: 91
    //                   18: 120
    //                   24: 131
    //                   34: 195
    //                   42: 224
    //                   50: 253
    //                   58: 282;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.a(qlo1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (b == null)
        {
            b = new pty();
        }
        qlo1.a(b);
          goto _L10
_L4:
        c = qlo1.g();
          goto _L10
_L5:
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
            d = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new pre();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new pqf();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new prg();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L9:
        if (h == null)
        {
            h = new pqg();
        }
        qlo1.a(h);
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != 0x80000000)
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
        if (g != null)
        {
            qlp1.a(6, g);
        }
        if (h != null)
        {
            qlp1.a(7, h);
        }
        super.a(qlp1);
    }
}
