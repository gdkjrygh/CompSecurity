// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class prx extends qlq
{

    private String a;
    private int b;
    private psg c;
    private String d;

    public prx()
    {
        a = null;
        b = 0x80000000;
        c = null;
        d = null;
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
            j = i + qlp.e(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.c(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(4, d);
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
    //                   16: 78
    //                   26: 119
    //                   34: 148;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.a(qlo1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L7
_L4:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            b = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new psg();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L6:
        d = qlo1.g();
        if (true) goto _L7; else goto _L8
_L8:
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
        if (d != null)
        {
            qlp1.a(4, d);
        }
        super.a(qlp1);
    }
}
