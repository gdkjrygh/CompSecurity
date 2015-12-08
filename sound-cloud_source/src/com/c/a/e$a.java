// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.c.a:
//            e, t, q, w, 
//            A

final class d
    implements ject
{

    final e a;
    private final int b;
    private final w c;
    private final boolean d;

    public final A a(w w)
        throws IOException
    {
        if (b < a.a.h.size())
        {
            new <init>(a, b + 1, w, d);
            return ((q)a.a.h.get(b)).a();
        } else
        {
            return a.a(w, d);
        }
    }

    ception(e e1, int i, w w, boolean flag)
    {
        a = e1;
        super();
        b = i;
        c = w;
        d = flag;
    }
}
