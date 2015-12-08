// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ee, Maps

class dc extends ee
{

    final Map c;

    dc(Map map)
    {
        c = (Map)p.a(map);
    }

    public void clear()
    {
        c.clear();
    }

    public boolean contains(Object obj)
    {
        return c.containsKey(obj);
    }

    public boolean isEmpty()
    {
        return c.isEmpty();
    }

    public Iterator iterator()
    {
        return Maps.a(c.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            c.remove(obj);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return c.size();
    }
}
