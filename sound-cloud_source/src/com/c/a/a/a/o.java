// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.h;
import com.c.a.B;
import com.c.a.p;
import com.c.a.r;

// Referenced classes of package com.c.a.a.a:
//            m

public final class o extends B
{

    private final p a;
    private final h b;

    public o(p p1, h h)
    {
        a = p1;
        b = h;
    }

    public final r a()
    {
        String s = a.a("Content-Type");
        if (s != null)
        {
            return r.a(s);
        } else
        {
            return null;
        }
    }

    public final long b()
    {
        return m.a(a);
    }

    public final h c()
    {
        return b;
    }
}
