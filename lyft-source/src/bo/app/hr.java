// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gr, gl, ho, hq, 
//            ib, go

final class hr extends gr
{

    final hq a;

    private hr(hq hq1)
    {
        a = hq1;
        super();
    }

    hr(hq hq1, byte byte0)
    {
        this(hq1);
    }

    public final ib a()
    {
        return b().a();
    }

    final go d()
    {
        return a;
    }

    final gl f()
    {
        return new ho(this, hq.a(a));
    }

    public final Iterator iterator()
    {
        return b().a();
    }
}
