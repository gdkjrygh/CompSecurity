// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            al, ac, e, x

final class nit> extends al
{

    private ac a;

    public final x a()
    {
        return e.a(ac.a(a).keySet().iterator());
    }

    public final boolean contains(Object obj)
    {
        return ac.a(a).containsKey(obj);
    }

    final boolean d()
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

    (ac ac1)
    {
        a = ac1;
        super();
    }
}
