// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            fx, gj, gr, he, 
//            gy, gq, hw, gg

final class gp extends fx
{

    private final gj a;

    gp(gj gj1)
    {
        a = gj1;
    }

    public final hw a()
    {
        return he.a(a.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && gy.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final gg f()
    {
        return new gq(this, a.b().b());
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
