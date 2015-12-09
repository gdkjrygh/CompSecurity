// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.a;

import java.util.List;

// Referenced classes of package com.jcp.a:
//            a

public class b
{

    final a a;
    private List b;
    private String c;

    protected b(a a1)
    {
        a = a1;
        super();
    }

    static String a(b b1, String s)
    {
        b1.c = s;
        return s;
    }

    static List a(b b1)
    {
        return b1.b;
    }

    static List a(b b1, List list)
    {
        b1.b = list;
        return list;
    }

    static String b(b b1)
    {
        return b1.c;
    }
}
