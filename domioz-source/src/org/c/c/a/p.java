// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import org.c.c.i;
import org.c.d.a;

// Referenced classes of package org.c.c.a:
//            c, n, g, e

public final class p extends c
{

    private final List a;

    public p(g g, List list)
    {
        super(g);
        org.c.d.a.notNull(g, "'requestFactory' must not be null");
        if (list == null)
        {
            list = Collections.emptyList();
        }
        a = list;
    }

    protected final e a(URI uri, i i, g g)
    {
        return new n(g, a, uri, i);
    }
}
