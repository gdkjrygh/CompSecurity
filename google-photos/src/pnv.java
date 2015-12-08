// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnv extends qlq
{

    private static volatile pnv a[];
    private int b;

    public pnv()
    {
        b = 0x80000000;
        F = null;
        G = -1;
    }

    public static pnv[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pnv[0];
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
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L4:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (super.a(qlo1, i)) goto _L4; else goto _L2
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
        case 4: // '\004'
            b = j;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        super.a(qlp1);
    }
}
