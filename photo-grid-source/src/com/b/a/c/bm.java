// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.c.a.a.f;

// Referenced classes of package com.b.a.c:
//            bj, b, f, bk

final class bm extends bj
{

    private final String a;
    private final int b;

    public bm(f f1, bk bk)
    {
        super(1, new bj[] {
            bk
        });
        a = f1.a;
        b = f1.b;
    }

    private boolean c()
    {
        return a != null && a.length() > 0;
    }

    public final int a()
    {
        int i;
        if (c())
        {
            i = f.b(1, com.b.a.c.b.a(a));
        } else
        {
            i = 0;
        }
        return i + f.c(2, b);
    }

    public final void a(com.b.a.c.f f1)
    {
        if (c())
        {
            f1.a(1, com.b.a.c.b.a(a));
        }
        f1.a(2, b);
    }
}
