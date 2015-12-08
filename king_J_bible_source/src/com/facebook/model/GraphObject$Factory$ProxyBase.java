// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.model;

import com.facebook.FacebookGraphObjectException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Referenced classes of package com.facebook.model:
//            GraphObject

private static abstract class state
    implements InvocationHandler
{

    private static final String EQUALS_METHOD = "equals";
    private static final String TOSTRING_METHOD = "toString";
    protected final Object state;

    protected final Object proxyObjectMethods(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        obj = method.getName();
        if (((String) (obj)).equals("equals"))
        {
            obj = aobj[0];
            if (obj == null)
            {
                return Boolean.valueOf(false);
            }
            obj = Proxy.getInvocationHandler(obj);
            if (!(obj instanceof tProxy))
            {
                return Boolean.valueOf(false);
            } else
            {
                obj = (tProxy)obj;
                return Boolean.valueOf(state.equals(((tProxy) (obj)).state));
            }
        }
        if (((String) (obj)).equals("toString"))
        {
            return toString();
        } else
        {
            return method.invoke(state, aobj);
        }
    }

    protected final Object throwUnexpectedMethodSignature(Method method)
    {
        throw new FacebookGraphObjectException((new StringBuilder(String.valueOf(getClass().getName()))).append(" got an unexpected method signature: ").append(method.toString()).toString());
    }

    protected tProxy(Object obj)
    {
        state = obj;
    }
}
