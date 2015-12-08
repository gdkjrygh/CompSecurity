// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.c.a;
import com.google.a.t;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            h, g, i, n, 
//            j, k, l, m, 
//            s

public final class f
{

    private final Map a;

    public f()
    {
        this(Collections.emptyMap());
    }

    public f(Map map)
    {
        a = map;
    }

    private s a(Class class1)
    {
        try
        {
            class1 = class1.getDeclaredConstructor(new Class[0]);
            if (!class1.isAccessible())
            {
                class1.setAccessible(true);
            }
            class1 = new h(this, class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public final s a(a a1)
    {
        java.lang.reflect.Type type = a1.b();
        Class class1 = a1.a();
        a1 = (t)a.get(type);
        Object obj;
        if (a1 != null)
        {
            obj = new g(this, a1, type);
        } else
        {
            a1 = a(class1);
            obj = a1;
            if (a1 == null)
            {
                if (java/util/Collection.isAssignableFrom(class1))
                {
                    if (java/util/SortedSet.isAssignableFrom(class1))
                    {
                        a1 = new i(this);
                    } else
                    if (java/util/Set.isAssignableFrom(class1))
                    {
                        a1 = new j(this);
                    } else
                    if (java/util/Queue.isAssignableFrom(class1))
                    {
                        a1 = new k(this);
                    } else
                    {
                        a1 = new l(this);
                    }
                } else
                if (java/util/Map.isAssignableFrom(class1))
                {
                    a1 = new m(this);
                } else
                {
                    a1 = null;
                }
                obj = a1;
                if (a1 == null)
                {
                    return new n(this, class1, type);
                }
            }
        }
        return ((s) (obj));
    }

    public final String toString()
    {
        return a.toString();
    }
}
