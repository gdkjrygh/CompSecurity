// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            lj, ik, lp, lo

class ln extends AbstractMap
{

    final Object a;
    Map b;
    Set c;
    Set d;
    final lj e;

    ln(lj lj1, Object obj)
    {
        e = lj1;
        super();
        a = Preconditions.checkNotNull(obj);
    }

    Map a()
    {
        if (b == null || b.isEmpty() && e.a.containsKey(a))
        {
            Map map = b();
            b = map;
            return map;
        } else
        {
            return b;
        }
    }

    Map b()
    {
        return (Map)e.a.get(a);
    }

    void c()
    {
        if (a() != null && b.isEmpty())
        {
            e.a.remove(a);
            b = null;
        }
    }

    public void clear()
    {
        Map map = a();
        if (map != null)
        {
            map.clear();
        }
        c();
    }

    public boolean containsKey(Object obj)
    {
        Map map = a();
        return obj != null && map != null && ik.b(map, obj);
    }

    public Set entrySet()
    {
        Set set = d;
        Object obj = set;
        if (set == null)
        {
            obj = new lp(this, null);
            d = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object get(Object obj)
    {
        Map map = a();
        if (obj != null && map != null)
        {
            return ik.a(map, obj);
        } else
        {
            return null;
        }
    }

    public Set keySet()
    {
        Set set = c;
        Object obj = set;
        if (set == null)
        {
            obj = new lo(this);
            c = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object put(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        if (b != null && !b.isEmpty())
        {
            return b.put(obj, obj1);
        } else
        {
            return e.a(a, obj, obj1);
        }
    }

    public Object remove(Object obj)
    {
        Map map;
        try
        {
            map = a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (map == null)
        {
            return null;
        }
        obj = map.remove(obj);
        c();
        return obj;
    }
}
