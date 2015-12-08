// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.InjectionPoint;

// Referenced classes of package com.google.inject.internal:
//            FailableCache, ConstructorInjectorStore, ErrorsException, Errors, 
//            ConstructorInjector

class this._cls0 extends FailableCache
{

    final ConstructorInjectorStore this$0;

    protected ConstructorInjector create(InjectionPoint injectionpoint, Errors errors)
        throws ErrorsException
    {
        return ConstructorInjectorStore.access$000(ConstructorInjectorStore.this, injectionpoint, errors);
    }

    protected volatile Object create(Object obj, Errors errors)
        throws ErrorsException
    {
        return create((InjectionPoint)obj, errors);
    }

    ()
    {
        this$0 = ConstructorInjectorStore.this;
        super();
    }
}
