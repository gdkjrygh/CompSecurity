// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            cr, ay, al, y, 
//            aw, am, ca, bc, 
//            be, ba

public abstract class av
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient be b;
    private transient be c;
    private transient am d;

    av()
    {
    }

    public static av a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new cr(new ay[] {
            c(obj, obj1), c(obj2, obj3)
        });
    }

    public static av b(Object obj, Object obj1)
    {
        return al.a(obj, obj1);
    }

    static ay c(Object obj, Object obj1)
    {
        y.a(obj, obj1);
        return new ay(obj, obj1);
    }

    public static av g()
    {
        return al.e();
    }

    public static aw h()
    {
        return new aw();
    }

    public be b()
    {
        be be2 = b;
        be be1 = be2;
        if (be2 == null)
        {
            be1 = c();
            b = be1;
        }
        return be1;
    }

    abstract be c();

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

    public be d()
    {
        be be2 = c;
        be be1 = be2;
        if (be2 == null)
        {
            be1 = i();
            c = be1;
        }
        return be1;
    }

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return ca.d(this, obj);
    }

    public am f()
    {
        am am1 = d;
        Object obj = am1;
        if (am1 == null)
        {
            obj = new bc(this);
            d = ((am) (obj));
        }
        return ((am) (obj));
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    be i()
    {
        return new ba(this);
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
        return ca.a(this);
    }

    public Collection values()
    {
        return f();
    }

}
