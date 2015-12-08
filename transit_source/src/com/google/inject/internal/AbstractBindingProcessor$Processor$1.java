// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            AbstractBindingProcessor, ErrorsException, BindingImpl, Errors, 
//            InjectorImpl

class val.binding
    implements Runnable
{

    final urce this$1;
    final BindingImpl val$binding;

    public void run()
    {
        try
        {
            val$binding.getInjector().initializeBinding(val$binding, errors.withSource(urce));
            return;
        }
        catch (ErrorsException errorsexception)
        {
            errors.merge(errorsexception.getErrors());
        }
    }

    ()
    {
        this$1 = final_;
        val$binding = BindingImpl.this;
        super();
    }
}
