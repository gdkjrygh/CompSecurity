// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.c.a;
import com.google.b.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.b.b:
//            l, g, k, m, 
//            j, n, o, p, 
//            q, r, h, i, 
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

    public final ae a(a a1)
    {
        java.lang.reflect.Type type = a1.getType();
        Class class1 = a1.getRawType();
        a1 = (s)a.get(type);
        Object obj;
        if (a1 != null)
        {
            obj = new g(this, a1, type);
        } else
        {
            a1 = (s)a.get(class1);
            if (a1 != null)
            {
                return new k(this, a1, type);
            }
            a1 = a(class1);
            obj = a1;
            if (a1 == null)
            {
                if (java/util/Collection.isAssignableFrom(class1))
                {
                    if (java/util/SortedSet.isAssignableFrom(class1))
                    {
                        a1 = new m(this);
                    } else
                    if (java/util/EnumSet.isAssignableFrom(class1))
                    {
                        a1 = new n(this, type);
                    } else
                    if (java/util/Set.isAssignableFrom(class1))
                    {
                        a1 = new o(this);
                    } else
                    if (java/util/Queue.isAssignableFrom(class1))
                    {
                        a1 = new p(this);
                    } else
                    {
                        a1 = new q(this);
                    }
                } else
                if (java/util/Map.isAssignableFrom(class1))
                {
                    if (java/util/SortedMap.isAssignableFrom(class1))
                    {
                        a1 = new r(this);
                    } else
                    if ((type instanceof ParameterizedType) && !java/lang/String.isAssignableFrom(com.google.b.c.a.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
                    {
                        a1 = new h(this);
                    } else
                    {
                        a1 = new i(this);
                    }
                } else
                {
                    a1 = null;
                }
                obj = a1;
                if (a1 == null)
                {
                    return new j(this, class1, type);
                }
            }
        }
        return ((ae) (obj));
    }

    public final String toString()
    {
        return a.toString();
    }
}
