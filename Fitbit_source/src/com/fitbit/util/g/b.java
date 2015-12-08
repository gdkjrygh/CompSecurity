// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.g;

import com.fitbit.e.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class com.fitbit.util.g.b
{
    public static class a
    {

        private final Object a;

        public transient b a(Method method, Object aobj[])
        {
            return com.fitbit.util.g.b.a(a, method, aobj);
        }

        public a(Object obj)
        {
            a = obj;
        }
    }

    public static class b
    {

        public final Exception a;
        public final boolean b;
        public final Object c;

        private b(boolean flag, Object obj, Exception exception)
        {
            b = flag;
            c = obj;
            a = exception;
        }

    }


    private static final String a = "ReflectionUtils";

    public com.fitbit.util.g.b()
    {
    }

    public static transient b a(Object obj, Method method, Object aobj[])
    {
        return a(obj, false, method, aobj);
    }

    public static transient b a(Object obj, boolean flag, Method method, Object aobj[])
    {
        Object obj1;
        if (obj == null && !flag)
        {
            com.fitbit.e.a.f("ReflectionUtils", "Unable to invoke method on null receiver", new Object[0]);
            return new b(false, null, null);
        }
        if (method == null)
        {
            com.fitbit.e.a.f("ReflectionUtils", "Unable to invoke null method", new Object[0]);
            return new b(false, null, null);
        }
        try
        {
            obj1 = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.f("ReflectionUtils", (new StringBuilder()).append("Unable to invoke method: [").append(method).append("]").toString(), ((Throwable) (obj)), new Object[0]);
            return new b(false, null, ((Exception) (obj)));
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (method.getReturnType().equals(Void.TYPE))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        com.fitbit.e.a.e("ReflectionUtils", (new StringBuilder()).append("Invocation result is null; receiver = ").append(obj).append(", method = ").append(method).append(", objects = ").append(((Object) (aobj))).toString(), new Object[0]);
        com.fitbit.e.b.a(20, "Invocation path", new Object[0]);
        obj = new b(true, obj1, null);
        return ((b) (obj));
        obj = new b(true, obj1, null);
        return ((b) (obj));
    }

    public static transient b a(Method method, Object aobj[])
    {
        return a(null, true, method, aobj);
    }

    public static Object a(Class class1, String s)
    {
        return a(class1, s, null);
    }

    public static Object a(Class class1, String s, Object obj)
    {
        try
        {
            class1 = ((Class) (class1.getField(s).get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            class1.printStackTrace();
            return obj;
        }
        return class1;
    }

    public static transient Method a(Class class1, String s, String as[])
    {
label0:
        {
            boolean flag = false;
            class1 = class1.getMethods();
            int k = class1.length;
            int i = 0;
            Method method;
            Class aclass[];
            int j;
            do
            {
                if (i >= k)
                {
                    break label0;
                }
                method = class1[i];
                if (method.getName().equals(s))
                {
                    aclass = method.getParameterTypes();
                    j = ((flag) ? 1 : 0);
                    if (aclass.length == as.length)
                    {
                        break;
                    }
                }
                i++;
            } while (true);
            for (; j < aclass.length; j++)
            {
                if (aclass[j].getName().equals(as[j]));
            }

            return method;
        }
        return null;
    }

    public static boolean a(Method method, Object obj)
    {
        if (method == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            method = (Boolean)method.invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            method.printStackTrace();
            return false;
        }
        if (method == null)
        {
            return false;
        }
        flag = method.booleanValue();
        return flag;
    }
}
