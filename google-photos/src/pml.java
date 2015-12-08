// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pml extends qlq
{

    private static volatile pml a[];
    private int b;
    private pra c;
    private pra d;
    private Boolean e;
    private pqv f;

    public pml()
    {
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static pml[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pml[0];
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
        if (b != 0x80000000)
        {
            i = j + qlp.e(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.c(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.c(3, d);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.c(5, f);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L8:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   18: 119
    //                   26: 148
    //                   32: 177
    //                   42: 191;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c == null)
        {
            c = new pra();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new pra();
        }
        qlo1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        e = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new pqv();
        }
        qlo1.a(f);
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
