// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            z, ao, bb, ac, 
//            bh, ai, aa, ax, 
//            aj, al, j

public abstract class af
    implements Serializable, Map
{
    public static class a
    {

        ag.a a[];
        int b;

        private void a(int i)
        {
            if (i > a.length)
            {
                a = (ag.a[])j.b(a, aa.b.a(a.length, i));
            }
        }

        public a a(Object obj, Object obj1)
        {
            a(b + 1);
            obj = af.b(obj, obj1);
            obj1 = a;
            int i = b;
            b = i + 1;
            obj1[i] = obj;
            return this;
        }

        public a a(java.util.Map.Entry entry)
        {
            return a(entry.getKey(), entry.getValue());
        }

        public a a(Map map)
        {
            a(b + map.size());
            for (map = map.entrySet().iterator(); map.hasNext(); a((java.util.Map.Entry)map.next())) { }
            return this;
        }

        public af a()
        {
            switch (b)
            {
            default:
                return new bh(b, a);

            case 0: // '\0'
                return af.d();

            case 1: // '\001'
                return af.a(a[0].getKey(), a[0].getValue());
            }
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            a = new ag.a[4];
            b = 0;
        }
    }

    static class b
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object a[];
        private final Object b[];

        final Object a(a a1)
        {
            for (int i = 0; i < a.length; i++)
            {
                a1.a(a[i], b[i]);
            }

            return a1.a();
        }

        Object readResolve()
        {
            return a(new a());
        }

        b(af af1)
        {
            a = new Object[af1.size()];
            b = new Object[af1.size()];
            af1 = af1.f().iterator();
            for (int i = 0; af1.hasNext(); i++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)af1.next();
                a[i] = entry.getKey();
                b[i] = entry.getValue();
            }

        }
    }


    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient al b;
    private transient al c;
    private transient aa d;

    af()
    {
    }

    public static af a(Object obj, Object obj1)
    {
        return z.c(obj, obj1);
    }

    public static af a(Map map)
    {
        if ((map instanceof af) && !(map instanceof ao))
        {
            af af1 = (af)map;
            if (!af1.c())
            {
                return af1;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); bb.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            return ac.a(map);
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new bh(map);

        case 0: // '\0'
            return z.j();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return z.c(map.getKey(), map.getValue());
    }

    static void a(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    static ag.a b(Object obj, Object obj1)
    {
        bb.a(obj, obj1);
        return new ag.a(obj, obj1);
    }

    public static af d()
    {
        return z.j();
    }

    public static a e()
    {
        return new a();
    }

    al a()
    {
        return new ai(this);
    }

    abstract al b();

    abstract boolean c();

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
        return h().contains(obj);
    }

    public Set entrySet()
    {
        return f();
    }

    public boolean equals(Object obj)
    {
        return ax.d(this, obj);
    }

    public al f()
    {
        al al2 = b;
        al al1 = al2;
        if (al2 == null)
        {
            al1 = b();
            b = al1;
        }
        return al1;
    }

    public al g()
    {
        al al2 = c;
        al al1 = al2;
        if (al2 == null)
        {
            al1 = a();
            c = al1;
        }
        return al1;
    }

    public abstract Object get(Object obj);

    public aa h()
    {
        aa aa1 = d;
        Object obj = aa1;
        if (aa1 == null)
        {
            obj = new aj(this);
            d = ((aa) (obj));
        }
        return ((aa) (obj));
    }

    public int hashCode()
    {
        return f().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return g();
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
        return ax.b(this);
    }

    public Collection values()
    {
        return h();
    }

    Object writeReplace()
    {
        return new b(this);
    }

}
