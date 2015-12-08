// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            ib, gi, gg, hj

final class gj extends ib
{

    final gi a;
    private final Iterator b;

    gj(gi gi1)
    {
        a = gi1;
        super();
        b = gg.a(a.a).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        return hj.a(entry.getKey(), entry.getValue());
    }
}
