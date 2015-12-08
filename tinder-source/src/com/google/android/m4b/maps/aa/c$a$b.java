// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c, ax

final class c
    implements Iterator
{

    private Iterator a;
    private Collection b;
    private b c;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.try try1 = (java.util.try)a.next();
        b = (Collection)try1.getValue();
        a a1 = c;
        Object obj = try1.getKey();
        return ax.a(obj, a1.c.a(obj, (Collection)try1.getValue()));
    }

    public final void remove()
    {
        a.remove();
        com.google.android.m4b.maps.aa.c.b(c.c, b.size());
        b.clear();
    }

    ( )
    {
        c = ;
        super();
        a = c.c.entrySet().iterator();
    }
}
