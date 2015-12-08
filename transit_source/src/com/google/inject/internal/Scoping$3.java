// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.spi.BindingScopingVisitor;

// Referenced classes of package com.google.inject.internal:
//            Scoping

static final class nit> extends Scoping
{

    public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
    {
        return bindingscopingvisitor.visitScope(Scopes.SINGLETON);
    }

    public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
    {
        scopedbindingbuilder.in(Scopes.SINGLETON);
    }

    public Scope getScopeInstance()
    {
        return Scopes.SINGLETON;
    }

    public String toString()
    {
        return Scopes.SINGLETON.toString();
    }

    gBuilder()
    {
        super(null);
    }
}
