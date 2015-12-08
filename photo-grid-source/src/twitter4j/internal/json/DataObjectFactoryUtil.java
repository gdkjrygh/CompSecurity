// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import twitter4j.json.DataObjectFactory;

public class DataObjectFactoryUtil
{

    private static final Method CLEAR_THREAD_LOCAL_MAP;
    private static final Method REGISTER_JSON_OBJECT;

    private DataObjectFactoryUtil()
    {
        throw new AssertionError("not intended to be instantiated.");
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
        Method amethod[] = twitter4j/json/DataObjectFactory.getDeclaredMethods();
        int j = amethod.length;
        int i = 0;
        Method method = null;
        Method method1 = null;
        while (i < j) 
        {
            Method method2 = amethod[i];
            if (method2.getName().equals("clearThreadLocalMap"))
            {
                method2.setAccessible(true);
                method = method2;
            } else
            if (method2.getName().equals("registerJSONObject"))
            {
                method2.setAccessible(true);
                method1 = method2;
            }
            i++;
        }
        if (method == null || method1 == null)
        {
            throw new AssertionError();
        } else
        {
            CLEAR_THREAD_LOCAL_MAP = method;
            REGISTER_JSON_OBJECT = method1;
            return;
        }
    }
}
