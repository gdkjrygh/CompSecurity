// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.d;

import java.io.InputStream;

// Referenced classes of package com.a.a.b.d:
//            c, f, d

public final class e
    implements c
{

    private final c a;

    public e(c c1)
    {
        a = c1;
    }

    public final InputStream a(String s, Object obj)
    {
        switch (f.a[d.a(s).ordinal()])
        {
        default:
            return a.a(s, obj);

        case 1: // '\001'
        case 2: // '\002'
            throw new IllegalStateException();
        }
    }
}
