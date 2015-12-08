// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.c.a;
import com.google.a.q;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            l, m, n, o, 
//            p, q, r, h, 
//            i, j, g, k, 
//            ae

public final class f
{

    private final Map a;

    public f(Map map)
    {
        a = map;
    }

    private ae a(Class class1)
    {
        try
        {
            class1 = class1.getDeclaredConstructor(new Class[0]);
            if (!class1.isAccessible())
            {
                class1.setAccessible(true);
            }
            class1 = new l(this, class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    private ae a(Type type, Class class1)
    {
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (java/util/SortedSet.isAssignableFrom(class1))
            {
                return new m(this);
            }
            if (java/util/EnumSet.isAssignableFrom(class1))
            {
                return new n(this, type);
            }
            if (java/util/Set.isAssignableFrom(class1))
            {
                return new o(this);
            }
            if (java/util/Queue.isAssignableFrom(class1))
            {
                return new p(this);
            } else
            {
                return new com.google.a.b.q(this);
            }
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (java/util/SortedMap.isAssignableFrom(class1))
            {
                return new r(this);
            }
            if ((type instanceof ParameterizedType) && !java/lang/String.isAssignableFrom(com.google.a.c.a.a(((ParameterizedType)type).getActualTypeArguments()[0]).a()))
            {
                return new h(this);
            } else
            {
                return new i(this);
            }
        } else
        {
            return null;
        }
    }

    private ae b(Type type, Class class1)
    {
        return new j(this, class1, type);
    }

    public ae a(a a1)
    {
        Type type = a1.b();
        Class class1 = a1.a();
        a1 = (q)a.get(type);
        if (a1 != null)
        {
            a1 = new g(this, a1, type);
        } else
        {
            a1 = (q)a.get(class1);
            if (a1 != null)
            {
                return new k(this, a1, type);
            }
            ae ae = a(class1);
            a1 = ae;
            if (ae == null)
            {
                ae ae1 = a(type, class1);
                a1 = ae1;
                if (ae1 == null)
                {
                    return b(type, class1);
                }
            }
        }
        return a1;
    }

    public String toString()
    {
        return a.toString();
    }
}
