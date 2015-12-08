// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pib extends qlq
{

    private static volatile pib e[];
    public int a;
    public Boolean b;
    public Boolean c;
    public Boolean d;

    public pib()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    public static pib[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new pib[0];
                }
            }
        }
        return e;
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
        if (b != null)
        {
            b.booleanValue();
            j = i + (qlp.c(2) + 1);
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (qlp.c(4) + 1);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L7:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 119
    //                   24: 133
    //                   32: 147;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 355: 
        case 397: 
        case 485: 
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Boolean.valueOf(qlo1.f());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.booleanValue());
        }
        super.a(qlp1);
    }
}
