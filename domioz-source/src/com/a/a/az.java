// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.c.a.b;

// Referenced classes of package com.a.a:
//            be, b, f

final class az extends be
{

    private final String a;
    private final String b;

    public az(b b1)
    {
        super(2, new be[0]);
        a = b1.a;
        b = b1.b;
    }

    public final int a()
    {
        int i = com.a.a.f.b(1, com.a.a.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        return com.a.a.f.b(2, com.a.a.b.a(s)) + i;
    }

    public final void a(f f1)
    {
        f1.a(1, com.a.a.b.a(a));
        String s;
        if (b == null)
        {
            s = "";
        } else
        {
            s = b;
        }
        f1.a(2, com.a.a.b.a(s));
    }
}
