// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ck, ak

public final class cl
{

    private static final Object a = null;
    private static Long b = new Long(0L);
    private static Double c = new Double(0.0D);
    private static ck d = ck.a(0L);
    private static String e;
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static com.google.android.gms.internal.h.a i;

    public static com.google.android.gms.internal.h.a a(Object obj)
    {
        com.google.android.gms.internal.h.a a1;
        boolean flag;
        flag = false;
        a1 = new com.google.android.gms.internal.h.a();
        if (obj instanceof com.google.android.gms.internal.h.a)
        {
            return (com.google.android.gms.internal.h.a)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a1.a = 1;
        a1.b = (String)obj;
_L4:
        a1.l = flag;
        return a1;
_L2:
        if (obj instanceof List)
        {
            a1.a = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                com.google.android.gms.internal.h.a a2 = a(((Iterator) (obj1)).next());
                if (a2 == i)
                {
                    return i;
                }
                if (flag || a2.l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a2);
            }
            a1.c = (com.google.android.gms.internal.h.a[])((List) (obj)).toArray(new com.google.android.gms.internal.h.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            a1.a = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                com.google.android.gms.internal.h.a a3 = a(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = a(((java.util.Map.Entry) (obj3)).getValue());
                if (a3 == i || obj3 == i)
                {
                    return i;
                }
                if (flag || a3.l || ((com.google.android.gms.internal.h.a) (obj3)).l)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a3);
                arraylist.add(obj3);
            }
            a1.d = (com.google.android.gms.internal.h.a[])((List) (obj)).toArray(new com.google.android.gms.internal.h.a[0]);
            a1.e = (com.google.android.gms.internal.h.a[])arraylist.toArray(new com.google.android.gms.internal.h.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (c(obj))
        {
            a1.a = 1;
            a1.b = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (d(obj))
        {
            a1.a = 6;
            a1.h = e(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        a1.a = 8;
        a1.i = ((Boolean)obj).booleanValue();
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
        ak.a(stringbuilder.append(((String) (obj))).toString());
        return i;
    }

    private static ck a(String s)
    {
        ck ck1;
        try
        {
            ck1 = ck.a(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            ak.a((new StringBuilder("Failed to convert '")).append(s).append("' to a number.").toString());
            return d;
        }
        return ck1;
    }

    public static Object a()
    {
        return a;
    }

    public static String a(com.google.android.gms.internal.h.a a1)
    {
        return b(e(a1));
    }

    public static ck b(com.google.android.gms.internal.h.a a1)
    {
        a1 = ((com.google.android.gms.internal.h.a) (e(a1)));
        if (a1 instanceof ck)
        {
            return (ck)a1;
        }
        if (d(a1))
        {
            return ck.a(e(a1));
        }
        if (c(a1))
        {
            double d1;
            if (a1 instanceof Number)
            {
                d1 = ((Number)a1).doubleValue();
            } else
            {
                ak.a("getDouble received non-Number");
                d1 = 0.0D;
            }
            return ck.a(Double.valueOf(d1));
        } else
        {
            return a(b(a1));
        }
    }

    public static Long b()
    {
        return b;
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

    public static Boolean c()
    {
        return f;
    }

    public static Long c(com.google.android.gms.internal.h.a a1)
    {
        a1 = ((com.google.android.gms.internal.h.a) (e(a1)));
        if (d(a1))
        {
            return Long.valueOf(e(a1));
        }
        a1 = a(b(a1));
        if (a1 == d)
        {
            return b;
        } else
        {
            return Long.valueOf(a1.longValue());
        }
    }

    private static boolean c(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof ck) && ((ck)obj).a();
    }

    public static ck d()
    {
        return d;
    }

    public static Boolean d(com.google.android.gms.internal.h.a a1)
    {
        a1 = ((com.google.android.gms.internal.h.a) (e(a1)));
        if (a1 instanceof Boolean)
        {
            return (Boolean)a1;
        }
        a1 = b(a1);
        if ("true".equalsIgnoreCase(a1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(a1))
        {
            return Boolean.FALSE;
        } else
        {
            return f;
        }
    }

    private static boolean d(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof ck) && ((ck)obj).b();
    }

    private static long e(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            ak.a("getInt64 received non-Number");
            return 0L;
        }
    }

    public static Object e(com.google.android.gms.internal.h.a a1)
    {
        boolean flag = false;
        int i1 = 0;
        int j = 0;
        if (a1 == null)
        {
            return a;
        }
        switch (a1.a)
        {
        default:
            ak.a((new StringBuilder("Failed to convert a value of type: ")).append(a1.a).toString());
            return a;

        case 1: // '\001'
            return a1.b;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(a1.c.length);
            a1 = a1.c;
            for (i1 = a1.length; j < i1; j++)
            {
                Object obj = e(a1[j]);
                if (obj == a)
                {
                    return a;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (a1.d.length != a1.e.length)
            {
                ak.a((new StringBuilder("Converting an invalid value to object: ")).append(a1.toString()).toString());
                return a;
            }
            HashMap hashmap = new HashMap(a1.e.length);
            for (int k = ((flag) ? 1 : 0); k < a1.d.length; k++)
            {
                Object obj1 = e(a1.d[k]);
                Object obj2 = e(a1.e[k]);
                if (obj1 == a || obj2 == a)
                {
                    return a;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            ak.a("Trying to convert a macro reference to object");
            return a;

        case 5: // '\005'
            ak.a("Trying to convert a function id to object");
            return a;

        case 6: // '\006'
            return Long.valueOf(a1.h);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            a1 = a1.j;
            int j1 = a1.length;
            for (int l = i1; l < j1; l++)
            {
                String s = a(a1[l]);
                if (s == e)
                {
                    return a;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(a1.i);
        }
    }

    public static String e()
    {
        return e;
    }

    public static com.google.android.gms.internal.h.a f()
    {
        return i;
    }

    static 
    {
        e = new String("");
        i = a(e);
    }
}
