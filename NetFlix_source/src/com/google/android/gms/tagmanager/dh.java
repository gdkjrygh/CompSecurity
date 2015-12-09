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

    private static final Object aaF = null;
    private static Long aaG = new Long(0L);
    private static Double aaH = new Double(0.0D);
    private static dg aaI = dg.w(0L);
    private static String aaJ;
    private static Boolean aaK = new Boolean(false);
    private static List aaL = new ArrayList(0);
    private static Map aaM = new HashMap();
    private static com.google.android.gms.internal.d.a aaN;

    public static com.google.android.gms.internal.d.a bX(String s1)
    {
        com.google.android.gms.internal.d.a a = new com.google.android.gms.internal.d.a();
        a.type = 5;
        a.fS = s1;
        return a;
    }

    private static dg bY(String s1)
    {
        dg dg1;
        try
        {
            dg1 = dg.bW(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            bh.w((new StringBuilder()).append("Failed to convert '").append(s1).append("' to a number.").toString());
            return aaI;
        }
        return dg1;
    }

    private static Long bZ(String s1)
    {
        s1 = bY(s1);
        if (s1 == aaI)
        {
            return aaG;
        } else
        {
            return Long.valueOf(s1.longValue());
        }
    }

    private static Double ca(String s1)
    {
        s1 = bY(s1);
        if (s1 == aaI)
        {
            return aaH;
        } else
        {
            return Double.valueOf(s1.doubleValue());
        }
    }

    private static Boolean cb(String s1)
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
            return aaK;
        }
    }

    private static double getDouble(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            bh.w("getDouble received non-Number");
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

    public static Object lN()
    {
        return aaF;
    }

    public static Long lO()
    {
        return aaG;
    }

    public static Double lP()
    {
        return aaH;
    }

    public static Boolean lQ()
    {
        return aaK;
    }

    public static dg lR()
    {
        return aaI;
    }

    public static String lS()
    {
        return aaJ;
    }

    public static com.google.android.gms.internal.d.a lT()
    {
        return aaN;
    }

    public static Double m(com.google.android.gms.internal.d.a a)
    {
        return p(o(a));
    }

    public static String m(Object obj)
    {
        if (obj == null)
        {
            return aaJ;
        } else
        {
            return obj.toString();
        }
    }

    public static dg n(Object obj)
    {
        if (obj instanceof dg)
        {
            return (dg)obj;
        }
        if (t(obj))
        {
            return dg.w(u(obj));
        }
        if (s(obj))
        {
            return dg.a(Double.valueOf(getDouble(obj)));
        } else
        {
            return bY(m(obj));
        }
    }

    public static Boolean n(com.google.android.gms.internal.d.a a)
    {
        return q(o(a));
    }

    public static Long o(Object obj)
    {
        if (t(obj))
        {
            return Long.valueOf(u(obj));
        } else
        {
            return bZ(m(obj));
        }
    }

    public static Object o(com.google.android.gms.internal.d.a a)
    {
        boolean flag = false;
        int k1 = 0;
        int i = 0;
        if (a == null)
        {
            return aaF;
        }
        switch (a.type)
        {
        default:
            bh.w((new StringBuilder()).append("Failed to convert a value of type: ").append(a.type).toString());
            return aaF;

        case 1: // '\001'
            return a.fN;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(a.fO.length);
            a = a.fO;
            for (k1 = a.length; i < k1; i++)
            {
                Object obj = o(a[i]);
                if (obj == aaF)
                {
                    return aaF;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (a.fP.length != a.fQ.length)
            {
                bh.w((new StringBuilder()).append("Converting an invalid value to object: ").append(a.toString()).toString());
                return aaF;
            }
            HashMap hashmap = new HashMap(a.fQ.length);
            for (int i1 = ((flag) ? 1 : 0); i1 < a.fP.length; i1++)
            {
                Object obj1 = o(a.fP[i1]);
                Object obj2 = o(a.fQ[i1]);
                if (obj1 == aaF || obj2 == aaF)
                {
                    return aaF;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            bh.w("Trying to convert a macro reference to object");
            return aaF;

        case 5: // '\005'
            bh.w("Trying to convert a function id to object");
            return aaF;

        case 6: // '\006'
            return Long.valueOf(a.fT);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            a = a.fV;
            int l1 = a.length;
            for (int j1 = k1; j1 < l1; j1++)
            {
                String s1 = j(a[j1]);
                if (s1 == aaJ)
                {
                    return aaF;
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
            return ca(m(obj));
        }
    }

    public static Boolean q(Object obj)
    {
        if (obj instanceof Boolean)
        {
            return (Boolean)obj;
        } else
        {
            return cb(m(obj));
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
                if (a1 == aaN)
                {
                    return aaN;
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
                if (a2 == aaN || obj3 == aaN)
                {
                    return aaN;
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
        bh.w(stringbuilder.append(((String) (obj))).toString());
        return aaN;
    }

    private static boolean s(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof dg) && ((dg)obj).lI();
    }

    private static boolean t(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof dg) && ((dg)obj).lJ();
    }

    private static long u(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            bh.w("getInt64 received non-Number");
            return 0L;
        }
    }

    static 
    {
        aaJ = new String("");
        aaN = r(aaJ);
    }
}
