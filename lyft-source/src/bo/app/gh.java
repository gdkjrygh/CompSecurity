// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            gw, gg, hd, ib

final class gh extends gw
{

    final gg a;

    gh(gg gg1)
    {
        a = gg1;
        super();
    }

    public final ib a()
    {
        return hd.a(gg.a(a).keySet().iterator());
    }

    public final boolean contains(Object obj)
    {
        return gg.a(a).containsKey(obj);
    }

    final boolean e()
    {
        return true;
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
