// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import com.a.a.c.a.a.a;
import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            V, f, b

private static final class a.d extends a.d
{

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public final int a()
    {
        int i = f.b(1, a);
        int j = f.b(2, b);
        return i + f.b(3, com.a.a.c.b.a(c)) + j + f.b(4, com.a.a.c.b.a(d));
    }

    public final void a(f f1)
        throws IOException
    {
        f1.a(1, a);
        f1.a(2, b);
        f1.a(3, com.a.a.c.b.a(c));
        f1.a(4, com.a.a.c.b.a(d));
    }

    public a(a a1)
    {
        super(4, new <init>[0]);
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
    }
}
