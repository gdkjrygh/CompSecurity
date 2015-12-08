// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnf extends qlq
{

    private int a;

    public pnf()
    {
        a = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a != 0x80000000)
        {
            i = j + qlp.e(1, a);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L4:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (super.a(qlo1, i)) goto _L4; else goto _L2
_L2:
        return this;
_L3:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = j;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(qlp qlp1)
    {
        if (a != 0x80000000)
        {
            qlp1.a(1, a);
        }
        super.a(qlp1);
    }
}
