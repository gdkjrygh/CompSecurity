// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.b.a.a.a.a.a:
//            a, g

public final class <init>
    implements Closeable
{

    File a[];
    final a b;
    private final String c;
    private final long d;
    private final InputStream e[];
    private final long f[];

    public final void close()
    {
        InputStream ainputstream[] = e;
        int j = ainputstream.length;
        for (int i = 0; i < j; i++)
        {
            g.a(ainputstream[i]);
        }

    }

    private (a a1, String s, long l, File afile[], InputStream ainputstream[], long al[])
    {
        b = a1;
        super();
        c = s;
        d = l;
        a = afile;
        e = ainputstream;
        f = al;
    }

    f(a a1, String s, long l, File afile[], InputStream ainputstream[], long al[], 
            byte byte0)
    {
        this(a1, s, l, afile, ainputstream, al);
    }
}
