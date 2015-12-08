// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.ConfigurationException;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.InjectionPoint;
import com.google.inject.spi.Message;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            AbstractBindingBuilder, LinkedBindingImpl, BindingImpl, ConstructorBindingImpl, 
//            InstanceBindingImpl, Scoping, LinkedProviderBindingImpl, ProviderInstanceBindingImpl

public class BindingBuilder extends AbstractBindingBuilder
    implements AnnotatedBindingBuilder
{

    public BindingBuilder(Binder binder, List list, Object obj, Key key)
    {
        super(binder, list, obj, key);
    }

    private void copyErrorsToBinder(ConfigurationException configurationexception)
    {
        Message message;
        for (configurationexception = configurationexception.getErrorMessages().iterator(); configurationexception.hasNext(); binder.addError(message))
        {
            message = (Message)configurationexception.next();
        }

    }

    public volatile LinkedBindingBuilder annotatedWith(Class class1)
    {
        return annotatedWith(class1);
    }

    public volatile LinkedBindingBuilder annotatedWith(Annotation annotation)
    {
        return annotatedWith(annotation);
    }

    public BindingBuilder annotatedWith(Class class1)
    {
        annotatedWithInternal(class1);
        return this;
    }

    public BindingBuilder annotatedWith(Annotation annotation)
    {
        annotatedWithInternal(annotation);
        return this;
    }

    public volatile ScopedBindingBuilder to(Key key)
    {
        return to(key);
    }

    public volatile ScopedBindingBuilder to(TypeLiteral typeliteral)
    {
        return to(typeliteral);
    }

    public volatile ScopedBindingBuilder to(Class class1)
    {
        return to(class1);
    }

    public BindingBuilder to(Key key)
    {
        $Preconditions.checkNotNull(key, "linkedKey");
        checkNotTargetted();
        BindingImpl bindingimpl = getBinding();
        setBinding(new LinkedBindingImpl(bindingimpl.getSource(), bindingimpl.getKey(), bindingimpl.getScoping(), key));
        return this;
    }

    public BindingBuilder to(TypeLiteral typeliteral)
    {
        return to(Key.get(typeliteral));
    }

    public BindingBuilder to(Class class1)
    {
        return to(Key.get(class1));
    }

    public ScopedBindingBuilder toConstructor(Constructor constructor)
    {
        return toConstructor(constructor, TypeLiteral.get(constructor.getDeclaringClass()));
    }

    public ScopedBindingBuilder toConstructor(Constructor constructor, TypeLiteral typeliteral)
    {
        $Preconditions.checkNotNull(constructor, "constructor");
        $Preconditions.checkNotNull(typeliteral, "type");
        checkNotTargetted();
        BindingImpl bindingimpl = getBinding();
        Set set;
        try
        {
            set = InjectionPoint.forInstanceMethodsAndFields(typeliteral);
        }
        catch (ConfigurationException configurationexception)
        {
            copyErrorsToBinder(configurationexception);
            configurationexception = (Set)configurationexception.getPartialValue();
        }
        try
        {
            constructor = InjectionPoint.forConstructor(constructor, typeliteral);
            setBinding(new ConstructorBindingImpl(bindingimpl.getKey(), bindingimpl.getSource(), bindingimpl.getScoping(), constructor, set));
        }
        // Misplaced declaration of an exception variable
        catch (Constructor constructor)
        {
            copyErrorsToBinder(constructor);
            return this;
        }
        return this;
    }

    public void toInstance(Object obj)
    {
        checkNotTargetted();
        Object obj1;
        BindingImpl bindingimpl;
        if (obj != null)
        {
            try
            {
                obj1 = InjectionPoint.forInstanceMethodsAndFields(obj.getClass());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                copyErrorsToBinder(((ConfigurationException) (obj1)));
                obj1 = (Set)((ConfigurationException) (obj1)).getPartialValue();
            }
        } else
        {
            binder.addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", new Object[0]);
            obj1 = $ImmutableSet.of();
        }
        bindingimpl = getBinding();
        setBinding(new InstanceBindingImpl(bindingimpl.getSource(), bindingimpl.getKey(), Scoping.EAGER_SINGLETON, ((Set) (obj1)), obj));
    }

    public volatile ScopedBindingBuilder toProvider(Key key)
    {
        return toProvider(key);
    }

    public volatile ScopedBindingBuilder toProvider(Provider provider)
    {
        return toProvider(provider);
    }

    public volatile ScopedBindingBuilder toProvider(TypeLiteral typeliteral)
    {
        return toProvider(typeliteral);
    }

    public volatile ScopedBindingBuilder toProvider(Class class1)
    {
        return toProvider(class1);
    }

    public BindingBuilder toProvider(Key key)
    {
        $Preconditions.checkNotNull(key, "providerKey");
        checkNotTargetted();
        BindingImpl bindingimpl = getBinding();
        setBinding(new LinkedProviderBindingImpl(bindingimpl.getSource(), bindingimpl.getKey(), bindingimpl.getScoping(), key));
        return this;
    }

    public BindingBuilder toProvider(Provider provider)
    {
        $Preconditions.checkNotNull(provider, "provider");
        checkNotTargetted();
        Set set;
        BindingImpl bindingimpl;
        try
        {
            set = InjectionPoint.forInstanceMethodsAndFields(provider.getClass());
        }
        catch (ConfigurationException configurationexception)
        {
            copyErrorsToBinder(configurationexception);
            configurationexception = (Set)configurationexception.getPartialValue();
        }
        bindingimpl = getBinding();
        setBinding(new ProviderInstanceBindingImpl(bindingimpl.getSource(), bindingimpl.getKey(), bindingimpl.getScoping(), set, provider));
        return this;
    }

    public BindingBuilder toProvider(TypeLiteral typeliteral)
    {
        return toProvider(Key.get(typeliteral));
    }

    public BindingBuilder toProvider(Class class1)
    {
        return toProvider(Key.get(class1));
    }

    public String toString()
    {
        return (new StringBuilder()).append("BindingBuilder<").append(getBinding().getKey().getTypeLiteral()).append(">").toString();
    }
}
