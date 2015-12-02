// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            lx, lk, ik, lt, 
//            ln, ls, lm

class lj
    implements lx, Serializable
{

    final Map a;
    final Supplier b;
    private transient lm c;
    private transient ls d;
    private transient lt e;

    lj(Map map, Supplier supplier)
    {
        a = map;
        b = supplier;
    }

    static Iterator a(Map map)
    {
        return new lk(map.entrySet().iterator());
    }

    static boolean a(lj lj1, Object obj, Object obj1, Object obj2)
    {
        return lj1.b(obj, obj1, obj2);
    }

    static boolean b(lj lj1, Object obj, Object obj1, Object obj2)
    {
        return lj1.c(obj, obj1, obj2);
    }

    private boolean b(Object obj, Object obj1, Object obj2)
    {
        return obj2 != null && obj2.equals(a(obj, obj1));
    }

    private Map c(Object obj)
    {
        Map map1 = (Map)a.get(obj);
        Map map = map1;
        if (map1 == null)
        {
            map = (Map)b.get();
            a.put(obj, map);
        }
        return map;
    }

    private boolean c(Object obj, Object obj1, Object obj2)
    {
        if (b(obj, obj1, obj2))
        {
            b(obj, obj1);
            return true;
        } else
        {
            return false;
        }
    }

    public Object a(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return null;
        }
        obj = (Map)ik.a(a, obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ik.a(((Map) (obj)), obj1);
        }
    }

    public Object a(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Preconditions.checkNotNull(obj2);
        return c(obj).put(obj1, obj2);
    }

    public boolean a(Object obj)
    {
        return obj != null && ik.b(a, obj);
    }

    public Object b(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return null;
        }
        Map map = (Map)ik.a(a, obj);
        if (map == null)
        {
            return null;
        }
        obj1 = map.remove(obj1);
        if (map.isEmpty())
        {
            a.remove(obj);
        }
        return obj1;
    }

    public Map b()
    {
        lt lt2 = e;
        lt lt1 = lt2;
        if (lt2 == null)
        {
            lt1 = new lt(this);
            e = lt1;
        }
        return lt1;
    }

    public Map b(Object obj)
    {
        return new ln(this, obj);
    }

    public Set c()
    {
        ls ls2 = d;
        ls ls1 = ls2;
        if (ls2 == null)
        {
            ls1 = new ls(this);
            d = ls1;
        }
        return ls1;
    }

    public Set d()
    {
        lm lm2 = c;
        lm lm1 = lm2;
        if (lm2 == null)
        {
            lm1 = new lm(this, null);
            c = lm1;
        }
        return lm1;
    }

    public int e()
    {
        Iterator iterator = a.values().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Map)iterator.next()).size() + i) { }
        return i;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof lx)
        {
            obj = (lx)obj;
            return d().equals(((lx) (obj)).d());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return d().hashCode();
    }

    public String toString()
    {
        return b().toString();
    }
}
