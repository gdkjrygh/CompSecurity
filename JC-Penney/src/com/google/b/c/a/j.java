// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;


// Referenced classes of package com.google.b.c.a:
//            i, h

final class j
{

    private final int a;
    private final i b[];

    private j(int k, i l)
    {
        a = k;
        b = (new i[] {
            l
        });
    }

    j(int k, i l, h h)
    {
        this(k, l);
    }

    private j(int k, i l, i i1)
    {
        a = k;
        b = (new i[] {
            l, i1
        });
    }

    j(int k, i l, i i1, h h)
    {
        this(k, l, i1);
    }

    int a()
    {
        return a;
    }

    i[] b()
    {
        return b;
    }
}
