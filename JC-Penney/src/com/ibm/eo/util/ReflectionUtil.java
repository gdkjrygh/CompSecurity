// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.util;

import java.lang.reflect.Method;

// Referenced classes of package com.ibm.eo.util:
//            LogInternal

public final class ReflectionUtil
{

    private static volatile ReflectionUtil _myInstance;

    private ReflectionUtil()
    {
    }

    public static ReflectionUtil getInstance()
    {
        com/ibm/eo/util/ReflectionUtil;
        JVM INSTR monitorenter ;
        ReflectionUtil reflectionutil;
        if (_myInstance == null)
        {
            _myInstance = new ReflectionUtil();
        }
        reflectionutil = _myInstance;
        com/ibm/eo/util/ReflectionUtil;
        JVM INSTR monitorexit ;
        return reflectionutil;
        Exception exception;
        exception;
        throw exception;
    }

    public static Object getValueFromObject(Object obj, String s)
    {
        if (obj == null || obj.getClass() == null)
        {
            return null;
        }
        try
        {
            obj = obj.getClass().getMethod(s, new Class[0]).invoke(obj, (Object[])null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogInternal.logException(((Throwable) (obj)));
            return null;
        }
        return obj;
    }
}
