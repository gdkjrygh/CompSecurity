// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.bl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bd, y

public final class be
{

    private static final Object a = null;
    private static Long b = new Long(0L);
    private static Double c = new Double(0.0D);
    private static bd d = bd.a();
    private static String e;
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static bl i;

    public static bl a()
    {
        return i;
    }

    public static bl a(Object obj)
    {
        bl bl1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        bl1 = new bl();
        if (obj instanceof bl)
        {
            return (bl)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        bl1.a = 1;
        bl1.b = (String)obj;
_L4:
        bl1.l = flag2;
        return bl1;
_L2:
        if (obj instanceof List)
        {
            bl1.a = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag2 = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                bl bl2 = a(((Iterator) (obj1)).next());
                if (bl2 == i)
                {
                    return i;
                }
                if (flag2 || bl2.l)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                ((List) (obj)).add(bl2);
            }
            bl1.c = (bl[])((List) (obj)).toArray(new bl[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            bl1.a = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag2 = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                bl bl3 = a(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = a(((java.util.Map.Entry) (obj3)).getValue());
                if (bl3 == i || obj3 == i)
                {
                    return i;
                }
                if (flag2 || bl3.l || ((bl) (obj3)).l)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                ((List) (obj)).add(bl3);
                arraylist.add(obj3);
            }
            bl1.d = (bl[])((List) (obj)).toArray(new bl[0]);
            bl1.e = (bl[])arraylist.toArray(new bl[0]);
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof bd) && ((bd)obj).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            bl1.a = 1;
            bl1.b = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!(obj instanceof Byte))
        {
            flag = flag1;
            if (!(obj instanceof Short))
            {
                flag = flag1;
                if (!(obj instanceof Integer))
                {
                    flag = flag1;
                    if (!(obj instanceof Long))
                    {
                        if ((obj instanceof bd) && ((bd)obj).c())
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
        }
        if (flag)
        {
            bl1.a = 6;
            long l;
            if (obj instanceof Number)
            {
                l = ((Number)obj).longValue();
            } else
            {
                y.a("getInt64 received non-Number");
                l = 0L;
            }
            bl1.h = l;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        bl1.a = 8;
        bl1.i = ((Boolean)obj).booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = new StringBuilder("Converting to Value from unknown object type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().toString();
        }
        y.a(stringbuilder.append(((String) (obj))).toString());
        return i;
    }

    public static String a(bl bl1)
    {
        return b(c(bl1));
    }

    public static Boolean b(bl bl1)
    {
        bl1 = ((bl) (c(bl1)));
        if (bl1 instanceof Boolean)
        {
            return (Boolean)bl1;
        }
        bl1 = b(bl1);
        if ("true".equalsIgnoreCase(bl1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(bl1))
        {
            return Boolean.FALSE;
        } else
        {
            return f;
        }
    }

    private static String b(Object obj)
    {
        if (obj == null)
        {
            return e;
        } else
        {
            return obj.toString();
        }
    }

    public static Object c(bl bl1)
    {
        boolean flag = false;
        int i1 = 0;
        int j = 0;
        if (bl1 == null)
        {
            return a;
        }
        switch (bl1.a)
        {
        default:
            y.a((new StringBuilder("Failed to convert a value of type: ")).append(bl1.a).toString());
            return a;

        case 1: // '\001'
            return bl1.b;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(bl1.c.length);
            bl1 = bl1.c;
            for (i1 = bl1.length; j < i1; j++)
            {
                Object obj = c(bl1[j]);
                if (obj == a)
                {
                    return a;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (bl1.d.length != bl1.e.length)
            {
                y.a((new StringBuilder("Converting an invalid value to object: ")).append(bl1.toString()).toString());
                return a;
            }
            HashMap hashmap = new HashMap(bl1.e.length);
            for (int k = ((flag) ? 1 : 0); k < bl1.d.length; k++)
            {
                Object obj1 = c(bl1.d[k]);
                Object obj2 = c(bl1.e[k]);
                if (obj1 == a || obj2 == a)
                {
                    return a;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            y.a("Trying to convert a macro reference to object");
            return a;

        case 5: // '\005'
            y.a("Trying to convert a function id to object");
            return a;

        case 6: // '\006'
            return Long.valueOf(bl1.h);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            bl1 = bl1.j;
            int j1 = bl1.length;
            for (int l = i1; l < j1; l++)
            {
                String s = a(bl1[l]);
                if (s == e)
                {
                    return a;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(bl1.i);
        }
    }

    static 
    {
        e = new String("");
        i = a(e);
    }
}
