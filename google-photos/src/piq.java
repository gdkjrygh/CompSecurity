// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class piq extends qlq
{

    public String a;
    public int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    public piq()
    {
        a = null;
        c = null;
        d = null;
        e = null;
        f = null;
        b = 0x80000000;
        g = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (c != null)
        {
            i = j + qlp.b(1, c);
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.b(2, f);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.b(3, e);
        }
        j = i;
        if (a != null)
        {
            j = i + qlp.b(4, a);
        }
        i = j;
        if (b != 0x80000000)
        {
            i = j + qlp.e(5, b);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(6, d);
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.b(7, g);
        }
        return i;
    }

    public final qlw a(qlo qlo1)
    {
_L10:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 102
    //                   26: 113
    //                   34: 124
    //                   40: 135
    //                   50: 187
    //                   58: 198;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.a(qlo1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        c = qlo1.g();
          goto _L10
_L4:
        f = qlo1.g();
          goto _L10
_L5:
        e = qlo1.g();
          goto _L10
_L6:
        a = qlo1.g();
          goto _L10
_L7:
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
_L8:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        g = qlo1.g();
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void a(qlp qlp1)
    {
        if (c != null)
        {
            qlp1.a(1, c);
        }
        if (f != null)
        {
            qlp1.a(2, f);
        }
        if (e != null)
        {
            qlp1.a(3, e);
        }
        if (a != null)
        {
            qlp1.a(4, a);
        }
        if (b != 0x80000000)
        {
            qlp1.a(5, b);
        }
        if (d != null)
        {
            qlp1.a(6, d);
        }
        if (g != null)
        {
            qlp1.a(7, g);
        }
        super.a(qlp1);
    }
}
