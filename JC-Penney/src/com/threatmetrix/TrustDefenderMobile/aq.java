// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class aq
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/aq.getName();

    aq()
    {
    }

    static Object a(Object obj, Field field)
    {
        if (obj == null || field == null)
        {
            return null;
        }
        try
        {
            obj = field.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    static transient Object a(Object obj, Method method, Object aobj[])
    {
        boolean flag = true;
        if (method == null) goto _L2; else goto _L1
_L1:
        obj = method.invoke(obj, aobj);
        flag = false;
_L3:
        if (!flag)
        {
            return obj;
        }
        break; /* Loop/switch isn't completed */
        obj;
        Log.e(a, (new StringBuilder()).append(method.getName()).append(" invoke failed: ").toString(), ((Throwable) (obj)));
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(a, (new StringBuilder()).append(method.getName()).append(" invoke failed: ").toString(), ((Throwable) (obj)));
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(a, (new StringBuilder()).append(method.getName()).append(" invoke failed: ").toString(), ((Throwable) (obj)));
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(a, (new StringBuilder()).append(method.getName()).append(" invoke failed: ").toString(), ((Throwable) (obj)));
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(a, (new StringBuilder()).append(method.getName()).append(" invoke failed: ").toString(), ((Throwable) (obj)));
        obj = null;
        if (true) goto _L3; else goto _L2
_L2:
        return null;
    }

    static Field a(Class class1, String s)
    {
        if (class1 == null)
        {
            return null;
        }
        try
        {
            class1 = class1.getDeclaredField(s);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    static transient Method a(Class class1, String s, Class aclass[])
    {
        if (class1 == null)
        {
            return null;
        }
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    static Class b(String s)
    {
        Class class1;
        try
        {
            class1 = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = a;
            return null;
        }
        catch (Exception exception)
        {
            Log.e(a, (new StringBuilder()).append(s).append(" getClass failed: ").toString(), exception);
            return null;
        }
        return class1;
    }

}
