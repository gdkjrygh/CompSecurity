// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.ConfigurationException;
import com.google.inject.internal.util.$Preconditions;
import java.util.Set;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor, InjectionPoint

public final class StaticInjectionRequest
    implements Element
{

    private final Object source;
    private final Class type;

    StaticInjectionRequest(Object obj, Class class1)
    {
        source = $Preconditions.checkNotNull(obj, "source");
        type = (Class)$Preconditions.checkNotNull(class1, "type");
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).requestStaticInjection(new Class[] {
            type
        });
    }

    public Set getInjectionPoints()
        throws ConfigurationException
    {
        return InjectionPoint.forStaticMethodsAndFields(type);
    }

    public Object getSource()
    {
        return source;
    }

    public Class getType()
    {
        return type;
    }
}
