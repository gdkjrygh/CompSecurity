// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import b.a.b;

// Referenced classes of package com.b.a:
//            i

public final class g extends i
{

    private long a;
    private long b;
    private b c;

    public g(b b1, long l)
    {
        a = 0x15f90L;
        c = b1;
        long l1 = l;
        if (l < a)
        {
            l1 = a;
        }
        b = l1;
    }

    public final boolean a(boolean flag)
    {
        return System.currentTimeMillis() - c.c >= b;
    }
}
