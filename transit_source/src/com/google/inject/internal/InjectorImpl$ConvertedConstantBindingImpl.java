// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.ConvertedConstantBinding;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.util.Providers;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, InjectorImpl, ConstantFactory, Initializables, 
//            Scoping

private static class typeConverterBinding extends BindingImpl
    implements ConvertedConstantBinding
{

    final Binding originalBinding;
    final Provider provider;
    final TypeConverterBinding typeConverterBinding;
    final Object value;

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        throw new UnsupportedOperationException("This element represents a synthetic binding.");
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof typeConverterBinding)
        {
            obj = (typeConverterBinding)obj;
            flag = flag1;
            if (getKey().equals(((getKey) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((getScoping) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(value, ((value) (obj)).value))
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
        return $ImmutableSet.of(Dependency.get(getSourceKey()));
    }

    public Provider getProvider()
    {
        return provider;
    }

    public Key getSourceKey()
    {
        return originalBinding.getKey();
    }

    public TypeConverterBinding getTypeConverterBinding()
    {
        return typeConverterBinding;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping(), value
        });
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/ConvertedConstantBinding)).add("key", getKey()).add("sourceKey", getSourceKey()).add("value", value).toString();
    }

    (InjectorImpl injectorimpl, Key key, Object obj, Binding binding, TypeConverterBinding typeconverterbinding)
    {
        super(injectorimpl, key, binding.getSource(), new ConstantFactory(Initializables.of(obj)), Scoping.UNSCOPED);
        value = obj;
        provider = Providers.of(obj);
        originalBinding = binding;
        typeConverterBinding = typeconverterbinding;
    }
}
