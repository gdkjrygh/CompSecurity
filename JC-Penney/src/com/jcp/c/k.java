// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import com.jcp.api.a.a;

// Referenced classes of package com.jcp.c:
//            h

class k
{

    final h a;
    private String b;
    private String c;
    private final String d;

    public k(h h, a a1)
    {
        a = h;
        super();
        b = a1.a();
        c = a1.b();
        d = a1.d();
    }

    static String a(k k1)
    {
        return k1.d;
    }

    static String a(k k1, String s)
    {
        k1.b = s;
        return s;
    }

    static String b(k k1)
    {
        return k1.b;
    }

    static String b(k k1, String s)
    {
        k1.c = s;
        return s;
    }

    static String c(k k1)
    {
        return k1.c;
    }
}
