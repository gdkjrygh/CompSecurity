// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.spi.UntargettedBinding;

// Referenced classes of package com.google.inject.internal:
//            AbstractBindingProcessor, BindingImpl, Errors, ProcessedBindingData, 
//            ErrorsException, InjectorImpl

class UntargettedBindingProcessor extends AbstractBindingProcessor
{

    UntargettedBindingProcessor(Errors errors, ProcessedBindingData processedbindingdata)
    {
        super(errors, processedbindingdata);
    }

    public Boolean visit(Binding binding)
    {
        return (Boolean)binding.acceptTargetVisitor(new AbstractBindingProcessor.Processor((BindingImpl)binding) {

            final UntargettedBindingProcessor this$0;

            public Boolean visit(UntargettedBinding untargettedbinding)
            {
                prepareBinding();
                if (key.getAnnotationType() != null)
                {
                    errors.missingImplementation(key);
                    putBinding(invalidBinding(injector, key, source));
                    return Boolean.valueOf(true);
                }
                try
                {
                    untargettedbinding = injector.createUninitializedBinding(key, scoping, source, errors, false);
                    scheduleInitialization(untargettedbinding);
                    putBinding(untargettedbinding);
                }
                // Misplaced declaration of an exception variable
                catch (UntargettedBinding untargettedbinding)
                {
                    errors.merge(untargettedbinding.getErrors());
                    putBinding(invalidBinding(injector, key, source));
                }
                return Boolean.valueOf(true);
            }

            public volatile Object visit(UntargettedBinding untargettedbinding)
            {
                return visit(untargettedbinding);
            }

            protected Boolean visitOther(Binding binding1)
            {
                return Boolean.valueOf(false);
            }

            protected volatile Object visitOther(Binding binding1)
            {
                return visitOther(binding1);
            }

            
            {
                this$0 = UntargettedBindingProcessor.this;
                super(UntargettedBindingProcessor.this, bindingimpl);
            }
        });
    }

    public volatile Object visit(Binding binding)
    {
        return visit(binding);
    }
}
