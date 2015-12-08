// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.spi.TypeListenerBinding;

// Referenced classes of package com.google.inject.internal:
//            AbstractProcessor, InjectorImpl, State, Errors

final class TypeListenerBindingProcessor extends AbstractProcessor
{

    TypeListenerBindingProcessor(Errors errors)
    {
        super(errors);
    }

    public Boolean visit(TypeListenerBinding typelistenerbinding)
    {
        injector.state.addTypeListener(typelistenerbinding);
        return Boolean.valueOf(true);
    }

    public volatile Object visit(TypeListenerBinding typelistenerbinding)
    {
        return visit(typelistenerbinding);
    }
}
