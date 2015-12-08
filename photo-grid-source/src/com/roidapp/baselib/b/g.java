// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.io.Closeable;
import java.io.InputStream;

// Referenced classes of package com.roidapp.baselib.b:
//            b

public final class g
    implements Closeable
{

    final b a;
    private final String b;
    private final long c;
    private final InputStream d[];

    private g(b b1, String s, long l, InputStream ainputstream[])
    {
        a = b1;
        super();
        b = s;
        c = l;
        d = ainputstream;
    }

    g(b b1, String s, long l, InputStream ainputstream[], byte byte0)
    {
        this(b1, s, l, ainputstream);
    }

    public final InputStream a()
    {
        return d[0];
    }

    public final void close()
    {
        InputStream ainputstream[] = d;
        int j = ainputstream.length;
        for (int i = 0; i < j; i++)
        {
            com.roidapp.baselib.b.b.a(ainputstream[i]);
        }

    }
}
