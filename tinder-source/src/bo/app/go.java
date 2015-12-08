// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            fw, gi, gq, hd, 
//            gx, gp, hv, gf

final class go extends fw
{

    private final gi a;

    go(gi gi1)
    {
        a = gi1;
    }

    public final hv a()
    {
        return hd.a(a.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && gx.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final gf f()
    {
        return new gp(this, a.b().b());
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
