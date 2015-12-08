// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            InternalInjectorCreator

static class delegateInjector
    implements Injector
{

    private final Injector delegateInjector;

    public Injector createChildInjector(Iterable iterable)
    {
        return delegateInjector.createChildInjector(iterable);
    }

    public transient Injector createChildInjector(Module amodule[])
    {
        return delegateInjector.createChildInjector(amodule);
    }

    public List findBindingsByType(TypeLiteral typeliteral)
    {
        return delegateInjector.findBindingsByType(typeliteral);
    }

    public Map getAllBindings()
    {
        return delegateInjector.getAllBindings();
    }

    public Binding getBinding(Key key)
    {
        return delegateInjector.getBinding(key);
    }

    public Binding getBinding(Class class1)
    {
        return delegateInjector.getBinding(class1);
    }

    public Map getBindings()
    {
        return delegateInjector.getBindings();
    }

    public Binding getExistingBinding(Key key)
    {
        return delegateInjector.getExistingBinding(key);
    }

    public Object getInstance(Key key)
    {
        throw new UnsupportedOperationException("Injector.getInstance(Key<T>) is not supported in Stage.TOOL");
    }

    public Object getInstance(Class class1)
    {
        throw new UnsupportedOperationException("Injector.getInstance(Class<T>) is not supported in Stage.TOOL");
    }

    public MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        throw new UnsupportedOperationException("Injector.getMembersInjector(TypeLiteral<T>) is not supported in Stage.TOOL");
    }

    public MembersInjector getMembersInjector(Class class1)
    {
        throw new UnsupportedOperationException("Injector.getMembersInjector(Class<T>) is not supported in Stage.TOOL");
    }

    public Injector getParent()
    {
        return delegateInjector.getParent();
    }

    public Provider getProvider(Key key)
    {
        throw new UnsupportedOperationException("Injector.getProvider(Key<T>) is not supported in Stage.TOOL");
    }

    public Provider getProvider(Class class1)
    {
        throw new UnsupportedOperationException("Injector.getProvider(Class<T>) is not supported in Stage.TOOL");
    }

    public Map getScopeBindings()
    {
        return delegateInjector.getScopeBindings();
    }

    public Set getTypeConverterBindings()
    {
        return delegateInjector.getTypeConverterBindings();
    }

    public void injectMembers(Object obj)
    {
        throw new UnsupportedOperationException("Injector.injectMembers(Object) is not supported in Stage.TOOL");
    }

    (Injector injector)
    {
        delegateInjector = injector;
    }
}
