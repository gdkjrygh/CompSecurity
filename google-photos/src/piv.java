// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class piv extends qlq
{

    private static volatile piv a[];
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public piv()
    {
        b = 0x80000000;
        c = null;
        d = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static piv[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new piv[0];
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
        j = i;
        if (c != null)
        {
            j = i + qlp.b(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i + qlp.b(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + qlp.b(5, f);
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
    //                   18: 119
    //                   26: 130
    //                   34: 141
    //                   42: 152;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.a(qlo1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L6:
        e = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L7:
        f = qlo1.g();
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        if (e != null)
        {
            qlp1.a(4, e);
        }
        if (f != null)
        {
            qlp1.a(5, f);
        }
        super.a(qlp1);
    }
}
