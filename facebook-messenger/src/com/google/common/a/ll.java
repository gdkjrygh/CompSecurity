// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            lj, gg, lz, lk, 
//            ly

class ll
    implements Iterator
{

    final Iterator a;
    java.util.Map.Entry b;
    Iterator c;
    final lj d;

    private ll(lj lj1)
    {
        d = lj1;
        super();
        a = d.a.entrySet().iterator();
        c = gg.b();
    }

    ll(lj lj1, lk lk)
    {
        this(lj1);
    }

    public ly a()
    {
        if (!c.hasNext())
        {
            b = (java.util.Map.Entry)a.next();
            c = ((Map)b.getValue()).entrySet().iterator();
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)c.next();
        return lz.a(b.getKey(), entry.getKey(), entry.getValue());
    }

    public boolean hasNext()
    {
        return a.hasNext() || c.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        c.remove();
        if (((Map)b.getValue()).isEmpty())
        {
            a.remove();
        }
    }
}
