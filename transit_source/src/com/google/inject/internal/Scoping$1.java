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
        return bindingscopingvisitor.visitNoScoping();
    }

    public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
    {
    }

    public Scope getScopeInstance()
    {
        return Scopes.NO_SCOPE;
    }

    public String toString()
    {
        return Scopes.NO_SCOPE.toString();
    }

    gBuilder()
    {
        super(null);
    }
}
