// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.binder.AnnotatedConstantBindingBuilder;
import com.google.inject.binder.ConstantBindingBuilder;
import com.google.inject.internal.util.$ImmutableSet;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            AbstractBindingBuilder, BindingImpl, InstanceBindingImpl

public final class ConstantBindingBuilderImpl extends AbstractBindingBuilder
    implements AnnotatedConstantBindingBuilder, ConstantBindingBuilder
{

    public ConstantBindingBuilderImpl(Binder binder, List list, Object obj)
    {
        super(binder, list, obj, NULL_KEY);
    }

    private void toConstant(Class class1, Object obj)
    {
        if (keyTypeIsSet())
        {
            binder.addError("Constant value is set more than once.", new Object[0]);
            return;
        }
        BindingImpl bindingimpl = getBinding();
        if (bindingimpl.getKey().getAnnotation() != null)
        {
            class1 = Key.get(class1, bindingimpl.getKey().getAnnotation());
        } else
        if (bindingimpl.getKey().getAnnotationType() != null)
        {
            class1 = Key.get(class1, bindingimpl.getKey().getAnnotationType());
        } else
        {
            class1 = Key.get(class1);
        }
        if (obj == null)
        {
            binder.addError("Binding to null instances is not allowed. Use toProvider(Providers.of(null)) if this is your intended behaviour.", new Object[0]);
        }
        setBinding(new InstanceBindingImpl(bindingimpl.getSource(), class1, bindingimpl.getScoping(), $ImmutableSet.of(), obj));
    }

    public ConstantBindingBuilder annotatedWith(Class class1)
    {
        annotatedWithInternal(class1);
        return this;
    }

    public ConstantBindingBuilder annotatedWith(Annotation annotation)
    {
        annotatedWithInternal(annotation);
        return this;
    }

    public void to(byte byte0)
    {
        toConstant(java/lang/Byte, Byte.valueOf(byte0));
    }

    public void to(char c)
    {
        toConstant(java/lang/Character, Character.valueOf(c));
    }

    public void to(double d)
    {
        toConstant(java/lang/Double, Double.valueOf(d));
    }

    public void to(float f)
    {
        toConstant(java/lang/Float, Float.valueOf(f));
    }

    public void to(int i)
    {
        toConstant(java/lang/Integer, Integer.valueOf(i));
    }

    public void to(long l)
    {
        toConstant(java/lang/Long, Long.valueOf(l));
    }

    public void to(Class class1)
    {
        toConstant(java/lang/Class, class1);
    }

    public void to(Enum enum)
    {
        toConstant(enum.getDeclaringClass(), enum);
    }

    public void to(String s)
    {
        toConstant(java/lang/String, s);
    }

    public void to(short word0)
    {
        toConstant(java/lang/Short, Short.valueOf(word0));
    }

    public void to(boolean flag)
    {
        toConstant(java/lang/Boolean, Boolean.valueOf(flag));
    }

    public String toString()
    {
        return "ConstantBindingBuilder";
    }
}
