// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import java.io.IOException;

// Referenced classes of package c:
//            y, a, e, z

final class c
    implements y
{

    final y a;
    final a b;

    c(a a1, y y1)
    {
        b = a1;
        a = y1;
        super();
    }

    public final long a(e e, long l)
        throws IOException
    {
        b.c();
        l = a.a(e, l);
        b.a(true);
        return l;
        e;
        throw b.a(e);
        e;
        b.a(false);
        throw e;
    }

    public final void close()
        throws IOException
    {
        a.close();
        b.a(true);
        return;
        Object obj;
        obj;
        throw b.a(((IOException) (obj)));
        obj;
        b.a(false);
        throw obj;
    }

    public final z timeout()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
    }
}
