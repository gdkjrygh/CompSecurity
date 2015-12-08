// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class OptionalMethod
{

    private final String methodName;
    private final Class methodParams[];
    private final Class returnType;

    public transient OptionalMethod(Class class1, String s, Class aclass[])
    {
        returnType = class1;
        methodName = s;
        methodParams = aclass;
    }

    private Method getMethod(Class class1)
    {
label0:
        {
            if (methodName != null)
            {
                class1 = getPublicMethod(class1, methodName, methodParams);
                if (class1 == null || returnType == null || returnType.isAssignableFrom(class1.getReturnType()))
                {
                    break label0;
                }
            }
            return null;
        }
        return class1;
    }

    private static Method getPublicMethod(Class class1, String s, Class aclass[])
    {
        int i;
        try
        {
            class1 = class1.getMethod(s, aclass);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        try
        {
            i = class1.getModifiers();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return class1;
        }
        if ((i & 1) == 0)
        {
            return null;
        } else
        {
            return class1;
        }
    }

    public transient Object invoke(Object obj, Object aobj[])
    {
        Method method = getMethod(obj.getClass());
        if (method == null)
        {
            throw new AssertionError((new StringBuilder()).append("Method ").append(methodName).append(" not supported for object ").append(obj).toString());
        }
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aobj = new AssertionError((new StringBuilder()).append("Unexpectedly could not call: ").append(method).toString());
            ((AssertionError) (aobj)).initCause(((Throwable) (obj)));
            throw aobj;
        }
        return obj;
    }

    public transient Object invokeOptional(Object obj, Object aobj[])
    {
        Method method = getMethod(obj.getClass());
        if (method == null)
        {
            return null;
        }
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return obj;
    }

    public transient Object invokeOptionalWithoutCheckedException(Object obj, Object aobj[])
    {
        try
        {
            obj = invokeOptional(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((InvocationTargetException) (obj)).getTargetException();
            if (obj instanceof RuntimeException)
            {
                throw (RuntimeException)obj;
            } else
            {
                aobj = new AssertionError("Unexpected exception");
                ((AssertionError) (aobj)).initCause(((Throwable) (obj)));
                throw aobj;
            }
        }
        return obj;
    }

    public transient Object invokeWithoutCheckedException(Object obj, Object aobj[])
    {
        try
        {
            obj = invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((InvocationTargetException) (obj)).getTargetException();
            if (obj instanceof RuntimeException)
            {
                throw (RuntimeException)obj;
            } else
            {
                aobj = new AssertionError("Unexpected exception");
                ((AssertionError) (aobj)).initCause(((Throwable) (obj)));
                throw aobj;
            }
        }
        return obj;
    }

    public boolean isSupported(Object obj)
    {
        return getMethod(obj.getClass()) != null;
    }
}
