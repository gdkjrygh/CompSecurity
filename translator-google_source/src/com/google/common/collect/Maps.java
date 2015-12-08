// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.g;
import com.google.common.base.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ag, af, cz, bl, 
//            ImmutableEntry, ej

public final class Maps
{

    static final g a;

    static int a(int i)
    {
        if (i < 3)
        {
            af.a(i, "expectedSize");
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

    static d a()
    {
        return EntryFunction.KEY;
    }

    static ej a(ej ej)
    {
        return new cz(ej);
    }

    static Object a(java.util.Map.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return entry.getKey();
        }
    }

    static Object a(Map map, Object obj)
    {
        p.a(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = ag.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    static Iterator a(Iterator iterator)
    {
        return bl.a(iterator, EntryFunction.KEY);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new ImmutableEntry(obj, obj1);
    }

    static void a(Map map, Map map1)
    {
        java.util.Map.Entry entry;
        for (map1 = map1.entrySet().iterator(); map1.hasNext(); map.put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map1.next();
        }

    }

    public static HashMap b()
    {
        return new HashMap();
    }

    static Iterator b(Iterator iterator)
    {
        return bl.a(iterator, EntryFunction.VALUE);
    }

    static boolean b(Map map, Object obj)
    {
        p.a(map);
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
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object c(Map map, Object obj)
    {
        p.a(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static boolean d(Map map, Object obj)
    {
        return bl.a(bl.a(map.entrySet().iterator(), EntryFunction.KEY), obj);
    }

    static boolean e(Map map, Object obj)
    {
        return bl.a(bl.a(map.entrySet().iterator(), EntryFunction.VALUE), obj);
    }

    static boolean f(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    static 
    {
        a = new g(ag.a, "=");
    }

    private class EntryFunction extends Enum
        implements d
    {

        public static final EntryFunction KEY;
        public static final EntryFunction VALUE;
        private static final EntryFunction a[];

        public static EntryFunction valueOf(String s)
        {
            return (EntryFunction)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
        }

        public static EntryFunction[] values()
        {
            return (EntryFunction[])a.clone();
        }

        static 
        {
            class _cls1 extends EntryFunction
            {

                public final volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public final Object apply(java.util.Map.Entry entry)
                {
                    return entry.getKey();
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            KEY = new _cls1("KEY", 0);
            class _cls2 extends EntryFunction
            {

                public final volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public final Object apply(java.util.Map.Entry entry)
                {
                    return entry.getValue();
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            VALUE = new _cls2("VALUE", 1);
            a = (new EntryFunction[] {
                KEY, VALUE
            });
        }

        private EntryFunction(String s, int i)
        {
            super(s, i);
        }

        EntryFunction(String s, int i, cz cz1)
        {
            this(s, i);
        }
    }

}
