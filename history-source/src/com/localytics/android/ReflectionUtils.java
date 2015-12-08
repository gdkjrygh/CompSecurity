// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ReflectionUtils
{

    private ReflectionUtils()
    {
        throw new UnsupportedOperationException("This class is non-instantiable");
    }

    private static Object helper(Object obj, Class class1, String s, String s1, Class aclass[], Object aobj[])
    {
        if (class1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            return class1.getMethod(s1, aclass).invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        class1 = obj.getClass();
          goto _L1
        class1 = Class.forName(s);
          goto _L1
    }

    public static Object tryInvokeConstructor(String s, Class aclass[], Object aobj[])
    {
        try
        {
            s = ((String) (Class.forName(s).getDeclaredConstructor(aclass).newInstance(aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static Object tryInvokeInstance(Object obj, String s, Class aclass[], Object aobj[])
    {
        return helper(obj, null, null, s, aclass, aobj);
    }

    public static Object tryInvokeStatic(Class class1, String s, Class aclass[], Object aobj[])
    {
        return helper(null, class1, null, s, aclass, aobj);
    }

    public static Object tryInvokeStatic(String s, String s1, Class aclass[], Object aobj[])
    {
        return helper(null, null, s, s1, aclass, aobj);
    }
}
