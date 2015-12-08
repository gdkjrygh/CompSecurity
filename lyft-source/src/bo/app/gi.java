// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gr, gj, gg, ib, 
//            go

final class gi extends gr
{

    final gg a;

    gi(gg gg)
    {
        a = gg;
        super();
    }

    public final ib a()
    {
        return new gj(this);
    }

    final go d()
    {
        return a;
    }

    public final Iterator iterator()
    {
        return a();
    }
}
