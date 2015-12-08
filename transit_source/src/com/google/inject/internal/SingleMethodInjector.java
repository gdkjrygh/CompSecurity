// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package com.google.inject.internal:
//            SingleMemberInjector, ErrorsException, InjectorImpl, SingleParameterInjector, 
//            Errors, InternalContext

final class SingleMethodInjector
    implements SingleMemberInjector
{

    private final InjectionPoint injectionPoint;
    private final InjectorImpl.MethodInvoker methodInvoker;
    private final SingleParameterInjector parameterInjectors[];

    SingleMethodInjector(InjectorImpl injectorimpl, InjectionPoint injectionpoint, Errors errors)
        throws ErrorsException
    {
        injectionPoint = injectionpoint;
        methodInvoker = createMethodInvoker((Method)injectionpoint.getMember());
        parameterInjectors = injectorimpl.getParametersInjectors(injectionpoint.getDependencies(), errors);
    }

    private InjectorImpl.MethodInvoker createMethodInvoker(final Method method)
    {
        int i = method.getModifiers();
        if (!Modifier.isPrivate(i))
        {
            if (Modifier.isProtected(i));
        }
        if (!Modifier.isPublic(i) || !Modifier.isPublic(method.getDeclaringClass().getModifiers()))
        {
            method.setAccessible(true);
        }
        return new InjectorImpl.MethodInvoker() {

            final SingleMethodInjector this$0;
            final Method val$method;

            public transient Object invoke(Object obj, Object aobj[])
                throws IllegalAccessException, InvocationTargetException
            {
                return method.invoke(obj, aobj);
            }

            
            {
                this$0 = SingleMethodInjector.this;
                method = method1;
                super();
            }
        };
    }

    public InjectionPoint getInjectionPoint()
    {
        return injectionPoint;
    }

    public void inject(Errors errors, InternalContext internalcontext, Object obj)
    {
        try
        {
            internalcontext = ((InternalContext) (SingleParameterInjector.getAll(errors, internalcontext, parameterInjectors)));
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext)
        {
            errors.merge(internalcontext.getErrors());
            return;
        }
        try
        {
            methodInvoker.invoke(obj, internalcontext);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Errors errors)
        {
            throw new AssertionError(errors);
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext) { }
        if (internalcontext.getCause() != null)
        {
            internalcontext = internalcontext.getCause();
        }
        errors.withSource(injectionPoint).errorInjectingMethod(internalcontext);
    }
}
