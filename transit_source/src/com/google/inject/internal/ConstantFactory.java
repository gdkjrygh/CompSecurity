// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.Dependency;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, ErrorsException, Initializable, Errors, 
//            InternalContext

final class ConstantFactory
    implements InternalFactory
{

    private final Initializable initializable;

    public ConstantFactory(Initializable initializable1)
    {
        initializable = initializable1;
    }

    public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return initializable.get(errors);
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/internal/ConstantFactory)).add("value", initializable).toString();
    }
}
