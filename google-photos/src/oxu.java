// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxu extends qlq
{

    private int a;
    private String b;

    public oxu()
    {
        a = 0x80000000;
        b = null;
        F = null;
        G = -1;
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
        if (a != 0x80000000)
        {
            j = i + qlp.e(2, a);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L5:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   10: 51
    //                   16: 62;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.a(qlo1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L5
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            a = j;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void a(qlp qlp1)
    {
        if (b != null)
        {
            qlp1.a(1, b);
        }
        if (a != 0x80000000)
        {
            qlp1.a(2, a);
        }
        super.a(qlp1);
    }
}
