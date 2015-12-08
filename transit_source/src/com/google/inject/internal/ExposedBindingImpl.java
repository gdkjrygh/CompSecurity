// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.ExposedBinding;
import com.google.inject.spi.PrivateElements;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory

public final class ExposedBindingImpl extends BindingImpl
    implements ExposedBinding
{

    private final PrivateElements privateElements;

    public ExposedBindingImpl(InjectorImpl injectorimpl, Object obj, Key key, InternalFactory internalfactory, PrivateElements privateelements)
    {
        super(injectorimpl, key, obj, internalfactory, Scoping.UNSCOPED);
        privateElements = privateelements;
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        throw new UnsupportedOperationException("This element represents a synthetic binding.");
    }

    public Set getDependencies()
    {
        return $ImmutableSet.of(Dependency.get(Key.get(com/google/inject/Injector)));
    }

    public PrivateElements getPrivateElements()
    {
        return privateElements;
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/ExposedBinding)).add("key", getKey()).add("source", getSource()).add("privateElements", privateElements).toString();
    }
}
