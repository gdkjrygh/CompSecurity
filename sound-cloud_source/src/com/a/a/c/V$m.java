// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import com.a.a.c.a.a.f;
import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            V, b, f

private static final class f.b extends f.b
{

    private final String a;
    private final int b;

    private boolean c()
    {
        return a != null && a.length() > 0;
    }

    public final int a()
    {
        int i;
        if (c())
        {
            i = f.b(1, com.a.a.c.b.a(a));
        } else
        {
            i = 0;
        }
        return i + f.c(2, b);
    }

    public final void a(com.a.a.c.f f1)
        throws IOException
    {
        if (c())
        {
            f1.a(1, com.a.a.c.b.a(a));
        }
        f1.a(2, b);
    }

    public f(f f1, f f2)
    {
        super(1, new <init>[] {
            f2
        });
        a = f1.a;
        b = f1.b;
    }
}
