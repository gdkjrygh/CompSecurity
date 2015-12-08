// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class psw extends qlq
{

    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;

    public psw()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0x80000000;
        f = 0x80000000;
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
        if (b != null)
        {
            j = i + qlp.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + qlp.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + qlp.b(4, d);
        }
        i = j;
        if (e != 0x80000000)
        {
            i = j + qlp.e(5, e);
        }
        j = i;
        if (f != 0x80000000)
        {
            j = i + qlp.e(6, f);
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L9:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   34: 116
    //                   40: 127
    //                   48: 175;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.a(qlo1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L9
_L4:
        b = qlo1.g();
          goto _L9
_L5:
        c = qlo1.g();
          goto _L9
_L6:
        d = qlo1.g();
          goto _L9
_L7:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k = qlo1.i();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = k;
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
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
        if (e != 0x80000000)
        {
            qlp1.a(5, e);
        }
        if (f != 0x80000000)
        {
            qlp1.a(6, f);
        }
        super.a(qlp1);
    }
}
