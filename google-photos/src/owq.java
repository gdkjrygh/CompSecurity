// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class owq extends qlq
{

    private static volatile owq e[];
    public String a;
    public String b;
    public String c;
    public String d;
    private String f;
    private int g;
    private String h;

    public owq()
    {
        a = null;
        b = null;
        c = null;
        f = null;
        g = 0x80000000;
        h = null;
        d = null;
        F = null;
        G = -1;
    }

    public static owq[] b()
    {
        if (e == null)
        {
            synchronized (qlu.a)
            {
                if (e == null)
                {
                    e = new owq[0];
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
        if (f != null)
        {
            j = i + qlp.b(4, f);
        }
        i = j;
        if (g != 0x80000000)
        {
            i = j + qlp.e(5, g);
        }
        j = i;
        if (h != null)
        {
            j = i + qlp.b(6, h);
        }
        i = j;
        if (d != null)
        {
            i = j + qlp.b(7, d);
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
    //                   50: 183
    //                   58: 194;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.a(qlo1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L10
_L4:
        b = qlo1.g();
          goto _L10
_L5:
        c = qlo1.g();
          goto _L10
_L6:
        f = qlo1.g();
          goto _L10
_L7:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            g = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L9:
        d = qlo1.g();
        if (true) goto _L10; else goto _L11
_L11:
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
        if (f != null)
        {
            qlp1.a(4, f);
        }
        if (g != 0x80000000)
        {
            qlp1.a(5, g);
        }
        if (h != null)
        {
            qlp1.a(6, h);
        }
        if (d != null)
        {
            qlp1.a(7, d);
        }
        super.a(qlp1);
    }
}
