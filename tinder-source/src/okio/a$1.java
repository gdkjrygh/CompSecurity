// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;

import java.io.IOException;

// Referenced classes of package okio:
//            q, a, c, s

final class .Object
    implements q
{

    final q a;
    final a b;

    public final void a_(c c, long l)
        throws IOException
    {
        b.r_();
        a.a_(c, l);
        b.a(true);
        return;
        c;
        throw b.b(c);
        c;
        b.a(false);
        throw c;
    }

    public final void close()
        throws IOException
    {
        b.r_();
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

    public final void flush()
        throws IOException
    {
        b.r_();
        a.flush();
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
        return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
    }

    .String(a a1, q q1)
    {
        b = a1;
        a = q1;
        super();
    }
}
