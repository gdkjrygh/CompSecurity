// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.a.a.a.d.a;

public final class b
{

    public static final String a = ".";
    public static final String b = "$";
    static Class c;
    static Class d;
    static Class e;
    static Class f;
    static Class g;
    static Class h;
    static Class i;
    static Class j;
    private static final Map k;
    private static final Map l;
    private static final Map m = new HashMap();
    private static final Map n = new HashMap();

    private static Class a(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    public static String a(Class class1)
    {
        int i1 = 0;
        if (class1 == null)
        {
            return "";
        }
        Object obj = class1.getName();
        if (obj == null)
        {
            return "";
        }
        if (((String) (obj)).length() == 0)
        {
            return "";
        }
        a a1 = new a();
        class1 = ((Class) (obj));
        if (((String) (obj)).startsWith("["))
        {
            for (; ((String) (obj)).charAt(0) == '['; a1.a("[]"))
            {
                obj = ((String) (obj)).substring(1);
            }

            class1 = ((Class) (obj));
            if (((String) (obj)).charAt(0) == 'L')
            {
                class1 = ((Class) (obj));
                if (((String) (obj)).charAt(((String) (obj)).length() - 1) == ';')
                {
                    class1 = ((String) (obj)).substring(1, ((String) (obj)).length() - 1);
                }
            }
        }
        obj = class1;
        if (n.containsKey(class1))
        {
            obj = (String)n.get(class1);
        }
        int j1 = ((String) (obj)).lastIndexOf('.');
        if (j1 != -1)
        {
            i1 = j1 + 1;
        }
        i1 = ((String) (obj)).indexOf('$', i1);
        obj = ((String) (obj)).substring(j1 + 1);
        class1 = ((Class) (obj));
        if (i1 != -1)
        {
            class1 = ((String) (obj)).replace('$', '.');
        }
        return "" + class1 + a1;
    }

    private static void a(String s, String s1)
    {
        m.put(s, s1);
        n.put(s1, s);
    }

    static 
    {
        Object obj1 = new HashMap();
        k = ((Map) (obj1));
        Class class2 = Boolean.TYPE;
        Object obj;
        if (c == null)
        {
            obj = a("java.lang.Boolean");
            c = ((Class) (obj));
        } else
        {
            obj = c;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Byte.TYPE;
        if (d == null)
        {
            obj = a("java.lang.Byte");
            d = ((Class) (obj));
        } else
        {
            obj = d;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Character.TYPE;
        if (e == null)
        {
            obj = a("java.lang.Character");
            e = ((Class) (obj));
        } else
        {
            obj = e;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Short.TYPE;
        if (f == null)
        {
            obj = a("java.lang.Short");
            f = ((Class) (obj));
        } else
        {
            obj = f;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Integer.TYPE;
        if (g == null)
        {
            obj = a("java.lang.Integer");
            g = ((Class) (obj));
        } else
        {
            obj = g;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Long.TYPE;
        if (h == null)
        {
            obj = a("java.lang.Long");
            h = ((Class) (obj));
        } else
        {
            obj = h;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Double.TYPE;
        if (i == null)
        {
            obj = a("java.lang.Double");
            i = ((Class) (obj));
        } else
        {
            obj = i;
        }
        ((Map) (obj1)).put(class2, obj);
        obj1 = k;
        class2 = Float.TYPE;
        if (j == null)
        {
            obj = a("java.lang.Float");
            j = ((Class) (obj));
        } else
        {
            obj = j;
        }
        ((Map) (obj1)).put(class2, obj);
        k.put(Void.TYPE, Void.TYPE);
        l = new HashMap();
        obj = k.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Class class1 = (Class)((Iterator) (obj)).next();
            Class class3 = (Class)k.get(class1);
            if (!class1.equals(class3))
            {
                l.put(class3, class1);
            }
        } while (true);
        a("int", "I");
        a("boolean", "Z");
        a("float", "F");
        a("long", "J");
        a("short", "S");
        a("byte", "B");
        a("double", "D");
        a("char", "C");
    }
}
