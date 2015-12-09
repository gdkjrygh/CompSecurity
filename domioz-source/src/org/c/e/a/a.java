// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.a;

import java.io.IOException;
import org.c.c.a.i;
import org.c.c.f;
import org.c.c.l;
import org.c.c.m;
import org.c.c.n;
import org.c.d.g;

// Referenced classes of package org.c.e.a:
//            i, b, k, c, 
//            e

public final class a
    implements org.c.e.a.i
{

    public a()
    {
    }

    private static byte[] a(i j)
    {
        j = j.getBody();
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        j = g.copyToByteArray(j);
        return j;
        j;
        return new byte[0];
    }

    public final void handleError(i j)
    {
        l l1 = j.getStatusCode();
        Object obj = j.getHeaders().getContentType();
        byte abyte0[];
        if (obj != null)
        {
            obj = ((n) (obj)).getCharSet();
        } else
        {
            obj = null;
        }
        abyte0 = a(j);
        switch (b.a[l1.series().ordinal()])
        {
        default:
            throw new k((new StringBuilder("Unknown status code [")).append(l1).append("]").toString());

        case 1: // '\001'
            throw new c(l1, j.getStatusText(), abyte0, ((java.nio.charset.Charset) (obj)));

        case 2: // '\002'
            throw new e(l1, j.getStatusText(), abyte0, ((java.nio.charset.Charset) (obj)));
        }
    }

    public final boolean hasError(i j)
    {
        j = j.getStatusCode();
        return j.series() == m.CLIENT_ERROR || j.series() == m.SERVER_ERROR;
    }
}
