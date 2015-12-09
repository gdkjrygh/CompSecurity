// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            f, e, ca

final class h
    implements Iterator
{

    final Iterator a;
    Collection b;
    final f c;

    h(f f1)
    {
        c = f1;
        super();
        a = c.a.entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        b = (Collection)entry.getValue();
        f f1 = c;
        Object obj = entry.getKey();
        return ca.a(obj, f1.b.a(obj, (Collection)entry.getValue()));
    }

    public final void remove()
    {
        a.remove();
        e.b(c.b, b.size());
        b.clear();
    }
}
