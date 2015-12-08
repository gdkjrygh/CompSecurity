// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.HasDependencies;
import com.google.inject.spi.ProviderInstanceBinding;
import com.google.inject.spi.ProviderWithExtensionVisitor;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory

final class ProviderInstanceBindingImpl extends BindingImpl
    implements ProviderInstanceBinding
{

    final $ImmutableSet injectionPoints;
    final Provider providerInstance;

    public ProviderInstanceBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, InternalFactory internalfactory, Scoping scoping, Provider provider, Set set)
    {
        super(injectorimpl, key, obj, internalfactory, scoping);
        providerInstance = provider;
        injectionPoints = $ImmutableSet.copyOf(set);
    }

    public ProviderInstanceBindingImpl(Object obj, Key key, Scoping scoping, Set set, Provider provider)
    {
        super(obj, key, scoping);
        injectionPoints = $ImmutableSet.copyOf(set);
        providerInstance = provider;
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        if (providerInstance instanceof ProviderWithExtensionVisitor)
        {
            return ((ProviderWithExtensionVisitor)providerInstance).acceptExtensionVisitor(bindingtargetvisitor, this);
        } else
        {
            return bindingtargetvisitor.visit(this);
        }
    }

    public void applyTo(Binder binder)
    {
        getScoping().applyTo(binder.withSource(getSource()).bind(getKey()).toProvider(getProviderInstance()));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ProviderInstanceBindingImpl)
        {
            obj = (ProviderInstanceBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((ProviderInstanceBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((ProviderInstanceBindingImpl) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(providerInstance, ((ProviderInstanceBindingImpl) (obj)).providerInstance))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public Set getDependencies()
    {
        if (providerInstance instanceof HasDependencies)
        {
            return $ImmutableSet.copyOf(((HasDependencies)providerInstance).getDependencies());
        } else
        {
            return Dependency.forInjectionPoints(injectionPoints);
        }
    }

    public Set getInjectionPoints()
    {
        return injectionPoints;
    }

    public Provider getProviderInstance()
    {
        return providerInstance;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping()
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/ProviderInstanceBinding)).add("key", getKey()).add("source", getSource()).add("scope", getScoping()).add("provider", providerInstance).toString();
    }

    public BindingImpl withKey(Key key)
    {
        return new ProviderInstanceBindingImpl(getSource(), key, getScoping(), injectionPoints, providerInstance);
    }

    public BindingImpl withScoping(Scoping scoping)
    {
        return new ProviderInstanceBindingImpl(getSource(), getKey(), scoping, injectionPoints, providerInstance);
    }
}
