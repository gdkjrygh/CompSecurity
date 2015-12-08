// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxp extends qlq
{

    private static volatile oxp a[];
    private int b;
    private int c;
    private String d;

    public oxp()
    {
        b = 0x80000000;
        c = 0x80000000;
        d = null;
        F = null;
        G = -1;
    }

    public static oxp[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new oxp[0];
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
        if (c != 0x80000000)
        {
            j = i + qlp.e(2, c);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(3, d);
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
    //                   26: 163;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = qlo1.i();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = qlo1.g();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (c != 0x80000000)
        {
            qlp1.a(2, c);
        }
        if (d != null)
        {
            qlp1.a(3, d);
        }
        super.a(qlp1);
    }
}
