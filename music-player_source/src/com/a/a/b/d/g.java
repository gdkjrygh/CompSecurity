// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.d;

import com.a.a.b.a.d;
import java.io.InputStream;

// Referenced classes of package com.a.a.b.d:
//            c, h, d

public final class g
    implements c
{

    private final c a;

    public g(c c1)
    {
        a = c1;
    }

    public final InputStream a(String s, Object obj)
    {
        obj = a.a(s, obj);
        switch (h.a[d.a(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new d(((InputStream) (obj)));
        }
    }
}
