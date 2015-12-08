// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.util.Arrays;

// Referenced classes of package com.c.a.a:
//            c

final class f extends c
{

    final char q[];

    f(String s, char ac[])
    {
        q = ac;
        super(s);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public final boolean c(char c1)
    {
        return Arrays.binarySearch(q, c1) >= 0;
    }
}
