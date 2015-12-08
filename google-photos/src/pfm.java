// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pfm extends qlq
{

    public int a;
    public int b;
    public String c;

    public pfm()
    {
        a = 0x80000000;
        b = 0x80000000;
        c = null;
        F = null;
        G = -1;
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
        if (a != 0x80000000)
        {
            j = i + qlp.e(2, a);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
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
    //                   16: 111
    //                   26: 155;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.a(qlo1, i)) goto _L6; else goto _L2
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
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        c = qlo1.g();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void a(qlp qlp1)
    {
        if (b != 0x80000000)
        {
            qlp1.a(1, b);
        }
        if (a != 0x80000000)
        {
            qlp1.a(2, a);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        super.a(qlp1);
    }
}
