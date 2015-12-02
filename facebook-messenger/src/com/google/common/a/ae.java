// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            x, gg, ik

class ae
    implements Iterator
{

    final Iterator a;
    Object b;
    Collection c;
    Iterator d;
    final x e;

    ae(x x1)
    {
        e = x1;
        super();
        a = x.a(x1).entrySet().iterator();
        if (a.hasNext())
        {
            a();
            return;
        } else
        {
            d = gg.b();
            return;
        }
    }

    void a()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        b = entry.getKey();
        c = (Collection)entry.getValue();
        d = c.iterator();
    }

    public java.util.Map.Entry b()
    {
        if (!d.hasNext())
        {
            a();
        }
        return ik.a(b, d.next());
    }

    public boolean hasNext()
    {
        return a.hasNext() || d.hasNext();
    }

    public Object next()
    {
        return b();
    }

    public void remove()
    {
        d.remove();
        if (c.isEmpty())
        {
            a.remove();
        }
        x.b(e);
    }
}
