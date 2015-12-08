// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d.a;

import java.io.Closeable;
import java.io.InputStream;

// Referenced classes of package com.d.a:
//            a, f

public final class tStream
    implements Closeable
{

    final a a;
    private final String b;
    private final long c;
    private final InputStream d[];
    private final long e[];

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
            f.a(ainputstream[i]);
        }

    }

    private tStream(a a1, String s, long l, InputStream ainputstream[], long al[])
    {
        a = a1;
        super();
        b = s;
        c = l;
        d = ainputstream;
        e = al;
    }

    tStream(a a1, String s, long l, InputStream ainputstream[], long al[], byte byte0)
    {
        this(a1, s, l, ainputstream, al);
    }
}
