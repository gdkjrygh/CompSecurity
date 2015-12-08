// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class g
{
    public static final class a extends Exception
    {

        public a(Throwable throwable)
        {
            super(throwable);
        }
    }


    public g()
    {
    }

    public static Object a(Object obj, String s)
        throws a
    {
        return a(obj, null, s, null, null);
    }

    private static Object a(Object obj, String s, String s1, Class aclass[], Object aobj[])
        throws a
    {
        {
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            Class class1;
            try
            {
                class1 = obj.getClass();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new a(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new a(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new a(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new a(((Throwable) (obj)));
            }
            s = ((String) (obj));
            obj = class1;
        }
        if (aclass == null)
        {
            break; /* Loop/switch isn't completed */
        }
        return a(((Class) (obj)), s1, aclass).invoke(s, aobj);
        obj = Class.forName(s);
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_15;
_L1:
        obj = a(((Class) (obj)), s1).invoke(s, new Object[0]);
        return obj;
    }

    public static transient Object a(Object obj, String s, Class aclass[], Object aobj[])
        throws a
    {
        return a(obj, null, s, aclass, aobj);
    }

    public static transient Object a(String s, String s1, Class aclass[], Object aobj[])
        throws a
    {
        return a(null, s, s1, aclass, aobj);
    }

    public static Method a(Class class1, String s)
    {
        try
        {
            class1 = class1.getMethod(s, new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public static Method a(Class class1, String s, Class aclass[])
    {
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }
}
