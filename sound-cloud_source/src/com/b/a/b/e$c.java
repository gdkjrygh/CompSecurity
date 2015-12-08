// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import com.b.a.b.a.c;
import com.b.a.b.d.b;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.b.a.b:
//            e

private static final class a
    implements b
{

    private final b a;

    public final InputStream a(String s, Object obj)
        throws IOException
    {
        obj = a.a(s, obj);
        switch (a[com.b.a.b.d.a(s).ordinal()])
        {
        default:
            return ((InputStream) (obj));

        case 1: // '\001'
        case 2: // '\002'
            return new c(((InputStream) (obj)));
        }
    }

    public ption(b b1)
    {
        a = b1;
    }
}
