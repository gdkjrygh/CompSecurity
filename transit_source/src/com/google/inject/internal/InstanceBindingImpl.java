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
import com.google.inject.spi.InstanceBinding;
import com.google.inject.util.Providers;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory

final class InstanceBindingImpl extends BindingImpl
    implements InstanceBinding
{

    final $ImmutableSet injectionPoints;
    final Object instance;
    final Provider provider;

    public InstanceBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, InternalFactory internalfactory, Set set, Object obj1)
    {
        super(injectorimpl, key, obj, internalfactory, Scoping.EAGER_SINGLETON);
        injectionPoints = $ImmutableSet.copyOf(set);
        instance = obj1;
        provider = Providers.of(obj1);
    }

    public InstanceBindingImpl(Object obj, Key key, Scoping scoping, Set set, Object obj1)
    {
        super(obj, key, scoping);
        injectionPoints = $ImmutableSet.copyOf(set);
        instance = obj1;
        provider = Providers.of(obj1);
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).bind(getKey()).toInstance(instance);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof InstanceBindingImpl)
        {
            obj = (InstanceBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((InstanceBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((InstanceBindingImpl) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(instance, ((InstanceBindingImpl) (obj)).instance))
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
        if (instance instanceof HasDependencies)
        {
            return $ImmutableSet.copyOf(((HasDependencies)instance).getDependencies());
        } else
        {
            return Dependency.forInjectionPoints(injectionPoints);
        }
    }

    public Set getInjectionPoints()
    {
        return injectionPoints;
    }

    public Object getInstance()
    {
        return instance;
    }

    public Provider getProvider()
    {
        return provider;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping()
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/InstanceBinding)).add("key", getKey()).add("source", getSource()).add("instance", instance).toString();
    }

    public BindingImpl withKey(Key key)
    {
        return new InstanceBindingImpl(getSource(), key, getScoping(), injectionPoints, instance);
    }

    public BindingImpl withScoping(Scoping scoping)
    {
        return new InstanceBindingImpl(getSource(), getKey(), scoping, injectionPoints, instance);
    }
}
