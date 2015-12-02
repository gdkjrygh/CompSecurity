// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.json.jsonmirror.a;

import com.facebook.common.json.jsonmirror.e;
import com.facebook.common.json.jsonmirror.f;
import com.facebook.common.w.s;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.common.json.jsonmirror.a:
//            c

public class k extends c
{

    protected static final Map h = ik.a();
    private static final Class i = com/facebook/common/json/jsonmirror/a/k;
    public final boolean g;
    private final Map j;
    private final Constructor k;

    public k(Class class1, Map map, boolean flag)
    {
        try
        {
            k = class1.getDeclaredConstructor(new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new f((new StringBuilder()).append("You need to add a no-argument constructor to class ").append(b(class1)).append(" to use it with jsonmirror.").toString());
        }
        k.setAccessible(true);
        j = map;
        g = flag;
    }

    public static Field a(com.facebook.common.json.jsonmirror.b b1, String s1)
    {
        Object obj1;
        Class class2;
        class2 = b1.getClass();
        Object obj = (Map)h.get(class2);
        Class class1;
        if (obj != null)
        {
            b1 = (Field)((Map) (obj)).get(s1);
        } else
        {
            obj = ik.a();
            h.put(class2, obj);
            b1 = null;
        }
        obj1 = b1;
        if (b1 != null) goto _L2; else goto _L1
_L1:
        class1 = class2;
_L3:
        obj1 = b1;
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = b1;
        if (b1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = class1.getDeclaredField(s1);
        b1 = ((com.facebook.common.json.jsonmirror.b) (obj1));
        ((Field) (obj1)).setAccessible(true);
        b1 = ((com.facebook.common.json.jsonmirror.b) (obj1));
        ((Map) (obj)).put(s1, obj1);
        b1 = ((com.facebook.common.json.jsonmirror.b) (obj1));
_L4:
        class1 = class1.getSuperclass();
        if (true) goto _L3; else goto _L2
_L2:
        if (obj1 == null)
        {
            throw new e((new StringBuilder()).append("cannot find field ").append(s1).append(" in class ").append(class2.getName()).toString());
        } else
        {
            return ((Field) (obj1));
        }
        NoSuchFieldException nosuchfieldexception;
        nosuchfieldexception;
          goto _L4
    }

    public static void a(com.facebook.common.json.jsonmirror.b b1, String s1, Object obj)
    {
        Field field;
        boolean flag;
        boolean flag1;
        flag1 = false;
        field = a(b1, s1);
        flag = flag1;
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        field.set(b1, obj);
        flag = true;
_L2:
        if (!flag)
        {
            com.facebook.debug.log.b.e(i, (new StringBuilder()).append("Unable to write to field ").append(s1).toString());
        }
        return;
        b1;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String b(Class class1)
    {
        String s1 = class1.getName();
        int l = s1.lastIndexOf(".");
        class1 = s1;
        if (l != -1)
        {
            class1 = s1.substring(l + 1);
        }
        return class1;
    }

    public com.facebook.common.json.jsonmirror.b a()
    {
        com.facebook.common.json.jsonmirror.b b1 = (com.facebook.common.json.jsonmirror.b)k.newInstance(new Object[0]);
        return b1;
        Object obj;
        obj;
        com.facebook.debug.log.b.e(i, "Illegal argument exception", ((Throwable) (obj)));
_L2:
        return null;
        obj;
        com.facebook.debug.log.b.e(i, "Instantiation exception", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        com.facebook.debug.log.b.e(i, "Illegal access exception", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        com.facebook.debug.log.b.e(i, "Invocation target exception", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public s a(String s1)
    {
        return (s)j.get(s1);
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, double d)
    {
        Field field;
        boolean flag;
        boolean flag1;
        flag1 = false;
        field = a(b1, s1);
        flag = flag1;
        if (field == null) goto _L2; else goto _L1
_L1:
        Class class1 = field.getType();
        if (class1 == java/lang/Double) goto _L4; else goto _L3
_L3:
        if (class1 != Double.TYPE) goto _L5; else goto _L4
_L4:
        field.setDouble(b1, d);
        flag = true;
_L2:
        if (!flag)
        {
            com.facebook.debug.log.b.e(i, (new StringBuilder()).append("Unable to write to field ").append(s1).toString());
        }
        return;
_L5:
        if (class1 == java/lang/Float)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag = flag1;
        if (class1 != Float.TYPE)
        {
            continue; /* Loop/switch isn't completed */
        }
        field.setFloat(b1, (float)d);
        flag = true;
        continue; /* Loop/switch isn't completed */
        b1;
        flag = flag1;
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, long l)
    {
        Field field;
        boolean flag;
        boolean flag1;
        flag1 = false;
        field = a(b1, s1);
        flag = flag1;
        if (field == null) goto _L2; else goto _L1
_L1:
        Class class1 = field.getType();
        if (class1 == java/lang/Long) goto _L4; else goto _L3
_L3:
        if (class1 != Long.TYPE) goto _L5; else goto _L4
_L4:
        field.setLong(b1, l);
        flag = true;
_L2:
        if (!flag)
        {
            com.facebook.debug.log.b.e(i, (new StringBuilder()).append("Unable to write to field ").append(s1).toString());
        }
        return;
_L5:
        if (class1 == java/lang/Integer)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        flag = flag1;
        if (class1 != Integer.TYPE)
        {
            continue; /* Loop/switch isn't completed */
        }
        field.setInt(b1, (int)l);
        flag = true;
        continue; /* Loop/switch isn't completed */
        b1;
        flag = flag1;
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, com.facebook.common.json.jsonmirror.b b2)
    {
        a(b1, s1, b2);
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, String s2)
    {
        a(b1, s1, s2);
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, List list)
    {
        a(b1, s1, list);
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, Map map)
    {
        a(b1, s1, map);
    }

    public void a(com.facebook.common.json.jsonmirror.b b1, String s1, boolean flag)
    {
        Field field;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        field = a(b1, s1);
        flag1 = flag2;
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        field.setBoolean(b1, flag);
        flag1 = true;
_L2:
        if (!flag1)
        {
            com.facebook.debug.log.b.e(i, (new StringBuilder()).append("Unable to write to field ").append(s1).toString());
        }
        return;
        b1;
        flag1 = flag2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean b()
    {
        return g;
    }

    public String toString()
    {
        return String.format("%s<%s, %s>", new Object[] {
            "JMStaticKeysDict", b(k.getDeclaringClass()), j.toString()
        });
    }

}
