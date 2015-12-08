// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class h
{

    private final Class a;
    private final String b;
    private final Class c[];

    public transient h(Class class1, String s, Class aclass[])
    {
        a = class1;
        b = s;
        c = aclass;
    }

    private Method a(Class class1)
    {
label0:
        {
            if (b != null)
            {
                class1 = a(class1, b, c);
                if (class1 == null || a == null || a.isAssignableFrom(class1.getReturnType()))
                {
                    break label0;
                }
            }
            return null;
        }
        return class1;
    }

    private static Method a(Class class1, String s, Class aclass[])
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

    private transient Object c(Object obj, Object aobj[])
        throws InvocationTargetException
    {
        Method method = a(obj.getClass());
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

    private transient Object d(Object obj, Object aobj[])
        throws InvocationTargetException
    {
        Method method = a(obj.getClass());
        if (method == null)
        {
            throw new AssertionError((new StringBuilder("Method ")).append(b).append(" not supported for object ").append(obj).toString());
        }
        try
        {
            obj = method.invoke(obj, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aobj = new AssertionError((new StringBuilder("Unexpectedly could not call: ")).append(method).toString());
            ((AssertionError) (aobj)).initCause(((Throwable) (obj)));
            throw aobj;
        }
        return obj;
    }

    public final transient Object a(Object obj, Object aobj[])
    {
        try
        {
            obj = c(obj, aobj);
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

    public final boolean a(Object obj)
    {
        return a(obj.getClass()) != null;
    }

    public final transient Object b(Object obj, Object aobj[])
    {
        try
        {
            obj = d(obj, aobj);
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
}
