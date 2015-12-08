// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Exposed;
import com.google.inject.Key;
import com.google.inject.PrivateBinder;
import com.google.inject.Provider;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$StackTraceElements;
import com.google.inject.spi.ProviderWithDependencies;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            Exceptions

public class ProviderMethod
    implements ProviderWithDependencies
{

    private final $ImmutableSet dependencies;
    private final boolean exposed;
    private final Object instance;
    private final Key key;
    private final Method method;
    private final List parameterProviders;
    private final Class scopeAnnotation;

    ProviderMethod(Key key1, Method method1, Object obj, $ImmutableSet $immutableset, List list, Class class1)
    {
        key = key1;
        scopeAnnotation = class1;
        instance = obj;
        dependencies = $immutableset;
        method = method1;
        parameterProviders = list;
        exposed = method1.isAnnotationPresent(com/google/inject/Exposed);
        method1.setAccessible(true);
    }

    public void configure(Binder binder)
    {
        binder = binder.withSource(method);
        if (scopeAnnotation != null)
        {
            binder.bind(key).toProvider(this).in(scopeAnnotation);
        } else
        {
            binder.bind(key).toProvider(this);
        }
        if (exposed)
        {
            ((PrivateBinder)binder).expose(key);
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ProviderMethod)
        {
            obj = (ProviderMethod)obj;
            flag = flag1;
            if (method.equals(((ProviderMethod) (obj)).method))
            {
                flag = flag1;
                if (instance.equals(((ProviderMethod) (obj)).instance))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Object get()
    {
        Object aobj[] = new Object[parameterProviders.size()];
        for (int i = 0; i < aobj.length; i++)
        {
            aobj[i] = ((Provider)parameterProviders.get(i)).get();
        }

        Object obj;
        try
        {
            obj = method.invoke(instance, aobj);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw Exceptions.throwCleanly(invocationtargetexception);
        }
        return obj;
    }

    public Set getDependencies()
    {
        return dependencies;
    }

    public Object getInstance()
    {
        return instance;
    }

    public Key getKey()
    {
        return key;
    }

    public Method getMethod()
    {
        return method;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            method
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("@Provides ").append($StackTraceElements.forMember(method).toString()).toString();
    }
}
