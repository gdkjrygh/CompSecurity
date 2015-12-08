// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$ImmutableSet;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            ErrorsException, InternalContext, ConstructionContext, Errors, 
//            SingleParameterInjector, ConstructionProxy, MembersInjectorImpl

final class ConstructorInjector
{

    private final ConstructionProxy constructionProxy;
    private final $ImmutableSet injectableMembers;
    private final MembersInjectorImpl membersInjector;
    private final SingleParameterInjector parameterInjectors[];

    ConstructorInjector(Set set, ConstructionProxy constructionproxy, SingleParameterInjector asingleparameterinjector[], MembersInjectorImpl membersinjectorimpl)
    {
        injectableMembers = $ImmutableSet.copyOf(set);
        constructionProxy = constructionproxy;
        parameterInjectors = asingleparameterinjector;
        membersInjector = membersinjectorimpl;
    }

    Object construct(Errors errors, InternalContext internalcontext, Class class1, boolean flag)
        throws ErrorsException
    {
        ConstructionContext constructioncontext = internalcontext.getConstructionContext(this);
        if (!constructioncontext.isConstructing()) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            throw errors.circularProxiesDisabled(class1).toException();
        }
        class1 = ((Class) (constructioncontext.createProxy(errors, class1)));
_L4:
        return class1;
_L2:
        Object obj;
        obj = constructioncontext.getCurrentReference();
        class1 = ((Class) (obj));
        if (obj != null) goto _L4; else goto _L3
_L3:
        constructioncontext.startConstruction();
        class1 = ((Class) (SingleParameterInjector.getAll(errors, internalcontext, parameterInjectors)));
        class1 = ((Class) (constructionProxy.newInstance(class1)));
        constructioncontext.setProxyDelegates(class1);
        constructioncontext.finishConstruction();
        constructioncontext.setCurrentReference(class1);
        membersInjector.injectMembers(class1, errors, internalcontext, false);
        membersInjector.notifyListeners(class1, errors);
        constructioncontext.removeCurrentReference();
        return class1;
        internalcontext;
        try
        {
            constructioncontext.finishConstruction();
            throw internalcontext;
        }
        // Misplaced declaration of an exception variable
        catch (InternalContext internalcontext) { }
        finally
        {
            constructioncontext.removeCurrentReference();
        }
        if (internalcontext.getCause() != null)
        {
            internalcontext = internalcontext.getCause();
        }
        throw errors.withSource(constructionProxy.getInjectionPoint()).errorInjectingConstructor(internalcontext).toException();
        throw errors;
    }

    ConstructionProxy getConstructionProxy()
    {
        return constructionProxy;
    }

    public $ImmutableSet getInjectableMembers()
    {
        return injectableMembers;
    }
}
