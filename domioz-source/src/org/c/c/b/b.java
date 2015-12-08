// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.ByteArrayOutputStream;
import org.c.c.f;
import org.c.c.g;
import org.c.c.j;
import org.c.c.n;

// Referenced classes of package org.c.c.b:
//            a

public final class b extends a
{

    public b()
    {
        super(new n[] {
            new n("application", "octet-stream"), n.ALL
        });
    }

    protected final Long getContentLength(Object obj, n n1)
    {
        return Long.valueOf(((byte[])obj).length);
    }

    public final volatile Object readInternal(Class class1, g g1)
    {
        return readInternal(class1, g1);
    }

    public final byte[] readInternal(Class class1, g g1)
    {
        long l = g1.getHeaders().getContentLength();
        if (l >= 0L)
        {
            class1 = new ByteArrayOutputStream((int)l);
            org.c.d.g.copy(g1.getBody(), class1);
            return class1.toByteArray();
        } else
        {
            return org.c.d.g.copyToByteArray(g1.getBody());
        }
    }

    public final boolean supports(Class class1)
    {
        return [B.equals(class1);
    }

    protected final void writeInternal(Object obj, j j1)
    {
        org.c.d.g.copy((byte[])obj, j1.getBody());
    }
}
