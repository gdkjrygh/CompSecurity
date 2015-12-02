// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.a:
//            ax, it, is, eq, 
//            il, hy, hw

public final class ik
{

    static final com.google.common.base.Joiner.MapJoiner a;

    private ik()
    {
    }

    public static hw a(Map map, Map map1)
    {
        return a(map, map1, Equivalences.equals());
    }

    public static hw a(Map map, Map map1, Equivalence equivalence)
    {
        boolean flag1 = true;
        Preconditions.checkNotNull(equivalence);
        HashMap hashmap = a();
        HashMap hashmap1 = new HashMap(map1);
        HashMap hashmap2 = a();
        HashMap hashmap3 = a();
        map = map.entrySet().iterator();
        boolean flag = true;
        while (map.hasNext()) 
        {
            Object obj1 = (java.util.Map.Entry)map.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            if (map1.containsKey(obj))
            {
                Object obj2 = hashmap1.remove(obj);
                if (equivalence.equivalent(obj1, obj2))
                {
                    hashmap2.put(obj, obj1);
                } else
                {
                    hashmap3.put(obj, it.a(obj1, obj2));
                    flag = false;
                }
            } else
            {
                hashmap.put(obj, obj1);
                flag = false;
            }
        }
        if (!flag || !hashmap1.isEmpty())
        {
            flag1 = false;
        }
        return a(flag1, ((Map) (hashmap)), ((Map) (hashmap1)), ((Map) (hashmap2)), ((Map) (hashmap3)));
    }

    private static hw a(boolean flag, Map map, Map map1, Map map2, Map map3)
    {
        return new is(flag, Collections.unmodifiableMap(map), Collections.unmodifiableMap(map1), Collections.unmodifiableMap(map2), Collections.unmodifiableMap(map3));
    }

    static Object a(Map map, Object obj)
    {
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    public static HashMap a()
    {
        return new HashMap();
    }

    public static HashMap a(int i)
    {
        return new HashMap(b(i));
    }

    public static HashMap a(Map map)
    {
        return new HashMap(map);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new eq(obj, obj1);
    }

    static java.util.Map.Entry a(java.util.Map.Entry entry)
    {
        Preconditions.checkNotNull(entry);
        return new il(entry);
    }

    public static TreeMap a(SortedMap sortedmap)
    {
        return new TreeMap(sortedmap);
    }

    static boolean a(Collection collection, Object obj)
    {
        if (!(obj instanceof java.util.Map.Entry))
        {
            return false;
        } else
        {
            return collection.contains(a((java.util.Map.Entry)obj));
        }
    }

    static int b(int i)
    {
        if (i < 3)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static String b(Map map)
    {
        StringBuilder stringbuilder = ax.a(map.size()).append('{');
        a.appendTo(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static LinkedHashMap b()
    {
        return new LinkedHashMap();
    }

    static boolean b(Map map, Object obj)
    {
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    public static ConcurrentMap c()
    {
        return (new hy()).n();
    }

    public static TreeMap d()
    {
        return new TreeMap();
    }

    static 
    {
        a = ax.a.withKeyValueSeparator("=");
    }
}
