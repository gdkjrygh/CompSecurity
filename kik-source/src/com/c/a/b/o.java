// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.a.b:
//            j, d, k, ac, 
//            t, v, r, ae, 
//            ah

public abstract class o
    implements Serializable, Map
{
    public static final class a
    {

        p.a a[];
        int b;

        public final a a(Object obj, Object obj1)
        {
            int l = b + 1;
            if (l > a.length)
            {
                a = (p.a[])ae.b(a, k.b.a(a.length, l));
            }
            obj = o.c(obj, obj1);
            obj1 = a;
            l = b;
            b = l + 1;
            obj1[l] = obj;
            return this;
        }

        public final o a()
        {
            switch (b)
            {
            default:
                return new ah(b, a);

            case 0: // '\0'
                return o.g();

            case 1: // '\001'
                return o.b(a[0].getKey(), a[0].getValue());
            }
        }

        public a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            a = new p.a[4];
            b = 0;
        }
    }


    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient v b;
    private transient v c;
    private transient k d;

    o()
    {
    }

    public static o b(Object obj, Object obj1)
    {
        return j.a(obj, obj1);
    }

    static p.a c(Object obj, Object obj1)
    {
        com.c.a.b.d.a(obj, obj1);
        return new p.a(obj, obj1);
    }

    public static o g()
    {
        return j.e();
    }

    public static a h()
    {
        return new a();
    }

    public v b()
    {
        v v2 = b;
        v v1 = v2;
        if (v2 == null)
        {
            v1 = c();
            b = v1;
        }
        return v1;
    }

    abstract v c();

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

    public v d()
    {
        v v2 = c;
        v v1 = v2;
        if (v2 == null)
        {
            v1 = i();
            c = v1;
        }
        return v1;
    }

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return ac.a(this, obj);
    }

    public k f()
    {
        k k1 = d;
        Object obj = k1;
        if (k1 == null)
        {
            obj = new t(this);
            d = ((k) (obj));
        }
        return ((k) (obj));
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    v i()
    {
        return new r(this);
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
        return ac.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
