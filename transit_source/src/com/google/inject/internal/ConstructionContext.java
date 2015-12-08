// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, Errors, DelegatingInvocationHandler, BytecodeGen, 
//            CircularDependencyProxy

final class ConstructionContext
{

    boolean constructing;
    Object currentReference;
    List invocationHandlers;

    ConstructionContext()
    {
    }

    public Object createProxy(Errors errors, Class class1)
        throws ErrorsException
    {
        if (!class1.isInterface())
        {
            throw errors.cannotSatisfyCircularDependency(class1).toException();
        }
        if (invocationHandlers == null)
        {
            invocationHandlers = new ArrayList();
        }
        errors = new DelegatingInvocationHandler();
        invocationHandlers.add(errors);
        return class1.cast(Proxy.newProxyInstance(BytecodeGen.getClassLoader(class1), new Class[] {
            class1, com/google/inject/internal/CircularDependencyProxy
        }, errors));
    }

    public void finishConstruction()
    {
        constructing = false;
        invocationHandlers = null;
    }

    public Object getCurrentReference()
    {
        return currentReference;
    }

    public boolean isConstructing()
    {
        return constructing;
    }

    public void removeCurrentReference()
    {
        currentReference = null;
    }

    public void setCurrentReference(Object obj)
    {
        currentReference = obj;
    }

    public void setProxyDelegates(Object obj)
    {
        if (invocationHandlers != null)
        {
            for (Iterator iterator = invocationHandlers.iterator(); iterator.hasNext(); ((DelegatingInvocationHandler)iterator.next()).setDelegate(obj)) { }
        }
    }

    public void startConstruction()
    {
        constructing = true;
    }
}
