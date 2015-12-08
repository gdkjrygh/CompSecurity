// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.URI;
import org.c.c.i;
import org.c.d.a;

// Referenced classes of package org.c.c.a:
//            g, e

public abstract class c
    implements g
{

    private final g a;

    protected c(g g1)
    {
        org.c.d.a.notNull(g1, "'requestFactory' must not be null");
        a = g1;
    }

    protected abstract e a(URI uri, i i, g g1);

    public final e createRequest(URI uri, i i)
    {
        return a(uri, i, a);
    }
}
