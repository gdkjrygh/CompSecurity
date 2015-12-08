// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class ang.Object
    implements hcw
{

    private hcw a;
    private hce b;

    public final hcx T_()
    {
        return b;
    }

    public final long a(hch hch, long l)
    {
        b.U_();
        l = a.a(hch, l);
        b.a(true);
        return l;
        hch;
        throw b.b(hch);
        hch;
        b.a(false);
        throw hch;
    }

    public final void close()
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

    public final String toString()
    {
        return (new StringBuilder("AsyncTimeout.source(")).append(a).append(")").toString();
    }

    (hce hce1, hcw hcw1)
    {
        b = hce1;
        a = hcw1;
        super();
    }
}
