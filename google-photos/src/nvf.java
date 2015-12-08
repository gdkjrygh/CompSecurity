// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class nvf extends zc
{

    private nva a;

    nvf(nva nva1)
    {
        a = nva1;
        super();
    }

    public final void a(zb zb, zk zk1)
    {
        super.a(zb, zk1);
        a.e();
    }

    public final void b(zb zb, zk zk1)
    {
        super.b(zb, zk1);
        a.e();
    }

    public final void c(zb zb, zk zk1)
    {
        super.c(zb, zk1);
        zb = zk1.n;
        if (!nva.g(a).isEmpty())
        {
            nva.a(a, ((lxm)olm.a(nva.g(), lxm)).a(zb));
        }
    }

    public final void d(zb zb, zk zk1)
    {
        super.d(zb, zk1);
        nva.a(a, null);
    }
}
