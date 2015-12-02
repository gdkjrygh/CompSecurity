// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ab, x, ik

class ad
    implements Iterator
{

    final Iterator a;
    Collection b;
    final ab c;

    ad(ab ab1)
    {
        c = ab1;
        super();
        a = c.a.entrySet().iterator();
    }

    public java.util.Map.Entry a()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        Object obj = entry.getKey();
        b = (Collection)entry.getValue();
        return ik.a(obj, x.a(c.c, obj, b));
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        a.remove();
        x.b(c.c, b.size());
        b.clear();
    }
}
