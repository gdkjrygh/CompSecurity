// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.Scope;
import com.google.inject.internal.util.$Preconditions;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor

public final class ScopeBinding
    implements Element
{

    private final Class annotationType;
    private final Scope scope;
    private final Object source;

    ScopeBinding(Object obj, Class class1, Scope scope1)
    {
        source = $Preconditions.checkNotNull(obj, "source");
        annotationType = (Class)$Preconditions.checkNotNull(class1, "annotationType");
        scope = (Scope)$Preconditions.checkNotNull(scope1, "scope");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).bindScope(annotationType, scope);
    }

    public Class getAnnotationType()
    {
        return annotationType;
    }

    public Scope getScope()
    {
        return scope;
    }

    public Object getSource()
    {
        return source;
    }
}
