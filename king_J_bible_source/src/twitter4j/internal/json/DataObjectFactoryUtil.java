// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DataObjectFactoryUtil
{

    private static final Method CLEAR_THREAD_LOCAL_MAP;
    private static final Method REGISTER_JSON_OBJECT;
    static Class class$twitter4j$json$DataObjectFactory;

    private DataObjectFactoryUtil()
    {
        throw new AssertionError("not intended to be instantiated.");
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
    }

    public static void clearThreadLocalMap()
    {
        try
        {
            CLEAR_THREAD_LOCAL_MAP.invoke(null, new Object[0]);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new AssertionError(invocationtargetexception);
        }
    }

    public static Object registerJSONObject(Object obj, Object obj1)
    {
        try
        {
            obj = REGISTER_JSON_OBJECT.invoke(null, new Object[] {
                obj, obj1
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        return obj;
    }

    static 
    {
        Object obj;
        Method method;
        Method amethod[];
        int i;
        int j;
        if (class$twitter4j$json$DataObjectFactory == null)
        {
            obj = _mthclass$("twitter4j.json.DataObjectFactory");
            class$twitter4j$json$DataObjectFactory = ((Class) (obj));
        } else
        {
            obj = class$twitter4j$json$DataObjectFactory;
        }
        amethod = ((Class) (obj)).getDeclaredMethods();
        obj = null;
        method = null;
        j = amethod.length;
        i = 0;
        while (i < j) 
        {
            Method method1 = amethod[i];
            Object obj1;
            if (method1.getName().equals("clearThreadLocalMap"))
            {
                obj1 = method1;
                ((Method) (obj1)).setAccessible(true);
            } else
            {
                obj1 = obj;
                if (method1.getName().equals("registerJSONObject"))
                {
                    method = method1;
                    method.setAccessible(true);
                    obj1 = obj;
                }
            }
            i++;
            obj = obj1;
        }
        if (obj == null || method == null)
        {
            throw new AssertionError();
        } else
        {
            CLEAR_THREAD_LOCAL_MAP = ((Method) (obj));
            REGISTER_JSON_OBJECT = method;
        }
    }
}
