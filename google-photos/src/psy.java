// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psy extends qlq
{

    private static volatile psy a[];
    private String b;
    private String c;
    private int d;
    private String e;

    public psy()
    {
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        F = null;
        G = -1;
    }

    public static psy[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new psy[0];
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
            i = j + qlp.b(1, b);
        }
        j = i;
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != 0x80000000)
        {
            i = j + qlp.e(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(4, e);
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
    //                   10: 67
    //                   18: 78
    //                   24: 89
    //                   34: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L7
_L4:
        c = qlo1.g();
          goto _L7
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
        continue; /* Loop/switch isn't completed */
_L6:
        e = qlo1.g();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != 0x80000000)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        super.a(qlp1);
    }
}
