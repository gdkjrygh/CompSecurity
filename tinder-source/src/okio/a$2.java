// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            r, a, c, s

final class .Object
    implements r
{

    final r a;
    final a b;

    public final long a(c c, long l)
        throws IOException
    {
        b.r_();
        l = a.a(c, l);
        b.a(true);
        return l;
        c;
        throw b.b(c);
        c;
        b.a(false);
        throw c;
    }

    public final void close()
        throws IOException
    {
        a.close();
        b.a(true);
        return;
        Object obj;
        obj;
        throw b.b(((IOException) (obj)));
        obj;
        b.a(false);
        throw obj;
    }

    public final s q_()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
    }

    .String(a a1, r r1)
    {
        b = a1;
        a = r1;
        super();
    }
}
