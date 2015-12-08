// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phr extends qlq
{

    private static volatile phr a[];
    private Long b;
    private int c;
    private Integer d;
    private Integer e;

    public phr()
    {
        b = null;
        c = 0x80000000;
        d = null;
        e = null;
        F = null;
        G = -1;
    }

    public static phr[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new phr[0];
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
            i = j + qlp.d(1, b.longValue());
        }
        j = i;
        if (c != 0x80000000)
        {
            j = i + qlp.e(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.e(3, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.e(4, e.intValue());
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
    //                   16: 81
    //                   24: 127
    //                   32: 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        b = Long.valueOf(qlo1.j());
          goto _L7
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        e = Integer.valueOf(qlo1.i());
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.longValue());
        }
        if (c != 0x80000000)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.intValue());
        }
        super.a(qlp1);
    }
}
