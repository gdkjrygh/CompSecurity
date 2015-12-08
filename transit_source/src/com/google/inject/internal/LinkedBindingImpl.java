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
import com.google.inject.spi.LinkedKeyBinding;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory

public final class LinkedBindingImpl extends BindingImpl
    implements LinkedKeyBinding, HasDependencies
{

    final Key targetKey;

    public LinkedBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, InternalFactory internalfactory, Scoping scoping, Key key1)
    {
        super(injectorimpl, key, obj, internalfactory, scoping);
        targetKey = key1;
    }

    public LinkedBindingImpl(Object obj, Key key, Scoping scoping, Key key1)
    {
        super(obj, key, scoping);
        targetKey = key1;
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        getScoping().applyTo(binder.withSource(getSource()).bind(getKey()).to(getLinkedKey()));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof LinkedBindingImpl)
        {
            obj = (LinkedBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((LinkedBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((LinkedBindingImpl) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(targetKey, ((LinkedBindingImpl) (obj)).targetKey))
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
        return $ImmutableSet.of(Dependency.get(targetKey));
    }

    public Key getLinkedKey()
    {
        return targetKey;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping(), targetKey
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/LinkedKeyBinding)).add("key", getKey()).add("source", getSource()).add("scope", getScoping()).add("target", targetKey).toString();
    }

    public BindingImpl withKey(Key key)
    {
        return new LinkedBindingImpl(getSource(), key, getScoping(), targetKey);
    }

    public BindingImpl withScoping(Scoping scoping)
    {
        return new LinkedBindingImpl(getSource(), getKey(), scoping, targetKey);
    }
}
