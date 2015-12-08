// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ltw
{

    private static final Object a = null;
    private static Long b = new Long(0L);
    private static ltv c = ltv.a(0L);
    private static String d;
    private static Boolean e = new Boolean(false);
    private static ksp f;

    public static Object a()
    {
        return null;
    }

    public static String a(ksp ksp1)
    {
        return b(e(ksp1));
    }

    public static ksp a(Object obj)
    {
        ksp ksp1;
        boolean flag;
        flag = false;
        ksp1 = new ksp();
        if (obj instanceof ksp)
        {
            return (ksp)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        ksp1.c = 1;
        ksp1.d = (String)obj;
_L4:
        ksp1.n = flag;
        return ksp1;
_L2:
        if (obj instanceof List)
        {
            ksp1.c = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                ksp ksp2 = a(((Iterator) (obj1)).next());
                if (ksp2 == f)
                {
                    return f;
                }
                if (flag || ksp2.n)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(ksp2);
            }
            ksp1.e = (ksp[])((List) (obj)).toArray(new ksp[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            ksp1.c = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                ksp ksp3 = a(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = a(((java.util.Map.Entry) (obj3)).getValue());
                if (ksp3 == f || obj3 == f)
                {
                    return f;
                }
                if (flag || ksp3.n || ((ksp) (obj3)).n)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(ksp3);
                arraylist.add(obj3);
            }
            ksp1.f = (ksp[])((List) (obj)).toArray(new ksp[0]);
            ksp1.g = (ksp[])arraylist.toArray(new ksp[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (c(obj))
        {
            ksp1.c = 1;
            ksp1.d = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (d(obj))
        {
            ksp1.c = 6;
            ksp1.j = e(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        ksp1.c = 8;
        ksp1.k = ((Boolean)obj).booleanValue();
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
        lqh.a(stringbuilder.append(((String) (obj))).toString());
        return f;
    }

    private static ltv a(String s)
    {
        ltv ltv1;
        try
        {
            ltv1 = ltv.a(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            lqh.a((new StringBuilder("Failed to convert '")).append(s).append("' to a number.").toString());
            return c;
        }
        return ltv1;
    }

    public static Long b()
    {
        return b;
    }

    private static String b(Object obj)
    {
        if (obj == null)
        {
            return d;
        } else
        {
            return obj.toString();
        }
    }

    public static ltv b(ksp ksp1)
    {
        ksp1 = ((ksp) (e(ksp1)));
        if (ksp1 instanceof ltv)
        {
            return (ltv)ksp1;
        }
        if (d(ksp1))
        {
            return ltv.a(e(ksp1));
        }
        if (c(ksp1))
        {
            double d1;
            if (ksp1 instanceof Number)
            {
                d1 = ((Number)ksp1).doubleValue();
            } else
            {
                lqh.a("getDouble received non-Number");
                d1 = 0.0D;
            }
            return ltv.a(Double.valueOf(d1));
        } else
        {
            return a(b(ksp1));
        }
    }

    public static Boolean c()
    {
        return e;
    }

    public static Long c(ksp ksp1)
    {
        ksp1 = ((ksp) (e(ksp1)));
        if (d(ksp1))
        {
            return Long.valueOf(e(ksp1));
        }
        ksp1 = a(b(ksp1));
        if (ksp1 == c)
        {
            return b;
        } else
        {
            return Long.valueOf(ksp1.longValue());
        }
    }

    private static boolean c(Object obj)
    {
label0:
        {
            boolean flag2 = false;
            if (!(obj instanceof Double) && !(obj instanceof Float))
            {
                boolean flag1 = flag2;
                if (!(obj instanceof ltv))
                {
                    break label0;
                }
                boolean flag;
                if (!((ltv)obj).a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = flag2;
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public static Boolean d(ksp ksp1)
    {
        ksp1 = ((ksp) (e(ksp1)));
        if (ksp1 instanceof Boolean)
        {
            return (Boolean)ksp1;
        }
        ksp1 = b(ksp1);
        if ("true".equalsIgnoreCase(ksp1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(ksp1))
        {
            return Boolean.FALSE;
        } else
        {
            return e;
        }
    }

    public static ltv d()
    {
        return c;
    }

    private static boolean d(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof ltv) && ((ltv)obj).a;
    }

    private static long e(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            lqh.a("getInt64 received non-Number");
            return 0L;
        }
    }

    public static Object e(ksp ksp1)
    {
        boolean flag = false;
        int l = 0;
        int i = 0;
        if (ksp1 == null)
        {
            return null;
        }
        switch (ksp1.c)
        {
        default:
            lqh.a((new StringBuilder("Failed to convert a value of type: ")).append(ksp1.c).toString());
            return null;

        case 1: // '\001'
            return ksp1.d;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(ksp1.e.length);
            ksp1 = ksp1.e;
            for (l = ksp1.length; i < l; i++)
            {
                Object obj = e(ksp1[i]);
                if (obj == null)
                {
                    return null;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (ksp1.f.length != ksp1.g.length)
            {
                lqh.a((new StringBuilder("Converting an invalid value to object: ")).append(ksp1.toString()).toString());
                return null;
            }
            HashMap hashmap = new HashMap(ksp1.g.length);
            for (int j = ((flag) ? 1 : 0); j < ksp1.f.length; j++)
            {
                Object obj1 = e(ksp1.f[j]);
                Object obj2 = e(ksp1.g[j]);
                if (obj1 == null || obj2 == null)
                {
                    return null;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            lqh.a("Trying to convert a macro reference to object");
            return null;

        case 5: // '\005'
            lqh.a("Trying to convert a function id to object");
            return null;

        case 6: // '\006'
            return Long.valueOf(ksp1.j);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            ksp1 = ksp1.l;
            int i1 = ksp1.length;
            for (int k = l; k < i1; k++)
            {
                String s = a(ksp1[k]);
                if (s == d)
                {
                    return null;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(ksp1.k);
        }
    }

    public static String e()
    {
        return d;
    }

    public static ksp f()
    {
        return f;
    }

    static 
    {
        new Double(0.0D);
        d = new String("");
        new ArrayList(0);
        new HashMap();
        f = a(d);
    }
}
