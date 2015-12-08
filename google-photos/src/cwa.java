// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cwa extends qlw
{

    private static volatile cwa e[];
    public long a;
    public long b;
    public int c;
    public cvs d;

    public cwa()
    {
        a = 0L;
        b = 0L;
        c = 0;
        d = null;
        G = -1;
    }

    public static cwa[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new cwa[0];
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
        int j = super.a() + qlp.e(1, a) + qlp.e(2, b) + qlp.e(3, c);
        int i = j;
        if (d != null)
        {
            i = j + qlp.c(4, d);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L7:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   8: 66
    //                   16: 77
    //                   24: 88
    //                   34: 151;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (qmb.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.j();
          goto _L7
_L4:
        b = qlo1.j();
          goto _L7
_L5:
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
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (d == null)
        {
            d = new cvs();
        }
        qlo1.a(d);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void a(qlp qlp1)
    {
        qlp1.b(1, a);
        qlp1.b(2, b);
        qlp1.a(3, c);
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
