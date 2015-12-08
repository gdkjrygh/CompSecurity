// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotationMap

public final class AnnotatedField extends AnnotatedMember
    implements Serializable
{

    protected final transient Field _field;

    public AnnotatedField(Field field, AnnotationMap annotationmap)
    {
        super(annotationmap);
        _field = field;
    }

    public final volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public final Field getAnnotated()
    {
        return _field;
    }

    public final Annotation getAnnotation(Class class1)
    {
        return _annotations.get(class1);
    }

    public final Class getDeclaringClass()
    {
        return _field.getDeclaringClass();
    }

    public final String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).toString();
    }

    public final Type getGenericType()
    {
        return _field.getGenericType();
    }

    public final Member getMember()
    {
        return _field;
    }

    public final String getName()
    {
        return _field.getName();
    }

    public final Class getRawType()
    {
        return _field.getType();
    }

    public final Object getValue(Object obj)
        throws IllegalArgumentException
    {
        try
        {
            obj = _field.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to getValue() for field ")).append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return obj;
    }

    public final void setValue(Object obj, Object obj1)
        throws IllegalArgumentException
    {
        try
        {
            _field.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder("Failed to setValue() for field ")).append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

    public final String toString()
    {
        return (new StringBuilder("[field ")).append(getFullName()).append("]").toString();
    }

    public final AnnotatedField withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedField(_field, annotationmap);
    }
}
