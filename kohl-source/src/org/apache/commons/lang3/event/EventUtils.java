// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.event;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.reflect.MethodUtils;

public class EventUtils
{
    private static class EventBindingInvocationHandler
        implements InvocationHandler
    {

        private final Set eventTypes;
        private final String methodName;
        private final Object target;

        private boolean hasMatchingParametersMethod(Method method)
        {
            return MethodUtils.getAccessibleMethod(target.getClass(), methodName, method.getParameterTypes()) != null;
        }

        public Object invoke(Object obj, Method method, Object aobj[])
            throws Throwable
        {
            if (eventTypes.isEmpty() || eventTypes.contains(method.getName()))
            {
                if (hasMatchingParametersMethod(method))
                {
                    return MethodUtils.invokeMethod(target, methodName, aobj);
                } else
                {
                    return MethodUtils.invokeMethod(target, methodName, new Object[0]);
                }
            } else
            {
                return null;
            }
        }

        EventBindingInvocationHandler(Object obj, String s, String as[])
        {
            target = obj;
            methodName = s;
            eventTypes = new HashSet(Arrays.asList(as));
        }
    }


    public EventUtils()
    {
    }

    public static void addEventListener(Object obj, Class class1, Object obj1)
    {
        try
        {
            MethodUtils.invokeMethod(obj, (new StringBuilder()).append("add").append(class1.getSimpleName()).toString(), new Object[] {
                obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(obj.getClass().getName()).append(" does not have a public add").append(class1.getSimpleName()).append(" method which takes a parameter of type ").append(class1.getName()).append(".").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(obj.getClass().getName()).append(" does not have an accessible add").append(class1.getSimpleName()).append(" method which takes a parameter of type ").append(class1.getName()).append(".").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Unable to add listener.", ((InvocationTargetException) (obj)).getCause());
        }
    }

    public static transient void bindEventsToMethod(Object obj, String s, Object obj1, Class class1, String as[])
    {
        ClassLoader classloader = obj.getClass().getClassLoader();
        obj = new EventBindingInvocationHandler(obj, s, as);
        addEventListener(obj1, class1, class1.cast(Proxy.newProxyInstance(classloader, new Class[] {
            class1
        }, ((InvocationHandler) (obj)))));
    }
}
