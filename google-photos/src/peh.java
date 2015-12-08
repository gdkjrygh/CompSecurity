// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class peh extends qlq
{

    private static volatile peh f[];
    public int a;
    public pei b;
    public pej c;
    public peo d;
    public Boolean e;
    private pgr g;

    public peh()
    {
        a = 0x80000000;
        b = null;
        c = null;
        g = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static peh[] b()
    {
        if (f == null)
        {
            synchronized (qlu.a)
            {
                if (f == null)
                {
                    f = new peh[0];
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
        if (a != 0x80000000)
        {
            i = j + qlp.e(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.c(3, g);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(5, d);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(6, b);
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
    //                   8: 83
    //                   18: 131
    //                   26: 160
    //                   32: 189
    //                   42: 203
    //                   50: 232;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new pej();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L5:
        if (g == null)
        {
            g = new pgr();
        }
        qlo1.a(g);
        continue; /* Loop/switch isn't completed */
_L6:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new peo();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L8:
        if (b == null)
        {
            b = new pei();
        }
        qlo1.a(b);
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (g != null)
        {
            qlp1.a(3, g);
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (b != null)
        {
            qlp1.a(6, b);
        }
        super.a(qlp1);
    }
}
