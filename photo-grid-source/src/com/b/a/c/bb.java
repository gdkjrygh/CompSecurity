// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.c.a.a.a;

// Referenced classes of package com.b.a.c:
//            bj, f, b

final class bb extends bj
{

    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public bb(a a1)
    {
        super(4, new bj[0]);
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
    }

    public final int a()
    {
        int i = f.b(1, a);
        int j = f.b(2, b);
        return i + f.b(3, com.b.a.c.b.a(c)) + j + f.b(4, com.b.a.c.b.a(d));
    }

    public final void a(f f1)
    {
        f1.a(1, a);
        f1.a(2, b);
        f1.a(3, com.b.a.c.b.a(c));
        f1.a(4, com.b.a.c.b.a(d));
    }
}
