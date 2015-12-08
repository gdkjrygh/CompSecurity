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
//            gt, fm, gb, fw, 
//            gx, hl, gn, fx, 
//            he, gp, gr

public abstract class gj
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient gr b;
    private transient gr c;
    private transient fx d;

    gj()
    {
    }

    public static gj a(Map map)
    {
        if ((map instanceof gj) && !(map instanceof gt))
        {
            gj gj1 = (gj)map;
            if (!gj1.e())
            {
                return gj1;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); fm.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            switch (map.size())
            {
            default:
                return new gb(map);

            case 0: // '\0'
                return fw.g();

            case 1: // '\001'
                map = (java.util.Map.Entry)gx.a(map.entrySet());
                break;
            }
            return fw.a(map.getKey(), map.getValue());
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new hl(map);

        case 0: // '\0'
            return fw.g();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return fw.a(map.getKey(), map.getValue());
    }

    gr a()
    {
        return new gn(this);
    }

    public gr b()
    {
        gr gr2 = b;
        gr gr1 = gr2;
        if (gr2 == null)
        {
            gr1 = c();
            b = gr1;
        }
        return gr1;
    }

    abstract gr c();

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

    public gr d()
    {
        gr gr2 = c;
        gr gr1 = gr2;
        if (gr2 == null)
        {
            gr1 = a();
            c = gr1;
        }
        return gr1;
    }

    abstract boolean e();

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return he.a(this, obj);
    }

    public fx f()
    {
        fx fx1 = d;
        Object obj = fx1;
        if (fx1 == null)
        {
            obj = new gp(this);
            d = ((fx) (obj));
        }
        return ((fx) (obj));
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
        return he.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
