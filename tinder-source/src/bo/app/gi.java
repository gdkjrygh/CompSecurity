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
//            gs, fl, ga, fv, 
//            gw, hk, gm, fw, 
//            hd, go, gq

public abstract class gi
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient gq b;
    private transient gq c;
    private transient fw d;

    gi()
    {
    }

    public static gi a(Map map)
    {
        if ((map instanceof gi) && !(map instanceof gs))
        {
            gi gi1 = (gi)map;
            if (!gi1.e())
            {
                return gi1;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); fl.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            switch (map.size())
            {
            default:
                return new ga(map);

            case 0: // '\0'
                return fv.g();

            case 1: // '\001'
                map = (java.util.Map.Entry)gw.a(map.entrySet());
                break;
            }
            return fv.a(map.getKey(), map.getValue());
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new hk(map);

        case 0: // '\0'
            return fv.g();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return fv.a(map.getKey(), map.getValue());
    }

    gq a()
    {
        return new gm(this);
    }

    public gq b()
    {
        gq gq2 = b;
        gq gq1 = gq2;
        if (gq2 == null)
        {
            gq1 = c();
            b = gq1;
        }
        return gq1;
    }

    abstract gq c();

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

    public gq d()
    {
        gq gq2 = c;
        gq gq1 = gq2;
        if (gq2 == null)
        {
            gq1 = a();
            c = gq1;
        }
        return gq1;
    }

    abstract boolean e();

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return hd.a(this, obj);
    }

    public fw f()
    {
        fw fw1 = d;
        Object obj = fw1;
        if (fw1 == null)
        {
            obj = new go(this);
            d = ((fw) (obj));
        }
        return ((fw) (obj));
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
        return hd.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
