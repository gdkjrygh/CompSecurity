// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

// Referenced classes of package org.a.a.a.a:
//            f, g

public final class e extends f
{

    private boolean a;
    private boolean b;
    private String c[];
    private Class d;

    private e(Object obj, g g1)
    {
        super(obj, g1);
        a = false;
        b = false;
        d = null;
        d = null;
        b = false;
        a = false;
    }

    public static String a(Object obj, g g1)
    {
        return (new e(obj, g1)).toString();
    }

    private void a(Class class1)
    {
        if (class1.isArray())
        {
            class1 = ((Class) (a()));
            c().c(b(), class1);
        } else
        {
            class1 = class1.getDeclaredFields();
            AccessibleObject.setAccessible(class1, true);
            int i = 0;
            while (i < class1.length) 
            {
                Field field = class1[i];
                String s = field.getName();
                boolean flag;
                if (field.getName().indexOf('$') != -1)
                {
                    flag = false;
                } else
                if (Modifier.isTransient(field.getModifiers()) && !b)
                {
                    flag = false;
                } else
                if (Modifier.isStatic(field.getModifiers()) && !a)
                {
                    flag = false;
                } else
                if (c != null && Arrays.binarySearch(c, field.getName()) >= 0)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    try
                    {
                        a(s, field.get(a()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Class class1)
                    {
                        throw new InternalError("Unexpected IllegalAccessException: " + class1.getMessage());
                    }
                }
                i++;
            }
        }
    }

    public final String toString()
    {
        if (a() == null)
        {
            return c().f();
        }
        Class class1 = a().getClass();
        a(class1);
        for (; class1.getSuperclass() != null && class1 != d; a(class1))
        {
            class1 = class1.getSuperclass();
        }

        return super.toString();
    }
}
