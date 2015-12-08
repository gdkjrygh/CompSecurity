// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.a.a.c:
//            X

final class Y
    implements b.a.a.a.a.b.w.c
{

    final byte a[];
    final int b[];
    final X c;

    Y(X x, byte abyte0[], int ai[])
    {
        c = x;
        a = abyte0;
        b = ai;
        super();
    }

    public final void a(InputStream inputstream, int i)
        throws IOException
    {
        int ai[];
        inputstream.read(a, b[0], i);
        ai = b;
        ai[0] = ai[0] + i;
        inputstream.close();
        return;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }
}
