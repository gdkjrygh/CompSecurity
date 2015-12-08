// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingScopingVisitor;
import com.google.inject.spi.ElementVisitor;
import com.google.inject.spi.InstanceBinding;

// Referenced classes of package com.google.inject.internal:
//            Scoping, InjectorImpl, InternalFactory

public abstract class BindingImpl
    implements Binding
{

    private final InjectorImpl injector;
    private final InternalFactory internalFactory;
    private final Key key;
    private volatile Provider provider;
    private final Scoping scoping;
    private final Object source;

    public BindingImpl(InjectorImpl injectorimpl, Key key1, Object obj, InternalFactory internalfactory, Scoping scoping1)
    {
        injector = injectorimpl;
        key = key1;
        source = obj;
        internalFactory = internalfactory;
        scoping = scoping1;
    }

    protected BindingImpl(Object obj, Key key1, Scoping scoping1)
    {
        internalFactory = null;
        injector = null;
        source = obj;
        key = key1;
        scoping = scoping1;
    }

    public Object acceptScopingVisitor(BindingScopingVisitor bindingscopingvisitor)
    {
        return scoping.acceptVisitor(bindingscopingvisitor);
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public InjectorImpl getInjector()
    {
        return injector;
    }

    public InternalFactory getInternalFactory()
    {
        return internalFactory;
    }

    public Key getKey()
    {
        return key;
    }

    public Provider getProvider()
    {
        if (provider == null)
        {
            if (injector == null)
            {
                throw new UnsupportedOperationException("getProvider() not supported for module bindings");
            }
            provider = injector.getProvider(key);
        }
        return provider;
    }

    public Scoping getScoping()
    {
        return scoping;
    }

    public Object getSource()
    {
        return source;
    }

    public boolean isConstant()
    {
        return this instanceof InstanceBinding;
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/Binding)).add("key", key).add("scope", scoping).add("source", source).toString();
    }

    protected BindingImpl withKey(Key key1)
    {
        throw new AssertionError();
    }

    protected BindingImpl withScoping(Scoping scoping1)
    {
        throw new AssertionError();
    }
}
