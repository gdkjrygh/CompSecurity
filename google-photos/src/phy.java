// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class phy extends qlq
{

    private static volatile phy d[];
    public String a;
    public int b;
    public phz c;

    public phy()
    {
        a = null;
        b = 0x80000000;
        c = null;
        F = null;
        G = -1;
    }

    public static phy[] b()
    {
        if (d == null)
        {
            synchronized (qlu.a)
            {
                if (d == null)
                {
                    d = new phy[0];
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
        if (a != null)
        {
            i = j + qlp.b(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + qlp.e(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
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
    //                   10: 59
    //                   16: 70
    //                   26: 123;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L6
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new phz();
        }
        qlo1.a(c);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != 0x80000000)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        super.a(qlp1);
    }
}
