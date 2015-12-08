// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gc, go, gw, hj, 
//            hd, gv, ib, gl

final class gu extends gc
{

    private final go a;

    gu(go go1)
    {
        a = go1;
    }

    public final ib a()
    {
        return hj.a(a.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && hd.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final gl f()
    {
        return new gv(this, a.b().b());
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return a.size();
    }
}
