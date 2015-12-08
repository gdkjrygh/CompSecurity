// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.spi.ConstructorBinding;
import com.google.inject.spi.ConvertedConstantBinding;
import com.google.inject.spi.ExposedBinding;
import com.google.inject.spi.InstanceBinding;
import com.google.inject.spi.LinkedKeyBinding;
import com.google.inject.spi.ProviderBinding;
import com.google.inject.spi.ProviderInstanceBinding;
import com.google.inject.spi.ProviderKeyBinding;
import com.google.inject.spi.UntargettedBinding;

// Referenced classes of package com.google.inject.internal:
//            BindingProcessor, ErrorsException, ConstructorBindingImpl, Errors, 
//            ConstantFactory, Initializer, Scoping, InstanceBindingImpl, 
//            FactoryProxy, ProcessedBindingData, LinkedBindingImpl, InternalFactoryToProviderAdapter, 
//            ProviderInstanceBindingImpl, BoundProviderFactory, LinkedProviderBindingImpl, BindingImpl

class essor extends essor.Processor
{

    final BindingProcessor this$0;

    public Boolean visit(ConstructorBinding constructorbinding)
    {
        prepareBinding();
        try
        {
            constructorbinding = ConstructorBindingImpl.create(injector, key, constructorbinding.getConstructor(), source, scoping, errors, false);
            scheduleInitialization(constructorbinding);
            putBinding(constructorbinding);
        }
        // Misplaced declaration of an exception variable
        catch (ConstructorBinding constructorbinding)
        {
            errors.merge(constructorbinding.getErrors());
            putBinding(invalidBinding(injector, key, source));
        }
        return Boolean.valueOf(true);
    }

    public Boolean visit(ConvertedConstantBinding convertedconstantbinding)
    {
        throw new IllegalArgumentException("Cannot apply a non-module element");
    }

    public Boolean visit(ExposedBinding exposedbinding)
    {
        throw new IllegalArgumentException("Cannot apply a non-module element");
    }

    public Boolean visit(InstanceBinding instancebinding)
    {
        prepareBinding();
        java.util.Set set = instancebinding.getInjectionPoints();
        instancebinding = ((InstanceBinding) (instancebinding.getInstance()));
        Object obj = new ConstantFactory(BindingProcessor.access$000(BindingProcessor.this).requestInjection(injector, instancebinding, source, set));
        obj = Scoping.scope(key, injector, ((InternalFactory) (obj)), source, scoping);
        putBinding(new InstanceBindingImpl(injector, key, source, ((InternalFactory) (obj)), set, instancebinding));
        return Boolean.valueOf(true);
    }

    public Boolean visit(LinkedKeyBinding linkedkeybinding)
    {
        prepareBinding();
        linkedkeybinding = linkedkeybinding.getLinkedKey();
        if (key.equals(linkedkeybinding))
        {
            errors.recursiveBinding();
        }
        Object obj = new FactoryProxy(injector, key, linkedkeybinding, source);
        bindingData.addCreationListener(((CreationListener) (obj)));
        obj = Scoping.scope(key, injector, ((InternalFactory) (obj)), source, scoping);
        putBinding(new LinkedBindingImpl(injector, key, source, ((InternalFactory) (obj)), scoping, linkedkeybinding));
        return Boolean.valueOf(true);
    }

    public Boolean visit(ProviderBinding providerbinding)
    {
        throw new IllegalArgumentException("Cannot apply a non-module element");
    }

    public Boolean visit(ProviderInstanceBinding providerinstancebinding)
    {
        prepareBinding();
        com.google.inject.Provider provider = providerinstancebinding.getProviderInstance();
        providerinstancebinding = providerinstancebinding.getInjectionPoints();
        Object obj = new InternalFactoryToProviderAdapter(BindingProcessor.access$000(BindingProcessor.this).requestInjection(injector, provider, source, providerinstancebinding), source);
        obj = Scoping.scope(key, injector, ((InternalFactory) (obj)), source, scoping);
        putBinding(new ProviderInstanceBindingImpl(injector, key, source, ((InternalFactory) (obj)), scoping, provider, providerinstancebinding));
        return Boolean.valueOf(true);
    }

    public Boolean visit(ProviderKeyBinding providerkeybinding)
    {
        prepareBinding();
        providerkeybinding = providerkeybinding.getProviderKey();
        Object obj = new BoundProviderFactory(injector, providerkeybinding, source);
        bindingData.addCreationListener(((CreationListener) (obj)));
        obj = Scoping.scope(key, injector, ((InternalFactory) (obj)), source, scoping);
        putBinding(new LinkedProviderBindingImpl(injector, key, source, ((InternalFactory) (obj)), scoping, providerkeybinding));
        return Boolean.valueOf(true);
    }

    public Boolean visit(UntargettedBinding untargettedbinding)
    {
        return Boolean.valueOf(false);
    }

    public volatile Object visit(ConstructorBinding constructorbinding)
    {
        return visit(constructorbinding);
    }

    public volatile Object visit(ConvertedConstantBinding convertedconstantbinding)
    {
        return visit(convertedconstantbinding);
    }

    public volatile Object visit(ExposedBinding exposedbinding)
    {
        return visit(exposedbinding);
    }

    public volatile Object visit(InstanceBinding instancebinding)
    {
        return visit(instancebinding);
    }

    public volatile Object visit(LinkedKeyBinding linkedkeybinding)
    {
        return visit(linkedkeybinding);
    }

    public volatile Object visit(ProviderBinding providerbinding)
    {
        return visit(providerbinding);
    }

    public volatile Object visit(ProviderInstanceBinding providerinstancebinding)
    {
        return visit(providerinstancebinding);
    }

    public volatile Object visit(ProviderKeyBinding providerkeybinding)
    {
        return visit(providerkeybinding);
    }

    public volatile Object visit(UntargettedBinding untargettedbinding)
    {
        return visit(untargettedbinding);
    }

    protected Boolean visitOther(Binding binding)
    {
        throw new IllegalStateException("BindingProcessor should override all visitations");
    }

    protected volatile Object visitOther(Binding binding)
    {
        return visitOther(binding);
    }

    essor(BindingImpl bindingimpl)
    {
        this$0 = BindingProcessor.this;
        super(BindingProcessor.this, bindingimpl);
    }
}
