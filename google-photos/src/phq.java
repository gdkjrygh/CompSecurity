// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phq extends qlq
{

    private static volatile phq a[];
    private Integer b;
    private int c;

    public phq()
    {
        b = null;
        c = 0x80000000;
        F = null;
        G = -1;
    }

    public static phq[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new phq[0];
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
            i = j + qlp.e(1, b.intValue());
        }
        j = i;
        if (c != 0x80000000)
        {
            j = i + qlp.e(2, c);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L5:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 65;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        b = Integer.valueOf(qlo1.i());
          goto _L5
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = j;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.intValue());
        }
        if (c != 0x80000000)
        {
            qlp1.a(2, c);
        }
        super.a(qlp1);
    }
}
