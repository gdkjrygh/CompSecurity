// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a;


// Referenced classes of package com.google.b.e.a:
//            b, c

final class d extends b
{

    private final c a;
    private int b;

    d(int i, int j, c c1)
    {
        super(i, j);
        a = c1;
    }

    c c()
    {
        return a;
    }

    int d()
    {
        return b;
    }

    void e()
    {
        b = b + 1;
    }
}
