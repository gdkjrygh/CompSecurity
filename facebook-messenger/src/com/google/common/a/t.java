// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dz, q, u, gg

class t extends dz
{

    final q a;
    private final Map b;
    private final Set c;

    t(q q1, Map map)
    {
        a = q1;
        super();
        b = map;
        c = map.keySet();
    }

    protected Set a()
    {
        return c;
    }

    protected Collection b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public void clear()
    {
        if (b == q.a(a))
        {
            a.clear();
        } else
        {
            Iterator iterator1 = iterator();
            while (iterator1.hasNext()) 
            {
                iterator1.next();
                iterator1.remove();
            }
        }
    }

    public Map d()
    {
        return b;
    }

    public Iterator iterator()
    {
        return new u(this, b.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        return q.a(a, obj, b) != 0;
    }

    public boolean removeAll(Collection collection)
    {
        return gg.a(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return gg.b(iterator(), collection);
    }
}
