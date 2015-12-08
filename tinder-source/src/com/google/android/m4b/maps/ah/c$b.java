// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ah;

import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.aa.d;
import com.google.android.m4b.maps.aa.q;
import com.google.android.m4b.maps.y.j;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.ah:
//            c

public static abstract class <init>
{

    static final  a = new c.b() {

        final Class a(Object obj)
        {
            return com.google.android.m4b.maps.ah.c.c(((c)obj).a);
        }

        final Iterable b(Object obj)
        {
            obj = (c)obj;
            if (((c) (obj)).a instanceof TypeVariable)
            {
                return com.google.android.m4b.maps.ah.c.a(((TypeVariable)((c) (obj)).a).getBounds());
            }
            if (((c) (obj)).a instanceof WildcardType)
            {
                return com.google.android.m4b.maps.ah.c.a(((WildcardType)((c) (obj)).a).getUpperBounds());
            }
            com.google.android.m4b.maps.aa.ae.a a1 = ae.g();
            java.lang.reflect.Type atype[] = com.google.android.m4b.maps.ah.c.c(((c) (obj)).a).getGenericInterfaces();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                a1.c(((c) (obj)).a(atype[i]));
            }

            return a1.a();
        }

        final Object c(Object obj)
        {
            obj = (c)obj;
            if (((c) (obj)).a instanceof TypeVariable)
            {
                return com.google.android.m4b.maps.ah.c.b(((TypeVariable)((c) (obj)).a).getBounds()[0]);
            }
            if (((c) (obj)).a instanceof WildcardType)
            {
                return com.google.android.m4b.maps.ah.c.b(((WildcardType)((c) (obj)).a).getUpperBounds()[0]);
            }
            java.lang.reflect.Type type = com.google.android.m4b.maps.ah.c.c(((c) (obj)).a).getGenericSuperclass();
            if (type == null)
            {
                return null;
            } else
            {
                return ((c) (obj)).a(type);
            }
        }

    };
    public static final s b = new c.b() {

        final Class a(Object obj)
        {
            return (Class)obj;
        }

        final Iterable b(Object obj)
        {
            return Arrays.asList(((Class)obj).getInterfaces());
        }

        final Object c(Object obj)
        {
            return ((Class)obj).getSuperclass();
        }

    };

    private int a(Object obj, Map map)
    {
        Object obj1 = (Integer)map.get(this);
        if (obj1 != null)
        {
            return ((Integer) (obj1)).intValue();
        }
        int i;
        if (a(obj).isInterface())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        for (obj1 = b(obj).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            i = Math.max(i, a(((Iterator) (obj1)).next(), map));
        }

        obj1 = c(obj);
        int k = i;
        if (obj1 != null)
        {
            k = Math.max(i, a(obj1, map));
        }
        map.put(obj, Integer.valueOf(k + 1));
        return k + 1;
    }

    public final ae a(Iterable iterable)
    {
        java.util.HashMap hashmap = ax.b();
        for (iterable = iterable.iterator(); iterable.hasNext(); a(iterable.next(), ((Map) (hashmap)))) { }
        iterable = new q(q.b().a(), hashmap) {

            private Comparator a;
            private Map b;

            public final int compare(Object obj, Object obj1)
            {
                return a.compare(b.get(obj), b.get(obj1));
            }

            
            {
                a = comparator;
                b = map;
                super();
            }
        };
        Object aobj[] = (Object[])d.b(hashmap.keySet());
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            j.a(aobj[i]);
        }

        Arrays.sort(aobj, iterable);
        return ae.b(aobj);
    }

    abstract Class a(Object obj);

    abstract Iterable b(Object obj);

    abstract Object c(Object obj);


    private nit>()
    {
    }

    nit>(byte byte0)
    {
        this();
    }
}
