// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.taplytics:
//            ih, ax, c

public final class ii extends ih
{

    private final byte b[];
    private final String c;

    private ii(byte abyte0[], c c1, String s)
    {
        super(c1);
        ax.a(abyte0, "byte[]");
        b = abyte0;
        c = s;
    }

    public ii(byte abyte0[], String s)
    {
        this(abyte0, "application/octet-stream", s);
    }

    private ii(byte abyte0[], String s, String s1)
    {
        this(abyte0, com.taplytics.c.a(s), s1);
    }

    public final String a()
    {
        return c;
    }

    public final void a(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(b);
    }

    public final String c()
    {
        return null;
    }

    public final String d()
    {
        return "binary";
    }

    public final long e()
    {
        return (long)b.length;
    }
}
