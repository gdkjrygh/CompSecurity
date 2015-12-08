// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.ConfigurationException;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Preconditions;
import java.util.Set;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor, InjectionPoint

public final class InjectionRequest
    implements Element
{

    private final Object instance;
    private final Object source;
    private final TypeLiteral type;

    public InjectionRequest(Object obj, TypeLiteral typeliteral, Object obj1)
    {
        source = $Preconditions.checkNotNull(obj, "source");
        type = (TypeLiteral)$Preconditions.checkNotNull(typeliteral, "type");
        instance = $Preconditions.checkNotNull(obj1, "instance");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).requestInjection(type, instance);
    }

    public Set getInjectionPoints()
        throws ConfigurationException
    {
        return InjectionPoint.forInstanceMethodsAndFields(instance.getClass());
    }

    public Object getInstance()
    {
        return instance;
    }

    public Object getSource()
    {
        return source;
    }

    public TypeLiteral getType()
    {
        return type;
    }
}
