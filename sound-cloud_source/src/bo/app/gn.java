// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gr, gg, gj, go, 
//            hw

final class gn extends gr
{

    private final gj a;

    gn(gj gj1)
    {
        a = gj1;
    }

    public final hw a()
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

    final gg f()
    {
        return new go(this, a.b().b());
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
