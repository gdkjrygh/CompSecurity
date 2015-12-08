// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements ain
{

    private ain a;
    private ahV b;

    public final void a_(ahX ahx, long l)
    {
        b.ab_();
        a.a_(ahx, l);
        b.a(true);
        return;
        ahx;
        throw b.a(ahx);
        ahx;
        b.a(false);
        throw ahx;
    }

    public final aip aa_()
    {
        return b;
    }

    public final void close()
    {
        b.ab_();
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

    public final void flush()
    {
        b.ab_();
        a.flush();
        b.a(true);
        return;
        Object obj;
        obj;
        throw b.a(((IOException) (obj)));
        obj;
        b.a(false);
        throw obj;
    }

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
    }

    (ahV ahv, ain ain1)
    {
        b = ahv;
        a = ain1;
        super();
    }
}
