// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

final class dea
    implements InvocationHandler
{

    dea()
    {
    }

    public final Object invoke(Object obj, Method method, Object aobj[])
    {
        return ddz.a().get(method.getReturnType());
    }
}
