// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;


// Referenced classes of package com.google.b.e.a.a.a:
//            r

final class p extends r
{

    private final String a;
    private final int b;
    private final boolean c;

    p(int i, String s)
    {
        super(i);
        a = s;
        c = false;
        b = 0;
    }

    p(int i, String s, int j)
    {
        super(i);
        c = true;
        b = j;
        a = s;
    }

    String a()
    {
        return a;
    }

    boolean b()
    {
        return c;
    }

    int c()
    {
        return b;
    }
}
