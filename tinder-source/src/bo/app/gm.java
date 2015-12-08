// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gq, gf, gi, gn, 
//            hv

final class gm extends gq
{

    private final gi a;

    gm(gi gi1)
    {
        a = gi1;
    }

    public final hv a()
    {
        return b().a();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    final gf f()
    {
        return new gn(this, a.b().b());
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    public final int size()
    {
        return a.size();
    }
}
