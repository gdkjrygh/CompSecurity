// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import com.a.a.c.a.a.b;
import java.io.IOException;

// Referenced classes of package com.a.a.c:
//            V, b, f

private static final class b.b extends b.b
{

    private final String a;
    private final String b;

    public final int a()
    {
        int i = com.a.a.c.f.b(1, com.a.a.c.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        return com.a.a.c.f.b(2, com.a.a.c.b.a(s)) + i;
    }

    public final void a(f f1)
        throws IOException
    {
        f1.a(1, com.a.a.c.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        f1.a(2, com.a.a.c.b.a(s));
    }

    public b(b b1)
    {
        super(2, new <init>[0]);
        a = b1.a;
        b = b1.b;
    }
}
