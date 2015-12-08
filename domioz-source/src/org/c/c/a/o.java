// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.util.Iterator;
import java.util.List;
import org.c.c.f;
import org.c.c.k;
import org.c.d.g;

// Referenced classes of package org.c.c.a:
//            f, n, h, g, 
//            e, i

final class o
    implements org.c.c.a.f
{

    final n a;
    private final Iterator b;

    private o(n n1)
    {
        a = n1;
        super();
        b = n.a(n1).iterator();
    }

    o(n n1, byte byte0)
    {
        this(n1);
    }

    public final i execute(k k1, byte abyte0[])
    {
        if (b.hasNext())
        {
            return ((h)b.next()).intercept(k1, abyte0, this);
        }
        e e1 = n.b(a).createRequest(k1.getURI(), k1.getMethod());
        e1.getHeaders().putAll(k1.getHeaders());
        if (abyte0.length > 0)
        {
            g.copy(abyte0, e1.getBody());
        }
        return e1.execute();
    }
}
