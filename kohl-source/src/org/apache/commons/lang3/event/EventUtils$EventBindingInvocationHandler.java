// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.event;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.reflect.MethodUtils;

// Referenced classes of package org.apache.commons.lang3.event:
//            EventUtils

private static class eventTypes
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

    (Object obj, String s, String as[])
    {
        target = obj;
        methodName = s;
        eventTypes = new HashSet(Arrays.asList(as));
    }
}
