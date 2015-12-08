// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package bo.app:
//            gq, ga, gx, hv

final class gb extends gq
{

    final ga a;

    gb(ga ga1)
    {
        a = ga1;
        super();
    }

    public final hv a()
    {
        return gx.a(ga.a(a).keySet().iterator());
    }

    public final boolean contains(Object obj)
    {
        return ga.a(a).containsKey(obj);
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
