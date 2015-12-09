// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotationMap, AnnotatedWithParams

public final class AnnotatedParameter extends AnnotatedMember
{

    private static final long serialVersionUID = 1L;
    protected final int _index;
    protected final AnnotatedWithParams _owner;
    protected final Type _type;

    public AnnotatedParameter(AnnotatedWithParams annotatedwithparams, Type type, AnnotationMap annotationmap, int i)
    {
        super(annotationmap);
        _owner = annotatedwithparams;
        _type = type;
        _index = i;
    }

    public final AnnotatedElement getAnnotated()
    {
        return null;
    }

    public final Annotation getAnnotation(Class class1)
    {
        if (_annotations == null)
        {
            return null;
        } else
        {
            return _annotations.get(class1);
        }
    }

    public final Class getDeclaringClass()
    {
        return _owner.getDeclaringClass();
    }

    public final Type getGenericType()
    {
        return _type;
    }

    public final int getIndex()
    {
        return _index;
    }

    public final Member getMember()
    {
        return _owner.getMember();
    }

    public final String getName()
    {
        return "";
    }

    public final AnnotatedWithParams getOwner()
    {
        return _owner;
    }

    public final Type getParameterType()
    {
        return _type;
    }

    public final Class getRawType()
    {
        if (_type instanceof Class)
        {
            return (Class)_type;
        } else
        {
            return TypeFactory.defaultInstance().constructType(_type).getRawClass();
        }
    }

    public final Object getValue(Object obj)
    {
        throw new UnsupportedOperationException((new StringBuilder("Cannot call getValue() on constructor parameter of ")).append(getDeclaringClass().getName()).toString());
    }

    public final void setValue(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException((new StringBuilder("Cannot call setValue() on constructor parameter of ")).append(getDeclaringClass().getName()).toString());
    }

    public final String toString()
    {
        return (new StringBuilder("[parameter #")).append(getIndex()).append(", annotations: ").append(_annotations).append("]").toString();
    }

    public final AnnotatedParameter withAnnotations(AnnotationMap annotationmap)
    {
        if (annotationmap == _annotations)
        {
            return this;
        } else
        {
            return _owner.replaceParameterAnnotations(_index, annotationmap);
        }
    }
}
