// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;


public final class D extends Enum
{

    public static final D a;
    public static final D b;
    public static final D c;
    public static final D d;
    private static final D f[];
    final String e;

    private D(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static D a(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -503070503: 118
    //                   -503070502: 104
    //                   79201641: 146
    //                   79923350: 132;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_146;
_L6:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected TLS version: ")).append(s).toString());

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
_L3:
        if (s.equals("TLSv1.2"))
        {
            byte0 = 0;
        }
          goto _L6
_L2:
        if (s.equals("TLSv1.1"))
        {
            byte0 = 1;
        }
          goto _L6
_L5:
        if (s.equals("TLSv1"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("SSLv3"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    public static D valueOf(String s)
    {
        return (D)Enum.valueOf(com/c/a/D, s);
    }

    public static D[] values()
    {
        return (D[])f.clone();
    }

    static 
    {
        a = new D("TLS_1_2", 0, "TLSv1.2");
        b = new D("TLS_1_1", 1, "TLSv1.1");
        c = new D("TLS_1_0", 2, "TLSv1");
        d = new D("SSL_3_0", 3, "SSLv3");
        f = (new D[] {
            a, b, c, d
        });
    }
}
