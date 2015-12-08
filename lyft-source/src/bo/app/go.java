// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package bo.app:
//            gy, fr, gg, gb, 
//            hc, hq, gs, gc, 
//            hj, gu, gw

public abstract class go
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient gw b;
    private transient gw c;
    private transient gc d;

    go()
    {
    }

    public static go a(Map map)
    {
        if ((map instanceof go) && !(map instanceof gy))
        {
            go go1 = (go)map;
            if (!go1.e())
            {
                return go1;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); fr.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            switch (map.size())
            {
            default:
                return new gg(map);

            case 0: // '\0'
                return gb.g();

            case 1: // '\001'
                map = (java.util.Map.Entry)hc.a(map.entrySet());
                break;
            }
            return gb.a(map.getKey(), map.getValue());
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new hq(map);

        case 0: // '\0'
            return gb.g();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return gb.a(map.getKey(), map.getValue());
    }

    gw a()
    {
        return new gs(this);
    }

    public gw b()
    {
        gw gw2 = b;
        gw gw1 = gw2;
        if (gw2 == null)
        {
            gw1 = c();
            b = gw1;
        }
        return gw1;
    }

    abstract gw c();

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return f().contains(obj);
    }

    public gw d()
    {
        gw gw2 = c;
        gw gw1 = gw2;
        if (gw2 == null)
        {
            gw1 = a();
            c = gw1;
        }
        return gw1;
    }

    abstract boolean e();

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return hj.a(this, obj);
    }

    public gc f()
    {
        gc gc1 = d;
        Object obj = gc1;
        if (gc1 == null)
        {
            obj = new gu(this);
            d = ((gc) (obj));
        }
        return ((gc) (obj));
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return d();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return hj.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
