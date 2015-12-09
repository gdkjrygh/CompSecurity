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
//            dd, bg

final class de
{

    private static final Object aQr = null;
    private static Long aQs = new Long(0L);
    private static Double aQt = new Double(0.0D);
    private static dd aQu = dd.D(0L);
    private static String aQv;
    private static Boolean aQw = new Boolean(false);
    private static List aQx = new ArrayList(0);
    private static Map aQy = new HashMap();
    private static com.google.android.gms.internal.d.a aQz;

    public static com.google.android.gms.internal.d.a A(Object obj)
    {
        com.google.android.gms.internal.d.a a;
        boolean flag;
        flag = false;
        a = new com.google.android.gms.internal.d.a();
        if (obj instanceof com.google.android.gms.internal.d.a)
        {
            return (com.google.android.gms.internal.d.a)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        a.type = 1;
        a.gu = (String)obj;
_L4:
        a.gE = flag;
        return a;
_L2:
        if (obj instanceof List)
        {
            a.type = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                com.google.android.gms.internal.d.a a1 = A(((Iterator) (obj1)).next());
                if (a1 == aQz)
                {
                    return aQz;
                }
                if (flag || a1.gE)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a1);
            }
            a.gv = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            a.type = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                com.google.android.gms.internal.d.a a2 = A(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = A(((java.util.Map.Entry) (obj3)).getValue());
                if (a2 == aQz || obj3 == aQz)
                {
                    return aQz;
                }
                if (flag || a2.gE || ((com.google.android.gms.internal.d.a) (obj3)).gE)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a2);
                arraylist.add(obj3);
            }
            a.gw = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
            a.gx = (com.google.android.gms.internal.d.a[])arraylist.toArray(new com.google.android.gms.internal.d.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (B(obj))
        {
            a.type = 1;
            a.gu = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (C(obj))
        {
            a.type = 6;
            a.gA = D(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        a.type = 8;
        a.gB = ((Boolean)obj).booleanValue();
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
        bg.e(stringbuilder.append(((String) (obj))).toString());
        return aQz;
    }

    private static boolean B(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof dd) && ((dd)obj).ua();
    }

    private static boolean C(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof dd) && ((dd)obj).ub();
    }

    private static long D(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            bg.e("getInt64 received non-Number");
            return 0L;
        }
    }

    private static Boolean ed(String s)
    {
        if ("true".equalsIgnoreCase(s))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s))
        {
            return Boolean.FALSE;
        } else
        {
            return aQw;
        }
    }

    public static String j(com.google.android.gms.internal.d.a a)
    {
        return v(o(a));
    }

    public static Boolean n(com.google.android.gms.internal.d.a a)
    {
        return z(o(a));
    }

    public static Object o(com.google.android.gms.internal.d.a a)
    {
        boolean flag = false;
        int i1 = 0;
        int i = 0;
        if (a == null)
        {
            return aQr;
        }
        switch (a.type)
        {
        default:
            bg.e((new StringBuilder("Failed to convert a value of type: ")).append(a.type).toString());
            return aQr;

        case 1: // '\001'
            return a.gu;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(a.gv.length);
            a = a.gv;
            for (i1 = a.length; i < i1; i++)
            {
                Object obj = o(a[i]);
                if (obj == aQr)
                {
                    return aQr;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (a.gw.length != a.gx.length)
            {
                bg.e((new StringBuilder("Converting an invalid value to object: ")).append(a.toString()).toString());
                return aQr;
            }
            HashMap hashmap = new HashMap(a.gx.length);
            for (int k = ((flag) ? 1 : 0); k < a.gw.length; k++)
            {
                Object obj1 = o(a.gw[k]);
                Object obj2 = o(a.gx[k]);
                if (obj1 == aQr || obj2 == aQr)
                {
                    return aQr;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            bg.e("Trying to convert a macro reference to object");
            return aQr;

        case 5: // '\005'
            bg.e("Trying to convert a function id to object");
            return aQr;

        case 6: // '\006'
            return Long.valueOf(a.gA);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            a = a.gC;
            int j1 = a.length;
            for (int l = i1; l < j1; l++)
            {
                String s = j(a[l]);
                if (s == aQv)
                {
                    return aQr;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(a.gB);
        }
    }

    public static com.google.android.gms.internal.d.a ul()
    {
        return aQz;
    }

    private static String v(Object obj)
    {
        if (obj == null)
        {
            return aQv;
        } else
        {
            return obj.toString();
        }
    }

    private static Boolean z(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return ed(v(obj));
        }
    }

    static 
    {
        aQv = new String("");
        aQz = A(aQv);
    }
}
