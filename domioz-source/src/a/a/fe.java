// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package a.a:
//            fo, eh, ew, er, 
//            fs, gh, fi, es, 
//            fz, fk, fm

public abstract class fe
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient fm b;
    private transient fm c;
    private transient es d;

    fe()
    {
    }

    public static fe a(Map map)
    {
        if ((map instanceof fe) && !(map instanceof fo))
        {
            fe fe1 = (fe)map;
            if (!fe1.e())
            {
                return fe1;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); eh.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            switch (map.size())
            {
            default:
                return new ew(map);

            case 0: // '\0'
                return er.g();

            case 1: // '\001'
                map = (java.util.Map.Entry)fs.a(map.entrySet());
                break;
            }
            return er.a(map.getKey(), map.getValue());
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new gh(map);

        case 0: // '\0'
            return er.g();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return er.a(map.getKey(), map.getValue());
    }

    fm a()
    {
        return new fi(this);
    }

    public fm b()
    {
        fm fm2 = b;
        fm fm1 = fm2;
        if (fm2 == null)
        {
            fm1 = c();
            b = fm1;
        }
        return fm1;
    }

    abstract fm c();

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

    public fm d()
    {
        fm fm2 = c;
        fm fm1 = fm2;
        if (fm2 == null)
        {
            fm1 = a();
            c = fm1;
        }
        return fm1;
    }

    abstract boolean e();

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return fz.a(this, obj);
    }

    public es f()
    {
        es es1 = d;
        Object obj = es1;
        if (es1 == null)
        {
            obj = new fk(this);
            d = ((es) (obj));
        }
        return ((es) (obj));
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
        return fz.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
