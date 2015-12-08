// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pxo extends qlq
{

    private static volatile pxo e[];
    public int a;
    public pxx b;
    public pxp c;
    public pxq d;

    public pxo()
    {
        a = 0x80000000;
        b = null;
        c = null;
        d = null;
        F = null;
        G = -1;
    }

    public static pxo[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new pxo[0];
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
            j = i + qlp.c(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.c(4, d);
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
    //                   18: 131
    //                   26: 160
    //                   34: 189;
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
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new pxx();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new pxp();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new pxq();
        }
        qlo1.a(d);
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
            qlp1.a(3, c);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
