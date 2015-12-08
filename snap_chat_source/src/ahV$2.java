// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements aio
{

    private aio a;
    private ahV b;

    public final long a(ahX ahx, long l)
    {
        b.ab_();
        l = a.a(ahx, l);
        b.a(true);
        return l;
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

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
    }

    (ahV ahv, aio aio1)
    {
        b = ahv;
        a = aio1;
        super();
    }
}
