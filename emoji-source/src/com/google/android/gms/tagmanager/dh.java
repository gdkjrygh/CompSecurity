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
//            dg, bh

class dh
{

    private static final Object ain = null;
    private static Long aio = new Long(0L);
    private static Double aip = new Double(0.0D);
    private static dg aiq = dg.z(0L);
    private static String air;
    private static Boolean ais = new Boolean(false);
    private static List ait = new ArrayList(0);
    private static Map aiu = new HashMap();
    private static com.google.android.gms.internal.d.a aiv;

    public static com.google.android.gms.internal.d.a cp(String s1)
    {
        com.google.android.gms.internal.d.a a = new com.google.android.gms.internal.d.a();
        a.type = 5;
        a.fS = s1;
        return a;
    }

    private static dg cq(String s1)
    {
        dg dg1;
        try
        {
            dg1 = dg.co(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            bh.A((new StringBuilder()).append("Failed to convert '").append(s1).append("' to a number.").toString());
            return aiq;
        }
        return dg1;
    }

    private static Long cr(String s1)
    {
        s1 = cq(s1);
        if (s1 == aiq)
        {
            return aio;
        } else
        {
            return Long.valueOf(s1.longValue());
        }
    }

    private static Double cs(String s1)
    {
        s1 = cq(s1);
        if (s1 == aiq)
        {
            return aip;
        } else
        {
            return Double.valueOf(s1.doubleValue());
        }
    }

    private static Boolean ct(String s1)
    {
        if ("true".equalsIgnoreCase(s1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s1))
        {
            return Boolean.FALSE;
        } else
        {
            return ais;
        }
    }

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            bh.A("getDouble received non-Number");
            return 0.0D;
        }
    }

    public static String j(com.google.android.gms.internal.d.a a)
    {
        return m(o(a));
    }

    public static dg k(com.google.android.gms.internal.d.a a)
    {
        return n(o(a));
    }

    public static Long l(com.google.android.gms.internal.d.a a)
    {
        return o(o(a));
    }

    public static Double m(com.google.android.gms.internal.d.a a)
    {
        return p(o(a));
    }

    public static String m(Object obj)
    {
        if (obj == null)
        {
            return air;
        } else
        {
            return obj.toString();
        }
    }

    public static Object mX()
    {
        return ain;
    }

    public static Long mY()
    {
        return aio;
    }

    public static Double mZ()
    {
        return aip;
    }

    public static dg n(Object obj)
    {
        if (obj instanceof dg)
        {
            return (dg)obj;
        }
        if (t(obj))
        {
            return dg.z(u(obj));
        }
        if (s(obj))
        {
            return dg.a(Double.valueOf(getDouble(obj)));
        } else
        {
            return cq(m(obj));
        }
    }

    public static Boolean n(com.google.android.gms.internal.d.a a)
    {
        return q(o(a));
    }

    public static Boolean na()
    {
        return ais;
    }

    public static dg nb()
    {
        return aiq;
    }

    public static String nc()
    {
        return air;
    }

    public static com.google.android.gms.internal.d.a nd()
    {
        return aiv;
    }

    public static Long o(Object obj)
    {
        if (t(obj))
        {
            return Long.valueOf(u(obj));
        } else
        {
            return cr(m(obj));
        }
    }

    public static Object o(com.google.android.gms.internal.d.a a)
    {
        boolean flag = false;
        int k1 = 0;
        int i = 0;
        if (a == null)
        {
            return ain;
        }
        switch (a.type)
        {
        default:
            bh.A((new StringBuilder()).append("Failed to convert a value of type: ").append(a.type).toString());
            return ain;

        case 1: // '\001'
            return a.fN;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(a.fO.length);
            a = a.fO;
            for (k1 = a.length; i < k1; i++)
            {
                Object obj = o(a[i]);
                if (obj == ain)
                {
                    return ain;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (a.fP.length != a.fQ.length)
            {
                bh.A((new StringBuilder()).append("Converting an invalid value to object: ").append(a.toString()).toString());
                return ain;
            }
            HashMap hashmap = new HashMap(a.fQ.length);
            for (int i1 = ((flag) ? 1 : 0); i1 < a.fP.length; i1++)
            {
                Object obj1 = o(a.fP[i1]);
                Object obj2 = o(a.fQ[i1]);
                if (obj1 == ain || obj2 == ain)
                {
                    return ain;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            bh.A("Trying to convert a macro reference to object");
            return ain;

        case 5: // '\005'
            bh.A("Trying to convert a function id to object");
            return ain;

        case 6: // '\006'
            return Long.valueOf(a.fT);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            a = a.fV;
            int l1 = a.length;
            for (int j1 = k1; j1 < l1; j1++)
            {
                String s1 = j(a[j1]);
                if (s1 == air)
                {
                    return ain;
                }
                stringbuffer.append(s1);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(a.fU);
        }
    }

    public static Double p(Object obj)
    {
        if (s(obj))
        {
            return Double.valueOf(getDouble(obj));
        } else
        {
            return cs(m(obj));
        }
    }

    public static Boolean q(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return ct(m(obj));
        }
    }

    public static com.google.android.gms.internal.d.a r(Object obj)
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
        a.fN = (String)obj;
_L4:
        a.fX = flag;
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
                com.google.android.gms.internal.d.a a1 = r(((Iterator) (obj1)).next());
                if (a1 == aiv)
                {
                    return aiv;
                }
                if (flag || a1.fX)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a1);
            }
            a.fO = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
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
                com.google.android.gms.internal.d.a a2 = r(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = r(((java.util.Map.Entry) (obj3)).getValue());
                if (a2 == aiv || obj3 == aiv)
                {
                    return aiv;
                }
                if (flag || a2.fX || ((com.google.android.gms.internal.d.a) (obj3)).fX)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((List) (obj)).add(a2);
                arraylist.add(obj3);
            }
            a.fP = (com.google.android.gms.internal.d.a[])((List) (obj)).toArray(new com.google.android.gms.internal.d.a[0]);
            a.fQ = (com.google.android.gms.internal.d.a[])arraylist.toArray(new com.google.android.gms.internal.d.a[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (s(obj))
        {
            a.type = 1;
            a.fN = obj.toString();
            continue; /* Loop/switch isn't completed */
        }
        if (t(obj))
        {
            a.type = 6;
            a.fT = u(obj);
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        a.type = 8;
        a.fU = ((Boolean)obj).booleanValue();
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Converting to Value from unknown object type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().toString();
        }
        bh.A(stringbuilder.append(((String) (obj))).toString());
        return aiv;
    }

    private static boolean s(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof dg) && ((dg)obj).mS();
    }

    private static boolean t(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof dg) && ((dg)obj).mT();
    }

    private static long u(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            bh.A("getInt64 received non-Number");
            return 0L;
        }
    }

    static 
    {
        air = new String("");
        aiv = r(air);
    }
}
