// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import com.b.a.c.a.a.b;

// Referenced classes of package com.b.a.c:
//            bj, b, f

final class bc extends bj
{

    private final String a;
    private final String b;

    public bc(b b1)
    {
        super(2, new bj[0]);
        a = b1.a;
        b = b1.b;
    }

    public final int a()
    {
        int i = com.b.a.c.f.b(1, com.b.a.c.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        return com.b.a.c.f.b(2, com.b.a.c.b.a(s)) + i;
    }

    public final void a(f f1)
    {
        f1.a(1, com.b.a.c.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        f1.a(2, com.b.a.c.b.a(s));
    }
}
