// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.g;
import java.io.IOException;

// Referenced classes of package com.c.a:
//            x, r

final class y extends x
{

    final r a;
    final int b;
    final byte c[];
    final int d;

    y(r r, int i, byte abyte0[], int j)
    {
        a = r;
        b = i;
        c = abyte0;
        d = j;
        super();
    }

    public final long contentLength()
    {
        return (long)b;
    }

    public final r contentType()
    {
        return a;
    }

    public final void writeTo(g g1)
        throws IOException
    {
        g1.c(c, d, b);
    }
}
