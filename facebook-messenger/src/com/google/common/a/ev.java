// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ks, jw, fp, ik, 
//            do, ew, fi, em

public abstract class ev
    implements Serializable, Map
{

    ev()
    {
    }

    public static ev a(Object obj, Object obj1)
    {
        return new ks(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1));
    }

    public static ev a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new jw(new java.util.Map.Entry[] {
            b(obj, obj1), b(obj2, obj3)
        });
    }

    public static ev a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new jw(new java.util.Map.Entry[] {
            b(obj, obj1), b(obj2, obj3), b(obj4, obj5)
        });
    }

    public static ev a(Map map)
    {
        int i = 0;
        if ((map instanceof ev) && !(map instanceof fp))
        {
            ev ev1 = (ev)map;
            if (!ev1.d())
            {
                return ev1;
            }
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[0]);
        switch (map.length)
        {
        default:
            for (; i < map.length; i++)
            {
                map[i] = b(map[i].getKey(), map[i].getValue());
            }

            break;

        case 0: // '\0'
            return j();

        case 1: // '\001'
            return new ks(b(map[0].getKey(), map[0].getValue()));
        }
        return new jw(map);
    }

    static java.util.Map.Entry b(Object obj, Object obj1)
    {
        return ik.a(Preconditions.checkNotNull(obj, "null key"), Preconditions.checkNotNull(obj1, "null value"));
    }

    public static ev j()
    {
        return do.a;
    }

    public static ew k()
    {
        return new ew();
    }

    public abstract fi a();

    public abstract em c();

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    abstract boolean d();

    public Set entrySet()
    {
        return a();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return a().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return a().hashCode();
    }

    public abstract fi i_();

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return i_();
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
        return ik.b(this);
    }

    public Collection values()
    {
        return c();
    }
}
