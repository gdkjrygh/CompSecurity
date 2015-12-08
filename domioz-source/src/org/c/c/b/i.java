// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.OutputStream;
import org.c.b.a.b;
import org.c.b.a.d;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

// Referenced classes of package org.c.c.b:
//            a

public final class i extends a
{

    public i()
    {
        super(n.ALL);
    }

    protected final Long getContentLength(Object obj, n n1)
    {
        return Long.valueOf(((d)obj).contentLength());
    }

    protected final volatile n getDefaultContentType(Object obj)
    {
        return n.APPLICATION_OCTET_STREAM;
    }

    protected final Object readInternal(Class class1, g g1)
    {
        return new b(org.c.d.g.copyToByteArray(g1.getBody()));
    }

    protected final boolean supports(Class class1)
    {
        return org/c/b/a/d.isAssignableFrom(class1);
    }

    protected final void writeInternal(Object obj, j j1)
    {
        org.c.d.g.copy(((d)obj).getInputStream(), j1.getBody());
        j1.getBody().flush();
    }
}
