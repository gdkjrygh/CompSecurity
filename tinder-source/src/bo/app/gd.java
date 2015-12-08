// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            hv, gc, ga, hd

final class gd extends hv
{

    final gc a;
    private final Iterator b;

    gd(gc gc1)
    {
        a = gc1;
        super();
        b = ga.a(a.a).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        return hd.a(entry.getKey(), entry.getValue());
    }
}
