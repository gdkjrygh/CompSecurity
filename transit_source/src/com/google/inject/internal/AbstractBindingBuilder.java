// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Scope;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.spi.InstanceBinding;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            UntargettedBindingImpl, Scoping, BindingImpl

public abstract class AbstractBindingBuilder
{

    public static final String ANNOTATION_ALREADY_SPECIFIED = "More than one annotation is specified for this binding.";
    public static final String BINDING_TO_NULL = "Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.";
    public static final String CONSTANT_VALUE_ALREADY_SET = "Constant value is set more than once.";
    public static final String IMPLEMENTATION_ALREADY_SET = "Implementation is set more than once.";
    protected static final Key NULL_KEY = Key.get(java/lang/Void);
    public static final String SCOPE_ALREADY_SET = "Scope is set more than once.";
    public static final String SINGLE_INSTANCE_AND_SCOPE = "Setting the scope is not permitted when binding to a single instance.";
    protected final Binder binder;
    private BindingImpl binding;
    protected List elements;
    protected int position;

    public AbstractBindingBuilder(Binder binder1, List list, Object obj, Key key)
    {
        binder = binder1;
        elements = list;
        position = list.size();
        binding = new UntargettedBindingImpl(obj, key, Scoping.UNSCOPED);
        list.add(position, binding);
    }

    protected BindingImpl annotatedWithInternal(Class class1)
    {
        $Preconditions.checkNotNull(class1, "annotationType");
        checkNotAnnotated();
        return setBinding(binding.withKey(Key.get(binding.getKey().getTypeLiteral(), class1)));
    }

    protected BindingImpl annotatedWithInternal(Annotation annotation)
    {
        $Preconditions.checkNotNull(annotation, "annotation");
        checkNotAnnotated();
        return setBinding(binding.withKey(Key.get(binding.getKey().getTypeLiteral(), annotation)));
    }

    public void asEagerSingleton()
    {
        checkNotScoped();
        setBinding(getBinding().withScoping(Scoping.EAGER_SINGLETON));
    }

    protected void checkNotAnnotated()
    {
        if (binding.getKey().getAnnotationType() != null)
        {
            binder.addError("More than one annotation is specified for this binding.", new Object[0]);
        }
    }

    protected void checkNotScoped()
    {
        if (binding instanceof InstanceBinding)
        {
            binder.addError("Setting the scope is not permitted when binding to a single instance.", new Object[0]);
        } else
        if (binding.getScoping().isExplicitlyScoped())
        {
            binder.addError("Scope is set more than once.", new Object[0]);
            return;
        }
    }

    protected void checkNotTargetted()
    {
        if (!(binding instanceof UntargettedBindingImpl))
        {
            binder.addError("Implementation is set more than once.", new Object[0]);
        }
    }

    protected BindingImpl getBinding()
    {
        return binding;
    }

    public void in(Scope scope)
    {
        $Preconditions.checkNotNull(scope, "scope");
        checkNotScoped();
        setBinding(getBinding().withScoping(Scoping.forInstance(scope)));
    }

    public void in(Class class1)
    {
        $Preconditions.checkNotNull(class1, "scopeAnnotation");
        checkNotScoped();
        setBinding(getBinding().withScoping(Scoping.forAnnotation(class1)));
    }

    protected boolean keyTypeIsSet()
    {
        return !java/lang/Void.equals(binding.getKey().getTypeLiteral().getType());
    }

    protected BindingImpl setBinding(BindingImpl bindingimpl)
    {
        binding = bindingimpl;
        elements.set(position, bindingimpl);
        return bindingimpl;
    }

}
