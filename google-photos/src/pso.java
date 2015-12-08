// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pso extends qlq
{

    private static volatile pso a[];
    private String b;
    private prr c;
    private int d;
    private prx e;
    private ptc f;
    private prt g;

    public pso()
    {
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        F = null;
        G = -1;
    }

    public static pso[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pso[0];
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
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
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
    //                   24: 123
    //                   34: 175
    //                   42: 204
    //                   50: 233;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L9
_L4:
        if (c == null)
        {
            c = new prr();
        }
        qlo1.a(c);
          goto _L9
_L5:
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
_L6:
        if (e == null)
        {
            e = new prx();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new ptc();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        if (g == null)
        {
            g = new prt();
        }
        qlo1.a(g);
        if (true) goto _L9; else goto _L10
_L10:
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
        super.a(qlp1);
    }
}
