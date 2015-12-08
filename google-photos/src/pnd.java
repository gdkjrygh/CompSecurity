// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnd extends qlq
{

    public String a;
    private int b;
    private pnf c;

    public pnd()
    {
        a = null;
        b = 0x80000000;
        c = null;
        F = null;
        G = -1;
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
            j = i + qlp.e(4, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(5, c);
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
    //                   32: 70
    //                   42: 115;
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
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new pnf();
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
            qlp1.a(4, b);
        }
        if (c != null)
        {
            qlp1.a(5, c);
        }
        super.a(qlp1);
    }
}
