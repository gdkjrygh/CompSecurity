// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plm extends qlq
{

    private static volatile plm e[];
    public int a;
    public String b;
    public Integer c;
    public Integer d;

    public plm()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    public static plm[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new plm[0];
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
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.e(3, c.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.e(4, d.intValue());
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
    //                   18: 115
    //                   24: 126
    //                   32: 140;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
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
        b = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        c = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L6:
        d = Integer.valueOf(qlo1.i());
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
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c.intValue());
        }
        if (d != null)
        {
            qlp1.a(4, d.intValue());
        }
        super.a(qlp1);
    }
}
