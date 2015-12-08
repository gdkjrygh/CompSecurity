// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.b;

import com.google.b.s;

// Referenced classes of package com.google.b.c.b:
//            b

final class c
{

    private final s a;
    private final s b;
    private final int c;

    private c(s s, s s1, int i)
    {
        a = s;
        b = s1;
        c = i;
    }

    c(s s, s s1, int i, b b1)
    {
        this(s, s1, i);
    }

    s a()
    {
        return a;
    }

    s b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append("/").append(b).append('/').append(c).toString();
    }
}
