// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkCmObjectException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.model:
//            b

abstract class d
    implements InvocationHandler
{

    protected final Object a;

    protected d(Object obj)
    {
        a = obj;
    }

    protected final Object a(Method method)
    {
        throw new CmLoginSdkCmObjectException((new StringBuilder()).append(getClass().getName()).append(" got an unexpected method signature: ").append(method.toString()).toString());
    }

    protected final Object a(Method method, Object aobj[])
    {
        String s = method.getName();
        if (s.equals("equals"))
        {
            method = ((Method) (aobj[0]));
            if (method == null)
            {
                return Boolean.valueOf(false);
            }
            method = Proxy.getInvocationHandler(method);
            if (!(method instanceof b))
            {
                return Boolean.valueOf(false);
            } else
            {
                method = (b)method;
                return Boolean.valueOf(a.equals(((b) (method)).a));
            }
        }
        if (s.equals("toString"))
        {
            return toString();
        } else
        {
            return method.invoke(a, aobj);
        }
    }
}
