// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnx extends qlq
{

    private static volatile pnx a[];
    private int b;
    private Integer c;

    public pnx()
    {
        b = 0x80000000;
        c = null;
        F = null;
        G = -1;
    }

    public static pnx[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pnx[0];
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
        int j = super.a() + qlp.e(1, b);
        int i = j;
        if (c != null)
        {
            i = j + qlp.e(2, c.intValue());
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L5:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 87;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = Integer.valueOf(qlo1.i());
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, b);
        if (c != null)
        {
            qlp1.a(2, c.intValue());
        }
        super.a(qlp1);
    }
}
