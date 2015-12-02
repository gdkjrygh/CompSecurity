// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotationMap, Annotated

public final class AnnotatedField extends AnnotatedMember
{

    protected final Field _field;

    public AnnotatedField(Field field, AnnotationMap annotationmap)
    {
        super(annotationmap);
        _field = field;
    }

    public volatile AnnotatedElement getAnnotated()
    {
        return getAnnotated();
    }

    public Field getAnnotated()
    {
        return _field;
    }

    public Annotation getAnnotation(Class class1)
    {
        return _annotations.get(class1);
    }

    public int getAnnotationCount()
    {
        return _annotations.size();
    }

    public Class getDeclaringClass()
    {
        return _field.getDeclaringClass();
    }

    public String getFullName()
    {
        return (new StringBuilder()).append(getDeclaringClass().getName()).append("#").append(getName()).toString();
    }

    public Type getGenericType()
    {
        return _field.getGenericType();
    }

    public Member getMember()
    {
        return _field;
    }

    public int getModifiers()
    {
        return _field.getModifiers();
    }

    public String getName()
    {
        return _field.getName();
    }

    public Class getRawType()
    {
        return _field.getType();
    }

    public Object getValue(Object obj)
    {
        try
        {
            obj = _field.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to getValue() for field ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        return obj;
    }

    public void setValue(Object obj, Object obj1)
    {
        try
        {
            _field.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to setValue() for field ").append(getFullName()).append(": ").append(((IllegalAccessException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("[field ").append(getFullName()).append("]").toString();
    }

    public volatile Annotated withAnnotations(AnnotationMap annotationmap)
    {
        return withAnnotations(annotationmap);
    }

    public AnnotatedField withAnnotations(AnnotationMap annotationmap)
    {
        return new AnnotatedField(_field, annotationmap);
    }
}
