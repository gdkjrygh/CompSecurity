// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;

import com.google.b.h;

// Referenced classes of package com.google.b.e.a.a.a:
//            r

final class q extends r
{

    private final int a;
    private final int b;

    q(int i, int j, int k)
    {
        super(i);
        if (j < 0 || j > 10 || k < 0 || k > 10)
        {
            throw h.a();
        } else
        {
            a = j;
            b = k;
            return;
        }
    }

    int a()
    {
        return a;
    }

    int b()
    {
        return b;
    }

    boolean c()
    {
        return a == 10;
    }

    boolean d()
    {
        return b == 10;
    }
}
