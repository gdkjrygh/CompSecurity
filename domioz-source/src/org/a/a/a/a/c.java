// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;
import org.a.a.a.a;

// Referenced classes of package org.a.a.a.a:
//            d

public class c
{

    static Class a;
    private static final ThreadLocal b = new ThreadLocal();
    private final int c;
    private int d;

    public c()
    {
        d = 0;
        c = 37;
        d = 17;
    }

    private c(byte byte0)
    {
        d = 0;
        c = 37;
        d = 17;
    }

    public static int a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The object to build a hash code for must not be null");
        }
        c c1 = new c((byte)0);
        Class class1 = obj.getClass();
        a(obj, class1, c1);
        for (; class1.getSuperclass() != null && class1 != null; a(obj, class1, c1))
        {
            class1 = class1.getSuperclass();
        }

        return c1.d;
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

    private static Set a()
    {
        return (Set)b.get();
    }

    private c a(long l)
    {
        d = d * c + (int)(l >> 32 ^ l);
        return this;
    }

    private static void a(Object obj, Class class1, c c1)
    {
        boolean flag1;
        boolean flag = true;
        flag1 = false;
        Set set = a();
        if (set == null || !set.contains(new d(obj)))
        {
            flag = false;
        }
        if (flag)
        {
            return;
        }
        if (a != null) goto _L2; else goto _L1
_L1:
        Class class2 = a("org.a.a.a.a.c");
        a = class2;
_L5:
        class2;
        JVM INSTR monitorenter ;
        if (a() == null)
        {
            b.set(new HashSet());
        }
        class2;
        JVM INSTR monitorexit ;
        a().add(new d(obj));
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        int i = ((flag1) ? 1 : 0);
_L4:
        if (i >= class1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        class2 = class1[i];
        boolean flag2;
        if (org.a.a.a.a.a(null, class2.getName()) || class2.getName().indexOf('$') != -1 || Modifier.isTransient(class2.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        flag2 = Modifier.isStatic(class2.getModifiers());
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        c1.c(class2.get(obj));
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        class2 = a;
          goto _L5
        class1;
        class2;
        JVM INSTR monitorexit ;
        throw class1;
        class1;
        b(obj);
        throw class1;
        class1;
        throw new InternalError("Unexpected IllegalAccessException");
_L3:
        b(obj);
        return;
    }

    private static void b(Object obj)
    {
        Set set = a();
        if (set == null) goto _L2; else goto _L1
_L1:
        set.remove(new d(obj));
        if (a != null) goto _L4; else goto _L3
_L3:
        obj = a("org.a.a.a.a.c");
        a = ((Class) (obj));
_L6:
        obj;
        JVM INSTR monitorenter ;
        set = a();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (set.isEmpty())
        {
            b.set(null);
        }
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
_L4:
        obj = a;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private c c(Object obj)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        int i = 0;
        if (obj == null)
        {
            d = d * c;
        } else
        if (obj.getClass().isArray())
        {
            if (obj instanceof long[])
            {
                obj = (long[])obj;
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (i < obj.length) 
                {
                    a(obj[i]);
                    i++;
                }
            } else
            if (obj instanceof int[])
            {
                obj = (int[])obj;
                int j = ((flag) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (j < obj.length) 
                {
                    d = obj[j] + d * c;
                    j++;
                }
            } else
            if (obj instanceof short[])
            {
                obj = (short[])obj;
                int k = ((flag1) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (k < obj.length) 
                {
                    d = obj[k] + d * c;
                    k++;
                }
            } else
            if (obj instanceof char[])
            {
                obj = (char[])obj;
                int l = ((flag2) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (l < obj.length) 
                {
                    d = obj[l] + d * c;
                    l++;
                }
            } else
            if (obj instanceof byte[])
            {
                obj = (byte[])obj;
                int i1 = ((flag3) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (i1 < obj.length) 
                {
                    d = obj[i1] + d * c;
                    i1++;
                }
            } else
            if (obj instanceof double[])
            {
                obj = (double[])obj;
                int j1 = ((flag4) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (j1 < obj.length) 
                {
                    a(Double.doubleToLongBits(obj[j1]));
                    j1++;
                }
            } else
            if (obj instanceof float[])
            {
                obj = (float[])obj;
                int k1 = ((flag5) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (k1 < obj.length) 
                {
                    float f = obj[k1];
                    int j2 = d;
                    int l2 = c;
                    d = Float.floatToIntBits(f) + j2 * l2;
                    k1++;
                }
            } else
            if (obj instanceof boolean[])
            {
                obj = (boolean[])obj;
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                int l1 = 0;
                while (l1 < obj.length) 
                {
                    byte byte0 = obj[l1];
                    int i3 = d;
                    int j3 = c;
                    int k2;
                    if (byte0 != 0)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = 1;
                    }
                    d = k2 + i3 * j3;
                    l1++;
                }
            } else
            {
                obj = ((Object) ((Object[])obj));
                int i2 = ((flag6) ? 1 : 0);
                if (obj == null)
                {
                    d = d * c;
                    return this;
                }
                while (i2 < obj.length) 
                {
                    c(obj[i2]);
                    i2++;
                }
            }
        } else
        {
            d = d * c + obj.hashCode();
            return this;
        }
        return this;
    }

    public int hashCode()
    {
        return d;
    }

}
