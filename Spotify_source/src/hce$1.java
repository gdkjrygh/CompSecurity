// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements hcv
{

    private hcv a;
    private hce b;

    public final hcx T_()
    {
        return b;
    }

    public final void a_(hch hch, long l)
    {
        b.U_();
        a.a_(hch, l);
        b.a(true);
        return;
        hch;
        throw b.b(hch);
        hch;
        b.a(false);
        throw hch;
    }

    public final void close()
    {
        b.U_();
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
    {
        b.U_();
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

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.sink(")).append(a).append(")").toString();
    }

    (hce hce1, hcv hcv1)
    {
        b = hce1;
        a = hcv1;
        super();
    }
}
