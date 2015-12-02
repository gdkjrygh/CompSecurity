// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            dw, av, f, i, 
//            c, g, b

abstract class a extends dw
    implements av, Serializable
{

    private transient Map a;
    private transient a b;
    private transient Set c;
    private transient Set d;
    private transient Set e;

    private a(Map map, a a1)
    {
        a = map;
        b = a1;
    }

    a(Map map, a a1, b b1)
    {
        this(map, a1);
    }

    a(Map map, Map map1)
    {
        a(map, map1);
    }

    static Object a(a a1, Object obj)
    {
        return a1.a(obj);
    }

    private Object a(Object obj)
    {
        obj = a.remove(obj);
        b(obj);
        return obj;
    }

    private Object a(Object obj, Object obj1, boolean flag)
    {
        boolean flag1 = containsKey(obj);
        if (flag1 && Objects.equal(obj1, get(obj)))
        {
            return obj1;
        }
        Object obj2;
        if (flag)
        {
            b().remove(obj1);
        } else
        {
            if (!containsValue(obj1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "value already present: %s", new Object[] {
                obj1
            });
        }
        obj2 = a.put(obj, obj1);
        a(obj, flag1, obj2, obj1);
        return obj2;
    }

    static Map a(a a1)
    {
        return a1.a;
    }

    static void a(a a1, Object obj, boolean flag, Object obj1, Object obj2)
    {
        a1.a(obj, flag, obj1, obj2);
    }

    private void a(Object obj, boolean flag, Object obj1, Object obj2)
    {
        if (flag)
        {
            b(obj1);
        }
        b.a.put(obj2, obj);
    }

    static a b(a a1)
    {
        return a1.b;
    }

    static void b(a a1, Object obj)
    {
        a1.b(obj);
    }

    private void b(Object obj)
    {
        b.a.remove(obj);
    }

    protected Map a()
    {
        return a;
    }

    void a(Map map, Map map1)
    {
        boolean flag1 = true;
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (b == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkArgument(map1.isEmpty());
        if (map != map1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = map;
        b = new f(map1, this, null);
    }

    public av b()
    {
        return b;
    }

    protected Object c()
    {
        return a();
    }

    public void clear()
    {
        a.clear();
        b.a.clear();
    }

    public boolean containsValue(Object obj)
    {
        return b.containsKey(obj);
    }

    public Set d()
    {
        Set set = d;
        Object obj = set;
        if (set == null)
        {
            obj = new i(this, null);
            d = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Set entrySet()
    {
        Set set = e;
        Object obj = set;
        if (set == null)
        {
            obj = new c(this, null);
            e = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Set keySet()
    {
        Set set = c;
        Object obj = set;
        if (set == null)
        {
            obj = new g(this, null);
            c = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Object put(Object obj, Object obj1)
    {
        return a(obj, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object remove(Object obj)
    {
        if (containsKey(obj))
        {
            return a(obj);
        } else
        {
            return null;
        }
    }

    public Collection values()
    {
        return d();
    }
}
