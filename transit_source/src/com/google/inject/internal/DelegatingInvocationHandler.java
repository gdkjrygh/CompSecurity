// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DelegatingInvocationHandler
    implements InvocationHandler
{

    private Object _flddelegate;

    DelegatingInvocationHandler()
    {
    }

    public Object getDelegate()
    {
        return _flddelegate;
    }

    public Object invoke(Object obj, Method method, Object aobj[])
        throws Throwable
    {
        if (_flddelegate == null)
        {
            throw new IllegalStateException("This is a proxy used to support circular references involving constructors. The object we're proxying is not constructed yet. Please wait until after injection has completed to use this object.");
        }
        try
        {
            obj = method.invoke(_flddelegate, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getTargetException();
        }
        return obj;
    }

    void setDelegate(Object obj)
    {
        _flddelegate = obj;
    }
}
