// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;

import java.util.Hashtable;
import java.util.StringTokenizer;
import org.b.a.a;
import org.b.a.a.c;
import org.b.a.d;

// Referenced classes of package org.b.b.b:
//            c, g, e

public final class b
{

    static Hashtable e;
    static Class f;
    private static Object g[] = new Object[0];
    Class a;
    ClassLoader b;
    String c;
    int d;

    public b(String s, Class class1)
    {
        c = s;
        a = class1;
        d = 0;
        b = class1.getClassLoader();
    }

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

    static Class a(String s, ClassLoader classloader)
    {
        if (!s.equals("*")) goto _L2; else goto _L1
_L1:
        Class class1 = null;
_L4:
        return class1;
_L2:
        Class class2;
        class2 = (Class)e.get(s);
        class1 = class2;
        if (class2 != null) goto _L4; else goto _L3
_L3:
        if (classloader != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        return Class.forName(s);
        s = Class.forName(s, false, classloader);
        return s;
        s;
        if (f == null)
        {
            s = a("java.lang.ClassNotFoundException");
            f = s;
            return s;
        } else
        {
            return f;
        }
    }

    public static a a(org.b.a.a.a a1, Object obj, Object obj1)
    {
        return new org.b.b.b.c(a1, obj, obj1, g);
    }

    public static a a(org.b.a.a.a a1, Object obj, Object obj1, Object obj2)
    {
        return new org.b.b.b.c(a1, obj, obj1, new Object[] {
            obj2
        });
    }

    public static a a(org.b.a.a.a a1, Object obj, Object obj1, Object aobj[])
    {
        return new org.b.b.b.c(a1, obj, obj1, aobj);
    }

    public final org.b.a.a.a a(String s, d d1, int i)
    {
        int j = d;
        d = j + 1;
        return new c.a(j, s, d1, new g(a, c, i));
    }

    public final c a(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        int l = Integer.parseInt(s, 16);
        s = a(s2, b);
        s3 = new StringTokenizer(s3, ":");
        int i1 = s3.countTokens();
        s2 = new Class[i1];
        for (int i = 0; i < i1; i++)
        {
            s2[i] = a(s3.nextToken(), b);
        }

        s4 = new StringTokenizer(s4, ":");
        i1 = s4.countTokens();
        s3 = new String[i1];
        for (int j = 0; j < i1; j++)
        {
            s3[j] = s4.nextToken();
        }

        s4 = new StringTokenizer(s5, ":");
        i1 = s4.countTokens();
        s5 = new Class[i1];
        for (int k = 0; k < i1; k++)
        {
            s5[k] = a(s4.nextToken(), b);
        }

        return new e(l, s1, s, s2, s3, s5, a(s6, b));
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        e = hashtable;
        hashtable.put("void", Void.TYPE);
        e.put("boolean", Boolean.TYPE);
        e.put("byte", Byte.TYPE);
        e.put("char", Character.TYPE);
        e.put("short", Short.TYPE);
        e.put("int", Integer.TYPE);
        e.put("long", Long.TYPE);
        e.put("float", Float.TYPE);
        e.put("double", Double.TYPE);
    }
}
