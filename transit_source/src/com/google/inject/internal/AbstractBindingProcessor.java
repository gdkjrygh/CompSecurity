// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.spi.DefaultBindingTargetVisitor;
import com.google.inject.spi.PrivateElements;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, ExposedBindingImpl, InjectorImpl, BindingImpl, 
//            State, Annotations, UntargettedBindingImpl, Errors, 
//            ProcessedBindingData, Scoping, ErrorsException

abstract class AbstractBindingProcessor extends AbstractProcessor
{
    abstract class Processor extends DefaultBindingTargetVisitor
    {

        final Key key;
        final Class rawType;
        Scoping scoping;
        final Object source;
        final AbstractBindingProcessor this$0;

        protected void prepareBinding()
        {
            validateKey(source, key);
            scoping = Scoping.makeInjectable(scoping, injector, errors);
        }

        protected void scheduleInitialization(BindingImpl bindingimpl)
        {
            bindingData.addUninitializedBinding(bindingimpl. new Runnable() {

                final Processor this$1;
                final BindingImpl val$binding;

                public void run()
                {
                    try
                    {
                        binding.getInjector().initializeBinding(binding, errors.withSource(source));
                        return;
                    }
                    catch (ErrorsException errorsexception)
                    {
                        errors.merge(errorsexception.getErrors());
                    }
                }

            
            {
                this$1 = final_processor;
                binding = BindingImpl.this;
                super();
            }
            });
        }

        Processor(BindingImpl bindingimpl)
        {
            this$0 = AbstractBindingProcessor.this;
            super();
            source = bindingimpl.getSource();
            key = bindingimpl.getKey();
            rawType = key.getTypeLiteral().getRawType();
            scoping = bindingimpl.getScoping();
        }
    }


    private static final Set FORBIDDEN_TYPES = $ImmutableSet.of(new Class[] {
        com/google/inject/AbstractModule, com/google/inject/Binder, com/google/inject/Binding, com/google/inject/Injector, com/google/inject/Key, com/google/inject/MembersInjector, com/google/inject/Module, com/google/inject/Provider, com/google/inject/Scope, com/google/inject/TypeLiteral
    });
    protected final ProcessedBindingData bindingData;

    AbstractBindingProcessor(Errors errors, ProcessedBindingData processedbindingdata)
    {
        super(errors);
        bindingData = processedbindingdata;
    }

    private boolean isOkayDuplicate(BindingImpl bindingimpl, BindingImpl bindingimpl1, State state)
    {
        boolean flag = false;
        if (bindingimpl instanceof ExposedBindingImpl)
        {
            if ((InjectorImpl)((ExposedBindingImpl)bindingimpl).getPrivateElements().getInjector() == bindingimpl1.getInjector())
            {
                flag = true;
            }
        } else
        {
            bindingimpl = (BindingImpl)state.getExplicitBindingsThisLevel().get(bindingimpl1.getKey());
            if (bindingimpl != null)
            {
                return bindingimpl.equals(bindingimpl1);
            }
        }
        return flag;
    }

    private void validateKey(Object obj, Key key)
    {
        Annotations.checkForMisplacedScopeAnnotations(key.getTypeLiteral().getRawType(), obj, errors);
    }

    protected UntargettedBindingImpl invalidBinding(InjectorImpl injectorimpl, Key key, Object obj)
    {
        return new UntargettedBindingImpl(injectorimpl, key, obj);
    }

    protected void putBinding(BindingImpl bindingimpl)
    {
        Key key = bindingimpl.getKey();
        Object obj = key.getTypeLiteral().getRawType();
        if (FORBIDDEN_TYPES.contains(obj))
        {
            errors.cannotBindToGuiceType(((Class) (obj)).getSimpleName());
            return;
        }
        obj = injector.getExistingBinding(key);
        if (obj != null)
        {
            if (injector.state.getExplicitBinding(key) != null)
            {
                try
                {
                    if (!isOkayDuplicate(((BindingImpl) (obj)), bindingimpl, injector.state))
                    {
                        errors.bindingAlreadySet(key, ((BindingImpl) (obj)).getSource());
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (BindingImpl bindingimpl)
                {
                    errors.errorCheckingDuplicateBinding(key, ((BindingImpl) (obj)).getSource(), bindingimpl);
                    return;
                }
            } else
            {
                errors.jitBindingAlreadySet(key);
                return;
            }
        }
        injector.state.parent().blacklist(key, bindingimpl.getSource());
        injector.state.putBinding(key, bindingimpl);
    }


}
