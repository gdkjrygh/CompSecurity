// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gw, gl, go, gt, 
//            ib

final class gs extends gw
{

    private final go a;

    gs(go go1)
    {
        a = go1;
    }

    public final ib a()
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

    final gl f()
    {
        return new gt(this, a.b().b());
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
