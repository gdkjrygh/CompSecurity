// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pia extends qlq
{

    private static volatile pia c[];
    public int a;
    public Boolean b;
    private Boolean d;
    private Boolean e;

    public pia()
    {
        a = 0x80000000;
        b = null;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static pia[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pia[0];
                }
            }
        }
        return c;
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
        if (d != null)
        {
            d.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (e != null)
        {
            e.booleanValue();
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
        d = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L6:
        e = Boolean.valueOf(qlo1.f());
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
        if (d != null)
        {
            qlp1.a(3, d.booleanValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.booleanValue());
        }
        super.a(qlp1);
    }
}
