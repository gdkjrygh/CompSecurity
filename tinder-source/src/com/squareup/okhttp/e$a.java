// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            e, s, q, t, 
//            v

final class d
    implements d
{

    final e a;
    private final int b;
    private final t c;
    private final boolean d;

    public final v a(t t)
        throws IOException
    {
        if (b < a.a.h.size())
        {
            new <init>(a, b + 1, t, d);
            return ((q)a.a.h.get(b)).a();
        } else
        {
            return a.a(t, d);
        }
    }

    (e e1, int i, t t, boolean flag)
    {
        a = e1;
        super();
        b = i;
        c = t;
        d = flag;
    }
}
