// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.spi.DefaultBindingTargetVisitor;

// Referenced classes of package com.google.inject.internal:
//            AbstractBindingProcessor, BindingImpl, Scoping, ProcessedBindingData, 
//            ErrorsException, Errors, InjectorImpl

abstract class scoping extends DefaultBindingTargetVisitor
{

    final Key key;
    final Class rawType;
    Scoping scoping;
    final Object source;
    final AbstractBindingProcessor this$0;

    protected void prepareBinding()
    {
        AbstractBindingProcessor.access$000(AbstractBindingProcessor.this, source, key);
        scoping = Scoping.makeInjectable(scoping, injector, errors);
    }

    protected void scheduleInitialization(final BindingImpl binding)
    {
        bindingData.addUninitializedBinding(new Runnable() {

            final AbstractBindingProcessor.Processor this$1;
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
                this$1 = AbstractBindingProcessor.Processor.this;
                binding = bindingimpl;
                super();
            }
        });
    }

    _cls1.val.binding(BindingImpl bindingimpl)
    {
        this$0 = AbstractBindingProcessor.this;
        super();
        source = bindingimpl.getSource();
        key = bindingimpl.getKey();
        rawType = key.getTypeLiteral().getRawType();
        scoping = bindingimpl.getScoping();
    }
}
