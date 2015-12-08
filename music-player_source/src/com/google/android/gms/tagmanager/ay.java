// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ej;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ax, t

final class ay
{

    private static final Object a = null;
    private static Long b = new Long(0L);
    private static Double c = new Double(0.0D);
    private static ax d = ax.a();
    private static String e;
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static ej i;

    public static ej a()
    {
        return i;
    }

    public static ej a(Object obj)
    {
        ej ej1;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        ej1 = new ej();
        if (obj instanceof ej)
        {
            return (ej)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        ej1.a = 1;
        ej1.b = (String)obj;
_L4:
        ej1.l = flag2;
        return ej1;
_L2:
        if (obj instanceof List)
        {
            ej1.a = 2;
            Object obj1 = (List)obj;
            obj = new ArrayList(((List) (obj1)).size());
            obj1 = ((List) (obj1)).iterator();
            flag2 = false;
            while (((Iterator) (obj1)).hasNext()) 
            {
                ej ej2 = a(((Iterator) (obj1)).next());
                if (ej2 == i)
                {
                    return i;
                }
                if (flag2 || ej2.l)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                ((List) (obj)).add(ej2);
            }
            ej1.c = (ej[])((List) (obj)).toArray(new ej[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            ej1.a = 3;
            Object obj2 = ((Map)obj).entrySet();
            obj = new ArrayList(((Set) (obj2)).size());
            ArrayList arraylist = new ArrayList(((Set) (obj2)).size());
            obj2 = ((Set) (obj2)).iterator();
            flag2 = false;
            while (((Iterator) (obj2)).hasNext()) 
            {
                Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                ej ej3 = a(((java.util.Map.Entry) (obj3)).getKey());
                obj3 = a(((java.util.Map.Entry) (obj3)).getValue());
                if (ej3 == i || obj3 == i)
                {
                    return i;
                }
                if (flag2 || ej3.l || ((ej) (obj3)).l)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                ((List) (obj)).add(ej3);
                arraylist.add(obj3);
            }
            ej1.d = (ej[])((List) (obj)).toArray(new ej[0]);
            ej1.e = (ej[])arraylist.toArray(new ej[0]);
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof ax) && ((ax)obj).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ej1.a = 1;
            ej1.b = obj.toString();
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
                        if ((obj instanceof ax) && ((ax)obj).c())
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
            ej1.a = 6;
            long l;
            if (obj instanceof Number)
            {
                l = ((Number)obj).longValue();
            } else
            {
                t.a("getInt64 received non-Number");
                l = 0L;
            }
            ej1.h = l;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        ej1.a = 8;
        ej1.i = ((Boolean)obj).booleanValue();
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
        t.a(stringbuilder.append(((String) (obj))).toString());
        return i;
    }

    public static String a(ej ej1)
    {
        return b(c(ej1));
    }

    public static Boolean b(ej ej1)
    {
        ej1 = ((ej) (c(ej1)));
        if (ej1 instanceof Boolean)
        {
            return (Boolean)ej1;
        }
        ej1 = b(ej1);
        if ("true".equalsIgnoreCase(ej1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(ej1))
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

    public static Object c(ej ej1)
    {
        boolean flag = false;
        int i1 = 0;
        int j = 0;
        if (ej1 == null)
        {
            return a;
        }
        switch (ej1.a)
        {
        default:
            t.a((new StringBuilder("Failed to convert a value of type: ")).append(ej1.a).toString());
            return a;

        case 1: // '\001'
            return ej1.b;

        case 2: // '\002'
            ArrayList arraylist = new ArrayList(ej1.c.length);
            ej1 = ej1.c;
            for (i1 = ej1.length; j < i1; j++)
            {
                Object obj = c(ej1[j]);
                if (obj == a)
                {
                    return a;
                }
                arraylist.add(obj);
            }

            return arraylist;

        case 3: // '\003'
            if (ej1.d.length != ej1.e.length)
            {
                t.a((new StringBuilder("Converting an invalid value to object: ")).append(ej1.toString()).toString());
                return a;
            }
            HashMap hashmap = new HashMap(ej1.e.length);
            for (int k = ((flag) ? 1 : 0); k < ej1.d.length; k++)
            {
                Object obj1 = c(ej1.d[k]);
                Object obj2 = c(ej1.e[k]);
                if (obj1 == a || obj2 == a)
                {
                    return a;
                }
                hashmap.put(obj1, obj2);
            }

            return hashmap;

        case 4: // '\004'
            t.a("Trying to convert a macro reference to object");
            return a;

        case 5: // '\005'
            t.a("Trying to convert a function id to object");
            return a;

        case 6: // '\006'
            return Long.valueOf(ej1.h);

        case 7: // '\007'
            StringBuffer stringbuffer = new StringBuffer();
            ej1 = ej1.j;
            int j1 = ej1.length;
            for (int l = i1; l < j1; l++)
            {
                String s = a(ej1[l]);
                if (s == e)
                {
                    return a;
                }
                stringbuffer.append(s);
            }

            return stringbuffer.toString();

        case 8: // '\b'
            return Boolean.valueOf(ej1.i);
        }
    }

    static 
    {
        e = new String("");
        i = a(e);
    }
}
