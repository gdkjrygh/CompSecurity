// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgl extends qlq
{

    private static volatile pgl d[];
    public int a;
    public Long b;
    public Integer c;

    public pgl()
    {
        a = 0x80000000;
        b = null;
        c = null;
        F = null;
        G = -1;
    }

    public static pgl[] b()
    {
        if (d == null)
        {
            synchronized (qlu.a)
            {
                if (d == null)
                {
                    d = new pgl[0];
                }
            }
        }
        return d;
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
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
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
    //                   8: 59
    //                   16: 107
    //                   24: 121;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
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
        b = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(qlo1.i());
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        super.a(qlp1);
    }
}
