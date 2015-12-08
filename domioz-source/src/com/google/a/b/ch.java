// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            da, ca

class ch extends da
{

    final Map c;

    ch(Map map)
    {
        c = (Map)ad.a(map);
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
        return ca.a(c.entrySet().iterator());
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
