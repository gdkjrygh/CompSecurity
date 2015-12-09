// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;
import ctx;
import ctz;
import cuj;
import cuk;
import cur;
import cvh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableEntry

public final class Maps
{

    private static ctx a;

    public static ImmutableMap a(Iterable iterable, ctv ctv1)
    {
        iterable = iterable.iterator();
        ctz.a(ctv1);
        cur cur1 = ImmutableMap.i();
        Object obj;
        for (; iterable.hasNext(); cur1.a(ctv1.a(obj), obj))
        {
            obj = iterable.next();
        }

        return cur1.a();
    }

    static ctv a()
    {
        return EntryFunction.a;
    }

    static cvh a(cvh cvh)
    {
        return new cvh(cvh) {

            private cvh a;

            public final boolean hasNext()
            {
                return a.hasNext();
            }

            public final Object next()
            {
                return ((java.util.Map.Entry)a.next()).getValue();
            }

            
            {
                a = cvh1;
                super();
            }
        };
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

    static String a(Map map)
    {
        StringBuilder stringbuilder = cuk.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    public static HashMap a(int i)
    {
        return new HashMap(b(i));
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new ImmutableEntry(obj, obj1);
    }

    static boolean a(Map map, Object obj)
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

    public static int b(int i)
    {
        if (i < 3)
        {
            cuj.a(i, "expectedSize");
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

    public static HashMap b()
    {
        return new HashMap();
    }

    static 
    {
        a = new ctx(cuk.a, "=", (byte)0);
    }

    private class EntryFunction extends Enum
        implements ctv
    {

        public static final EntryFunction a;
        private static EntryFunction b;
        private static final EntryFunction c[];

        public static EntryFunction valueOf(String s)
        {
            return (EntryFunction)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
        }

        public static EntryFunction[] values()
        {
            return (EntryFunction[])c.clone();
        }

        static 
        {
            a = new EntryFunction("KEY") {

                public final Object a(Object obj)
                {
                    return ((java.util.Map.Entry)obj).getKey();
                }

            };
            b = new EntryFunction("VALUE") {

                public final Object a(Object obj)
                {
                    return ((java.util.Map.Entry)obj).getValue();
                }

            };
            c = (new EntryFunction[] {
                a, b
            });
        }

        private EntryFunction(String s, int i)
        {
            super(s, i);
        }

        EntryFunction(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
