// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal:
//            Platform, Util

private static class protocols
    implements InvocationHandler
{

    private final List protocols;
    private String selected;
    private boolean unsupported;

    public Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        String s = method.getName();
        Class class1 = method.getReturnType();
        obj = ((Object) (aobj));
        if (aobj == null)
        {
            obj = Util.EMPTY_STRING_ARRAY;
        }
        if (s.equals("supports") && Boolean.TYPE == class1)
        {
            return Boolean.valueOf(true);
        }
        if (s.equals("unsupported") && Void.TYPE == class1)
        {
            unsupported = true;
            return null;
        }
        if (s.equals("protocols") && obj.length == 0)
        {
            return protocols;
        }
        if (s.equals("selectProtocol") && java/lang/String == class1 && obj.length == 1 && (obj[0] == null || (obj[0] instanceof List)))
        {
            obj = (List)obj[0];
            selected = (String)protocols.get(0);
            return selected;
        }
        if (s.equals("protocolSelected") && obj.length == 1)
        {
            selected = (String)obj[0];
            return null;
        } else
        {
            return method.invoke(this, ((Object []) (obj)));
        }
    }



    public (List list)
    {
        protocols = list;
    }
}
