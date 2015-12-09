// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.c.a.f;

// Referenced classes of package com.a.a:
//            be, b, f, bf

final class bh extends be
{

    private final String a;
    private final int b;

    public bh(f f1, bf bf)
    {
        super(1, new be[] {
            bf
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
            i = f.b(1, com.a.a.b.a(a));
        } else
        {
            i = 0;
        }
        return i + f.c(2, b);
    }

    public final void a(com.a.a.f f1)
    {
        if (c())
        {
            f1.a(1, com.a.a.b.a(a));
        }
        f1.a(2, b);
    }
}
