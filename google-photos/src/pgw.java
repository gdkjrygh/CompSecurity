// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pgw extends qlq
{

    private static volatile pgw a[];
    private Long b;
    private Long c;
    private Integer d;
    private Integer e;
    private int f;

    public pgw()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0x80000000;
        F = null;
        G = -1;
    }

    public static pgw[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new pgw[0];
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
        if (c != null)
        {
            j = i + qlp.d(2, c.longValue());
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
        i = j;
        if (f != 0x80000000)
        {
            i = j + qlp.e(5, f);
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
    //                   16: 89
    //                   24: 103
    //                   32: 117
    //                   40: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        b = Long.valueOf(qlo1.j());
          goto _L8
_L4:
        c = Long.valueOf(qlo1.j());
          goto _L8
_L5:
        d = Integer.valueOf(qlo1.i());
          goto _L8
_L6:
        e = Integer.valueOf(qlo1.i());
          goto _L8
_L7:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            f = j;
            break;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(2, c.longValue());
        }
        if (d != null)
        {
            qlp1.a(3, d.intValue());
        }
        if (e != null)
        {
            qlp1.a(4, e.intValue());
        }
        if (f != 0x80000000)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
