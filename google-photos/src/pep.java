// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pep extends qlq
{

    private static volatile pep c[];
    public pek a;
    public pgs b;
    private int d;

    public pep()
    {
        a = null;
        b = null;
        d = 0x80000000;
        F = null;
        G = -1;
    }

    public static pep[] b()
    {
        if (c == null)
        {
            synchronized (qlu.a)
            {
                if (c == null)
                {
                    c = new pep[0];
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
        if (a != null)
        {
            i = j + qlp.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.c(2, b);
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + qlp.e(3, d);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L6:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 88
    //                   24: 117;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new pek();
        }
        qlo1.a(a);
          goto _L6
_L4:
        if (b == null)
        {
            b = new pgs();
        }
        qlo1.a(b);
          goto _L6
_L5:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = j;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (d != 0x80000000)
        {
            qlp1.a(3, d);
        }
        super.a(qlp1);
    }
}
