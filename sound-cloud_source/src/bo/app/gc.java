// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            gr, gb, gy, hw

final class gc extends gr
{

    final gb a;

    gc(gb gb1)
    {
        a = gb1;
        super();
    }

    public final hw a()
    {
        return gy.a(gb.a(a).keySet().iterator());
    }

    public final boolean contains(Object obj)
    {
        return gb.a(a).containsKey(obj);
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
