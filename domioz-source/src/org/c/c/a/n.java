// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.URI;
import java.util.List;
import org.c.c.f;
import org.c.c.i;

// Referenced classes of package org.c.c.a:
//            a, o, g, i

final class n extends a
{

    private final g a;
    private final List b;
    private i c;
    private URI d;

    protected n(g g, List list, URI uri, i i)
    {
        a = g;
        b = list;
        c = i;
        d = uri;
    }

    static List a(n n1)
    {
        return n1.b;
    }

    static g b(n n1)
    {
        return n1.a;
    }

    protected final org.c.c.a.i a(f f, byte abyte0[])
    {
        return (new o(this, (byte)0)).execute(this, abyte0);
    }

    public final i getMethod()
    {
        return c;
    }

    public final URI getURI()
    {
        return d;
    }
}
