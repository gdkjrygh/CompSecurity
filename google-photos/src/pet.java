// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pet extends qlq
{

    private static volatile pet f[];
    public pry a;
    public int b;
    public String c;
    public pqb d;
    public String e;
    private pek g;

    public pet()
    {
        a = null;
        b = 0x80000000;
        g = null;
        c = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pet[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new pet[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + qlp.e(2, b);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.c(3, g);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(4, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(6, e);
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
    //                   16: 112
    //                   26: 167
    //                   34: 196
    //                   42: 207
    //                   50: 236;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new pry();
        }
        qlo1.a(a);
          goto _L9
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (g == null)
        {
            g = new pek();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L6:
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new pqb();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L8:
        e = qlo1.g();
        if (true) goto _L9; else goto _L10
_L10:
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
        if (g != null)
        {
            qlp1.a(3, g);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (e != null)
        {
            qlp1.a(6, e);
        }
        super.a(qlp1);
    }
}
