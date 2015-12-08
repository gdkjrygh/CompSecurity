// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Singleton;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.spi.BindingScopingVisitor;

// Referenced classes of package com.google.inject.internal:
//            Scoping

static final class nit> extends Scoping
{

    public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
    {
        return bindingscopingvisitor.visitScopeAnnotation(com/google/inject/Singleton);
    }

    public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
    {
        scopedbindingbuilder.in(com/google/inject/Singleton);
    }

    public Class getScopeAnnotation()
    {
        return com/google/inject/Singleton;
    }

    public String toString()
    {
        return com/google/inject/Singleton.getName();
    }

    gBuilder()
    {
        super(null);
    }
}
