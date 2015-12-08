// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.HasDependencies;
import com.google.inject.spi.ProviderKeyBinding;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory

final class LinkedProviderBindingImpl extends BindingImpl
    implements ProviderKeyBinding, HasDependencies
{

    final Key providerKey;

    public LinkedProviderBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, InternalFactory internalfactory, Scoping scoping, Key key1)
    {
        super(injectorimpl, key, obj, internalfactory, scoping);
        providerKey = key1;
    }

    LinkedProviderBindingImpl(Object obj, Key key, Scoping scoping, Key key1)
    {
        super(obj, key, scoping);
        providerKey = key1;
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        getScoping().applyTo(binder.withSource(getSource()).bind(getKey()).toProvider(getProviderKey()));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof LinkedProviderBindingImpl)
        {
            obj = (LinkedProviderBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((LinkedProviderBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((LinkedProviderBindingImpl) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(providerKey, ((LinkedProviderBindingImpl) (obj)).providerKey))
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
        return $ImmutableSet.of(Dependency.get(providerKey));
    }

    public Key getProviderKey()
    {
        return providerKey;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping(), providerKey
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/ProviderKeyBinding)).add("key", getKey()).add("source", getSource()).add("scope", getScoping()).add("provider", providerKey).toString();
    }

    public BindingImpl withKey(Key key)
    {
        return new LinkedProviderBindingImpl(getSource(), key, getScoping(), providerKey);
    }

    public BindingImpl withScoping(Scoping scoping)
    {
        return new LinkedProviderBindingImpl(getSource(), getKey(), scoping, providerKey);
    }
}
