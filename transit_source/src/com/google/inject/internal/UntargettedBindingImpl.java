// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.UntargettedBinding;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, Scoping, InjectorImpl, InternalFactory, 
//            Errors, InternalContext

final class UntargettedBindingImpl extends BindingImpl
    implements UntargettedBinding
{

    UntargettedBindingImpl(InjectorImpl injectorimpl, Key key, Object obj)
    {
        super(injectorimpl, key, obj, new InternalFactory() {

            public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
            {
                throw new AssertionError();
            }

        }, Scoping.UNSCOPED);
    }

    public UntargettedBindingImpl(Object obj, Key key, Scoping scoping)
    {
        super(obj, key, scoping);
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        getScoping().applyTo(binder.withSource(getSource()).bind(getKey()));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof UntargettedBindingImpl)
        {
            obj = (UntargettedBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((UntargettedBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((UntargettedBindingImpl) (obj)).getScoping()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping()
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/UntargettedBinding)).add("key", getKey()).add("source", getSource()).toString();
    }

    public BindingImpl withKey(Key key)
    {
        return new UntargettedBindingImpl(getSource(), key, getScoping());
    }

    public BindingImpl withScoping(Scoping scoping)
    {
        return new UntargettedBindingImpl(getSource(), getKey(), scoping);
    }
}
