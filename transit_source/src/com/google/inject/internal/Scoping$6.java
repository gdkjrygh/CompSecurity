// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Scope;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.spi.BindingScopingVisitor;

// Referenced classes of package com.google.inject.internal:
//            Scoping

static final class nit> extends Scoping
{

    final Scope val$scope;

    public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
    {
        return bindingscopingvisitor.visitScope(val$scope);
    }

    public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
    {
        scopedbindingbuilder.in(val$scope);
    }

    public Scope getScopeInstance()
    {
        return val$scope;
    }

    public String toString()
    {
        return val$scope.toString();
    }

    gBuilder(Scope scope1)
    {
        val$scope = scope1;
        super(null);
    }
}
