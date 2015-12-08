// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.c.a.a.e;

// Referenced classes of package com.b.a.c:
//            bj, b, f

final class bl extends bj
{

    private final String a;
    private final String b;
    private final long c;

    public bl(e e1)
    {
        super(3, new bj[0]);
        a = e1.a;
        b = e1.b;
        c = e1.c;
    }

    public final int a()
    {
        return f.b(1, com.b.a.c.b.a(a)) + f.b(2, com.b.a.c.b.a(b)) + f.b(3, c);
    }

    public final void a(f f1)
    {
        f1.a(1, com.b.a.c.b.a(a));
        f1.a(2, com.b.a.c.b.a(b));
        f1.a(3, c);
    }
}
